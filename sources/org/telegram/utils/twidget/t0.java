package org.telegram.utils.twidget;

import android.os.SystemClock;
public final class t0 implements p0 {
    public final int f54980a;
    public final x0 f54981b;
    public final byte[] f54982c;
    public final int d;

    public t0(int i7, int i10, x0 x0Var, byte[] bArr) {
        this.f54980a = i10;
        this.f54981b = x0Var;
        this.f54982c = bArr;
        this.d = i7;
    }

    @Override
    public final Object run() {
        switch (this.f54980a) {
            case 0:
                x0 x0Var = this.f54981b;
                byte[] bArr = this.f54982c;
                int i7 = this.d;
                byte[] i12 = x0Var.i1(bArr);
                if (i12.length <= 1048576) {
                    synchronized (x0Var) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        double min = Math.min(2000.0d, ((elapsedRealtime - x0Var.f55024i) * 1.0d) + x0Var.f55023f);
                        x0Var.f55023f = min;
                        x0Var.f55024i = elapsedRealtime;
                        if (min >= 1.0d) {
                            x0Var.f55023f = min - 1.0d;
                            x0Var.f55020b.signal(i7, i12);
                            return null;
                        }
                        throw new IllegalStateException("Widget engine: too many signals");
                    }
                }
                throw new IllegalArgumentException("Signal too long");
            default:
                x0 x0Var2 = this.f54981b;
                byte[] bArr2 = this.f54982c;
                int i10 = this.d;
                x0Var2.getClass();
                if (bArr2 != null && bArr2.length <= 262144) {
                    return Float.valueOf(x0Var2.f55020b.textWidth(i10, bArr2));
                }
                throw new IllegalArgumentException("Text too long");
        }
    }
}
