package xd;

import a8.kf;
import java.util.Iterator;
public abstract class d implements Iterable {
    public final int f51733a;
    public final int f51734b;
    public final int f51735c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f51733a = i10;
                this.f51734b = kf.a(i10, i11, i12);
                this.f51735c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f51733a, this.f51734b, this.f51735c);
    }
}
