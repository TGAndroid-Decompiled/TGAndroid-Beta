package yh;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;
public final class v5 implements Runnable {
    public final int f48150a;
    public final org.telegram.ui.ActionBar.e3[] f48151b;
    public final TL_stars.StarsTransaction f48152c;
    public final long d;

    public v5(org.telegram.ui.ActionBar.e3[] e3VarArr, long j3, TL_stars.StarsTransaction starsTransaction) {
        this.f48150a = 2;
        this.f48151b = e3VarArr;
        this.d = j3;
        this.f48152c = starsTransaction;
    }

    @Override
    public final void run() {
        switch (this.f48150a) {
            case 0:
                this.f48151b[0].dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    TL_stars.StarsTransaction starsTransaction = this.f48152c;
                    int i10 = starsTransaction.flags & 8192;
                    long j3 = this.d;
                    if (i10 != 0) {
                        U.presentFragment(wn.Q9(starsTransaction.giveaway_post_id, j3));
                        return;
                    } else {
                        U.presentFragment(wn.R9(j3));
                        return;
                    }
                }
                return;
            case 1:
                this.f48151b[0].dismiss();
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.f48152c;
                    int i11 = starsTransaction2.flags & 8192;
                    long j10 = this.d;
                    if (i11 != 0) {
                        U2.presentFragment(wn.Q9(starsTransaction2.giveaway_post_id, j10));
                        return;
                    } else {
                        U2.presentFragment(wn.R9(j10));
                        return;
                    }
                }
                return;
            case 2:
                this.f48151b[0].dismiss();
                org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.f48152c.msg_id);
                    U3.presentFragment(new wn(bundle));
                    return;
                }
                return;
            case 3:
                this.f48151b[0].dismiss();
                org.telegram.ui.ActionBar.m2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.f48152c;
                    int i12 = starsTransaction3.flags & 8192;
                    long j11 = this.d;
                    if (i12 != 0) {
                        U4.presentFragment(wn.Q9(starsTransaction3.giveaway_post_id, j11));
                        return;
                    } else {
                        U4.presentFragment(wn.R9(j11));
                        return;
                    }
                }
                return;
            default:
                this.f48151b[0].dismiss();
                org.telegram.ui.ActionBar.m2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.f48152c;
                    int i13 = starsTransaction4.flags & 8192;
                    long j12 = this.d;
                    if (i13 != 0) {
                        U5.presentFragment(wn.Q9(starsTransaction4.giveaway_post_id, j12));
                        return;
                    } else {
                        U5.presentFragment(wn.R9(j12));
                        return;
                    }
                }
                return;
        }
    }

    public v5(org.telegram.ui.ActionBar.e3[] e3VarArr, TL_stars.StarsTransaction starsTransaction, long j3, int i10) {
        this.f48150a = i10;
        this.f48151b = e3VarArr;
        this.f48152c = starsTransaction;
        this.d = j3;
    }
}
