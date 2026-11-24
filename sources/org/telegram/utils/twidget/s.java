package org.telegram.utils.twidget;

import android.os.SystemClock;
public final class s implements xvc {
    public final byte a;
    public final w b;
    public final byte[] c;
    public final int d;

    public s(w wVar, byte[] bArr, int i, byte b) {
        this.a = b;
        this.b = wVar;
        this.c = bArr;
        this.d = i;
    }

    @Override
    public final Object run() {
        switch (this.a) {
            case 0:
                w wVar = this.b;
                byte[] bArr = this.c;
                int i = this.d;
                byte[] b = wVar.b(bArr);
                if (b.length <= 1048576) {
                    synchronized (wVar) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        double min = Math.min(2000.0d, ((elapsedRealtime - wVar.i) * 1.0d) + wVar.f);
                        wVar.f = min;
                        wVar.i = elapsedRealtime;
                        if (min >= 1.0d) {
                            wVar.f = min - 1.0d;
                            wVar.b.signal(i, b);
                        } else {
                            sc8.j("Widget engine: too many signals");
                        }
                    }
                } else {
                    w26.j("Signal too long");
                }
                return null;
            default:
                w wVar2 = this.b;
                byte[] bArr2 = this.c;
                int i2 = this.d;
                if (bArr2 != null && bArr2.length <= 262144) {
                    return Float.valueOf(wVar2.b.textWidth(i2, bArr2));
                }
                w26.j("Text too long");
                return null;
        }
    }
}
