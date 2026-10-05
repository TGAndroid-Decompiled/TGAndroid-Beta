package xh;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.yn;
public final class p0 implements Runnable {
    public final int f50176a;
    public final long f50177b;
    public final Object f50178c;
    public final Object d;

    public p0(Object obj, long j3, Object obj2, int i10) {
        this.f50176a = i10;
        this.f50178c = obj;
        this.f50177b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f50176a) {
            case 0:
                q1 q1Var = (q1) this.f50178c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                q1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    q1Var.dismiss();
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.f50177b);
                    bundle.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 1:
                yh.y3 y3Var = (yh.y3) this.f50178c;
                Runnable runnable = (Runnable) this.d;
                y3Var.p2((int) this.f50177b, y3Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                yh.y3 y3Var2 = (yh.y3) this.f50178c;
                y3Var2.getClass();
                ((nf.e) this.d).b();
                y3Var2.p2((int) this.f50177b, y3Var2.getContext(), true);
                return;
            default:
                TL_stories.Boost boost = (TL_stories.Boost) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) this.f50178c)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(yn.P9(boost.giveaway_msg_id, this.f50177b));
                    return;
                }
                return;
        }
    }

    public p0(cb cbVar, Object obj, long j3, int i10) {
        this.f50176a = i10;
        this.f50178c = cbVar;
        this.d = obj;
        this.f50177b = j3;
    }
}
