package ud;

import java.util.Iterator;
import w7.x;
public abstract class d implements Iterable {
    public final int f47609a;
    public final int f47610b;
    public final int f47611c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f47609a = i10;
                this.f47610b = x.a(i10, i11, i12);
                this.f47611c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f47609a, this.f47610b, this.f47611c);
    }
}
