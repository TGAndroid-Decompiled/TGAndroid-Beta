package yh;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yn;
public final class a6 implements Runnable {
    public final int f51108a;
    public final org.telegram.ui.ActionBar.f3[] f51109b;
    public final TL_stars.StarsTransaction f51110c;
    public final long d;

    public a6(org.telegram.ui.ActionBar.f3[] f3VarArr, long j3, TL_stars.StarsTransaction starsTransaction) {
        this.f51108a = 2;
        this.f51109b = f3VarArr;
        this.d = j3;
        this.f51110c = starsTransaction;
    }

    @Override
    public final void run() {
        switch (this.f51108a) {
            case 0:
                this.f51109b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    TL_stars.StarsTransaction starsTransaction = this.f51110c;
                    int i10 = starsTransaction.flags & 8192;
                    long j3 = this.d;
                    if (i10 != 0) {
                        U.presentFragment(yn.P9(starsTransaction.giveaway_post_id, j3));
                        return;
                    } else {
                        U.presentFragment(yn.Q9(j3));
                        return;
                    }
                }
                return;
            case 1:
                this.f51109b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.f51110c;
                    int i11 = starsTransaction2.flags & 8192;
                    long j10 = this.d;
                    if (i11 != 0) {
                        U2.presentFragment(yn.P9(starsTransaction2.giveaway_post_id, j10));
                        return;
                    } else {
                        U2.presentFragment(yn.Q9(j10));
                        return;
                    }
                }
                return;
            case 2:
                this.f51109b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.f51110c.msg_id);
                    U3.presentFragment(new yn(bundle));
                    return;
                }
                return;
            case 3:
                this.f51109b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.f51110c;
                    int i12 = starsTransaction3.flags & 8192;
                    long j11 = this.d;
                    if (i12 != 0) {
                        U4.presentFragment(yn.P9(starsTransaction3.giveaway_post_id, j11));
                        return;
                    } else {
                        U4.presentFragment(yn.Q9(j11));
                        return;
                    }
                }
                return;
            default:
                this.f51109b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.f51110c;
                    int i13 = starsTransaction4.flags & 8192;
                    long j12 = this.d;
                    if (i13 != 0) {
                        U5.presentFragment(yn.P9(starsTransaction4.giveaway_post_id, j12));
                        return;
                    } else {
                        U5.presentFragment(yn.Q9(j12));
                        return;
                    }
                }
                return;
        }
    }

    public a6(org.telegram.ui.ActionBar.f3[] f3VarArr, TL_stars.StarsTransaction starsTransaction, long j3, int i10) {
        this.f51108a = i10;
        this.f51109b = f3VarArr;
        this.f51110c = starsTransaction;
        this.d = j3;
    }
}
