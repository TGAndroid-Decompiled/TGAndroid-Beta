package q8;

import java.util.List;
import java.util.ListIterator;
public final class i extends j7.c implements ListIterator {
    public final j7.e f46455e;

    public i(j7.e eVar) {
        super(eVar, (char) 0);
        this.f46455e = eVar;
    }

    @Override
    public final void add(Object obj) {
        j7.e eVar = this.f46455e;
        boolean isEmpty = eVar.isEmpty();
        c().add(obj);
        ((h0) eVar.h).f46453e++;
        if (isEmpty) {
            eVar.i();
        }
    }

    public final ListIterator c() {
        a();
        return (ListIterator) this.f10973b;
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

    public i(j7.e eVar, int i10) {
        super(eVar, ((List) eVar.f10990c).listIterator(i10), (char) 0);
        this.f46455e = eVar;
    }
}
