package pc;

import g7.m6;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
public final class e extends AbstractList implements List {
    public static final Object[] d = new Object[0];
    public int f45536a;
    public Object[] f45537b = d;
    public int f45538c;

    @Override
    public final void add(int i9, Object obj) {
        int i10;
        int i11 = this.f45538c;
        if (i9 < 0 || i9 > i11) {
            throw new IndexOutOfBoundsException(aa.d.k(i9, i11, "index: ", ", size: "));
        }
        if (i9 == i11) {
            addLast(obj);
        } else if (i9 == 0) {
            addFirst(obj);
        } else {
            s();
            n(this.f45538c + 1);
            int r10 = r(this.f45536a + i9);
            int i12 = this.f45538c;
            if (i9 < ((i12 + 1) >> 1)) {
                if (r10 == 0) {
                    Object[] objArr = this.f45537b;
                    kotlin.jvm.internal.i.e(objArr, "<this>");
                    r10 = objArr.length;
                }
                int i13 = r10 - 1;
                int i14 = this.f45536a;
                if (i14 == 0) {
                    Object[] objArr2 = this.f45537b;
                    kotlin.jvm.internal.i.e(objArr2, "<this>");
                    i10 = objArr2.length - 1;
                } else {
                    i10 = i14 - 1;
                }
                int i15 = this.f45536a;
                if (i13 >= i15) {
                    Object[] objArr3 = this.f45537b;
                    objArr3[i10] = objArr3[i15];
                    f.c(i15, i15 + 1, i13 + 1, objArr3, objArr3);
                } else {
                    Object[] objArr4 = this.f45537b;
                    f.c(i15 - 1, i15, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f45537b;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    f.c(0, 1, i13 + 1, objArr5, objArr5);
                }
                this.f45537b[i13] = obj;
                this.f45536a = i10;
            } else {
                int r11 = r(this.f45536a + i12);
                if (r10 < r11) {
                    Object[] objArr6 = this.f45537b;
                    f.c(r10 + 1, r10, r11, objArr6, objArr6);
                } else {
                    Object[] objArr7 = this.f45537b;
                    f.c(1, 0, r11, objArr7, objArr7);
                    Object[] objArr8 = this.f45537b;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    f.c(r10 + 1, r10, objArr8.length - 1, objArr8, objArr8);
                }
                this.f45537b[r10] = obj;
            }
            this.f45538c++;
        }
    }

    @Override
    public final boolean addAll(int i9, Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        int i10 = this.f45538c;
        if (i9 >= 0 && i9 <= i10) {
            if (elements.isEmpty()) {
                return false;
            }
            if (i9 == this.f45538c) {
                return addAll(elements);
            }
            s();
            n(elements.size() + this.f45538c);
            int r10 = r(this.f45536a + this.f45538c);
            int r11 = r(this.f45536a + i9);
            int size = elements.size();
            if (i9 < ((this.f45538c + 1) >> 1)) {
                int i11 = this.f45536a;
                int i12 = i11 - size;
                if (r11 < i11) {
                    Object[] objArr = this.f45537b;
                    f.c(i12, i11, objArr.length, objArr, objArr);
                    if (size >= r11) {
                        Object[] objArr2 = this.f45537b;
                        f.c(objArr2.length - size, 0, r11, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.f45537b;
                        f.c(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.f45537b;
                        f.c(0, size, r11, objArr4, objArr4);
                    }
                } else if (i12 >= 0) {
                    Object[] objArr5 = this.f45537b;
                    f.c(i12, i11, r11, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.f45537b;
                    i12 += objArr6.length;
                    int i13 = r11 - i11;
                    int length = objArr6.length - i12;
                    if (length >= i13) {
                        f.c(i12, i11, r11, objArr6, objArr6);
                    } else {
                        f.c(i12, i11, i11 + length, objArr6, objArr6);
                        Object[] objArr7 = this.f45537b;
                        f.c(0, this.f45536a + length, r11, objArr7, objArr7);
                    }
                }
                this.f45536a = i12;
                i(p(r11 - size), elements);
                return true;
            }
            int i14 = r11 + size;
            if (r11 < r10) {
                int i15 = size + r10;
                Object[] objArr8 = this.f45537b;
                if (i15 <= objArr8.length) {
                    f.c(i14, r11, r10, objArr8, objArr8);
                } else if (i14 >= objArr8.length) {
                    f.c(i14 - objArr8.length, r11, r10, objArr8, objArr8);
                } else {
                    int length2 = r10 - (i15 - objArr8.length);
                    f.c(0, length2, r10, objArr8, objArr8);
                    Object[] objArr9 = this.f45537b;
                    f.c(i14, r11, length2, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.f45537b;
                f.c(size, 0, r10, objArr10, objArr10);
                Object[] objArr11 = this.f45537b;
                if (i14 >= objArr11.length) {
                    f.c(i14 - objArr11.length, r11, objArr11.length, objArr11, objArr11);
                } else {
                    f.c(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.f45537b;
                    f.c(i14, r11, objArr12.length - size, objArr12, objArr12);
                }
            }
            i(r11, elements);
            return true;
        }
        throw new IndexOutOfBoundsException(aa.d.k(i9, i10, "index: ", ", size: "));
    }

    public final void addFirst(Object obj) {
        s();
        n(this.f45538c + 1);
        int i9 = this.f45536a;
        if (i9 == 0) {
            Object[] objArr = this.f45537b;
            kotlin.jvm.internal.i.e(objArr, "<this>");
            i9 = objArr.length;
        }
        int i10 = i9 - 1;
        this.f45536a = i10;
        this.f45537b[i10] = obj;
        this.f45538c++;
    }

    public final void addLast(Object obj) {
        s();
        n(this.f45538c + 1);
        this.f45537b[r(this.f45536a + this.f45538c)] = obj;
        this.f45538c++;
    }

    @Override
    public final void clear() {
        if (!isEmpty()) {
            s();
            q(this.f45536a, r(this.f45536a + this.f45538c));
        }
        this.f45536a = 0;
        this.f45538c = 0;
    }

    @Override
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final Object get(int i9) {
        int i10 = this.f45538c;
        if (i9 >= 0 && i9 < i10) {
            return this.f45537b[r(this.f45536a + i9)];
        }
        throw new IndexOutOfBoundsException(aa.d.k(i9, i10, "index: ", ", size: "));
    }

    public final void i(int i9, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f45537b.length;
        while (i9 < length && it.hasNext()) {
            this.f45537b[i9] = it.next();
            i9++;
        }
        int i10 = this.f45536a;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f45537b[i11] = it.next();
        }
        this.f45538c = collection.size() + this.f45538c;
    }

    @Override
    public final int indexOf(Object obj) {
        int i9;
        int r10 = r(this.f45536a + this.f45538c);
        int i10 = this.f45536a;
        if (i10 < r10) {
            while (i10 < r10) {
                if (kotlin.jvm.internal.i.a(obj, this.f45537b[i10])) {
                    i9 = this.f45536a;
                } else {
                    i10++;
                }
            }
            return -1;
        } else if (i10 >= r10) {
            int length = this.f45537b.length;
            while (true) {
                if (i10 < length) {
                    if (kotlin.jvm.internal.i.a(obj, this.f45537b[i10])) {
                        i9 = this.f45536a;
                        break;
                    }
                    i10++;
                } else {
                    for (int i11 = 0; i11 < r10; i11++) {
                        if (kotlin.jvm.internal.i.a(obj, this.f45537b[i11])) {
                            i10 = i11 + this.f45537b.length;
                            i9 = this.f45536a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i10 - i9;
    }

    @Override
    public final boolean isEmpty() {
        if (this.f45538c == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int length;
        int i9;
        int r10 = r(this.f45536a + this.f45538c);
        int i10 = this.f45536a;
        if (i10 < r10) {
            length = r10 - 1;
            if (i10 <= length) {
                while (!kotlin.jvm.internal.i.a(obj, this.f45537b[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i9 = this.f45536a;
                return length - i9;
            }
            return -1;
        }
        if (i10 > r10) {
            int i11 = r10 - 1;
            while (true) {
                if (-1 < i11) {
                    if (kotlin.jvm.internal.i.a(obj, this.f45537b[i11])) {
                        length = i11 + this.f45537b.length;
                        i9 = this.f45536a;
                        break;
                    }
                    i11--;
                } else {
                    Object[] objArr = this.f45537b;
                    kotlin.jvm.internal.i.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i12 = this.f45536a;
                    if (i12 <= length) {
                        while (!kotlin.jvm.internal.i.a(obj, this.f45537b[length])) {
                            if (length != i12) {
                                length--;
                            }
                        }
                        i9 = this.f45536a;
                    }
                }
            }
        }
        return -1;
    }

    public final void n(int i9) {
        if (i9 >= 0) {
            Object[] objArr = this.f45537b;
            if (i9 <= objArr.length) {
                return;
            }
            if (objArr == d) {
                if (i9 < 10) {
                    i9 = 10;
                }
                this.f45537b = new Object[i9];
                return;
            }
            int length = objArr.length;
            int i10 = length + (length >> 1);
            if (i10 - i9 < 0) {
                i10 = i9;
            }
            if (i10 - 2147483639 > 0) {
                if (i9 > 2147483639) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i10];
            f.c(0, this.f45536a, objArr.length, objArr, objArr2);
            Object[] objArr3 = this.f45537b;
            int length2 = objArr3.length;
            int i11 = this.f45536a;
            f.c(length2 - i11, 0, i11, objArr3, objArr2);
            this.f45536a = 0;
            this.f45537b = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int o(int i9) {
        Object[] objArr = this.f45537b;
        kotlin.jvm.internal.i.e(objArr, "<this>");
        if (i9 == objArr.length - 1) {
            return 0;
        }
        return i9 + 1;
    }

    public final int p(int i9) {
        if (i9 < 0) {
            return i9 + this.f45537b.length;
        }
        return i9;
    }

    public final void q(int i9, int i10) {
        if (i9 < i10) {
            f.e(i9, i10, this.f45537b);
            return;
        }
        Object[] objArr = this.f45537b;
        f.e(i9, objArr.length, objArr);
        f.e(0, i10, this.f45537b);
    }

    public final int r(int i9) {
        Object[] objArr = this.f45537b;
        if (i9 >= objArr.length) {
            return i9 - objArr.length;
        }
        return i9;
    }

    @Override
    public final Object remove(int i9) {
        int i10 = this.f45538c;
        if (i9 >= 0 && i9 < i10) {
            if (i9 == h.b(this)) {
                return removeLast();
            }
            if (i9 == 0) {
                return removeFirst();
            }
            s();
            int r10 = r(this.f45536a + i9);
            Object[] objArr = this.f45537b;
            Object obj = objArr[r10];
            if (i9 < (this.f45538c >> 1)) {
                int i11 = this.f45536a;
                if (r10 >= i11) {
                    f.c(i11 + 1, i11, r10, objArr, objArr);
                } else {
                    f.c(1, 0, r10, objArr, objArr);
                    Object[] objArr2 = this.f45537b;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i12 = this.f45536a;
                    f.c(i12 + 1, i12, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f45537b;
                int i13 = this.f45536a;
                objArr3[i13] = null;
                this.f45536a = o(i13);
            } else {
                int r11 = r(h.b(this) + this.f45536a);
                if (r10 <= r11) {
                    Object[] objArr4 = this.f45537b;
                    f.c(r10, r10 + 1, r11 + 1, objArr4, objArr4);
                } else {
                    Object[] objArr5 = this.f45537b;
                    f.c(r10, r10 + 1, objArr5.length, objArr5, objArr5);
                    Object[] objArr6 = this.f45537b;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    f.c(0, 1, r11 + 1, objArr6, objArr6);
                }
                this.f45537b[r11] = null;
            }
            this.f45538c--;
            return obj;
        }
        throw new IndexOutOfBoundsException(aa.d.k(i9, i10, "index: ", ", size: "));
    }

    @Override
    public final boolean removeAll(Collection elements) {
        int r10;
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f45537b.length != 0) {
            int r11 = r(this.f45536a + this.f45538c);
            int i9 = this.f45536a;
            if (i9 < r11) {
                r10 = i9;
                while (i9 < r11) {
                    Object obj = this.f45537b[i9];
                    if (!elements.contains(obj)) {
                        this.f45537b[r10] = obj;
                        r10++;
                    } else {
                        z10 = true;
                    }
                    i9++;
                }
                f.e(r10, r11, this.f45537b);
            } else {
                int length = this.f45537b.length;
                int i10 = i9;
                boolean z11 = false;
                while (i9 < length) {
                    Object[] objArr = this.f45537b;
                    Object obj2 = objArr[i9];
                    objArr[i9] = null;
                    if (!elements.contains(obj2)) {
                        this.f45537b[i10] = obj2;
                        i10++;
                    } else {
                        z11 = true;
                    }
                    i9++;
                }
                r10 = r(i10);
                for (int i11 = 0; i11 < r11; i11++) {
                    Object[] objArr2 = this.f45537b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (!elements.contains(obj3)) {
                        this.f45537b[r10] = obj3;
                        r10 = o(r10);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                s();
                this.f45538c = p(r10 - this.f45536a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            s();
            Object[] objArr = this.f45537b;
            int i9 = this.f45536a;
            Object obj = objArr[i9];
            objArr[i9] = null;
            this.f45536a = o(i9);
            this.f45538c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            s();
            int r10 = r(h.b(this) + this.f45536a);
            Object[] objArr = this.f45537b;
            Object obj = objArr[r10];
            objArr[r10] = null;
            this.f45538c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override
    public final void removeRange(int i9, int i10) {
        m6.a(i9, i10, this.f45538c);
        int i11 = i10 - i9;
        if (i11 == 0) {
            return;
        }
        if (i11 == this.f45538c) {
            clear();
        } else if (i11 == 1) {
            remove(i9);
        } else {
            s();
            if (i9 < this.f45538c - i10) {
                int r10 = r((i9 - 1) + this.f45536a);
                int r11 = r((i10 - 1) + this.f45536a);
                while (i9 > 0) {
                    int i12 = r10 + 1;
                    int min = Math.min(i9, Math.min(i12, r11 + 1));
                    Object[] objArr = this.f45537b;
                    int i13 = r11 - min;
                    int i14 = r10 - min;
                    f.c(i13 + 1, i14 + 1, i12, objArr, objArr);
                    r10 = p(i14);
                    r11 = p(i13);
                    i9 -= min;
                }
                int r12 = r(this.f45536a + i11);
                q(this.f45536a, r12);
                this.f45536a = r12;
            } else {
                int r13 = r(this.f45536a + i10);
                int r14 = r(this.f45536a + i9);
                int i15 = this.f45538c;
                while (true) {
                    i15 -= i10;
                    if (i15 <= 0) {
                        break;
                    }
                    Object[] objArr2 = this.f45537b;
                    i10 = Math.min(i15, Math.min(objArr2.length - r13, objArr2.length - r14));
                    Object[] objArr3 = this.f45537b;
                    int i16 = r13 + i10;
                    f.c(r14, r13, i16, objArr3, objArr3);
                    r13 = r(i16);
                    r14 = r(r14 + i10);
                }
                int r15 = r(this.f45536a + this.f45538c);
                q(p(r15 - i11), r15);
            }
            this.f45538c -= i11;
        }
    }

    @Override
    public final boolean retainAll(Collection elements) {
        int r10;
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f45537b.length != 0) {
            int r11 = r(this.f45536a + this.f45538c);
            int i9 = this.f45536a;
            if (i9 < r11) {
                r10 = i9;
                while (i9 < r11) {
                    Object obj = this.f45537b[i9];
                    if (elements.contains(obj)) {
                        this.f45537b[r10] = obj;
                        r10++;
                    } else {
                        z10 = true;
                    }
                    i9++;
                }
                f.e(r10, r11, this.f45537b);
            } else {
                int length = this.f45537b.length;
                int i10 = i9;
                boolean z11 = false;
                while (i9 < length) {
                    Object[] objArr = this.f45537b;
                    Object obj2 = objArr[i9];
                    objArr[i9] = null;
                    if (elements.contains(obj2)) {
                        this.f45537b[i10] = obj2;
                        i10++;
                    } else {
                        z11 = true;
                    }
                    i9++;
                }
                r10 = r(i10);
                for (int i11 = 0; i11 < r11; i11++) {
                    Object[] objArr2 = this.f45537b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        this.f45537b[r10] = obj3;
                        r10 = o(r10);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                s();
                this.f45538c = p(r10 - this.f45536a);
            }
        }
        return z10;
    }

    public final void s() {
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object set(int i9, Object obj) {
        int i10 = this.f45538c;
        if (i9 >= 0 && i9 < i10) {
            int r10 = r(this.f45536a + i9);
            Object[] objArr = this.f45537b;
            Object obj2 = objArr[r10];
            objArr[r10] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(aa.d.k(i9, i10, "index: ", ", size: "));
    }

    @Override
    public final int size() {
        return this.f45538c;
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[this.f45538c]);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        int length = array.length;
        int i9 = this.f45538c;
        if (length < i9) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i9);
            kotlin.jvm.internal.i.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int r10 = r(this.f45536a + this.f45538c);
        int i10 = this.f45536a;
        if (i10 < r10) {
            f.d(i10, r10, 2, this.f45537b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f45537b;
            f.c(0, this.f45536a, objArr.length, objArr, array);
            Object[] objArr2 = this.f45537b;
            f.c(objArr2.length - this.f45536a, 0, r10, objArr2, array);
        }
        int i11 = this.f45538c;
        if (i11 < array.length) {
            array[i11] = null;
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
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        s();
        n(elements.size() + this.f45538c);
        i(r(this.f45536a + this.f45538c), elements);
        return true;
    }
}
