package wd;

import java.util.Iterator;
import w7.i0;
public abstract class d implements Iterable {
    public final int f48924a;
    public final int f48925b;
    public final int f48926c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f48924a = i10;
                this.f48925b = i0.a(i10, i11, i12);
                this.f48926c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f48924a, this.f48925b, this.f48926c);
    }
}
