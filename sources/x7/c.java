package x7;

import java.util.List;
import java.util.ListIterator;
public final class c extends e9.c implements ListIterator {
    public final e9.l f48938e;

    public c(e9.l lVar) {
        super(lVar, (byte) 0);
        this.f48938e = lVar;
    }

    @Override
    public final void add(Object obj) {
        e9.l lVar = this.f48938e;
        boolean isEmpty = lVar.isEmpty();
        b();
        ((ListIterator) this.f8925b).add(obj);
        ((f) lVar.h).d++;
        if (isEmpty) {
            lVar.p();
        }
    }

    @Override
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f8925b).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f8925b).nextIndex();
    }

    @Override
    public final Object previous() {
        b();
        return ((ListIterator) this.f8925b).previous();
    }

    @Override
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f8925b).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f8925b).set(obj);
    }

    public c(e9.l lVar, int i10) {
        super(lVar, ((List) lVar.f8971c).listIterator(i10), (byte) 0);
        this.f48938e = lVar;
    }
}
