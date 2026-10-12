package wd;

import java.util.Iterator;
import w7.j0;
public abstract class d implements Iterable {
    public final int f47537a;
    public final int f47538b;
    public final int f47539c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f47537a = i10;
                this.f47538b = j0.a(i10, i11, i12);
                this.f47539c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f47537a, this.f47538b, this.f47539c);
    }
}
