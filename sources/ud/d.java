package ud;

import java.util.Iterator;
import w7.w;
public abstract class d implements Iterable {
    public final int f43680a;
    public final int f43681b;
    public final int f43682c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f43680a = i10;
                this.f43681b = w.a(i10, i11, i12);
                this.f43682c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f43680a, this.f43681b, this.f43682c);
    }
}
