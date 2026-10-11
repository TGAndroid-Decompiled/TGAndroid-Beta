package y2;

import e2.d0;
import java.util.Arrays;
public final class d {
    public int f51784c;
    public int d;
    public final boolean f51782a = true;
    public final int f51783b = 65536;
    public int f51785e = 0;
    public a[] f51786f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 < this.f51784c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51784c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d0.f(this.f51784c, this.f51783b) - this.d);
        int i10 = this.f51785e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f51786f, max, i10, (Object) null);
        this.f51785e = max;
    }
}
