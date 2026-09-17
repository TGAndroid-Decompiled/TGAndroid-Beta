package yh;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.co;
public final class o0 implements Runnable {
    public final int f50466a;
    public final long f50467b;
    public final Object f50468c;
    public final Object d;

    public o0(Object obj, long j3, Object obj2, int i10) {
        this.f50466a = i10;
        this.f50468c = obj;
        this.f50467b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f50466a) {
            case 0:
                p1 p1Var = (p1) this.f50468c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                p1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.dismiss();
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.f50467b);
                    bundle.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 1:
                zh.w3 w3Var = (zh.w3) this.f50468c;
                Runnable runnable = (Runnable) this.d;
                w3Var.p2((int) this.f50467b, w3Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                zh.w3 w3Var2 = (zh.w3) this.f50468c;
                w3Var2.getClass();
                ((of.e) this.d).b();
                w3Var2.p2((int) this.f50467b, w3Var2.getContext(), true);
                return;
            default:
                TL_stories.Boost boost = (TL_stories.Boost) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) this.f50468c)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(co.Q9(boost.giveaway_msg_id, this.f50467b));
                    return;
                }
                return;
        }
    }

    public o0(bb bbVar, Object obj, long j3, int i10) {
        this.f50466a = i10;
        this.f50468c = bbVar;
        this.d = obj;
        this.f50467b = j3;
    }
}
