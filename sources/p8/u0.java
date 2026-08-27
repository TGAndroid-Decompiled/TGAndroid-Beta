package p8;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

public class u0 extends AbstractCollection implements Set {

    public final Set f45592a;

    public final o8.f f45593b;

    public u0(Set set, o8.f fVar) {
        this.f45592a = set;
        this.f45593b = fVar;
    }

    @Override
    public final boolean add(Object obj) {
        if (this.f45593b.apply(obj)) {
            return this.f45592a.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f45593b.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f45592a.addAll(collection);
    }

    @Override
    public final void clear() {
        Set set = this.f45592a;
        boolean z10 = set instanceof RandomAccess;
        o8.f fVar = this.f45593b;
        if (!z10 || !(set instanceof List)) {
            Iterator it = set.iterator();
            fVar.getClass();
            while (it.hasNext()) {
                if (fVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
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
    }

    @Override
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f45592a;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f45593b.apply(obj);
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
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
        Iterator it = this.f45592a.iterator();
        o8.f fVar = this.f45593b;
        if (fVar == null) {
            throw new NullPointerException("predicate");
        }
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (fVar.apply(it.next())) {
                break;
            }
            i10++;
        }
        return true ^ (i10 != -1);
    }

    @Override
    public final Iterator iterator() {
        Iterator it = this.f45592a.iterator();
        it.getClass();
        o8.f fVar = this.f45593b;
        fVar.getClass();
        return new d0(it, fVar);
    }

    @Override
    public final boolean remove(Object obj) {
        return contains(obj) && this.f45592a.remove(obj);
    }

    @Override
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f45592a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f45593b.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f45592a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f45593b.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final int size() {
        Iterator it = this.f45592a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f45593b.apply(it.next())) {
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
