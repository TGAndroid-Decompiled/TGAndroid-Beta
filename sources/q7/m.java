package q7;

import j$.util.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;
public abstract class m extends h implements List, RandomAccess, j$.util.List {
    public static final i f53883b = new i(x.f53917e, 0);

    public static x o(int i7, Object[] objArr) {
        if (i7 == 0) {
            return x.f53917e;
        }
        return new x(i7, objArr);
    }

    public static x p(Object[] objArr) {
        if (objArr.length == 0) {
            return x.f53917e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (objArr2[i7] == null) {
                throw new NullPointerException(jg.g.j(i7, "at index "));
            }
        }
        return o(length, objArr2);
    }

    @Override
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object obj) {
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
                            if (a.h(get(i7), list.get(i7))) {
                            }
                        }
                        return true;
                    }
                    i listIterator = listIterator(0);
                    Iterator it = list.iterator();
                    while (true) {
                        if (listIterator.hasNext()) {
                            if (it.hasNext()) {
                                if (!a.h(listIterator.next(), it.next())) {
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

    public int indexOf(Object obj) {
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
    public final d0 k() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
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

    public m m() {
        if (size() <= 1) {
            return this;
        }
        return new k(this);
    }

    @Override
    public m subList(int i7, int i10) {
        a.m(i7, i10, size());
        int i11 = i10 - i7;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return x.f53917e;
        }
        return new l(this, i7, i11);
    }

    @Override
    public final i listIterator(int i7) {
        int size = size();
        if (i7 >= 0 && i7 <= size) {
            if (isEmpty()) {
                return f53883b;
            }
            return new i(this, i7);
        }
        throw new IndexOutOfBoundsException(a.n(i7, size, "index"));
    }

    @Override
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }
}
