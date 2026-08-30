package tc;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k7.q7;
public final class e extends AbstractList implements List {
    public static final Object[] d = new Object[0];
    public int f44646a;
    public Object[] f44647b = d;
    public int f44648c;

    @Override
    public final void add(int i10, Object obj) {
        int i11;
        int i12 = this.f44648c;
        if (i10 < 0 || i10 > i12) {
            throw new IndexOutOfBoundsException(android.support.v4.media.a.k(i10, i12, "index: ", ", size: "));
        }
        if (i10 == i12) {
            addLast(obj);
        } else if (i10 == 0) {
            addFirst(obj);
        } else {
            s();
            n(this.f44648c + 1);
            int r10 = r(this.f44646a + i10);
            int i13 = this.f44648c;
            if (i10 < ((i13 + 1) >> 1)) {
                if (r10 == 0) {
                    Object[] objArr = this.f44647b;
                    kotlin.jvm.internal.j.e(objArr, "<this>");
                    r10 = objArr.length;
                }
                int i14 = r10 - 1;
                int i15 = this.f44646a;
                if (i15 == 0) {
                    Object[] objArr2 = this.f44647b;
                    kotlin.jvm.internal.j.e(objArr2, "<this>");
                    i11 = objArr2.length - 1;
                } else {
                    i11 = i15 - 1;
                }
                int i16 = this.f44646a;
                if (i14 >= i16) {
                    Object[] objArr3 = this.f44647b;
                    objArr3[i11] = objArr3[i16];
                    f.c(i16, i16 + 1, i14 + 1, objArr3, objArr3);
                } else {
                    Object[] objArr4 = this.f44647b;
                    f.c(i16 - 1, i16, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f44647b;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    f.c(0, 1, i14 + 1, objArr5, objArr5);
                }
                this.f44647b[i14] = obj;
                this.f44646a = i11;
            } else {
                int r11 = r(this.f44646a + i13);
                if (r10 < r11) {
                    Object[] objArr6 = this.f44647b;
                    f.c(r10 + 1, r10, r11, objArr6, objArr6);
                } else {
                    Object[] objArr7 = this.f44647b;
                    f.c(1, 0, r11, objArr7, objArr7);
                    Object[] objArr8 = this.f44647b;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    f.c(r10 + 1, r10, objArr8.length - 1, objArr8, objArr8);
                }
                this.f44647b[r10] = obj;
            }
            this.f44648c++;
        }
    }

    @Override
    public final boolean addAll(int i10, Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        int i11 = this.f44648c;
        if (i10 >= 0 && i10 <= i11) {
            if (elements.isEmpty()) {
                return false;
            }
            if (i10 == this.f44648c) {
                return addAll(elements);
            }
            s();
            n(elements.size() + this.f44648c);
            int r10 = r(this.f44646a + this.f44648c);
            int r11 = r(this.f44646a + i10);
            int size = elements.size();
            if (i10 < ((this.f44648c + 1) >> 1)) {
                int i12 = this.f44646a;
                int i13 = i12 - size;
                if (r11 < i12) {
                    Object[] objArr = this.f44647b;
                    f.c(i13, i12, objArr.length, objArr, objArr);
                    if (size >= r11) {
                        Object[] objArr2 = this.f44647b;
                        f.c(objArr2.length - size, 0, r11, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.f44647b;
                        f.c(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.f44647b;
                        f.c(0, size, r11, objArr4, objArr4);
                    }
                } else if (i13 >= 0) {
                    Object[] objArr5 = this.f44647b;
                    f.c(i13, i12, r11, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.f44647b;
                    i13 += objArr6.length;
                    int i14 = r11 - i12;
                    int length = objArr6.length - i13;
                    if (length >= i14) {
                        f.c(i13, i12, r11, objArr6, objArr6);
                    } else {
                        f.c(i13, i12, i12 + length, objArr6, objArr6);
                        Object[] objArr7 = this.f44647b;
                        f.c(0, this.f44646a + length, r11, objArr7, objArr7);
                    }
                }
                this.f44646a = i13;
                i(p(r11 - size), elements);
                return true;
            }
            int i15 = r11 + size;
            if (r11 < r10) {
                int i16 = size + r10;
                Object[] objArr8 = this.f44647b;
                if (i16 <= objArr8.length) {
                    f.c(i15, r11, r10, objArr8, objArr8);
                } else if (i15 >= objArr8.length) {
                    f.c(i15 - objArr8.length, r11, r10, objArr8, objArr8);
                } else {
                    int length2 = r10 - (i16 - objArr8.length);
                    f.c(0, length2, r10, objArr8, objArr8);
                    Object[] objArr9 = this.f44647b;
                    f.c(i15, r11, length2, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.f44647b;
                f.c(size, 0, r10, objArr10, objArr10);
                Object[] objArr11 = this.f44647b;
                if (i15 >= objArr11.length) {
                    f.c(i15 - objArr11.length, r11, objArr11.length, objArr11, objArr11);
                } else {
                    f.c(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.f44647b;
                    f.c(i15, r11, objArr12.length - size, objArr12, objArr12);
                }
            }
            i(r11, elements);
            return true;
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.a.k(i10, i11, "index: ", ", size: "));
    }

    public final void addFirst(Object obj) {
        s();
        n(this.f44648c + 1);
        int i10 = this.f44646a;
        if (i10 == 0) {
            Object[] objArr = this.f44647b;
            kotlin.jvm.internal.j.e(objArr, "<this>");
            i10 = objArr.length;
        }
        int i11 = i10 - 1;
        this.f44646a = i11;
        this.f44647b[i11] = obj;
        this.f44648c++;
    }

    public final void addLast(Object obj) {
        s();
        n(this.f44648c + 1);
        this.f44647b[r(this.f44646a + this.f44648c)] = obj;
        this.f44648c++;
    }

    @Override
    public final void clear() {
        if (!isEmpty()) {
            s();
            q(this.f44646a, r(this.f44646a + this.f44648c));
        }
        this.f44646a = 0;
        this.f44648c = 0;
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
        int i11 = this.f44648c;
        if (i10 >= 0 && i10 < i11) {
            return this.f44647b[r(this.f44646a + i10)];
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.a.k(i10, i11, "index: ", ", size: "));
    }

    public final void i(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f44647b.length;
        while (i10 < length && it.hasNext()) {
            this.f44647b[i10] = it.next();
            i10++;
        }
        int i11 = this.f44646a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f44647b[i12] = it.next();
        }
        this.f44648c = collection.size() + this.f44648c;
    }

    @Override
    public final int indexOf(Object obj) {
        int i10;
        int r10 = r(this.f44646a + this.f44648c);
        int i11 = this.f44646a;
        if (i11 < r10) {
            while (i11 < r10) {
                if (kotlin.jvm.internal.j.a(obj, this.f44647b[i11])) {
                    i10 = this.f44646a;
                } else {
                    i11++;
                }
            }
            return -1;
        } else if (i11 >= r10) {
            int length = this.f44647b.length;
            while (true) {
                if (i11 < length) {
                    if (kotlin.jvm.internal.j.a(obj, this.f44647b[i11])) {
                        i10 = this.f44646a;
                        break;
                    }
                    i11++;
                } else {
                    for (int i12 = 0; i12 < r10; i12++) {
                        if (kotlin.jvm.internal.j.a(obj, this.f44647b[i12])) {
                            i11 = i12 + this.f44647b.length;
                            i10 = this.f44646a;
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
        if (this.f44648c == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int r10 = r(this.f44646a + this.f44648c);
        int i11 = this.f44646a;
        if (i11 < r10) {
            length = r10 - 1;
            if (i11 <= length) {
                while (!kotlin.jvm.internal.j.a(obj, this.f44647b[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.f44646a;
                return length - i10;
            }
            return -1;
        }
        if (i11 > r10) {
            int i12 = r10 - 1;
            while (true) {
                if (-1 < i12) {
                    if (kotlin.jvm.internal.j.a(obj, this.f44647b[i12])) {
                        length = i12 + this.f44647b.length;
                        i10 = this.f44646a;
                        break;
                    }
                    i12--;
                } else {
                    Object[] objArr = this.f44647b;
                    kotlin.jvm.internal.j.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i13 = this.f44646a;
                    if (i13 <= length) {
                        while (!kotlin.jvm.internal.j.a(obj, this.f44647b[length])) {
                            if (length != i13) {
                                length--;
                            }
                        }
                        i10 = this.f44646a;
                    }
                }
            }
        }
        return -1;
    }

    public final void n(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f44647b;
            if (i10 <= objArr.length) {
                return;
            }
            if (objArr == d) {
                if (i10 < 10) {
                    i10 = 10;
                }
                this.f44647b = new Object[i10];
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
            f.c(0, this.f44646a, objArr.length, objArr, objArr2);
            Object[] objArr3 = this.f44647b;
            int length2 = objArr3.length;
            int i12 = this.f44646a;
            f.c(length2 - i12, 0, i12, objArr3, objArr2);
            this.f44646a = 0;
            this.f44647b = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int o(int i10) {
        Object[] objArr = this.f44647b;
        kotlin.jvm.internal.j.e(objArr, "<this>");
        if (i10 == objArr.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    public final int p(int i10) {
        if (i10 < 0) {
            return i10 + this.f44647b.length;
        }
        return i10;
    }

    public final void q(int i10, int i11) {
        if (i10 < i11) {
            f.e(i10, i11, this.f44647b);
            return;
        }
        Object[] objArr = this.f44647b;
        f.e(i10, objArr.length, objArr);
        f.e(0, i11, this.f44647b);
    }

    public final int r(int i10) {
        Object[] objArr = this.f44647b;
        if (i10 >= objArr.length) {
            return i10 - objArr.length;
        }
        return i10;
    }

    @Override
    public final Object remove(int i10) {
        int i11 = this.f44648c;
        if (i10 >= 0 && i10 < i11) {
            if (i10 == h.b(this)) {
                return removeLast();
            }
            if (i10 == 0) {
                return removeFirst();
            }
            s();
            int r10 = r(this.f44646a + i10);
            Object[] objArr = this.f44647b;
            Object obj = objArr[r10];
            if (i10 < (this.f44648c >> 1)) {
                int i12 = this.f44646a;
                if (r10 >= i12) {
                    f.c(i12 + 1, i12, r10, objArr, objArr);
                } else {
                    f.c(1, 0, r10, objArr, objArr);
                    Object[] objArr2 = this.f44647b;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i13 = this.f44646a;
                    f.c(i13 + 1, i13, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f44647b;
                int i14 = this.f44646a;
                objArr3[i14] = null;
                this.f44646a = o(i14);
            } else {
                int r11 = r(h.b(this) + this.f44646a);
                if (r10 <= r11) {
                    Object[] objArr4 = this.f44647b;
                    f.c(r10, r10 + 1, r11 + 1, objArr4, objArr4);
                } else {
                    Object[] objArr5 = this.f44647b;
                    f.c(r10, r10 + 1, objArr5.length, objArr5, objArr5);
                    Object[] objArr6 = this.f44647b;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    f.c(0, 1, r11 + 1, objArr6, objArr6);
                }
                this.f44647b[r11] = null;
            }
            this.f44648c--;
            return obj;
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.a.k(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final boolean removeAll(Collection elements) {
        int r10;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f44647b.length != 0) {
            int r11 = r(this.f44646a + this.f44648c);
            int i10 = this.f44646a;
            if (i10 < r11) {
                r10 = i10;
                while (i10 < r11) {
                    Object obj = this.f44647b[i10];
                    if (!elements.contains(obj)) {
                        this.f44647b[r10] = obj;
                        r10++;
                    } else {
                        z4 = true;
                    }
                    i10++;
                }
                f.e(r10, r11, this.f44647b);
            } else {
                int length = this.f44647b.length;
                int i11 = i10;
                boolean z10 = false;
                while (i10 < length) {
                    Object[] objArr = this.f44647b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (!elements.contains(obj2)) {
                        this.f44647b[i11] = obj2;
                        i11++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                r10 = r(i11);
                for (int i12 = 0; i12 < r11; i12++) {
                    Object[] objArr2 = this.f44647b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (!elements.contains(obj3)) {
                        this.f44647b[r10] = obj3;
                        r10 = o(r10);
                    } else {
                        z10 = true;
                    }
                }
                z4 = z10;
            }
            if (z4) {
                s();
                this.f44648c = p(r10 - this.f44646a);
            }
        }
        return z4;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            s();
            Object[] objArr = this.f44647b;
            int i10 = this.f44646a;
            Object obj = objArr[i10];
            objArr[i10] = null;
            this.f44646a = o(i10);
            this.f44648c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            s();
            int r10 = r(h.b(this) + this.f44646a);
            Object[] objArr = this.f44647b;
            Object obj = objArr[r10];
            objArr[r10] = null;
            this.f44648c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override
    public final void removeRange(int i10, int i11) {
        q7.a(i10, i11, this.f44648c);
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f44648c) {
            clear();
        } else if (i12 == 1) {
            remove(i10);
        } else {
            s();
            if (i10 < this.f44648c - i11) {
                int r10 = r((i10 - 1) + this.f44646a);
                int r11 = r((i11 - 1) + this.f44646a);
                while (i10 > 0) {
                    int i13 = r10 + 1;
                    int min = Math.min(i10, Math.min(i13, r11 + 1));
                    Object[] objArr = this.f44647b;
                    int i14 = r11 - min;
                    int i15 = r10 - min;
                    f.c(i14 + 1, i15 + 1, i13, objArr, objArr);
                    r10 = p(i15);
                    r11 = p(i14);
                    i10 -= min;
                }
                int r12 = r(this.f44646a + i12);
                q(this.f44646a, r12);
                this.f44646a = r12;
            } else {
                int r13 = r(this.f44646a + i11);
                int r14 = r(this.f44646a + i10);
                int i16 = this.f44648c;
                while (true) {
                    i16 -= i11;
                    if (i16 <= 0) {
                        break;
                    }
                    Object[] objArr2 = this.f44647b;
                    i11 = Math.min(i16, Math.min(objArr2.length - r13, objArr2.length - r14));
                    Object[] objArr3 = this.f44647b;
                    int i17 = r13 + i11;
                    f.c(r14, r13, i17, objArr3, objArr3);
                    r13 = r(i17);
                    r14 = r(r14 + i11);
                }
                int r15 = r(this.f44646a + this.f44648c);
                q(p(r15 - i12), r15);
            }
            this.f44648c -= i12;
        }
    }

    @Override
    public final boolean retainAll(Collection elements) {
        int r10;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f44647b.length != 0) {
            int r11 = r(this.f44646a + this.f44648c);
            int i10 = this.f44646a;
            if (i10 < r11) {
                r10 = i10;
                while (i10 < r11) {
                    Object obj = this.f44647b[i10];
                    if (elements.contains(obj)) {
                        this.f44647b[r10] = obj;
                        r10++;
                    } else {
                        z4 = true;
                    }
                    i10++;
                }
                f.e(r10, r11, this.f44647b);
            } else {
                int length = this.f44647b.length;
                int i11 = i10;
                boolean z10 = false;
                while (i10 < length) {
                    Object[] objArr = this.f44647b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f44647b[i11] = obj2;
                        i11++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                r10 = r(i11);
                for (int i12 = 0; i12 < r11; i12++) {
                    Object[] objArr2 = this.f44647b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f44647b[r10] = obj3;
                        r10 = o(r10);
                    } else {
                        z10 = true;
                    }
                }
                z4 = z10;
            }
            if (z4) {
                s();
                this.f44648c = p(r10 - this.f44646a);
            }
        }
        return z4;
    }

    public final void s() {
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object set(int i10, Object obj) {
        int i11 = this.f44648c;
        if (i10 >= 0 && i10 < i11) {
            int r10 = r(this.f44646a + i10);
            Object[] objArr = this.f44647b;
            Object obj2 = objArr[r10];
            objArr[r10] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.a.k(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int size() {
        return this.f44648c;
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[this.f44648c]);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.e(array, "array");
        int length = array.length;
        int i10 = this.f44648c;
        if (length < i10) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i10);
            kotlin.jvm.internal.j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int r10 = r(this.f44646a + this.f44648c);
        int i11 = this.f44646a;
        if (i11 < r10) {
            f.d(i11, r10, 2, this.f44647b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f44647b;
            f.c(0, this.f44646a, objArr.length, objArr, array);
            Object[] objArr2 = this.f44647b;
            f.c(objArr2.length - this.f44646a, 0, r10, objArr2, array);
        }
        int i12 = this.f44648c;
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
        n(elements.size() + this.f44648c);
        i(r(this.f44646a + this.f44648c), elements);
        return true;
    }
}
