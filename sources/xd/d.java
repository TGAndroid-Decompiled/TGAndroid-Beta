package xd;

import a8.kf;
import java.util.Iterator;
public abstract class d implements Iterable {
    public final int f51791a;
    public final int f51792b;
    public final int f51793c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f51791a = i10;
                this.f51792b = kf.a(i10, i11, i12);
                this.f51793c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f51791a, this.f51792b, this.f51793c);
    }
}
