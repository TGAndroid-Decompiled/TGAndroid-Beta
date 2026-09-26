package ud;

import java.util.Iterator;
import w7.x;
public abstract class d implements Iterable {
    public final int f43969a;
    public final int f43970b;
    public final int f43971c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f43969a = i10;
                this.f43970b = x.a(i10, i11, i12);
                this.f43971c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f43969a, this.f43970b, this.f43971c);
    }
}
