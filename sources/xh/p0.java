package xh;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;
public final class p0 implements Runnable {
    public final int f46329a;
    public final long f46330b;
    public final Object f46331c;
    public final Object d;

    public p0(Object obj, long j3, Object obj2, int i10) {
        this.f46329a = i10;
        this.f46331c = obj;
        this.f46330b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f46329a) {
            case 0:
                r1 r1Var = (r1) this.f46331c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                r1Var.getClass();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    r1Var.dismiss();
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.f46330b);
                    bundle.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 1:
                yh.x3 x3Var = (yh.x3) this.f46331c;
                Runnable runnable = (Runnable) this.d;
                x3Var.p2((int) this.f46330b, x3Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                yh.x3 x3Var2 = (yh.x3) this.f46331c;
                x3Var2.getClass();
                ((nf.e) this.d).b();
                x3Var2.p2((int) this.f46330b, x3Var2.getContext(), true);
                return;
            default:
                TL_stories.Boost boost = (TL_stories.Boost) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = ((org.telegram.ui.ActionBar.e3[]) this.f46331c)[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(wn.Q9(boost.giveaway_msg_id, this.f46330b));
                    return;
                }
                return;
        }
    }

    public p0(bb bbVar, Object obj, long j3, int i10) {
        this.f46329a = i10;
        this.f46331c = bbVar;
        this.d = obj;
        this.f46330b = j3;
    }
}
