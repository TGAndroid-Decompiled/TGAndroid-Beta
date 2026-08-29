package rc;

import a4.w;
import i7.i7;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
public final class e extends AbstractList implements List {
    public static final Object[] d = new Object[0];
    public int f47117a;
    public Object[] f47118b = d;
    public int f47119c;

    @Override
    public final void add(int i10, Object obj) {
        int i11;
        int i12 = this.f47119c;
        if (i10 < 0 || i10 > i12) {
            throw new IndexOutOfBoundsException(w.k(i10, i12, "index: ", ", size: "));
        }
        if (i10 == i12) {
            addLast(obj);
        } else if (i10 == 0) {
            addFirst(obj);
        } else {
            s();
            n(this.f47119c + 1);
            int r6 = r(this.f47117a + i10);
            int i13 = this.f47119c;
            if (i10 < ((i13 + 1) >> 1)) {
                if (r6 == 0) {
                    Object[] objArr = this.f47118b;
                    kotlin.jvm.internal.j.e(objArr, "<this>");
                    r6 = objArr.length;
                }
                int i14 = r6 - 1;
                int i15 = this.f47117a;
                if (i15 == 0) {
                    Object[] objArr2 = this.f47118b;
                    kotlin.jvm.internal.j.e(objArr2, "<this>");
                    i11 = objArr2.length - 1;
                } else {
                    i11 = i15 - 1;
                }
                int i16 = this.f47117a;
                if (i14 >= i16) {
                    Object[] objArr3 = this.f47118b;
                    objArr3[i11] = objArr3[i16];
                    f.c(i16, i16 + 1, i14 + 1, objArr3, objArr3);
                } else {
                    Object[] objArr4 = this.f47118b;
                    f.c(i16 - 1, i16, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f47118b;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    f.c(0, 1, i14 + 1, objArr5, objArr5);
                }
                this.f47118b[i14] = obj;
                this.f47117a = i11;
            } else {
                int r9 = r(this.f47117a + i13);
                if (r6 < r9) {
                    Object[] objArr6 = this.f47118b;
                    f.c(r6 + 1, r6, r9, objArr6, objArr6);
                } else {
                    Object[] objArr7 = this.f47118b;
                    f.c(1, 0, r9, objArr7, objArr7);
                    Object[] objArr8 = this.f47118b;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    f.c(r6 + 1, r6, objArr8.length - 1, objArr8, objArr8);
                }
                this.f47118b[r6] = obj;
            }
            this.f47119c++;
        }
    }

    @Override
    public final boolean addAll(int i10, Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        int i11 = this.f47119c;
        if (i10 >= 0 && i10 <= i11) {
            if (elements.isEmpty()) {
                return false;
            }
            if (i10 == this.f47119c) {
                return addAll(elements);
            }
            s();
            n(elements.size() + this.f47119c);
            int r6 = r(this.f47117a + this.f47119c);
            int r9 = r(this.f47117a + i10);
            int size = elements.size();
            if (i10 < ((this.f47119c + 1) >> 1)) {
                int i12 = this.f47117a;
                int i13 = i12 - size;
                if (r9 < i12) {
                    Object[] objArr = this.f47118b;
                    f.c(i13, i12, objArr.length, objArr, objArr);
                    if (size >= r9) {
                        Object[] objArr2 = this.f47118b;
                        f.c(objArr2.length - size, 0, r9, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.f47118b;
                        f.c(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.f47118b;
                        f.c(0, size, r9, objArr4, objArr4);
                    }
                } else if (i13 >= 0) {
                    Object[] objArr5 = this.f47118b;
                    f.c(i13, i12, r9, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.f47118b;
                    i13 += objArr6.length;
                    int i14 = r9 - i12;
                    int length = objArr6.length - i13;
                    if (length >= i14) {
                        f.c(i13, i12, r9, objArr6, objArr6);
                    } else {
                        f.c(i13, i12, i12 + length, objArr6, objArr6);
                        Object[] objArr7 = this.f47118b;
                        f.c(0, this.f47117a + length, r9, objArr7, objArr7);
                    }
                }
                this.f47117a = i13;
                i(p(r9 - size), elements);
                return true;
            }
            int i15 = r9 + size;
            if (r9 < r6) {
                int i16 = size + r6;
                Object[] objArr8 = this.f47118b;
                if (i16 <= objArr8.length) {
                    f.c(i15, r9, r6, objArr8, objArr8);
                } else if (i15 >= objArr8.length) {
                    f.c(i15 - objArr8.length, r9, r6, objArr8, objArr8);
                } else {
                    int length2 = r6 - (i16 - objArr8.length);
                    f.c(0, length2, r6, objArr8, objArr8);
                    Object[] objArr9 = this.f47118b;
                    f.c(i15, r9, length2, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.f47118b;
                f.c(size, 0, r6, objArr10, objArr10);
                Object[] objArr11 = this.f47118b;
                if (i15 >= objArr11.length) {
                    f.c(i15 - objArr11.length, r9, objArr11.length, objArr11, objArr11);
                } else {
                    f.c(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.f47118b;
                    f.c(i15, r9, objArr12.length - size, objArr12, objArr12);
                }
            }
            i(r9, elements);
            return true;
        }
        throw new IndexOutOfBoundsException(w.k(i10, i11, "index: ", ", size: "));
    }

    public final void addFirst(Object obj) {
        s();
        n(this.f47119c + 1);
        int i10 = this.f47117a;
        if (i10 == 0) {
            Object[] objArr = this.f47118b;
            kotlin.jvm.internal.j.e(objArr, "<this>");
            i10 = objArr.length;
        }
        int i11 = i10 - 1;
        this.f47117a = i11;
        this.f47118b[i11] = obj;
        this.f47119c++;
    }

    public final void addLast(Object obj) {
        s();
        n(this.f47119c + 1);
        this.f47118b[r(this.f47117a + this.f47119c)] = obj;
        this.f47119c++;
    }

    @Override
    public final void clear() {
        if (!isEmpty()) {
            s();
            q(this.f47117a, r(this.f47117a + this.f47119c));
        }
        this.f47117a = 0;
        this.f47119c = 0;
    }

    @Override
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f47119c;
        if (i10 >= 0 && i10 < i11) {
            return this.f47118b[r(this.f47117a + i10)];
        }
        throw new IndexOutOfBoundsException(w.k(i10, i11, "index: ", ", size: "));
    }

    public final void i(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f47118b.length;
        while (i10 < length && it.hasNext()) {
            this.f47118b[i10] = it.next();
            i10++;
        }
        int i11 = this.f47117a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f47118b[i12] = it.next();
        }
        this.f47119c = collection.size() + this.f47119c;
    }

    @Override
    public final int indexOf(Object obj) {
        int i10;
        int r6 = r(this.f47117a + this.f47119c);
        int i11 = this.f47117a;
        if (i11 < r6) {
            while (i11 < r6) {
                if (kotlin.jvm.internal.j.a(obj, this.f47118b[i11])) {
                    i10 = this.f47117a;
                } else {
                    i11++;
                }
            }
            return -1;
        } else if (i11 >= r6) {
            int length = this.f47118b.length;
            while (true) {
                if (i11 < length) {
                    if (kotlin.jvm.internal.j.a(obj, this.f47118b[i11])) {
                        i10 = this.f47117a;
                        break;
                    }
                    i11++;
                } else {
                    for (int i12 = 0; i12 < r6; i12++) {
                        if (kotlin.jvm.internal.j.a(obj, this.f47118b[i12])) {
                            i11 = i12 + this.f47118b.length;
                            i10 = this.f47117a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i11 - i10;
    }

    @Override
    public final boolean isEmpty() {
        if (this.f47119c == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int r6 = r(this.f47117a + this.f47119c);
        int i11 = this.f47117a;
        if (i11 < r6) {
            length = r6 - 1;
            if (i11 <= length) {
                while (!kotlin.jvm.internal.j.a(obj, this.f47118b[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.f47117a;
                return length - i10;
            }
            return -1;
        }
        if (i11 > r6) {
            int i12 = r6 - 1;
            while (true) {
                if (-1 < i12) {
                    if (kotlin.jvm.internal.j.a(obj, this.f47118b[i12])) {
                        length = i12 + this.f47118b.length;
                        i10 = this.f47117a;
                        break;
                    }
                    i12--;
                } else {
                    Object[] objArr = this.f47118b;
                    kotlin.jvm.internal.j.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i13 = this.f47117a;
                    if (i13 <= length) {
                        while (!kotlin.jvm.internal.j.a(obj, this.f47118b[length])) {
                            if (length != i13) {
                                length--;
                            }
                        }
                        i10 = this.f47117a;
                    }
                }
            }
        }
        return -1;
    }

    public final void n(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f47118b;
            if (i10 <= objArr.length) {
                return;
            }
            if (objArr == d) {
                if (i10 < 10) {
                    i10 = 10;
                }
                this.f47118b = new Object[i10];
                return;
            }
            int length = objArr.length;
            int i11 = length + (length >> 1);
            if (i11 - i10 < 0) {
                i11 = i10;
            }
            if (i11 - 2147483639 > 0) {
                if (i10 > 2147483639) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i11];
            f.c(0, this.f47117a, objArr.length, objArr, objArr2);
            Object[] objArr3 = this.f47118b;
            int length2 = objArr3.length;
            int i12 = this.f47117a;
            f.c(length2 - i12, 0, i12, objArr3, objArr2);
            this.f47117a = 0;
            this.f47118b = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int o(int i10) {
        Object[] objArr = this.f47118b;
        kotlin.jvm.internal.j.e(objArr, "<this>");
        if (i10 == objArr.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    public final int p(int i10) {
        if (i10 < 0) {
            return i10 + this.f47118b.length;
        }
        return i10;
    }

    public final void q(int i10, int i11) {
        if (i10 < i11) {
            f.e(i10, i11, this.f47118b);
            return;
        }
        Object[] objArr = this.f47118b;
        f.e(i10, objArr.length, objArr);
        f.e(0, i11, this.f47118b);
    }

    public final int r(int i10) {
        Object[] objArr = this.f47118b;
        if (i10 >= objArr.length) {
            return i10 - objArr.length;
        }
        return i10;
    }

    @Override
    public final Object remove(int i10) {
        int i11 = this.f47119c;
        if (i10 >= 0 && i10 < i11) {
            if (i10 == h.b(this)) {
                return removeLast();
            }
            if (i10 == 0) {
                return removeFirst();
            }
            s();
            int r6 = r(this.f47117a + i10);
            Object[] objArr = this.f47118b;
            Object obj = objArr[r6];
            if (i10 < (this.f47119c >> 1)) {
                int i12 = this.f47117a;
                if (r6 >= i12) {
                    f.c(i12 + 1, i12, r6, objArr, objArr);
                } else {
                    f.c(1, 0, r6, objArr, objArr);
                    Object[] objArr2 = this.f47118b;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i13 = this.f47117a;
                    f.c(i13 + 1, i13, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f47118b;
                int i14 = this.f47117a;
                objArr3[i14] = null;
                this.f47117a = o(i14);
            } else {
                int r9 = r(h.b(this) + this.f47117a);
                if (r6 <= r9) {
                    Object[] objArr4 = this.f47118b;
                    f.c(r6, r6 + 1, r9 + 1, objArr4, objArr4);
                } else {
                    Object[] objArr5 = this.f47118b;
                    f.c(r6, r6 + 1, objArr5.length, objArr5, objArr5);
                    Object[] objArr6 = this.f47118b;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    f.c(0, 1, r9 + 1, objArr6, objArr6);
                }
                this.f47118b[r9] = null;
            }
            this.f47119c--;
            return obj;
        }
        throw new IndexOutOfBoundsException(w.k(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final boolean removeAll(Collection elements) {
        int r6;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f47118b.length != 0) {
            int r9 = r(this.f47117a + this.f47119c);
            int i10 = this.f47117a;
            if (i10 < r9) {
                r6 = i10;
                while (i10 < r9) {
                    Object obj = this.f47118b[i10];
                    if (!elements.contains(obj)) {
                        this.f47118b[r6] = obj;
                        r6++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                f.e(r6, r9, this.f47118b);
            } else {
                int length = this.f47118b.length;
                int i11 = i10;
                boolean z11 = false;
                while (i10 < length) {
                    Object[] objArr = this.f47118b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (!elements.contains(obj2)) {
                        this.f47118b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                r6 = r(i11);
                for (int i12 = 0; i12 < r9; i12++) {
                    Object[] objArr2 = this.f47118b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (!elements.contains(obj3)) {
                        this.f47118b[r6] = obj3;
                        r6 = o(r6);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                s();
                this.f47119c = p(r6 - this.f47117a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            s();
            Object[] objArr = this.f47118b;
            int i10 = this.f47117a;
            Object obj = objArr[i10];
            objArr[i10] = null;
            this.f47117a = o(i10);
            this.f47119c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            s();
            int r6 = r(h.b(this) + this.f47117a);
            Object[] objArr = this.f47118b;
            Object obj = objArr[r6];
            objArr[r6] = null;
            this.f47119c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override
    public final void removeRange(int i10, int i11) {
        i7.a(i10, i11, this.f47119c);
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f47119c) {
            clear();
        } else if (i12 == 1) {
            remove(i10);
        } else {
            s();
            if (i10 < this.f47119c - i11) {
                int r6 = r((i10 - 1) + this.f47117a);
                int r9 = r((i11 - 1) + this.f47117a);
                while (i10 > 0) {
                    int i13 = r6 + 1;
                    int min = Math.min(i10, Math.min(i13, r9 + 1));
                    Object[] objArr = this.f47118b;
                    int i14 = r9 - min;
                    int i15 = r6 - min;
                    f.c(i14 + 1, i15 + 1, i13, objArr, objArr);
                    r6 = p(i15);
                    r9 = p(i14);
                    i10 -= min;
                }
                int r10 = r(this.f47117a + i12);
                q(this.f47117a, r10);
                this.f47117a = r10;
            } else {
                int r11 = r(this.f47117a + i11);
                int r12 = r(this.f47117a + i10);
                int i16 = this.f47119c;
                while (true) {
                    i16 -= i11;
                    if (i16 <= 0) {
                        break;
                    }
                    Object[] objArr2 = this.f47118b;
                    i11 = Math.min(i16, Math.min(objArr2.length - r11, objArr2.length - r12));
                    Object[] objArr3 = this.f47118b;
                    int i17 = r11 + i11;
                    f.c(r12, r11, i17, objArr3, objArr3);
                    r11 = r(i17);
                    r12 = r(r12 + i11);
                }
                int r13 = r(this.f47117a + this.f47119c);
                q(p(r13 - i12), r13);
            }
            this.f47119c -= i12;
        }
    }

    @Override
    public final boolean retainAll(Collection elements) {
        int r6;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f47118b.length != 0) {
            int r9 = r(this.f47117a + this.f47119c);
            int i10 = this.f47117a;
            if (i10 < r9) {
                r6 = i10;
                while (i10 < r9) {
                    Object obj = this.f47118b[i10];
                    if (elements.contains(obj)) {
                        this.f47118b[r6] = obj;
                        r6++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                f.e(r6, r9, this.f47118b);
            } else {
                int length = this.f47118b.length;
                int i11 = i10;
                boolean z11 = false;
                while (i10 < length) {
                    Object[] objArr = this.f47118b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f47118b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                r6 = r(i11);
                for (int i12 = 0; i12 < r9; i12++) {
                    Object[] objArr2 = this.f47118b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f47118b[r6] = obj3;
                        r6 = o(r6);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                s();
                this.f47119c = p(r6 - this.f47117a);
            }
        }
        return z10;
    }

    public final void s() {
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object set(int i10, Object obj) {
        int i11 = this.f47119c;
        if (i10 >= 0 && i10 < i11) {
            int r6 = r(this.f47117a + i10);
            Object[] objArr = this.f47118b;
            Object obj2 = objArr[r6];
            objArr[r6] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(w.k(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int size() {
        return this.f47119c;
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[this.f47119c]);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.e(array, "array");
        int length = array.length;
        int i10 = this.f47119c;
        if (length < i10) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i10);
            kotlin.jvm.internal.j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int r6 = r(this.f47117a + this.f47119c);
        int i11 = this.f47117a;
        if (i11 < r6) {
            f.d(i11, r6, 2, this.f47118b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f47118b;
            f.c(0, this.f47117a, objArr.length, objArr, array);
            Object[] objArr2 = this.f47118b;
            f.c(objArr2.length - this.f47117a, 0, r6, objArr2, array);
        }
        int i12 = this.f47119c;
        if (i12 < array.length) {
            array[i12] = null;
        }
        return array;
    }

    @Override
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
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
        n(elements.size() + this.f47119c);
        i(r(this.f47117a + this.f47119c), elements);
        return true;
    }
}
