package p8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class z extends u implements List, RandomAccess {

    public static final x f45604b = new x(l0.f45555e, 0);

    public static l0 s(int i10, Object[] objArr) {
        return i10 == 0 ? l0.f45555e : new l0(i10, objArr);
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
        if (!(collection instanceof u)) {
            return t(collection.toArray());
        }
        z zVarI = ((u) collection).i();
        if (!zVarI.r()) {
            return zVarI;
        }
        Object[] array = zVarI.toArray(u.f45591a);
        return s(array.length, array);
    }

    public static l0 v(Object[] objArr) {
        return objArr.length == 0 ? l0.f45555e : t((Object[]) objArr.clone());
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
        return indexOf(obj) >= 0;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && h7.e0.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i10 = 0; i10 < size; i10++) {
                        if (h7.e0.a(get(i10), list.get(i10))) {
                        }
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
        h7.f0.c(i10, size());
        return isEmpty() ? f45604b : new x(this, i10);
    }

    @Override
    public z subList(int i10, int i11) {
        h7.f0.d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? l0.f45555e : new y(this, i10, i12);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public final z i() {
        return this;
    }
}
