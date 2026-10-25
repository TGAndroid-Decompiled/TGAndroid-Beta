package y7;

import a8.dh;
import a8.ta;
import java.util.List;
import java.util.ListIterator;
public final class c extends ta implements ListIterator {
    public final dh e;

    public c(dh dhVar) {
        super(dhVar, (char) 0);
        this.e = dhVar;
    }

    @Override
    public final void add(Object obj) {
        dh dhVar = this.e;
        boolean isEmpty = dhVar.isEmpty();
        b();
        ((ListIterator) this.f938b).add(obj);
        ((e) dhVar.h).d++;
        if (isEmpty) {
            dhVar.o();
        }
    }

    @Override
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f938b).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f938b).nextIndex();
    }

    @Override
    public final Object previous() {
        b();
        return ((ListIterator) this.f938b).previous();
    }

    @Override
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f938b).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f938b).set(obj);
    }

    public c(dh dhVar, int i10) {
        super(dhVar, ((List) dhVar.f412c).listIterator(i10), (char) 0);
        this.e = dhVar;
    }
}
