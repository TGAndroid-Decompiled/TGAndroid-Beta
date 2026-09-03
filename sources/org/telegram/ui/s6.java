package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class s6 implements Runnable {
    public final int f38105a;
    public final boolean[] f38106b;
    public final v6 f38107c;
    public final long[] d;
    public final t6 e;

    public s6(boolean[] zArr, v6 v6Var, long[] jArr, t6 t6Var, int i10) {
        this.f38105a = i10;
        this.f38106b = zArr;
        this.f38107c = v6Var;
        this.d = jArr;
        this.e = t6Var;
    }

    @Override
    public final void run() {
        switch (this.f38105a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s6(this.f38106b, this.f38107c, this.d, this.e, 1));
                return;
            default:
                this.f38106b[0] = true;
                this.f38107c.a(1.0f);
                long[] jArr = this.d;
                long j10 = jArr[0];
                t6 t6Var = this.e;
                if (j10 > 0) {
                    AndroidUtilities.runOnUIThread(new yt0(t6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    t6Var.dismiss();
                    return;
                }
        }
    }
}
