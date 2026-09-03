package s8;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
public class r0 extends AbstractCollection implements Set {
    public final Set f44216a;
    public final r8.f f44217b;

    public r0(Set set, r8.f fVar) {
        this.f44216a = set;
        this.f44217b = fVar;
    }

    @Override
    public final boolean add(Object obj) {
        if (this.f44217b.apply(obj)) {
            return this.f44216a.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            if (!this.f44217b.apply(obj)) {
                throw new IllegalArgumentException();
            }
        }
        return this.f44216a.addAll(collection);
    }

    @Override
    public final void clear() {
        Set set = this.f44216a;
        boolean z4 = set instanceof RandomAccess;
        r8.f fVar = this.f44217b;
        if (z4 && (set instanceof List)) {
            List list = (List) set;
            fVar.getClass();
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                Object obj = list.get(i11);
                if (!fVar.apply(obj)) {
                    if (i11 > i10) {
                        try {
                            list.set(i10, obj);
                        } catch (IllegalArgumentException unused) {
                            l.l(list, fVar, i10, i11);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            l.l(list, fVar, i10, i11);
                            return;
                        }
                    }
                    i10++;
                }
            }
            list.subList(i10, list.size()).clear();
            return;
        }
        Iterator it = set.iterator();
        fVar.getClass();
        while (it.hasNext()) {
            if (fVar.apply(it.next())) {
                it.remove();
            }
        }
    }

    @Override
    public final boolean contains(Object obj) {
        boolean z4;
        Set set = this.f44216a;
        set.getClass();
        try {
            z4 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        return this.f44217b.apply(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object obj) {
        return l.e(this, obj);
    }

    @Override
    public final int hashCode() {
        return l.i(this);
    }

    @Override
    public final boolean isEmpty() {
        Iterator it = this.f44216a.iterator();
        r8.f fVar = this.f44217b;
        if (fVar != null) {
            boolean z4 = false;
            int i10 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (fVar.apply(it.next())) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 != -1) {
                z4 = true;
            }
            return true ^ z4;
        }
        throw new NullPointerException("predicate");
    }

    @Override
    public final Iterator iterator() {
        Iterator it = this.f44216a.iterator();
        it.getClass();
        r8.f fVar = this.f44217b;
        fVar.getClass();
        return new a0(it, fVar);
    }

    @Override
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f44216a.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f44216a.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f44217b.apply(next) && collection.contains(next)) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f44216a.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f44217b.apply(next) && !collection.contains(next)) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    @Override
    public final int size() {
        int i10 = 0;
        for (Object obj : this.f44216a) {
            if (this.f44217b.apply(obj)) {
                i10++;
            }
        }
        return i10;
    }

    @Override
    public final Object[] toArray() {
        a0 a0Var = (a0) iterator();
        ArrayList arrayList = new ArrayList();
        while (a0Var.hasNext()) {
            arrayList.add(a0Var.next());
        }
        return arrayList.toArray();
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        a0 a0Var = (a0) iterator();
        ArrayList arrayList = new ArrayList();
        while (a0Var.hasNext()) {
            arrayList.add(a0Var.next());
        }
        return arrayList.toArray(objArr);
    }
}
