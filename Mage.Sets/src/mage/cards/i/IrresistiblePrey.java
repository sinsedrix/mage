
package mage.cards.i;

import java.util.UUID;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.combat.MustBeBlockedByAtLeastOneTargetEffect;
import mage.abilities.effects.common.continuous.GainAbilityTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Zone;
import mage.target.common.TargetCreaturePermanent;

/**
 *
 * @author jeffwadsworth
 */
public final class IrresistiblePrey extends CardImpl {

    public IrresistiblePrey(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.SORCERY},"{G}");


        // Target creature must be blocked this turn if able.
        // Draw a card.
        this.getSpellAbility().addEffect(
                new GainAbilityTargetEffect(
                new SimpleStaticAbility(Zone.BATTLEFIELD, new MustBeBlockedByAtLeastOneTargetEffect()),
                Duration.EndOfTurn));
        this.getSpellAbility().addTarget(new TargetCreaturePermanent());
        this.getSpellAbility().addEffect(new DrawCardSourceControllerEffect(1));
    }

    public IrresistiblePrey(final IrresistiblePrey card) {
        super(card);
    }

    @Override
    public IrresistiblePrey copy() {
        return new IrresistiblePrey(this);
    }
}
