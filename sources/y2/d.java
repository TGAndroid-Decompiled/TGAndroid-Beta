package y2;

import e2.d0;
import java.util.Arrays;
public final class d {
    public int f51661c;
    public int d;
    public final boolean f51659a = true;
    public final int f51660b = 65536;
    public int f51662e = 0;
    public a[] f51663f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 < this.f51661c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51661c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d0.f(this.f51661c, this.f51660b) - this.d);
        int i10 = this.f51662e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f51663f, max, i10, (Object) null);
        this.f51662e = max;
    }
}
