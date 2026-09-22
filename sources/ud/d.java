package ud;

import java.util.Iterator;
import w7.x;
public abstract class d implements Iterable {
    public final int f44007a;
    public final int f44008b;
    public final int f44009c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f44007a = i10;
                this.f44008b = x.a(i10, i11, i12);
                this.f44009c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f44007a, this.f44008b, this.f44009c);
    }
}
