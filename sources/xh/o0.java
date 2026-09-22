package xh;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bo;
public final class o0 implements Runnable {
    public final int f46045a;
    public final long f46046b;
    public final Object f46047c;
    public final Object d;

    public o0(Object obj, long j3, Object obj2, int i10) {
        this.f46045a = i10;
        this.f46047c = obj;
        this.f46046b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f46045a) {
            case 0:
                q1 q1Var = (q1) this.f46047c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                q1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    q1Var.dismiss();
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.f46046b);
                    bundle.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 1:
                yh.z3 z3Var = (yh.z3) this.f46047c;
                Runnable runnable = (Runnable) this.d;
                z3Var.p2((int) this.f46046b, z3Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                yh.z3 z3Var2 = (yh.z3) this.f46047c;
                z3Var2.getClass();
                ((nf.e) this.d).b();
                z3Var2.p2((int) this.f46046b, z3Var2.getContext(), true);
                return;
            default:
                TL_stories.Boost boost = (TL_stories.Boost) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) this.f46047c)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(bo.Q9(boost.giveaway_msg_id, this.f46046b));
                    return;
                }
                return;
        }
    }

    public o0(za zaVar, Object obj, long j3, int i10) {
        this.f46045a = i10;
        this.f46047c = zaVar;
        this.d = obj;
        this.f46046b = j3;
    }
}
