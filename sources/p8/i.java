package p8;

import java.util.List;
import java.util.ListIterator;

public final class i extends i7.c implements ListIterator {

    public final i7.e f45548e;

    public i(i7.e eVar) {
        super(eVar, (char) 0);
        this.f45548e = eVar;
    }

    @Override
    public final void add(Object obj) {
        i7.e eVar = this.f45548e;
        boolean zIsEmpty = eVar.isEmpty();
        c().add(obj);
        ((h0) eVar.h).f45546e++;
        if (zIsEmpty) {
            eVar.i();
        }
    }

    public final ListIterator c() {
        a();
        return (ListIterator) this.f10600b;
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

    public i(i7.e eVar, int i10) {
        super(eVar, ((List) eVar.f10617c).listIterator(i10), (char) 0);
        this.f45548e = eVar;
    }
}
