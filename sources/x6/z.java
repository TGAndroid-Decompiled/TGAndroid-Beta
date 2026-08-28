package x6;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
public final class z extends s {
    public static final z h;
    public final transient m f49078f;

    static {
        i iVar = m.f49036b;
        h = new z(x.f49070e, v.f49065b);
    }

    public z(m mVar, Comparator comparator) {
        super(comparator);
        this.f49078f = mVar;
    }

    public final z A(int i9, int i10) {
        m mVar = this.f49078f;
        if (i9 == 0) {
            if (i10 != mVar.size()) {
                i9 = 0;
            } else {
                return this;
            }
        }
        Comparator comparator = this.d;
        if (i9 < i10) {
            return new z(mVar.subList(i9, i10), comparator);
        }
        return s.x(comparator);
    }

    @Override
    public final Object ceiling(Object obj) {
        int z10 = z(obj, true);
        m mVar = this.f49078f;
        if (z10 == mVar.size()) {
            return null;
        }
        return mVar.get(z10);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f49078f, obj, this.d) >= 0) {
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
            i listIterator = this.f49078f.listIterator(0);
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
        return this.f49078f.r().listIterator(0);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                m mVar = this.f49078f;
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
    public final Object first() {
        if (!isEmpty()) {
            return this.f49078f.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final Object floor(Object obj) {
        int y10 = y(obj, true) - 1;
        if (y10 == -1) {
            return null;
        }
        return this.f49078f.get(y10);
    }

    @Override
    public final Object higher(Object obj) {
        int z10 = z(obj, false);
        m mVar = this.f49078f;
        if (z10 == mVar.size()) {
            return null;
        }
        return mVar.get(z10);
    }

    @Override
    public final int i(Object[] objArr) {
        return this.f49078f.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.f49078f.listIterator(0);
    }

    @Override
    public final Object last() {
        if (!isEmpty()) {
            m mVar = this.f49078f;
            return mVar.get(mVar.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final Object lower(Object obj) {
        int y10 = y(obj, false) - 1;
        if (y10 == -1) {
            return null;
        }
        return this.f49078f.get(y10);
    }

    @Override
    public final int n() {
        return this.f49078f.n();
    }

    @Override
    public final int o() {
        return this.f49078f.o();
    }

    @Override
    public final d0 p() {
        return this.f49078f.listIterator(0);
    }

    @Override
    public final Object[] q() {
        return this.f49078f.q();
    }

    @Override
    public final int size() {
        return this.f49078f.size();
    }

    @Override
    public final m t() {
        return this.f49078f;
    }

    public final int y(Object obj, boolean z10) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f49078f, obj, this.d);
        if (binarySearch >= 0) {
            if (z10) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final int z(Object obj, boolean z10) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f49078f, obj, this.d);
        if (binarySearch >= 0) {
            if (z10) {
                return binarySearch;
            }
            return binarySearch + 1;
        }
        return ~binarySearch;
    }
}
