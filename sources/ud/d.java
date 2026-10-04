package ud;

import java.util.Iterator;
import w7.x;
public abstract class d implements Iterable {
    public final int f47610a;
    public final int f47611b;
    public final int f47612c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f47610a = i10;
                this.f47611b = x.a(i10, i11, i12);
                this.f47612c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f47610a, this.f47611b, this.f47612c);
    }
}
