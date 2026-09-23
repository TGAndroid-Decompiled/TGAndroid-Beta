package yh;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
public final class w5 implements Runnable {
    public final int f47866a;
    public final org.telegram.ui.ActionBar.f3[] f47867b;
    public final TL_stars.StarsTransaction f47868c;
    public final long d;

    public w5(org.telegram.ui.ActionBar.f3[] f3VarArr, long j3, TL_stars.StarsTransaction starsTransaction) {
        this.f47866a = 2;
        this.f47867b = f3VarArr;
        this.d = j3;
        this.f47868c = starsTransaction;
    }

    @Override
    public final void run() {
        switch (this.f47866a) {
            case 0:
                this.f47867b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    TL_stars.StarsTransaction starsTransaction = this.f47868c;
                    int i10 = starsTransaction.flags & 8192;
                    long j3 = this.d;
                    if (i10 != 0) {
                        U.presentFragment(xn.Q9(starsTransaction.giveaway_post_id, j3));
                        return;
                    } else {
                        U.presentFragment(xn.R9(j3));
                        return;
                    }
                }
                return;
            case 1:
                this.f47867b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.f47868c;
                    int i11 = starsTransaction2.flags & 8192;
                    long j10 = this.d;
                    if (i11 != 0) {
                        U2.presentFragment(xn.Q9(starsTransaction2.giveaway_post_id, j10));
                        return;
                    } else {
                        U2.presentFragment(xn.R9(j10));
                        return;
                    }
                }
                return;
            case 2:
                this.f47867b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.f47868c.msg_id);
                    U3.presentFragment(new xn(bundle));
                    return;
                }
                return;
            case 3:
                this.f47867b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.f47868c;
                    int i12 = starsTransaction3.flags & 8192;
                    long j11 = this.d;
                    if (i12 != 0) {
                        U4.presentFragment(xn.Q9(starsTransaction3.giveaway_post_id, j11));
                        return;
                    } else {
                        U4.presentFragment(xn.R9(j11));
                        return;
                    }
                }
                return;
            default:
                this.f47867b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.f47868c;
                    int i13 = starsTransaction4.flags & 8192;
                    long j12 = this.d;
                    if (i13 != 0) {
                        U5.presentFragment(xn.Q9(starsTransaction4.giveaway_post_id, j12));
                        return;
                    } else {
                        U5.presentFragment(xn.R9(j12));
                        return;
                    }
                }
                return;
        }
    }

    public w5(org.telegram.ui.ActionBar.f3[] f3VarArr, TL_stars.StarsTransaction starsTransaction, long j3, int i10) {
        this.f47866a = i10;
        this.f47867b = f3VarArr;
        this.f47868c = starsTransaction;
        this.d = j3;
    }
}
