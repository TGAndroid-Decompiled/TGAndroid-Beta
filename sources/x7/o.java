package x7;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public abstract class o extends k implements List, RandomAccess {
    public static final m f49112b = new m(s.f49157e, 0);

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
                            if (w7.l8.a(get(i10), list.get(i10))) {
                            }
                        }
                        return true;
                    }
                    m listIterator = listIterator(0);
                    Iterator it = list.iterator();
                    while (true) {
                        if (listIterator.hasNext()) {
                            if (it.hasNext()) {
                                if (!w7.l8.a(listIterator.next(), it.next())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else if (!it.hasNext()) {
                            return true;
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
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    @Override
    public int i(Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = get(i10);
        }
        return size;
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
    public final Iterator iterator() {
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
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public o subList(int i10, int i11) {
        w7.m8.b(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return s.f49157e;
        }
        return new n(this, i10, i12);
    }

    @Override
    public final m listIterator(int i10) {
        int size = size();
        if (i10 >= 0 && i10 <= size) {
            if (isEmpty()) {
                return f49112b;
            }
            return new m(this, i10);
        }
        throw new IndexOutOfBoundsException(w7.m8.c(i10, size, "index"));
    }

    @Override
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }
}
