package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.oz;
import org.telegram.messenger.qz;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.pr;
import org.telegram.ui.rt0;
import org.telegram.ui.un;
public final class l implements Runnable {
    public final int f43086a;
    public final long f43087b;
    public final int f43088c;

    public l(int i10, long j10, int i11) {
        this.f43086a = i11;
        this.f43088c = i10;
        this.f43087b = j10;
    }

    @Override
    public final void run() {
        switch (this.f43086a) {
            case 0:
                k2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(un.ga(this.f43088c, this.f43087b));
                    return;
                }
                return;
            case 1:
                k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    long j10 = this.f43087b;
                    if (j10 >= 0) {
                        T2.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i10 = this.f43088c;
                    long j11 = -j10;
                    if (w3.V(vp.r1(i10).L0(Long.valueOf(j11)))) {
                        T2.presentFragment(new rt0(j11));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j11);
                    bundle.putInt("type", 3);
                    pr prVar = new pr(bundle);
                    prVar.B0(vp.r1(i10).M0(j11));
                    T2.presentFragment(prVar);
                    return;
                }
                return;
            case 2:
                qz.C(this.f43088c).r0(oz.b("/privacy", this.f43087b, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            default:
                int i11 = this.f43088c;
                long j12 = this.f43087b;
                try {
                    SQLitePreparedStatement executeFast = hs.a0(i11).f15940b.executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j12);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
        }
    }

    public l(long j10, int i10, int i11) {
        this.f43086a = i11;
        this.f43087b = j10;
        this.f43088c = i10;
    }
}
