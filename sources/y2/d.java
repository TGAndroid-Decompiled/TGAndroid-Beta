package y2;

import e2.d0;
import java.util.Arrays;
public final class d {
    public int f46565c;
    public int d;
    public final boolean f46563a = true;
    public final int f46564b = 65536;
    public int e = 0;
    public a[] f46566f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 < this.f46565c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46565c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d0.f(this.f46565c, this.f46564b) - this.d);
        int i10 = this.e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f46566f, max, i10, (Object) null);
        this.e = max;
    }
}
