package y2;

import e2.d0;
import java.util.Arrays;
public final class d {
    public int f49483c;
    public int d;
    public final boolean f49481a = true;
    public final int f49482b = 65536;
    public int f49484e = 0;
    public a[] f49485f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 < this.f49483c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49483c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d0.f(this.f49483c, this.f49482b) - this.d);
        int i10 = this.f49484e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f49485f, max, i10, (Object) null);
        this.f49484e = max;
    }
}
