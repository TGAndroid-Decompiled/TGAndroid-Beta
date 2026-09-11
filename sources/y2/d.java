package y2;

import e2.d0;
import java.util.Arrays;
public final class d {
    public int f49482c;
    public int d;
    public final boolean f49480a = true;
    public final int f49481b = 65536;
    public int f49483e = 0;
    public a[] f49484f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 < this.f49482c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49482c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d0.f(this.f49482c, this.f49481b) - this.d);
        int i10 = this.f49483e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f49484f, max, i10, (Object) null);
        this.f49483e = max;
    }
}
