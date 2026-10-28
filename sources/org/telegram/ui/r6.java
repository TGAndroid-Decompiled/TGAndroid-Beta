package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class r6 implements Runnable {
    public final int f42858a;
    public final boolean[] f42859b;
    public final v6 f42860c;
    public final long[] d;
    public final s6 e;

    public r6(boolean[] zArr, v6 v6Var, long[] jArr, s6 s6Var, int i10) {
        this.f42858a = i10;
        this.f42859b = zArr;
        this.f42860c = v6Var;
        this.d = jArr;
        this.e = s6Var;
    }

    @Override
    public final void run() {
        switch (this.f42858a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r6(this.f42859b, this.f42860c, this.d, this.e, 1));
                return;
            default:
                this.f42859b[0] = true;
                this.f42860c.a(1.0f);
                long[] jArr = this.d;
                int i10 = (jArr[0] > 0L ? 1 : (jArr[0] == 0L ? 0 : -1));
                s6 s6Var = this.e;
                if (i10 > 0) {
                    AndroidUtilities.runOnUIThread(new bu0(s6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    return;
                } else {
                    s6Var.dismiss();
                    return;
                }
        }
    }
}
