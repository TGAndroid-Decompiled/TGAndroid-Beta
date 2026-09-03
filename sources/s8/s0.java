package s8;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
public final class s0 extends r0 implements SortedSet {
    @Override
    public final Comparator comparator() {
        return ((SortedSet) this.f47167a).comparator();
    }

    @Override
    public final Object first() {
        Iterator it = this.f47167a.iterator();
        it.getClass();
        r8.f fVar = this.f47168b;
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
        return new r0(((SortedSet) this.f47167a).headSet(obj), this.f47168b);
    }

    @Override
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f47167a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f47168b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return new r0(((SortedSet) this.f47167a).subSet(obj, obj2), this.f47168b);
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return new r0(((SortedSet) this.f47167a).tailSet(obj), this.f47168b);
    }
}
