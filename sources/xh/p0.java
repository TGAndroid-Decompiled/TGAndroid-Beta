package xh;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
public final class p0 implements Runnable {
    public final int f46015a;
    public final long f46016b;
    public final Object f46017c;
    public final Object d;

    public p0(Object obj, long j3, Object obj2, int i10) {
        this.f46015a = i10;
        this.f46017c = obj;
        this.f46016b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f46015a) {
            case 0:
                r1 r1Var = (r1) this.f46017c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                r1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    r1Var.dismiss();
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.f46016b);
                    bundle.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 1:
                yh.y3 y3Var = (yh.y3) this.f46017c;
                Runnable runnable = (Runnable) this.d;
                y3Var.p2((int) this.f46016b, y3Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                yh.y3 y3Var2 = (yh.y3) this.f46017c;
                y3Var2.getClass();
                ((nf.e) this.d).b();
                y3Var2.p2((int) this.f46016b, y3Var2.getContext(), true);
                return;
            default:
                TL_stories.Boost boost = (TL_stories.Boost) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) this.f46017c)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(xn.Q9(boost.giveaway_msg_id, this.f46016b));
                    return;
                }
                return;
        }
    }

    public p0(bb bbVar, Object obj, long j3, int i10) {
        this.f46015a = i10;
        this.f46017c = bbVar;
        this.d = obj;
        this.f46016b = j3;
    }
}
