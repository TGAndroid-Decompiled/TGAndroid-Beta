package ud;

import java.util.Iterator;
import w7.w;
public abstract class d implements Iterable {
    public final int f47047a;
    public final int f47048b;
    public final int f47049c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f47047a = i10;
                this.f47048b = w.a(i10, i11, i12);
                this.f47049c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f47047a, this.f47048b, this.f47049c);
    }
}
