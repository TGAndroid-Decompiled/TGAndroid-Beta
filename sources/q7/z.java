package q7;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
public final class z extends s {
    public static final z h;
    public final transient m f53949f;

    static {
        i iVar = m.f53907b;
        h = new z(x.f53941e, v.f53936b);
    }

    public z(m mVar, Comparator comparator) {
        super(comparator);
        this.f53949f = mVar;
    }

    @Override
    public final Object ceiling(Object obj) {
        int u10 = u(obj, true);
        m mVar = this.f53949f;
        if (u10 == mVar.size()) {
            return null;
        }
        return mVar.get(u10);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f53949f, obj, this.d) >= 0) {
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
        if (a.i(comparator, collection) && collection.size() > 1) {
            i listIterator = this.f53949f.listIterator(0);
            Iterator it = collection.iterator();
            if (listIterator.hasNext()) {
                Object next = it.next();
                Object next2 = listIterator.next();
                while (true) {
                    try {
                        int compare = comparator.compare(next2, next);
                        if (compare < 0) {
                            if (!listIterator.hasNext()) {
                                break;
                            }
                            next2 = listIterator.next();
                        } else if (compare != 0) {
                            break;
                        } else if (!it.hasNext()) {
                            return true;
                        } else {
                            next = it.next();
                        }
                    } catch (ClassCastException | NullPointerException unused) {
                    }
                }
            }
            return false;
        }
        return super.containsAll(collection);
    }

    @Override
    public final Iterator descendingIterator() {
        return this.f53949f.m().listIterator(0);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                m mVar = this.f53949f;
                if (mVar.size() == set.size()) {
                    if (!isEmpty()) {
                        Comparator comparator = this.d;
                        if (a.i(comparator, set)) {
                            Iterator it = set.iterator();
                            try {
                                i listIterator = mVar.listIterator(0);
                                while (listIterator.hasNext()) {
                                    Object next = listIterator.next();
                                    Object next2 = it.next();
                                    if (next2 != null) {
                                        if (comparator.compare(next, next2) != 0) {
                                        }
                                    }
                                }
                                return true;
                            } catch (ClassCastException | NoSuchElementException unused) {
                            }
                        } else {
                            return containsAll(set);
                        }
                    } else {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final int f(Object[] objArr) {
        return this.f53949f.f(objArr);
    }

    @Override
    public final Object first() {
        if (!isEmpty()) {
            return this.f53949f.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final Object floor(Object obj) {
        int t6 = t(obj, true) - 1;
        if (t6 == -1) {
            return null;
        }
        return this.f53949f.get(t6);
    }

    @Override
    public final Object higher(Object obj) {
        int u10 = u(obj, false);
        m mVar = this.f53949f;
        if (u10 == mVar.size()) {
            return null;
        }
        return mVar.get(u10);
    }

    @Override
    public final int i() {
        return this.f53949f.i();
    }

    @Override
    public final Iterator iterator() {
        return this.f53949f.listIterator(0);
    }

    @Override
    public final int j() {
        return this.f53949f.j();
    }

    @Override
    public final d0 k() {
        return this.f53949f.listIterator(0);
    }

    @Override
    public final Object[] l() {
        return this.f53949f.l();
    }

    @Override
    public final Object last() {
        if (!isEmpty()) {
            m mVar = this.f53949f;
            return mVar.get(mVar.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final Object lower(Object obj) {
        int t6 = t(obj, false) - 1;
        if (t6 == -1) {
            return null;
        }
        return this.f53949f.get(t6);
    }

    @Override
    public final m o() {
        return this.f53949f;
    }

    @Override
    public final int size() {
        return this.f53949f.size();
    }

    public final int t(Object obj, boolean z9) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f53949f, obj, this.d);
        if (binarySearch >= 0) {
            if (z9) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final int u(Object obj, boolean z9) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f53949f, obj, this.d);
        if (binarySearch >= 0) {
            if (z9) {
                return binarySearch;
            }
            return binarySearch + 1;
        }
        return ~binarySearch;
    }

    public final z v(int i7, int i10) {
        m mVar = this.f53949f;
        if (i7 == 0) {
            if (i10 != mVar.size()) {
                i7 = 0;
            } else {
                return this;
            }
        }
        Comparator comparator = this.d;
        if (i7 < i10) {
            return new z(mVar.subList(i7, i10), comparator);
        }
        return s.s(comparator);
    }
}
