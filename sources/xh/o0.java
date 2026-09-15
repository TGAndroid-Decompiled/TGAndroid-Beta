package xh;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bo;
public final class o0 implements Runnable {
    public final int f46049a;
    public final long f46050b;
    public final Object f46051c;
    public final Object d;

    public o0(Object obj, long j3, Object obj2, int i10) {
        this.f46049a = i10;
        this.f46051c = obj;
        this.f46050b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f46049a) {
            case 0:
                q1 q1Var = (q1) this.f46051c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                q1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    q1Var.dismiss();
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.f46050b);
                    bundle.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 1:
                yh.a4 a4Var = (yh.a4) this.f46051c;
                Runnable runnable = (Runnable) this.d;
                a4Var.p2((int) this.f46050b, a4Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                yh.a4 a4Var2 = (yh.a4) this.f46051c;
                a4Var2.getClass();
                ((nf.e) this.d).b();
                a4Var2.p2((int) this.f46050b, a4Var2.getContext(), true);
                return;
            default:
                TL_stories.Boost boost = (TL_stories.Boost) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) this.f46051c)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(bo.Q9(boost.giveaway_msg_id, this.f46050b));
                    return;
                }
                return;
        }
    }

    public o0(za zaVar, Object obj, long j3, int i10) {
        this.f46049a = i10;
        this.f46051c = zaVar;
        this.d = obj;
        this.f46050b = j3;
    }
}
