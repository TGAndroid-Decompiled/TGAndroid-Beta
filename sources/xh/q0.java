package xh;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.eb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;
public final class q0 implements Runnable {
    public final int f51505a;
    public final long f51506b;
    public final Object f51507c;
    public final Object d;

    public q0(Object obj, long j3, Object obj2, int i10) {
        this.f51505a = i10;
        this.f51507c = obj;
        this.f51506b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f51505a) {
            case 0:
                r1 r1Var = (r1) this.f51507c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                r1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    r1Var.dismiss();
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.f51506b);
                    bundle.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 1:
                yh.s3 s3Var = (yh.s3) this.f51507c;
                Runnable runnable = (Runnable) this.d;
                s3Var.r2((int) this.f51506b, s3Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                yh.s3 s3Var2 = (yh.s3) this.f51507c;
                s3Var2.getClass();
                ((of.e) this.d).b();
                s3Var2.r2((int) this.f51506b, s3Var2.getContext(), true);
                return;
            default:
                TL_stories.Boost boost = (TL_stories.Boost) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) this.f51507c)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(zn.V9(boost.giveaway_msg_id, this.f51506b));
                    return;
                }
                return;
        }
    }

    public q0(eb ebVar, Object obj, long j3, int i10) {
        this.f51505a = i10;
        this.f51507c = ebVar;
        this.d = obj;
        this.f51506b = j3;
    }
}
