package y2;

import e2.d0;
import java.util.Arrays;
public final class d {
    public int f51663c;
    public int d;
    public final boolean f51661a = true;
    public final int f51662b = 65536;
    public int f51664e = 0;
    public a[] f51665f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 < this.f51663c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51663c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d0.f(this.f51663c, this.f51662b) - this.d);
        int i10 = this.f51664e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f51665f, max, i10, (Object) null);
        this.f51664e = max;
    }
}
