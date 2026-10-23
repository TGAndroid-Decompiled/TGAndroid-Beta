package wd;

import java.util.Iterator;
import w7.i0;
public abstract class d implements Iterable {
    public final int f49371a;
    public final int f49372b;
    public final int f49373c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f49371a = i10;
                this.f49372b = i0.a(i10, i11, i12);
                this.f49373c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f49371a, this.f49372b, this.f49373c);
    }
}
