package qh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.qc;
public final class k4 extends x1 {
    public final int E;
    public final a5 F;

    public k4(a5 a5Var, Context context, p4 p4Var, int i10) {
        super(context, p4Var, false, false);
        this.F = a5Var;
        this.E = i10;
    }

    @Override
    public final boolean l0(Integer num) {
        v4 v4Var = this.F.O0;
        if (num.intValue() == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < v4Var.getChildCount(); i11++) {
                if (v4Var.getChildAt(i11) instanceof eg.y2) {
                    i10++;
                }
            }
            if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                String formatPluralString = LocaleController.formatPluralString("StoryPremiumWidgets2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]);
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new qc(this.container, this.resourcesProvider).M(LocaleController.getString(R.string.IncreaseLimit), AndroidUtilities.replaceSingleTag(formatPluralString, org.telegram.ui.ActionBar.k6.f21722gc, 0, new org.telegram.ui.web.s0(this, 13), this.resourcesProvider), R.raw.star_premium_2).k(true);
                return false;
            } else if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium) {
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new qc(this.container, this.resourcesProvider).M(LocaleController.getString("LimitReached", R.string.LimitReached), LocaleController.formatPluralString("StoryReactionsWidgetLimit2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]), R.raw.chats_infotip).k(true);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean m0(Integer num) {
        a5 a5Var = this.F;
        v4 v4Var = a5Var.O0;
        boolean z4 = false;
        if (a5Var.U1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i10 = 0;
            while (true) {
                if (i10 >= v4Var.getChildCount()) {
                    break;
                } else if (v4Var.getChildAt(i10) instanceof eg.a4) {
                    z4 = true;
                    break;
                } else {
                    i10++;
                }
            }
            return !z4;
        }
        return true;
    }

    @Override
    public final boolean n0(im imVar) {
        return this.F.f0(imVar);
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.F.R0(this.E);
    }
}
