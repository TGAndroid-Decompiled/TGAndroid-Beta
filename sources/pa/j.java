package pa;

import java.util.AbstractSet;
import java.util.Iterator;
public final class j extends AbstractSet {
    public final int f45688a;
    public final l f45689b;

    public j(l lVar, int i10) {
        this.f45688a = i10;
        this.f45689b = lVar;
    }

    @Override
    public final void clear() {
        switch (this.f45688a) {
            case 0:
                this.f45689b.clear();
                return;
            default:
                this.f45689b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: pa.j.contains(java.lang.Object):boolean");
    }

    @Override
    public final Iterator iterator() {
        switch (this.f45688a) {
            case 0:
                return new i(this.f45689b, 0);
            default:
                return new i(this.f45689b, 1);
        }
    }

    @Override
    public final boolean remove(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: pa.j.remove(java.lang.Object):boolean");
    }

    @Override
    public final int size() {
        switch (this.f45688a) {
            case 0:
                return this.f45689b.d;
            default:
                return this.f45689b.d;
        }
    }
}
