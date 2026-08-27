package qc;

import h7.o6;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class e extends AbstractList implements List {
    public static final Object[] d = new Object[0];

    public int f46206a;

    public Object[] f46207b = d;

    public int f46208c;

    @Override
    public final void add(int i10, Object obj) {
        int length;
        int i11 = this.f46208c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a9.p.j(i10, i11, "index: ", ", size: "));
        }
        if (i10 == i11) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        s();
        n(this.f46208c + 1);
        int iR = r(this.f46206a + i10);
        int i12 = this.f46208c;
        if (i10 < ((i12 + 1) >> 1)) {
            if (iR == 0) {
                Object[] objArr = this.f46207b;
                kotlin.jvm.internal.j.e(objArr, "<this>");
                iR = objArr.length;
            }
            int i13 = iR - 1;
            int i14 = this.f46206a;
            if (i14 == 0) {
                Object[] objArr2 = this.f46207b;
                kotlin.jvm.internal.j.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i14 - 1;
            }
            int i15 = this.f46206a;
            if (i13 >= i15) {
                Object[] objArr3 = this.f46207b;
                objArr3[length] = objArr3[i15];
                f.c(i15, i15 + 1, i13 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f46207b;
                f.c(i15 - 1, i15, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f46207b;
                objArr5[objArr5.length - 1] = objArr5[0];
                f.c(0, 1, i13 + 1, objArr5, objArr5);
            }
            this.f46207b[i13] = obj;
            this.f46206a = length;
        } else {
            int iR2 = r(this.f46206a + i12);
            if (iR < iR2) {
                Object[] objArr6 = this.f46207b;
                f.c(iR + 1, iR, iR2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f46207b;
                f.c(1, 0, iR2, objArr7, objArr7);
                Object[] objArr8 = this.f46207b;
                objArr8[0] = objArr8[objArr8.length - 1];
                f.c(iR + 1, iR, objArr8.length - 1, objArr8, objArr8);
            }
            this.f46207b[iR] = obj;
        }
        this.f46208c++;
    }

    @Override
    public final boolean addAll(int i10, Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        int i11 = this.f46208c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a9.p.j(i10, i11, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == this.f46208c) {
            return addAll(elements);
        }
        s();
        n(elements.size() + this.f46208c);
        int iR = r(this.f46206a + this.f46208c);
        int iR2 = r(this.f46206a + i10);
        int size = elements.size();
        if (i10 >= ((this.f46208c + 1) >> 1)) {
            int i12 = iR2 + size;
            if (iR2 < iR) {
                int i13 = size + iR;
                Object[] objArr = this.f46207b;
                if (i13 <= objArr.length) {
                    f.c(i12, iR2, iR, objArr, objArr);
                } else if (i12 >= objArr.length) {
                    f.c(i12 - objArr.length, iR2, iR, objArr, objArr);
                } else {
                    int length = iR - (i13 - objArr.length);
                    f.c(0, length, iR, objArr, objArr);
                    Object[] objArr2 = this.f46207b;
                    f.c(i12, iR2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f46207b;
                f.c(size, 0, iR, objArr3, objArr3);
                Object[] objArr4 = this.f46207b;
                if (i12 >= objArr4.length) {
                    f.c(i12 - objArr4.length, iR2, objArr4.length, objArr4, objArr4);
                } else {
                    f.c(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f46207b;
                    f.c(i12, iR2, objArr5.length - size, objArr5, objArr5);
                }
            }
            i(iR2, elements);
            return true;
        }
        int i14 = this.f46206a;
        int length2 = i14 - size;
        if (iR2 < i14) {
            Object[] objArr6 = this.f46207b;
            f.c(length2, i14, objArr6.length, objArr6, objArr6);
            if (size >= iR2) {
                Object[] objArr7 = this.f46207b;
                f.c(objArr7.length - size, 0, iR2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f46207b;
                f.c(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f46207b;
                f.c(0, size, iR2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f46207b;
            f.c(length2, i14, iR2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f46207b;
            length2 += objArr11.length;
            int i15 = iR2 - i14;
            int length3 = objArr11.length - length2;
            if (length3 >= i15) {
                f.c(length2, i14, iR2, objArr11, objArr11);
            } else {
                f.c(length2, i14, i14 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f46207b;
                f.c(0, this.f46206a + length3, iR2, objArr12, objArr12);
            }
        }
        this.f46206a = length2;
        i(p(iR2 - size), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        s();
        n(this.f46208c + 1);
        int length = this.f46206a;
        if (length == 0) {
            Object[] objArr = this.f46207b;
            kotlin.jvm.internal.j.e(objArr, "<this>");
            length = objArr.length;
        }
        int i10 = length - 1;
        this.f46206a = i10;
        this.f46207b[i10] = obj;
        this.f46208c++;
    }

    public final void addLast(Object obj) {
        s();
        n(this.f46208c + 1);
        this.f46207b[r(this.f46206a + this.f46208c)] = obj;
        this.f46208c++;
    }

    @Override
    public final void clear() {
        if (!isEmpty()) {
            s();
            q(this.f46206a, r(this.f46206a + this.f46208c));
        }
        this.f46206a = 0;
        this.f46208c = 0;
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f46208c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a9.p.j(i10, i11, "index: ", ", size: "));
        }
        return this.f46207b[r(this.f46206a + i10)];
    }

    public final void i(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f46207b.length;
        while (i10 < length && it.hasNext()) {
            this.f46207b[i10] = it.next();
            i10++;
        }
        int i11 = this.f46206a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f46207b[i12] = it.next();
        }
        this.f46208c = collection.size() + this.f46208c;
    }

    @Override
    public final int indexOf(Object obj) {
        int i10;
        int iR = r(this.f46206a + this.f46208c);
        int length = this.f46206a;
        if (length < iR) {
            while (length < iR) {
                if (kotlin.jvm.internal.j.a(obj, this.f46207b[length])) {
                    i10 = this.f46206a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iR) {
            return -1;
        }
        int length2 = this.f46207b.length;
        while (length < length2) {
            if (kotlin.jvm.internal.j.a(obj, this.f46207b[length])) {
                i10 = this.f46206a;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iR; i11++) {
            if (kotlin.jvm.internal.j.a(obj, this.f46207b[i11])) {
                length = i11 + this.f46207b.length;
                i10 = this.f46206a;
            }
        }
        return -1;
        return length - i10;
    }

    @Override
    public final boolean isEmpty() {
        return this.f46208c == 0;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int iR = r(this.f46206a + this.f46208c);
        int i11 = this.f46206a;
        if (i11 < iR) {
            length = iR - 1;
            if (i11 <= length) {
                while (!kotlin.jvm.internal.j.a(obj, this.f46207b[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.f46206a;
                return length - i10;
            }
            return -1;
        }
        if (i11 > iR) {
            for (int i12 = iR - 1; -1 < i12; i12--) {
                if (kotlin.jvm.internal.j.a(obj, this.f46207b[i12])) {
                    length = i12 + this.f46207b.length;
                    i10 = this.f46206a;
                    return length - i10;
                }
            }
            Object[] objArr = this.f46207b;
            kotlin.jvm.internal.j.e(objArr, "<this>");
            length = objArr.length - 1;
            int i13 = this.f46206a;
            if (i13 <= length) {
                while (!kotlin.jvm.internal.j.a(obj, this.f46207b[length])) {
                    if (length != i13) {
                        length--;
                    }
                }
                i10 = this.f46206a;
                return length - i10;
            }
        }
        return -1;
    }

    public final void n(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f46207b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f46207b = new Object[i10];
            return;
        }
        int length = objArr.length;
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        f.c(0, this.f46206a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f46207b;
        int length2 = objArr3.length;
        int i12 = this.f46206a;
        f.c(length2 - i12, 0, i12, objArr3, objArr2);
        this.f46206a = 0;
        this.f46207b = objArr2;
    }

    public final int o(int i10) {
        Object[] objArr = this.f46207b;
        kotlin.jvm.internal.j.e(objArr, "<this>");
        if (i10 == objArr.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    public final int p(int i10) {
        return i10 < 0 ? i10 + this.f46207b.length : i10;
    }

    public final void q(int i10, int i11) {
        if (i10 < i11) {
            f.e(i10, i11, this.f46207b);
            return;
        }
        Object[] objArr = this.f46207b;
        f.e(i10, objArr.length, objArr);
        f.e(0, i11, this.f46207b);
    }

    public final int r(int i10) {
        Object[] objArr = this.f46207b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @Override
    public final Object remove(int i10) {
        int i11 = this.f46208c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a9.p.j(i10, i11, "index: ", ", size: "));
        }
        if (i10 == h.b(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        s();
        int iR = r(this.f46206a + i10);
        Object[] objArr = this.f46207b;
        Object obj = objArr[iR];
        if (i10 < (this.f46208c >> 1)) {
            int i12 = this.f46206a;
            if (iR >= i12) {
                f.c(i12 + 1, i12, iR, objArr, objArr);
            } else {
                f.c(1, 0, iR, objArr, objArr);
                Object[] objArr2 = this.f46207b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = this.f46206a;
                f.c(i13 + 1, i13, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f46207b;
            int i14 = this.f46206a;
            objArr3[i14] = null;
            this.f46206a = o(i14);
        } else {
            int iR2 = r(h.b(this) + this.f46206a);
            if (iR <= iR2) {
                Object[] objArr4 = this.f46207b;
                f.c(iR, iR + 1, iR2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f46207b;
                f.c(iR, iR + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f46207b;
                objArr6[objArr6.length - 1] = objArr6[0];
                f.c(0, 1, iR2 + 1, objArr6, objArr6);
            }
            this.f46207b[iR2] = null;
        }
        this.f46208c--;
        return obj;
    }

    @Override
    public final boolean removeAll(Collection elements) {
        int iR;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f46207b.length != 0) {
            int iR2 = r(this.f46206a + this.f46208c);
            int i10 = this.f46206a;
            if (i10 < iR2) {
                iR = i10;
                while (i10 < iR2) {
                    Object obj = this.f46207b[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f46207b[iR] = obj;
                        iR++;
                    }
                    i10++;
                }
                f.e(iR, iR2, this.f46207b);
            } else {
                int length = this.f46207b.length;
                int i11 = i10;
                boolean z11 = false;
                while (i10 < length) {
                    Object[] objArr = this.f46207b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f46207b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iR = r(i11);
                for (int i12 = 0; i12 < iR2; i12++) {
                    Object[] objArr2 = this.f46207b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f46207b[iR] = obj3;
                        iR = o(iR);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                s();
                this.f46208c = p(iR - this.f46206a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        s();
        Object[] objArr = this.f46207b;
        int i10 = this.f46206a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f46206a = o(i10);
        this.f46208c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        s();
        int iR = r(h.b(this) + this.f46206a);
        Object[] objArr = this.f46207b;
        Object obj = objArr[iR];
        objArr[iR] = null;
        this.f46208c--;
        return obj;
    }

    @Override
    public final void removeRange(int i10, int i11) {
        o6.a(i10, i11, this.f46208c);
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f46208c) {
            clear();
            return;
        }
        if (i12 == 1) {
            remove(i10);
            return;
        }
        s();
        if (i10 < this.f46208c - i11) {
            int iR = r((i10 - 1) + this.f46206a);
            int iR2 = r((i11 - 1) + this.f46206a);
            while (i10 > 0) {
                int i13 = iR + 1;
                int iMin = Math.min(i10, Math.min(i13, iR2 + 1));
                Object[] objArr = this.f46207b;
                int i14 = iR2 - iMin;
                int i15 = iR - iMin;
                f.c(i14 + 1, i15 + 1, i13, objArr, objArr);
                iR = p(i15);
                iR2 = p(i14);
                i10 -= iMin;
            }
            int iR3 = r(this.f46206a + i12);
            q(this.f46206a, iR3);
            this.f46206a = iR3;
        } else {
            int iR4 = r(this.f46206a + i11);
            int iR5 = r(this.f46206a + i10);
            int i16 = this.f46208c;
            while (true) {
                i16 -= i11;
                if (i16 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f46207b;
                i11 = Math.min(i16, Math.min(objArr2.length - iR4, objArr2.length - iR5));
                Object[] objArr3 = this.f46207b;
                int i17 = iR4 + i11;
                f.c(iR5, iR4, i17, objArr3, objArr3);
                iR4 = r(i17);
                iR5 = r(iR5 + i11);
            }
            int iR6 = r(this.f46206a + this.f46208c);
            q(p(iR6 - i12), iR6);
        }
        this.f46208c -= i12;
    }

    @Override
    public final boolean retainAll(Collection elements) {
        int iR;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f46207b.length != 0) {
            int iR2 = r(this.f46206a + this.f46208c);
            int i10 = this.f46206a;
            if (i10 < iR2) {
                iR = i10;
                while (i10 < iR2) {
                    Object obj = this.f46207b[i10];
                    if (elements.contains(obj)) {
                        this.f46207b[iR] = obj;
                        iR++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                f.e(iR, iR2, this.f46207b);
            } else {
                int length = this.f46207b.length;
                int i11 = i10;
                boolean z11 = false;
                while (i10 < length) {
                    Object[] objArr = this.f46207b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f46207b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iR = r(i11);
                for (int i12 = 0; i12 < iR2; i12++) {
                    Object[] objArr2 = this.f46207b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f46207b[iR] = obj3;
                        iR = o(iR);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                s();
                this.f46208c = p(iR - this.f46206a);
            }
        }
        return z10;
    }

    public final void s() {
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object set(int i10, Object obj) {
        int i11 = this.f46208c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a9.p.j(i10, i11, "index: ", ", size: "));
        }
        int iR = r(this.f46206a + i10);
        Object[] objArr = this.f46207b;
        Object obj2 = objArr[iR];
        objArr[iR] = obj;
        return obj2;
    }

    @Override
    public final int size() {
        return this.f46208c;
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[this.f46208c]);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.e(array, "array");
        int length = array.length;
        int i10 = this.f46208c;
        if (length < i10) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i10);
            kotlin.jvm.internal.j.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        int iR = r(this.f46206a + this.f46208c);
        int i11 = this.f46206a;
        if (i11 < iR) {
            f.d(i11, iR, 2, this.f46207b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f46207b;
            f.c(0, this.f46206a, objArr.length, objArr, array);
            Object[] objArr2 = this.f46207b;
            f.c(objArr2.length - this.f46206a, 0, iR, objArr2, array);
        }
        int i12 = this.f46208c;
        if (i12 < array.length) {
            array[i12] = null;
        }
        return array;
    }

    @Override
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        s();
        n(elements.size() + this.f46208c);
        i(r(this.f46206a + this.f46208c), elements);
        return true;
    }
}
