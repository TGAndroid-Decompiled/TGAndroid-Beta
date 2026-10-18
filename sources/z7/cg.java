package z7;

import java.util.List;
import java.util.ListIterator;
public final class cg extends e9.d implements ListIterator {
    public final e9.m e;

    public cg(e9.m mVar) {
        super(mVar, (char) 0);
        this.e = mVar;
    }

    @Override
    public final void add(Object obj) {
        e9.m mVar = this.e;
        boolean isEmpty = mVar.isEmpty();
        b();
        ((ListIterator) this.f8427b).add(obj);
        if (isEmpty) {
            mVar.o();
        }
    }

    @Override
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f8427b).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f8427b).nextIndex();
    }

    @Override
    public final Object previous() {
        b();
        return ((ListIterator) this.f8427b).previous();
    }

    @Override
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f8427b).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f8427b).set(obj);
    }

    public cg(e9.m mVar, int i10) {
        super(mVar, ((List) mVar.f8470c).listIterator(i10), (char) 0);
        this.e = mVar;
    }
}
