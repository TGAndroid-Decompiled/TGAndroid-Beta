package vd;

import java.util.Iterator;
import w7.b0;
public abstract class d implements Iterable {
    public final int f49542a;
    public final int f49543b;
    public final int f49544c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f49542a = i10;
                this.f49543b = b0.a(i10, i11, i12);
                this.f49544c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f49542a, this.f49543b, this.f49544c);
    }
}
