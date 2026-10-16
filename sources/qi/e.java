package qi;

import android.os.Bundle;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.db;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;
import yh.p1;
import zh.r3;
public final class e implements Runnable {
    public final int f43401a;
    public final long f43402b;
    public final Object f43403c;
    public final Object d;

    public e(Object obj, long j10, Object obj2, int i10) {
        this.f43401a = i10;
        this.f43403c = obj;
        this.f43402b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f43401a) {
            case 0:
                q qVar = (q) this.f43403c;
                File file = (File) this.d;
                if (qVar.f43438m == o.f43424f) {
                    long j10 = this.f43402b;
                    qVar.f43441p = j10;
                    qVar.f43443r = 0L;
                    qVar.f43444s = q.q(j10);
                    qVar.d();
                    qVar.t(file);
                    return;
                }
                return;
            case 1:
                Exception exc = (Exception) this.d;
                q qVar2 = (q) ((cc.e) this.f43403c).f4725c;
                if (this.f43402b == qVar2.f43440o) {
                    qVar2.f43439n = null;
                    qVar2.g(exc);
                    return;
                }
                return;
            case 2:
                p1 p1Var = (p1) this.f43403c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                p1Var.getClass();
                m2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.dismiss();
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.f43402b);
                    bundle.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 3:
                r3 r3Var = (r3) this.f43403c;
                Runnable runnable = (Runnable) this.d;
                r3Var.r2((int) this.f43402b, r3Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                r3 r3Var2 = (r3) this.f43403c;
                r3Var2.getClass();
                ((pf.c) this.d).b();
                r3Var2.r2((int) this.f43402b, r3Var2.getContext(), true);
                return;
            default:
                TL_stories.Boost boost = (TL_stories.Boost) this.d;
                e3 e3Var = ((e3[]) this.f43403c)[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(fo.V9(boost.giveaway_msg_id, this.f43402b));
                    return;
                }
                return;
        }
    }

    public e(db dbVar, Object obj, long j10, int i10) {
        this.f43401a = i10;
        this.f43403c = dbVar;
        this.d = obj;
        this.f43402b = j10;
    }
}
