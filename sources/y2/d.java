package y2;

import e2.d0;
import java.util.Arrays;
public final class d {
    public int f49511c;
    public int d;
    public final boolean f49509a = true;
    public final int f49510b = 65536;
    public int f49512e = 0;
    public a[] f49513f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 < this.f49511c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49511c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d0.f(this.f49511c, this.f49510b) - this.d);
        int i10 = this.f49512e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f49513f, max, i10, (Object) null);
        this.f49512e = max;
    }
}
