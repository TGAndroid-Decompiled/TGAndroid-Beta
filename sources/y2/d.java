package y2;

import e2.d0;
import java.util.Arrays;
public final class d {
    public int f46518c;
    public int d;
    public final boolean f46516a = true;
    public final int f46517b = 65536;
    public int e = 0;
    public a[] f46519f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 < this.f46518c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46518c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d0.f(this.f46518c, this.f46517b) - this.d);
        int i10 = this.e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f46519f, max, i10, (Object) null);
        this.e = max;
    }
}
