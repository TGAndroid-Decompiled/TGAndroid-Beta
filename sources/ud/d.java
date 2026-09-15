package ud;

import java.util.Iterator;
import w7.w;
public abstract class d implements Iterable {
    public final int f43684a;
    public final int f43685b;
    public final int f43686c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f43684a = i10;
                this.f43685b = w.a(i10, i11, i12);
                this.f43686c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f43684a, this.f43685b, this.f43686c);
    }
}
