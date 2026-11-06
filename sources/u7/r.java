package u7;

import c8.oc;
import c8.pc;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public abstract class r extends o implements List, RandomAccess {
    public static final p f56298b = new p(s.f56299e, 0);

    @Override
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(int i7, Collection collection) {
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
                        for (int i7 = 0; i7 < size; i7++) {
                            if (oc.a(get(i7), list.get(i7))) {
                            }
                        }
                        return true;
                    }
                    p listIterator = listIterator(0);
                    Iterator it = list.iterator();
                    while (true) {
                        if (listIterator.hasNext()) {
                            if (it.hasNext()) {
                                if (!oc.a(listIterator.next(), it.next())) {
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
    public int f(Object[] objArr) {
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            objArr[i7] = get(i7);
        }
        return size;
    }

    @Override
    public final int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i7 = (i7 * 31) + get(i10).hashCode();
        }
        return i7;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
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
    public r subList(int i7, int i10) {
        pc.b(i7, i10, size());
        int i11 = i10 - i7;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return s.f56299e;
        }
        return new q(this, i7, i11);
    }

    @Override
    public final p listIterator(int i7) {
        int size = size();
        if (i7 >= 0 && i7 <= size) {
            if (isEmpty()) {
                return f56298b;
            }
            return new p(this, i7);
        }
        throw new IndexOutOfBoundsException(pc.c(i7, size, "index"));
    }

    @Override
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }
}
