package ud;

import java.util.Iterator;
import w7.w;
public abstract class d implements Iterable {
    public final int f43632a;
    public final int f43633b;
    public final int f43634c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f43632a = i10;
                this.f43633b = w.a(i10, i11, i12);
                this.f43634c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f43632a, this.f43633b, this.f43634c);
    }
}
