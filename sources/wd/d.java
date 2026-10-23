package wd;

import java.util.Iterator;
import w7.i0;
public abstract class d implements Iterable {
    public final int f48933a;
    public final int f48934b;
    public final int f48935c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f48933a = i10;
                this.f48934b = i0.a(i10, i11, i12);
                this.f48935c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f48933a, this.f48934b, this.f48935c);
    }
}
