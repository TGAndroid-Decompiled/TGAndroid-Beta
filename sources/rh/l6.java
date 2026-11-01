package rh;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
public final class l6 implements Runnable {
    public final int f47199a;
    public final org.telegram.ui.ActionBar.z2[] f47200b;
    public final TL_stars.StarsTransaction f47201c;
    public final long d;

    public l6(org.telegram.ui.ActionBar.z2[] z2VarArr, long j10, TL_stars.StarsTransaction starsTransaction) {
        this.f47199a = 3;
        this.f47200b = z2VarArr;
        this.d = j10;
        this.f47201c = starsTransaction;
    }

    @Override
    public final void run() {
        switch (this.f47199a) {
            case 0:
                this.f47200b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    TL_stars.StarsTransaction starsTransaction = this.f47201c;
                    int i10 = starsTransaction.flags & 8192;
                    long j10 = this.d;
                    if (i10 != 0) {
                        T.presentFragment(un.la(starsTransaction.giveaway_post_id, j10));
                        return;
                    } else {
                        T.presentFragment(un.ma(j10));
                        return;
                    }
                }
                return;
            case 1:
                this.f47200b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.f47201c;
                    int i11 = starsTransaction2.flags & 8192;
                    long j11 = this.d;
                    if (i11 != 0) {
                        T2.presentFragment(un.la(starsTransaction2.giveaway_post_id, j11));
                        return;
                    } else {
                        T2.presentFragment(un.ma(j11));
                        return;
                    }
                }
                return;
            case 2:
                this.f47200b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.f47201c;
                    int i12 = starsTransaction3.flags & 8192;
                    long j12 = this.d;
                    if (i12 != 0) {
                        T3.presentFragment(un.la(starsTransaction3.giveaway_post_id, j12));
                        return;
                    } else {
                        T3.presentFragment(un.ma(j12));
                        return;
                    }
                }
                return;
            case 3:
                this.f47200b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.f47201c.msg_id);
                    T4.presentFragment(new un(bundle));
                    return;
                }
                return;
            default:
                this.f47200b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.f47201c;
                    int i13 = starsTransaction4.flags & 8192;
                    long j13 = this.d;
                    if (i13 != 0) {
                        T5.presentFragment(un.la(starsTransaction4.giveaway_post_id, j13));
                        return;
                    } else {
                        T5.presentFragment(un.ma(j13));
                        return;
                    }
                }
                return;
        }
    }

    public l6(org.telegram.ui.ActionBar.z2[] z2VarArr, TL_stars.StarsTransaction starsTransaction, long j10, int i10) {
        this.f47199a = i10;
        this.f47200b = z2VarArr;
        this.f47201c = starsTransaction;
        this.d = j10;
    }
}
