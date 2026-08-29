package q8;

import i7.o6;
import i7.p6;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public abstract class z extends u implements List, RandomAccess {
    public static final x f46511b = new x(l0.f46462e, 0);

    public static l0 s(int i10, Object[] objArr) {
        if (i10 == 0) {
            return l0.f46462e;
        }
        return new l0(i10, objArr);
    }

    public static l0 t(Object... objArr) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (objArr[i10] == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i10);
                throw new NullPointerException(sb2.toString());
            }
        }
        return s(objArr.length, objArr);
    }

    public static z u(Collection collection) {
        if (collection instanceof u) {
            z i10 = ((u) collection).i();
            if (i10.r()) {
                Object[] array = i10.toArray(u.f46498a);
                return s(array.length, array);
            }
            return i10;
        }
        return t(collection.toArray());
    }

    public static l0 v(Object[] objArr) {
        if (objArr.length == 0) {
            return l0.f46462e;
        }
        return t((Object[]) objArr.clone());
    }

    public static l0 x(Long l10, Long l11, Long l12, Long l13, Long l14) {
        return t(l10, l11, l12, l13, l14);
    }

    public static l0 y(Object obj) {
        return t(obj);
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
                            if (o6.a(get(i10), list.get(i10))) {
                            }
                        }
                    } else {
                        Iterator it = list.iterator();
                        for (Object obj2 : this) {
                            if (it.hasNext()) {
                                if (!o6.a(obj2, it.next())) {
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
    public final x listIterator(int i10) {
        p6.c(i10, size());
        if (isEmpty()) {
            return f46511b;
        }
        return new x(this, i10);
    }

    @Override
    public z subList(int i10, int i11) {
        p6.d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return l0.f46462e;
        }
        return new y(this, i10, i12);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public final z i() {
        return this;
    }
}
