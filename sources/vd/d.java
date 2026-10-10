package vd;

import java.util.Iterator;
import w7.b0;
public abstract class d implements Iterable {
    public final int f49588a;
    public final int f49589b;
    public final int f49590c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f49588a = i10;
                this.f49589b = b0.a(i10, i11, i12);
                this.f49590c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f49588a, this.f49589b, this.f49590c);
    }
}
