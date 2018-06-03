
package mage.cards.s;

import java.util.UUID;
import mage.MageInt;
import mage.MageObject;
import mage.abilities.Ability;
import mage.abilities.common.BeginningOfUpkeepTriggeredAbility;
import mage.abilities.effects.AsThoughEffectImpl;
import mage.abilities.effects.ContinuousEffectImpl;
import mage.abilities.effects.ContinuousRuleModifyingEffectImpl;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.players.Player;
import mage.target.common.TargetOpponent;

/**
 *
 * @author LevelX2
 */
public final class SenTriplets extends CardImpl {

    public SenTriplets(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.ARTIFACT,CardType.CREATURE},"{2}{W}{U}{B}");
        addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.WIZARD);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        // At the beginning of your upkeep, choose target opponent. 
        // This turn, that player can't cast spells or activate abilities and plays with their hand revealed.
        // You may play cards from that player's hand this turn.
        Ability ability = new BeginningOfUpkeepTriggeredAbility(Zone.BATTLEFIELD, new SenTripletsRuleModifyingEffect(), TargetController.YOU, false, false);
        ability.addEffect(new SenTripletsOpponentRevealsHandEffect());
        ability.addEffect(new SenTripletsPlayFromOpponentsHandEffect());
        ability.addTarget(new TargetOpponent());
        this.addAbility(ability);
    }

    public SenTriplets(final SenTriplets card) {
        super(card);
    }

    @Override
    public SenTriplets copy() {
        return new SenTriplets(this);
    }
}

class SenTripletsRuleModifyingEffect extends ContinuousRuleModifyingEffectImpl {

    public SenTripletsRuleModifyingEffect() {
        super(Duration.EndOfTurn, Outcome.Benefit);
        staticText = "At the beginning of your upkeep, choose target opponent. This turn, that player can't cast spells or activate abilities";        
    }

    public SenTripletsRuleModifyingEffect(final SenTripletsRuleModifyingEffect effect) {
        super(effect);        
    }

    @Override
    public SenTripletsRuleModifyingEffect copy() {
        return new SenTripletsRuleModifyingEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        return true;
    }

    @Override
    public String getInfoMessage(Ability source, GameEvent event, Game game) {
        Player targetPlayer = game.getPlayer(getTargetPointer().getFirst(game, source));
        MageObject mageObject = game.getObject(source.getSourceId());
        if (targetPlayer != null && mageObject != null) {
            return "This turn you can't cast spells or activate abilities" +
                    " (" + mageObject.getLogName() + ')';
        }
        return null;
    }

    @Override
    public boolean checksEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.CAST_SPELL || event.getType() == GameEvent.EventType.ACTIVATE_ABILITY;
    }

    @Override
    public boolean applies(GameEvent event, Ability source, Game game) {
        return event.getPlayerId().equals(getTargetPointer().getFirst(game, source));
    }
}

class SenTripletsOpponentRevealsHandEffect extends ContinuousEffectImpl {

    public SenTripletsOpponentRevealsHandEffect() {
        super(Duration.EndOfTurn, Layer.PlayerEffects, SubLayer.NA, Outcome.Detriment);
        staticText = "and plays with their hand revealed";
    }

    public SenTripletsOpponentRevealsHandEffect(final SenTripletsOpponentRevealsHandEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(getTargetPointer().getFirst(game, source));
        if (player != null) {
            player.revealCards(player.getName() + "'s hand cards", player.getHand(), game, false);
        }
        return true;
    }

    @Override
    public SenTripletsOpponentRevealsHandEffect copy() {
        return new SenTripletsOpponentRevealsHandEffect(this);
    }
}

class SenTripletsPlayFromOpponentsHandEffect extends AsThoughEffectImpl {

    
    public SenTripletsPlayFromOpponentsHandEffect() {
        super(AsThoughEffectType.PLAY_FROM_NOT_OWN_HAND_ZONE, Duration.EndOfTurn, Outcome.Benefit);
               staticText = "You may play cards from that player's hand this turn";
    }

    public SenTripletsPlayFromOpponentsHandEffect(final SenTripletsPlayFromOpponentsHandEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        return true;
    }

    @Override
    public SenTripletsPlayFromOpponentsHandEffect copy() {
        return new SenTripletsPlayFromOpponentsHandEffect(this);
    }

    @Override
    public boolean applies(UUID objectId, Ability source, UUID affectedControllerId, Game game) {
        Card card = game.getCard(objectId);
        return card != null &&
                card.getOwnerId().equals(getTargetPointer().getFirst(game, source)) &&
                game.getState().getZone(objectId) == Zone.HAND &&
                affectedControllerId.equals(source.getControllerId());
    }

}


