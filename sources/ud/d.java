package ud;

import java.util.Iterator;
import w7.x;
public abstract class d implements Iterable {
    public final int f47625a;
    public final int f47626b;
    public final int f47627c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f47625a = i10;
                this.f47626b = x.a(i10, i11, i12);
                this.f47627c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f47625a, this.f47626b, this.f47627c);
    }
}
