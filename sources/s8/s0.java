package s8;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
public final class s0 extends r0 implements SortedSet {
    @Override
    public final Comparator comparator() {
        return ((SortedSet) this.f44216a).comparator();
    }

    @Override
    public final Object first() {
        Iterator it = this.f44216a.iterator();
        it.getClass();
        r8.f fVar = this.f44217b;
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
        return new r0(((SortedSet) this.f44216a).headSet(obj), this.f44217b);
    }

    @Override
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f44216a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f44217b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return new r0(((SortedSet) this.f44216a).subSet(obj, obj2), this.f44217b);
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return new r0(((SortedSet) this.f44216a).tailSet(obj), this.f44217b);
    }
}
