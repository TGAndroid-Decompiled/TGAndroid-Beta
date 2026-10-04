package y2;

import e2.d0;
import java.util.Arrays;
public final class d {
    public int f50367c;
    public int d;
    public final boolean f50365a = true;
    public final int f50366b = 65536;
    public int f50368e = 0;
    public a[] f50369f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 < this.f50367c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50367c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d0.f(this.f50367c, this.f50366b) - this.d);
        int i10 = this.f50368e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f50369f, max, i10, (Object) null);
        this.f50368e = max;
    }
}
