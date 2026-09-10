package zh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;
public final class j1 implements Runnable {
    public final int f48530a;
    public final a3 f48531b;

    public j1(a3 a3Var, int i10) {
        this.f48530a = i10;
        this.f48531b = a3Var;
    }

    @Override
    public final void run() {
        float f7;
        boolean z10;
        switch (this.f48530a) {
            case 0:
                this.f48531b.f48184j2.setVisibility(8);
                return;
            case 1:
                a3 a3Var = this.f48531b;
                if (!a3Var.J0.H0) {
                    a3Var.f48234z3 = null;
                    if (a3Var.H0 == null) {
                        bi.x4 x4Var = new bi.x4(a3Var.getContext(), 3);
                        x4Var.l(1.0f, -22.0f);
                        a3Var.H0 = x4Var;
                        x4Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        bi.x4 x4Var2 = a3Var.H0;
                        x4Var2.U = false;
                        x4Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        a3Var.H0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        h2 h2Var = a3Var.f48160c1;
                        bi.x4 x4Var3 = a3Var.H0;
                        if (a3Var.f48226x2) {
                            f7 = 0.0f;
                        } else {
                            f7 = 56.0f;
                        }
                        h2Var.addView(x4Var3, w7.a6.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f7));
                    }
                    a3Var.H0.u();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    return;
                }
                return;
            case 2:
                this.f48531b.Q0();
                return;
            case 3:
                ((l7) this.f48531b.Q1).b(true);
                return;
            case 4:
                this.f48531b.r0(true);
                return;
            case 5:
                u7 u7Var = this.f48531b.J0;
                if (u7Var != null) {
                    u7Var.H(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                this.f48531b.O0();
                return;
            case 7:
                a3 a3Var2 = this.f48531b;
                a3Var2.L3 = 0L;
                t1 t1Var = a3Var2.f48157b2;
                if (t1Var != null) {
                    t1Var.K(true);
                    a3Var2.f48157b2.R1();
                    a3Var2.r0(true);
                    return;
                }
                return;
            case 8:
                a3 a3Var3 = this.f48531b;
                Activity findActivity = AndroidUtilities.findActivity(a3Var3.getContext());
                if (findActivity != null) {
                    yg.q qVar = new yg.q(10, a3Var3, findActivity);
                    u7 u7Var2 = ((l7) a3Var3.Q1).d;
                    t7 t7Var = u7Var2.f48974z0;
                    if (t7Var != null) {
                        z10 = t7Var.release(qVar);
                        u7Var2.f48974z0 = null;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        AndroidUtilities.runOnUIThread(qVar, 80L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                u7 u7Var3 = ((l7) this.f48531b.Q1).d;
                u7Var3.f48939i1 = false;
                u7Var3.P();
                return;
            case 10:
                this.f48531b.L0(null);
                return;
            case 11:
                this.f48531b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                a3 a3Var4 = this.f48531b;
                a3Var4.U3 = true;
                a3Var4.setActive(false);
                return;
        }
    }
}
