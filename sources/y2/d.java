package y2;

import e2.d0;
import java.util.Arrays;
public final class d {
    public int f46217c;
    public int d;
    public final boolean f46215a = true;
    public final int f46216b = 65536;
    public int e = 0;
    public a[] f46218f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 < this.f46217c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46217c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, d0.f(this.f46217c, this.f46216b) - this.d);
        int i10 = this.e;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f46218f, max, i10, (Object) null);
        this.e = max;
    }
}
