package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class r6 implements Runnable {
    public final int f39304a;
    public final boolean[] f39305b;
    public final v6 f39306c;
    public final long[] d;
    public final s6 e;

    public r6(boolean[] zArr, v6 v6Var, long[] jArr, s6 s6Var, int i10) {
        this.f39304a = i10;
        this.f39305b = zArr;
        this.f39306c = v6Var;
        this.d = jArr;
        this.e = s6Var;
    }

    @Override
    public final void run() {
        switch (this.f39304a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r6(this.f39305b, this.f39306c, this.d, this.e, 1));
                return;
            default:
                this.f39305b[0] = true;
                this.f39306c.a(1.0f);
                long[] jArr = this.d;
                int i10 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                s6 s6Var = this.e;
                if (i10 > 0) {
                    AndroidUtilities.runOnUIThread(new su0(s6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    s6Var.dismiss();
                    return;
                }
        }
    }
}
