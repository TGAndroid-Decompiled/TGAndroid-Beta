package x7;

import java.util.List;
import java.util.ListIterator;
public final class c extends e9.d implements ListIterator {
    public final e9.m e;

    public c(e9.m mVar) {
        super(mVar, (byte) 0);
        this.e = mVar;
    }

    @Override
    public final void add(Object obj) {
        e9.m mVar = this.e;
        boolean isEmpty = mVar.isEmpty();
        b();
        ((ListIterator) this.f8544b).add(obj);
        ((f) mVar.h).d++;
        if (isEmpty) {
            mVar.o();
        }
    }

    @Override
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f8544b).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f8544b).nextIndex();
    }

    @Override
    public final Object previous() {
        b();
        return ((ListIterator) this.f8544b).previous();
    }

    @Override
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f8544b).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f8544b).set(obj);
    }

    public c(e9.m mVar, int i10) {
        super(mVar, ((List) mVar.f8587c).listIterator(i10), (byte) 0);
        this.e = mVar;
    }
}
