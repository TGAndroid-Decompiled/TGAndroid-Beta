package z7;

import java.util.List;
import java.util.ListIterator;
public final class bg extends e9.c implements ListIterator {
    public final e9.l f50828e;

    public bg(e9.l lVar) {
        super(lVar, (char) 0);
        this.f50828e = lVar;
    }

    @Override
    public final void add(Object obj) {
        e9.l lVar = this.f50828e;
        boolean isEmpty = lVar.isEmpty();
        b();
        ((ListIterator) this.f8953b).add(obj);
        if (isEmpty) {
            lVar.p();
        }
    }

    @Override
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f8953b).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f8953b).nextIndex();
    }

    @Override
    public final Object previous() {
        b();
        return ((ListIterator) this.f8953b).previous();
    }

    @Override
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f8953b).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f8953b).set(obj);
    }

    public bg(e9.l lVar, int i10) {
        super(lVar, ((List) lVar.f8999c).listIterator(i10), (char) 0);
        this.f50828e = lVar;
    }
}
