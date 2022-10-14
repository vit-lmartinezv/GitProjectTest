/**
 *
 */
package org.gs.gsusaaddon.ruleengine.actions;

import de.hybris.platform.ruleengineservices.rao.CartRAO;
import de.hybris.platform.ruleengineservices.rule.evaluation.RuleActionContext;
import de.hybris.platform.ruleengineservices.rule.evaluation.actions.AbstractRuleExecutableSupport;
import de.hybris.platform.ruleengineservices.rule.evaluation.actions.RAOAction;

import java.math.BigDecimal;


/**
 * Used to add the appropriate Council Fee product to cart under the correct conditions.
 *
 */
public class RuleMembershipFeeRAOAction extends AbstractRuleExecutableSupport implements RAOAction
{
	protected void performAction(final RuleActionContext context, final BigDecimal amount, final BigDecimal maxDiscount)
	{
		final CartRAO cartRao = context.getCartRao();

		// TODO call custom service to get the appropriate council fee product based on the council id of the order entry with the membership product and add it to the cart
	}
}
