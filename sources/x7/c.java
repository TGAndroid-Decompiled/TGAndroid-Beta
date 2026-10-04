package x7;

import java.util.List;
import java.util.ListIterator;
public final class c extends e9.c implements ListIterator {
    public final e9.l f49428e;

    public c(e9.l lVar) {
        super(lVar, (byte) 0);
        this.f49428e = lVar;
    }

    @Override
    public final void add(Object obj) {
        e9.l lVar = this.f49428e;
        boolean isEmpty = lVar.isEmpty();
        b();
        ((ListIterator) this.f8726b).add(obj);
        ((f) lVar.h).d++;
        if (isEmpty) {
            lVar.p();
        }
    }

    @Override
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f8726b).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f8726b).nextIndex();
    }

    @Override
    public final Object previous() {
        b();
        return ((ListIterator) this.f8726b).previous();
    }

    @Override
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f8726b).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f8726b).set(obj);
    }

    public c(e9.l lVar, int i10) {
        super(lVar, ((List) lVar.f8772c).listIterator(i10), (byte) 0);
        this.f49428e = lVar;
    }
}
