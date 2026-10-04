package y2;

import e2.d0;
import java.util.Arrays;
public final class d {
    public int f50375c;
    public int d;
    public final boolean f50373a = true;
    public final int f50374b = 65536;
    public int f50376e = 0;
    public a[] f50377f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 < this.f50375c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50375c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d0.f(this.f50375c, this.f50374b) - this.d);
        int i10 = this.f50376e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f50377f, max, i10, (Object) null);
        this.f50376e = max;
    }
}
