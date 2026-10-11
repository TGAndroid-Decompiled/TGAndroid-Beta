package vd;

import java.util.Iterator;
import w7.b0;
public abstract class d implements Iterable {
    public final int f49665a;
    public final int f49666b;
    public final int f49667c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f49665a = i10;
                this.f49666b = b0.a(i10, i11, i12);
                this.f49667c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f49665a, this.f49666b, this.f49667c);
    }
}
