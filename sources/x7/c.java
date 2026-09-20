package x7;

import java.util.List;
import java.util.ListIterator;
public final class c extends e9.c implements ListIterator {
    public final e9.l e;

    public c(e9.l lVar) {
        super(lVar, (byte) 0);
        this.e = lVar;
    }

    @Override
    public final void add(Object obj) {
        e9.l lVar = this.e;
        boolean isEmpty = lVar.isEmpty();
        b();
        ((ListIterator) this.f8060b).add(obj);
        ((f) lVar.h).d++;
        if (isEmpty) {
            lVar.p();
        }
    }

    @Override
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f8060b).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f8060b).nextIndex();
    }

    @Override
    public final Object previous() {
        b();
        return ((ListIterator) this.f8060b).previous();
    }

    @Override
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f8060b).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f8060b).set(obj);
    }

    public c(e9.l lVar, int i10) {
        super(lVar, ((List) lVar.f8097c).listIterator(i10), (byte) 0);
        this.e = lVar;
    }
}
