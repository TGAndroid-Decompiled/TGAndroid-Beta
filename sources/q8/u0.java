package q8;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
public class u0 extends AbstractCollection implements Set {
    public final Set f46499a;
    public final p8.f f46500b;

    public u0(Set set, p8.f fVar) {
        this.f46499a = set;
        this.f46500b = fVar;
    }

    @Override
    public final boolean add(Object obj) {
        if (this.f46500b.apply(obj)) {
            return this.f46499a.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            if (!this.f46500b.apply(obj)) {
                throw new IllegalArgumentException();
            }
        }
        return this.f46499a.addAll(collection);
    }

    @Override
    public final void clear() {
        Set set = this.f46499a;
        boolean z10 = set instanceof RandomAccess;
        p8.f fVar = this.f46500b;
        if (z10 && (set instanceof List)) {
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
                            l.n(list, fVar, i10, i11);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            l.n(list, fVar, i10, i11);
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
        boolean z10;
        Set set = this.f46499a;
        set.getClass();
        try {
            z10 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return this.f46500b.apply(obj);
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
        return l.d(this, obj);
    }

    @Override
    public final int hashCode() {
        return l.h(this);
    }

    @Override
    public final boolean isEmpty() {
        Iterator it = this.f46499a.iterator();
        p8.f fVar = this.f46500b;
        if (fVar != null) {
            boolean z10 = false;
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
                z10 = true;
            }
            return true ^ z10;
        }
        throw new NullPointerException("predicate");
    }

    @Override
    public final Iterator iterator() {
        Iterator it = this.f46499a.iterator();
        it.getClass();
        p8.f fVar = this.f46500b;
        fVar.getClass();
        return new d0(it, fVar);
    }

    @Override
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f46499a.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f46499a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f46500b.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f46499a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f46500b.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final int size() {
        int i10 = 0;
        for (Object obj : this.f46499a) {
            if (this.f46500b.apply(obj)) {
                i10++;
            }
        }
        return i10;
    }

    @Override
    public final Object[] toArray() {
        d0 d0Var = (d0) iterator();
        ArrayList arrayList = new ArrayList();
        while (d0Var.hasNext()) {
            arrayList.add(d0Var.next());
        }
        return arrayList.toArray();
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        d0 d0Var = (d0) iterator();
        ArrayList arrayList = new ArrayList();
        while (d0Var.hasNext()) {
            arrayList.add(d0Var.next());
        }
        return arrayList.toArray(objArr);
    }
}
