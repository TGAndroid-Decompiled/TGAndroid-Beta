package ud;

import java.util.Iterator;
import w7.w;
public abstract class d implements Iterable {
    public final int f47020a;
    public final int f47021b;
    public final int f47022c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f47020a = i10;
                this.f47021b = w.a(i10, i11, i12);
                this.f47022c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f47020a, this.f47021b, this.f47022c);
    }
}
