package y2;

import e2.d0;
import java.util.Arrays;
public final class d {
    public int f51895c;
    public int d;
    public final boolean f51893a = true;
    public final int f51894b = 65536;
    public int f51896e = 0;
    public a[] f51897f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 < this.f51895c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51895c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d0.f(this.f51895c, this.f51894b) - this.d);
        int i10 = this.f51896e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f51897f, max, i10, (Object) null);
        this.f51896e = max;
    }
}
