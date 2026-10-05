package y2;

import e2.d0;
import java.util.Arrays;
public final class d {
    public int f50382c;
    public int d;
    public final boolean f50380a = true;
    public final int f50381b = 65536;
    public int f50383e = 0;
    public a[] f50384f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 < this.f50382c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50382c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d0.f(this.f50382c, this.f50381b) - this.d);
        int i10 = this.f50383e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f50384f, max, i10, (Object) null);
        this.f50383e = max;
    }
}
