package xd;

import a8.kf;
import java.util.Iterator;
public abstract class d implements Iterable {
    public final int f51730a;
    public final int f51731b;
    public final int f51732c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f51730a = i10;
                this.f51731b = kf.a(i10, i11, i12);
                this.f51732c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f51730a, this.f51731b, this.f51732c);
    }
}
