package xh;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
public final class y5 implements Runnable {
    public final int f46336a;
    public final org.telegram.ui.ActionBar.h3[] f46337b;
    public final TL_stars.StarsTransaction f46338c;
    public final long d;

    public y5(org.telegram.ui.ActionBar.h3[] h3VarArr, long j3, TL_stars.StarsTransaction starsTransaction) {
        this.f46336a = 2;
        this.f46337b = h3VarArr;
        this.d = j3;
        this.f46338c = starsTransaction;
    }

    @Override
    public final void run() {
        switch (this.f46336a) {
            case 0:
                this.f46337b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    TL_stars.StarsTransaction starsTransaction = this.f46338c;
                    int i10 = starsTransaction.flags & 8192;
                    long j3 = this.d;
                    if (i10 != 0) {
                        U.presentFragment(eo.Q9(starsTransaction.giveaway_post_id, j3));
                        return;
                    } else {
                        U.presentFragment(eo.R9(j3));
                        return;
                    }
                }
                return;
            case 1:
                this.f46337b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.f46338c;
                    int i11 = starsTransaction2.flags & 8192;
                    long j10 = this.d;
                    if (i11 != 0) {
                        U2.presentFragment(eo.Q9(starsTransaction2.giveaway_post_id, j10));
                        return;
                    } else {
                        U2.presentFragment(eo.R9(j10));
                        return;
                    }
                }
                return;
            case 2:
                this.f46337b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.f46338c.msg_id);
                    U3.presentFragment(new eo(bundle));
                    return;
                }
                return;
            case 3:
                this.f46337b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.f46338c;
                    int i12 = starsTransaction3.flags & 8192;
                    long j11 = this.d;
                    if (i12 != 0) {
                        U4.presentFragment(eo.Q9(starsTransaction3.giveaway_post_id, j11));
                        return;
                    } else {
                        U4.presentFragment(eo.R9(j11));
                        return;
                    }
                }
                return;
            default:
                this.f46337b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.f46338c;
                    int i13 = starsTransaction4.flags & 8192;
                    long j12 = this.d;
                    if (i13 != 0) {
                        U5.presentFragment(eo.Q9(starsTransaction4.giveaway_post_id, j12));
                        return;
                    } else {
                        U5.presentFragment(eo.R9(j12));
                        return;
                    }
                }
                return;
        }
    }

    public y5(org.telegram.ui.ActionBar.h3[] h3VarArr, TL_stars.StarsTransaction starsTransaction, long j3, int i10) {
        this.f46336a = i10;
        this.f46337b = h3VarArr;
        this.f46338c = starsTransaction;
        this.d = j3;
    }
}
