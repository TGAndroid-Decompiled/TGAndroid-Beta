package y2;

import e2.d0;
import java.util.Arrays;
public final class d {
    public int f50366c;
    public int d;
    public final boolean f50364a = true;
    public final int f50365b = 65536;
    public int f50367e = 0;
    public a[] f50368f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 < this.f50366c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50366c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d0.f(this.f50366c, this.f50365b) - this.d);
        int i10 = this.f50367e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f50368f, max, i10, (Object) null);
        this.f50367e = max;
    }
}
