package z7;

import b8.ah;
import b8.ra;
import java.util.List;
import java.util.ListIterator;
public final class c extends ra implements ListIterator {
    public final ah f59809e;

    public c(ah ahVar) {
        super(ahVar, (char) 0);
        this.f59809e = ahVar;
    }

    @Override
    public final void add(Object obj) {
        ah ahVar = this.f59809e;
        boolean isEmpty = ahVar.isEmpty();
        b();
        ((ListIterator) this.f3048b).add(obj);
        ((e) ahVar.h).d++;
        if (isEmpty) {
            ahVar.k();
        }
    }

    @Override
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f3048b).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f3048b).nextIndex();
    }

    @Override
    public final Object previous() {
        b();
        return ((ListIterator) this.f3048b).previous();
    }

    @Override
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f3048b).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f3048b).set(obj);
    }

    public c(ah ahVar, int i3) {
        super(ahVar, ((List) ahVar.f2472c).listIterator(i3), (char) 0);
        this.f59809e = ahVar;
    }
}
