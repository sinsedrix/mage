
package mage.cards.c;

import java.util.UUID;
import mage.ObjectColor;
import mage.abilities.Ability;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.AttachEffect;
import mage.abilities.effects.common.continuous.AddCardSubtypeAttachedEffect;
import mage.abilities.effects.common.continuous.BoostEnchantedEffect;
import mage.abilities.effects.common.continuous.GainAbilityAttachedEffect;
import mage.abilities.keyword.EnchantAbility;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.Predicates;
import mage.filter.predicate.mageobject.ColorPredicate;
import mage.target.TargetPermanent;
import mage.target.common.TargetCreaturePermanent;

/**
 *
 * @author Loki
 */
public final class CallToServe extends CardImpl {

    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("nonblack creature");

    static {
        filter.add(Predicates.not(new ColorPredicate(ObjectColor.BLACK)));
    }

    public CallToServe(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.ENCHANTMENT},"{1}{W}");
        this.subtype.add(SubType.AURA);

        // Enchant nonblack creature
        TargetPermanent auraTarget = new TargetCreaturePermanent(filter);
        this.getSpellAbility().addTarget(auraTarget);
        this.getSpellAbility().addEffect(new AttachEffect(Outcome.BoostCreature));
        Ability ability = new EnchantAbility(auraTarget.getTargetName());
        this.addAbility(ability);

        // Enchanted creature gets +1/+2, has flying, and is an Angel in addition to its other types.
        ability = new SimpleStaticAbility(Zone.BATTLEFIELD, new BoostEnchantedEffect(1, 2, Duration.WhileOnBattlefield));
        Effect effect = new GainAbilityAttachedEffect(FlyingAbility.getInstance(), AttachmentType.AURA);
        effect.setText(", has flying");
        ability.addEffect(effect);
        effect = new AddCardSubtypeAttachedEffect(SubType.ANGEL, Duration.WhileOnBattlefield, AttachmentType.AURA);
        effect.setText(", and is an Angel in addition to its other types");
        ability.addEffect(effect);
        this.addAbility(ability);
    }

    public CallToServe(final CallToServe card) {
        super(card);
    }

    @Override
    public CallToServe copy() {
        return new CallToServe(this);
    }
}
