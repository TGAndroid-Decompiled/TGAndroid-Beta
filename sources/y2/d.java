package y2;

import e2.d0;
import java.util.Arrays;
public final class d {
    public int f51707c;
    public int d;
    public final boolean f51705a = true;
    public final int f51706b = 65536;
    public int f51708e = 0;
    public a[] f51709f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 < this.f51707c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51707c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d0.f(this.f51707c, this.f51706b) - this.d);
        int i10 = this.f51708e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f51709f, max, i10, (Object) null);
        this.f51708e = max;
    }
}
