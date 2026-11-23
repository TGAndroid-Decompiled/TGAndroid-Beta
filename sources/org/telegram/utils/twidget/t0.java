package org.telegram.utils.twidget;

import android.os.SystemClock;
public final class t0 implements p0 {
    public final int f54984a;
    public final x0 f54985b;
    public final byte[] f54986c;
    public final int d;

    public t0(int i7, int i10, x0 x0Var, byte[] bArr) {
        this.f54984a = i10;
        this.f54985b = x0Var;
        this.f54986c = bArr;
        this.d = i7;
    }

    @Override
    public final Object run() {
        switch (this.f54984a) {
            case 0:
                x0 x0Var = this.f54985b;
                byte[] bArr = this.f54986c;
                int i7 = this.d;
                byte[] i12 = x0Var.i1(bArr);
                if (i12.length <= 1048576) {
                    synchronized (x0Var) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        double min = Math.min(2000.0d, ((elapsedRealtime - x0Var.f55028i) * 1.0d) + x0Var.f55027f);
                        x0Var.f55027f = min;
                        x0Var.f55028i = elapsedRealtime;
                        if (min >= 1.0d) {
                            x0Var.f55027f = min - 1.0d;
                            x0Var.f55024b.signal(i7, i12);
                            return null;
                        }
                        throw new IllegalStateException("Widget engine: too many signals");
                    }
                }
                throw new IllegalArgumentException("Signal too long");
            default:
                x0 x0Var2 = this.f54985b;
                byte[] bArr2 = this.f54986c;
                int i10 = this.d;
                x0Var2.getClass();
                if (bArr2 != null && bArr2.length <= 262144) {
                    return Float.valueOf(x0Var2.f55024b.textWidth(i10, bArr2));
                }
                throw new IllegalArgumentException("Text too long");
        }
    }
}
