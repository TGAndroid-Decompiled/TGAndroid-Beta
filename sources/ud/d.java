package ud;

import java.util.Iterator;
import w7.x;
public abstract class d implements Iterable {
    public final int f44012a;
    public final int f44013b;
    public final int f44014c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f44012a = i10;
                this.f44013b = x.a(i10, i11, i12);
                this.f44014c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f44012a, this.f44013b, this.f44014c);
    }
}
