package s8;

import java.util.List;
import java.util.ListIterator;
public final class i extends l7.c implements ListIterator {
    public final l7.e f47138e;

    public i(l7.e eVar) {
        super(eVar, (char) 0);
        this.f47138e = eVar;
    }

    @Override
    public final void add(Object obj) {
        l7.e eVar = this.f47138e;
        boolean isEmpty = eVar.isEmpty();
        c().add(obj);
        ((e0) eVar.h).f47132e++;
        if (isEmpty) {
            eVar.i();
        }
    }

    public final ListIterator c() {
        a();
        return (ListIterator) this.f11814b;
    }

    @Override
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override
    public final Object previous() {
        return c().previous();
    }

    @Override
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override
    public final void set(Object obj) {
        c().set(obj);
    }

    public i(l7.e eVar, int i10) {
        super(eVar, ((List) eVar.f11831c).listIterator(i10), (char) 0);
        this.f47138e = eVar;
    }
}
