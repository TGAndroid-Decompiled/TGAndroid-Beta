package rh;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
public final class l6 implements Runnable {
    public final int f47185a;
    public final org.telegram.ui.ActionBar.z2[] f47186b;
    public final TL_stars.StarsTransaction f47187c;
    public final long d;

    public l6(org.telegram.ui.ActionBar.z2[] z2VarArr, long j10, TL_stars.StarsTransaction starsTransaction) {
        this.f47185a = 3;
        this.f47186b = z2VarArr;
        this.d = j10;
        this.f47187c = starsTransaction;
    }

    @Override
    public final void run() {
        switch (this.f47185a) {
            case 0:
                this.f47186b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    TL_stars.StarsTransaction starsTransaction = this.f47187c;
                    int i10 = starsTransaction.flags & 8192;
                    long j10 = this.d;
                    if (i10 != 0) {
                        T.presentFragment(un.ga(starsTransaction.giveaway_post_id, j10));
                        return;
                    } else {
                        T.presentFragment(un.ha(j10));
                        return;
                    }
                }
                return;
            case 1:
                this.f47186b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.f47187c;
                    int i11 = starsTransaction2.flags & 8192;
                    long j11 = this.d;
                    if (i11 != 0) {
                        T2.presentFragment(un.ga(starsTransaction2.giveaway_post_id, j11));
                        return;
                    } else {
                        T2.presentFragment(un.ha(j11));
                        return;
                    }
                }
                return;
            case 2:
                this.f47186b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.f47187c;
                    int i12 = starsTransaction3.flags & 8192;
                    long j12 = this.d;
                    if (i12 != 0) {
                        T3.presentFragment(un.ga(starsTransaction3.giveaway_post_id, j12));
                        return;
                    } else {
                        T3.presentFragment(un.ha(j12));
                        return;
                    }
                }
                return;
            case 3:
                this.f47186b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.f47187c.msg_id);
                    T4.presentFragment(new un(bundle));
                    return;
                }
                return;
            default:
                this.f47186b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.f47187c;
                    int i13 = starsTransaction4.flags & 8192;
                    long j13 = this.d;
                    if (i13 != 0) {
                        T5.presentFragment(un.ga(starsTransaction4.giveaway_post_id, j13));
                        return;
                    } else {
                        T5.presentFragment(un.ha(j13));
                        return;
                    }
                }
                return;
        }
    }

    public l6(org.telegram.ui.ActionBar.z2[] z2VarArr, TL_stars.StarsTransaction starsTransaction, long j10, int i10) {
        this.f47185a = i10;
        this.f47186b = z2VarArr;
        this.f47187c = starsTransaction;
        this.d = j10;
    }
}
