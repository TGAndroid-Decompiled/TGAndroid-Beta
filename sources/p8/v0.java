package p8;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

public final class v0 extends u0 implements SortedSet {
    @Override
    public final Comparator comparator() {
        return ((SortedSet) this.f45592a).comparator();
    }

    @Override
    public final Object first() {
        Iterator it = this.f45592a.iterator();
        it.getClass();
        o8.f fVar = this.f45593b;
        fVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (fVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public final SortedSet headSet(Object obj) {
        return new v0(((SortedSet) this.f45592a).headSet(obj), this.f45593b);
    }

    @Override
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f45592a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f45593b.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return new v0(((SortedSet) this.f45592a).subSet(obj, obj2), this.f45593b);
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return new v0(((SortedSet) this.f45592a).tailSet(obj), this.f45593b);
    }
}
