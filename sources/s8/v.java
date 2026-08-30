package s8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import k7.a7;
import k7.b7;
public abstract class v extends q implements List, RandomAccess {
    public static final t f44157b = new t(i0.e, 0);

    public static i0 s(int i10, Object[] objArr) {
        if (i10 == 0) {
            return i0.e;
        }
        return new i0(i10, objArr);
    }

    public static v t(Collection collection) {
        if (collection instanceof q) {
            v i10 = ((q) collection).i();
            if (i10.r()) {
                Object[] array = i10.toArray(q.f44146a);
                return s(array.length, array);
            }
            return i10;
        }
        Object[] array2 = collection.toArray();
        l.b(array2.length, array2);
        return s(array2.length, array2);
    }

    public static i0 u(Object[] objArr) {
        if (objArr.length == 0) {
            return i0.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        l.b(objArr2.length, objArr2);
        return s(objArr2.length, objArr2);
    }

    public static i0 w(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        l.b(5, objArr);
        return s(5, objArr);
    }

    public static i0 x(Object obj) {
        Object[] objArr = {obj};
        l.b(1, objArr);
        return s(1, objArr);
    }

    @Override
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        for (int i10 = 0; i10 < size; i10++) {
                            if (a7.a(get(i10), list.get(i10))) {
                            }
                        }
                    } else {
                        Iterator it = list.iterator();
                        for (Object obj2 : this) {
                            if (it.hasNext()) {
                                if (!a7.a(obj2, it.next())) {
                                }
                            }
                        }
                        return !it.hasNext();
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override
    public int n(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final t listIterator(int i10) {
        b7.d(i10, size());
        if (isEmpty()) {
            return f44157b;
        }
        return new t(this, i10);
    }

    @Override
    public v subList(int i10, int i11) {
        b7.e(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return i0.e;
        }
        return new u(this, i10, i12);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public final v i() {
        return this;
    }
}
