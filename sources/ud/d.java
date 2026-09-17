package ud;

import java.util.Iterator;
import w7.w;
public abstract class d implements Iterable {
    public final int f47048a;
    public final int f47049b;
    public final int f47050c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f47048a = i10;
                this.f47049b = w.a(i10, i11, i12);
                this.f47050c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f47048a, this.f47049b, this.f47050c);
    }
}
