package ra;

import java.util.AbstractSet;
import java.util.Iterator;
public final class j extends AbstractSet {
    public final int f46799a;
    public final l f46800b;

    public j(l lVar, int i10) {
        this.f46799a = i10;
        this.f46800b = lVar;
    }

    @Override
    public final void clear() {
        switch (this.f46799a) {
            case 0:
                this.f46800b.clear();
                return;
            default:
                this.f46800b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: ra.j.contains(java.lang.Object):boolean");
    }

    @Override
    public final Iterator iterator() {
        switch (this.f46799a) {
            case 0:
                return new i(this.f46800b, 0);
            default:
                return new i(this.f46800b, 1);
        }
    }

    @Override
    public final boolean remove(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: ra.j.remove(java.lang.Object):boolean");
    }

    @Override
    public final int size() {
        switch (this.f46799a) {
            case 0:
                return this.f46800b.d;
            default:
                return this.f46800b.d;
        }
    }
}
