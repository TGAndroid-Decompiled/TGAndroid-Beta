package y2;

import e2.d0;
import java.util.Arrays;
public final class d {
    public int f51750c;
    public int d;
    public final boolean f51748a = true;
    public final int f51749b = 65536;
    public int f51751e = 0;
    public a[] f51752f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 < this.f51750c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51750c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d0.f(this.f51750c, this.f51749b) - this.d);
        int i10 = this.f51751e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f51752f, max, i10, (Object) null);
        this.f51751e = max;
    }
}
