package z7;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public abstract class n extends j implements List, RandomAccess {
    public static final l f59960b = new l(r.f60018e, 0);

    @Override
    public final void add(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(int i3, Collection collection) {
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
                        for (int i3 = 0; i3 < size; i3++) {
                            if (x7.w6.a(get(i3), list.get(i3))) {
                            }
                        }
                        return true;
                    }
                    l listIterator = listIterator(0);
                    Iterator it = list.iterator();
                    while (true) {
                        if (listIterator.hasNext()) {
                            if (it.hasNext()) {
                                if (!x7.w6.a(listIterator.next(), it.next())) {
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
    public int h(Object[] objArr) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = get(i3);
        }
        return size;
    }

    @Override
    public final int hashCode() {
        int size = size();
        int i3 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i3 = (i3 * 31) + get(i10).hashCode();
        }
        return i3;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (obj.equals(get(i3))) {
                return i3;
            }
        }
        return -1;
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override
    public n subList(int i3, int i10) {
        x7.x6.b(i3, i10, size());
        int i11 = i10 - i3;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return r.f60018e;
        }
        return new m(this, i3, i11);
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
    public final l listIterator(int i3) {
        int size = size();
        if (i3 >= 0 && i3 <= size) {
            if (isEmpty()) {
                return f59960b;
            }
            return new l(this, i3);
        }
        throw new IndexOutOfBoundsException(x7.x6.c(i3, size, "index"));
    }

    @Override
    public final Object remove(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object set(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }
}
