package pi;

import android.os.Bundle;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.db;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;
import xh.q1;
import yh.s3;
public final class f implements Runnable {
    public final int f45779a;
    public final long f45780b;
    public final Object f45781c;
    public final Object d;

    public f(Object obj, long j3, Object obj2, int i10) {
        this.f45779a = i10;
        this.f45781c = obj;
        this.f45780b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f45779a) {
            case 0:
                s sVar = (s) this.f45781c;
                File file = (File) this.d;
                if (sVar.f45822m == q.f45807f) {
                    long j3 = this.f45780b;
                    sVar.f45825p = j3;
                    sVar.f45827r = 0L;
                    sVar.f45828s = s.q(j3);
                    sVar.c();
                    sVar.t(file);
                    return;
                }
                return;
            case 1:
                Exception exc = (Exception) this.d;
                s sVar2 = (s) ((bc.e) this.f45781c).f3855c;
                if (this.f45780b == sVar2.f45824o) {
                    sVar2.f45823n = null;
                    sVar2.g(exc);
                    return;
                }
                return;
            case 2:
                q1 q1Var = (q1) this.f45781c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                q1Var.getClass();
                m2 U = LaunchActivity.U();
                if (U != null) {
                    q1Var.dismiss();
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.f45780b);
                    bundle.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 3:
                s3 s3Var = (s3) this.f45781c;
                Runnable runnable = (Runnable) this.d;
                s3Var.r2((int) this.f45780b, s3Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                s3 s3Var2 = (s3) this.f45781c;
                s3Var2.getClass();
                ((of.e) this.d).b();
                s3Var2.r2((int) this.f45780b, s3Var2.getContext(), true);
                return;
            default:
                TL_stories.Boost boost = (TL_stories.Boost) this.d;
                e3 e3Var = ((e3[]) this.f45781c)[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(eo.V9(boost.giveaway_msg_id, this.f45780b));
                    return;
                }
                return;
        }
    }

    public f(db dbVar, Object obj, long j3, int i10) {
        this.f45779a = i10;
        this.f45781c = dbVar;
        this.d = obj;
        this.f45780b = j3;
    }
}
