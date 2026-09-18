package y2;

import e2.d0;
import java.util.Arrays;
public final class d {
    public int f46291c;
    public int d;
    public final boolean f46289a = true;
    public final int f46290b = 65536;
    public int e = 0;
    public a[] f46292f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 < this.f46291c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46291c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d0.f(this.f46291c, this.f46290b) - this.d);
        int i10 = this.e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f46292f, max, i10, (Object) null);
        this.e = max;
    }
}
