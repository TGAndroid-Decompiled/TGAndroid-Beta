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
public final class d implements Runnable {
    public final int f45777a;
    public final long f45778b;
    public final Object f45779c;
    public final Object d;

    public d(Object obj, long j3, Object obj2, int i10) {
        this.f45777a = i10;
        this.f45779c = obj;
        this.f45778b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f45777a) {
            case 0:
                t tVar = (t) this.f45779c;
                File file = (File) this.d;
                if (tVar.f45830m == r.f45815f) {
                    long j3 = this.f45778b;
                    tVar.f45833p = j3;
                    tVar.f45835r = 0L;
                    tVar.f45836s = t.s(j3);
                    tVar.c();
                    tVar.w(file);
                    return;
                }
                return;
            case 1:
                Exception exc = (Exception) this.d;
                t tVar2 = (t) ((bc.e) this.f45779c).f3855c;
                if (this.f45778b == tVar2.f45832o) {
                    tVar2.f45831n = null;
                    tVar2.i(exc);
                    return;
                }
                return;
            case 2:
                q1 q1Var = (q1) this.f45779c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                q1Var.getClass();
                m2 U = LaunchActivity.U();
                if (U != null) {
                    q1Var.dismiss();
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.f45778b);
                    bundle.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 3:
                s3 s3Var = (s3) this.f45779c;
                Runnable runnable = (Runnable) this.d;
                s3Var.r2((int) this.f45778b, s3Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                s3 s3Var2 = (s3) this.f45779c;
                s3Var2.getClass();
                ((of.e) this.d).b();
                s3Var2.r2((int) this.f45778b, s3Var2.getContext(), true);
                return;
            default:
                TL_stories.Boost boost = (TL_stories.Boost) this.d;
                e3 e3Var = ((e3[]) this.f45779c)[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(eo.V9(boost.giveaway_msg_id, this.f45778b));
                    return;
                }
                return;
        }
    }

    public d(db dbVar, Object obj, long j3, int i10) {
        this.f45777a = i10;
        this.f45779c = dbVar;
        this.d = obj;
        this.f45778b = j3;
    }
}
