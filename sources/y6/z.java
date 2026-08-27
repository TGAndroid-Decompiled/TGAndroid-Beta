package y6;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public final class z extends s {
    public static final z h;

    public final transient m f49795f;

    static {
        i iVar = m.f49753b;
        h = new z(x.f49787e, v.f49782b);
    }

    public z(m mVar, Comparator comparator) {
        super(comparator);
        this.f49795f = mVar;
    }

    public final z A(int i10, int i11) {
        m mVar = this.f49795f;
        if (i10 == 0) {
            if (i11 == mVar.size()) {
                return this;
            }
            i10 = 0;
        }
        Comparator comparator = this.d;
        return i10 < i11 ? new z(mVar.subList(i10, i11), comparator) : s.x(comparator);
    }

    @Override
    public final Object ceiling(Object obj) {
        int iZ = z(obj, true);
        m mVar = this.f49795f;
        if (iZ == mVar.size()) {
            return null;
        }
        return mVar.get(iZ);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f49795f, obj, this.d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        if (collection instanceof u) {
            collection = ((u) collection).zza();
        }
        Comparator comparator = this.d;
        if (!a.i(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        i iVarListIterator = this.f49795f.listIterator(0);
        Iterator it = collection.iterator();
        if (iVarListIterator.hasNext()) {
            Object next = it.next();
            Object next2 = iVarListIterator.next();
            while (true) {
                try {
                    int iCompare = comparator.compare(next2, next);
                    if (iCompare >= 0) {
                        if (iCompare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!iVarListIterator.hasNext()) {
                            break;
                        }
                        next2 = iVarListIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override
    public final Iterator descendingIterator() {
        return this.f49795f.r().listIterator(0);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            m mVar = this.f49795f;
            if (mVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.d;
                if (!a.i(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    i iVarListIterator = mVar.listIterator(0);
                    while (iVarListIterator.hasNext()) {
                        Object next = iVarListIterator.next();
                        Object next2 = it.next();
                        if (next2 == null || comparator.compare(next, next2) != 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f49795f.get(0);
    }

    @Override
    public final Object floor(Object obj) {
        int iY = y(obj, true) - 1;
        if (iY == -1) {
            return null;
        }
        return this.f49795f.get(iY);
    }

    @Override
    public final Object higher(Object obj) {
        int iZ = z(obj, false);
        m mVar = this.f49795f;
        if (iZ == mVar.size()) {
            return null;
        }
        return mVar.get(iZ);
    }

    @Override
    public final int i(Object[] objArr) {
        return this.f49795f.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.f49795f.listIterator(0);
    }

    @Override
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        m mVar = this.f49795f;
        return mVar.get(mVar.size() - 1);
    }

    @Override
    public final Object lower(Object obj) {
        int iY = y(obj, false) - 1;
        if (iY == -1) {
            return null;
        }
        return this.f49795f.get(iY);
    }

    @Override
    public final int n() {
        return this.f49795f.n();
    }

    @Override
    public final int o() {
        return this.f49795f.o();
    }

    @Override
    public final d0 p() {
        return this.f49795f.listIterator(0);
    }

    @Override
    public final Object[] q() {
        return this.f49795f.q();
    }

    @Override
    public final int size() {
        return this.f49795f.size();
    }

    @Override
    public final m t() {
        return this.f49795f;
    }

    public final int y(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f49795f, obj, this.d);
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int z(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f49795f, obj, this.d);
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }
}
