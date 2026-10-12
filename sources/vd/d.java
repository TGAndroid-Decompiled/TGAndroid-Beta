package vd;

import java.util.Iterator;
import w7.a0;
public abstract class d implements Iterable {
    public final int f49772a;
    public final int f49773b;
    public final int f49774c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f49772a = i10;
                this.f49773b = a0.a(i10, i11, i12);
                this.f49774c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f49772a, this.f49773b, this.f49774c);
    }
}
