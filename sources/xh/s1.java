package xh;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wv;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;
public final class s1 implements View.OnClickListener {
    public final int f46025a;
    public final Object f46026b;
    public final Object f46027c;

    public s1(int i10, Object obj, Object obj2) {
        this.f46025a = i10;
        this.f46026b = obj;
        this.f46027c = obj2;
    }

    @Override
    public final void onClick(View view) {
        Integer num;
        zh.w2 w2Var;
        switch (this.f46025a) {
            case 0:
                nf.f.u(((x3) this.f46026b).getContext(), ((TL_stars.UniqueStarGiftValueInfo) this.f46027c).fragment_listed_url);
                return;
            case 1:
                ((x3) this.f46026b).n2((CharSequence) this.f46027c);
                return;
            case 2:
                x2 x2Var = (x2) this.f46026b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f46027c;
                if (x2Var.E.getAlpha() >= 1.0f && !x2Var.f46255h0 && !x2Var.f46257j0 && x2Var.f46250d0 != null) {
                    new s0(x2Var.getContext(), f6Var, x2Var.W, x2Var.f46249c0, x2Var.f46250d0, true).show();
                    return;
                }
                return;
            case 3:
                nf.f.s((Context) this.f46026b, ((TL_stars.StarsTransaction) this.f46027c).transaction_url);
                return;
            case 4:
                zh.t0 t0Var = (zh.t0) this.f46026b;
                Context context = (Context) this.f46027c;
                if (t0Var != null) {
                    int i10 = t0Var.e;
                    if (i10 != UserConfig.selectedAccount) {
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            launchActivity.K0(i10);
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i10).getStoriesController().u(t0Var.f48880c, t0Var.f48879b);
                        if (u10 == null) {
                            u10 = t0Var.f48878a;
                        }
                        if (u10 != null) {
                            U.getOrCreateStoryViewer().B(i10, context, u10, null);
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.d1(17), 200L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                zh.a3 a3Var = (zh.a3) this.f46026b;
                zh.j6 j6Var = (zh.j6) this.f46027c;
                zh.u7 u7Var = a3Var.J0;
                if (j6Var.f48544b != null) {
                    Bundle bundle = new Bundle();
                    if (j6Var.f48544b.longValue() >= 0) {
                        bundle.putLong("user_id", j6Var.f48544b.longValue());
                    } else {
                        bundle.putLong("chat_id", -j6Var.f48544b.longValue());
                    }
                    if (j6Var.e && (num = j6Var.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        u7Var.H(new eo(bundle));
                        return;
                    }
                    u7Var.H(new ProfileActivity(bundle, null));
                    return;
                }
                pc Q = new wc(a3Var.f48160c1, a3Var.B0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                Q.f26075a = 3;
                Q.k(true);
                return;
            case 6:
                zh.a3 a3Var2 = (zh.a3) this.f46026b;
                ((zh.l7) a3Var2.Q1).h(new qg.a1(a3Var2.J0.f48931f, 14, false));
                ((org.telegram.ui.ActionBar.h3) this.f46027c).dismiss();
                return;
            default:
                zh.a3 a3Var3 = ((zh.v2) this.f46026b).f48986l;
                wv alert = ((zh.r6) this.f46027c).getAlert();
                if (alert != null && (w2Var = a3Var3.Q1) != null) {
                    ((zh.l7) w2Var).h(alert);
                    a3Var3.f48211t1.a();
                    return;
                }
                return;
        }
    }
}
