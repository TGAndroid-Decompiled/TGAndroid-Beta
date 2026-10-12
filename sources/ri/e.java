package ri;

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
    public final int f44725a;
    public final long f44726b;
    public final Object f44727c;
    public final Object d;

    public e(Object obj, long j10, Object obj2, int i10) {
        this.f44725a = i10;
        this.f44727c = obj;
        this.f44726b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f44725a) {
            case 0:
                q qVar = (q) this.f44727c;
                File file = (File) this.d;
                if (qVar.f44762m == o.f44748f) {
                    long j10 = this.f44726b;
                    qVar.f44765p = j10;
                    qVar.f44767r = 0L;
                    qVar.f44768s = q.q(j10);
                    qVar.d();
                    qVar.t(file);
                    return;
                }
                return;
            case 1:
                Exception exc = (Exception) this.d;
                q qVar2 = (q) ((cc.e) this.f44727c).f4722c;
                if (this.f44726b == qVar2.f44764o) {
                    qVar2.f44763n = null;
                    qVar2.g(exc);
                    return;
                }
                return;
            case 2:
                p1 p1Var = (p1) this.f44727c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                p1Var.getClass();
                m2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.dismiss();
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.f44726b);
                    bundle.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 3:
                r3 r3Var = (r3) this.f44727c;
                Runnable runnable = (Runnable) this.d;
                r3Var.r2((int) this.f44726b, r3Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                r3 r3Var2 = (r3) this.f44727c;
                r3Var2.getClass();
                ((pf.c) this.d).b();
                r3Var2.r2((int) this.f44726b, r3Var2.getContext(), true);
                return;
            default:
                TL_stories.Boost boost = (TL_stories.Boost) this.d;
                e3 e3Var = ((e3[]) this.f44727c)[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(fo.V9(boost.giveaway_msg_id, this.f44726b));
                    return;
                }
                return;
        }
    }

    public e(db dbVar, Object obj, long j10, int i10) {
        this.f44725a = i10;
        this.f44727c = dbVar;
        this.d = obj;
        this.f44726b = j10;
    }
}
