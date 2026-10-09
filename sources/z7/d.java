package z7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public final class d extends AbstractMap implements Serializable {
    public static final Object f53620s = new Object();
    public transient Object f53621a;
    public transient int[] f53622b;
    public transient Object[] f53623c;
    public transient Object[] d;
    public transient int f53624e = Math.min(Math.max(12, 1), 1073741823);
    public transient int f53625f;
    public transient b h;
    public transient b f53626n;
    public transient e9.n f53627r;

    public final Map a() {
        Object obj = this.f53621a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void b(int i10, int i11) {
        Object obj = this.f53621a;
        obj.getClass();
        int[] iArr = this.f53622b;
        iArr.getClass();
        Object[] objArr = this.f53623c;
        objArr.getClass();
        Object[] objArr2 = this.d;
        objArr2.getClass();
        int size = size();
        int i12 = size - 1;
        if (i10 < i12) {
            int i13 = i10 + 1;
            Object obj2 = objArr[i12];
            objArr[i10] = obj2;
            objArr2[i10] = objArr2[i12];
            objArr[i12] = null;
            objArr2[i12] = null;
            iArr[i10] = iArr[i12];
            iArr[i12] = 0;
            int a2 = w7.f9.a(obj2) & i11;
            int b10 = w7.e9.b(a2, obj);
            if (b10 == size) {
                w7.e9.d(a2, i13, obj);
                return;
            }
            while (true) {
                int i14 = b10 - 1;
                int i15 = iArr[i14];
                int i16 = i15 & i11;
                if (i16 != size) {
                    b10 = i16;
                } else {
                    iArr[i14] = (i15 & (~i11)) | (i11 & i13);
                    return;
                }
            }
        } else {
            objArr[i10] = null;
            objArr2[i10] = null;
            iArr[i10] = 0;
        }
    }

    public final boolean c() {
        if (this.f53621a == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void clear() {
        if (c()) {
            return;
        }
        this.f53624e += 32;
        Map a2 = a();
        if (a2 == null) {
            Object[] objArr = this.f53623c;
            objArr.getClass();
            Arrays.fill(objArr, 0, this.f53625f, (Object) null);
            Object[] objArr2 = this.d;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, this.f53625f, (Object) null);
            Object obj = this.f53621a;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            int[] iArr = this.f53622b;
            iArr.getClass();
            Arrays.fill(iArr, 0, this.f53625f, 0);
            this.f53625f = 0;
            return;
        }
        this.f53624e = Math.min(Math.max(size(), 3), 1073741823);
        a2.clear();
        this.f53621a = null;
        this.f53625f = 0;
    }

    @Override
    public final boolean containsKey(Object obj) {
        Map a2 = a();
        if (a2 != null) {
            return a2.containsKey(obj);
        }
        if (e(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Map a2 = a();
        if (a2 == null) {
            for (int i10 = 0; i10 < this.f53625f; i10++) {
                Object[] objArr = this.d;
                objArr.getClass();
                if (w7.i9.a(obj, objArr[i10])) {
                    return true;
                }
            }
            return false;
        }
        return a2.containsValue(obj);
    }

    public final int d() {
        return (1 << (this.f53624e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (c()) {
            return -1;
        }
        int a2 = w7.f9.a(obj);
        int d = d();
        Object obj2 = this.f53621a;
        obj2.getClass();
        int b10 = w7.e9.b(a2 & d, obj2);
        if (b10 == 0) {
            return -1;
        }
        int i10 = ~d;
        int i11 = a2 & i10;
        do {
            int i12 = b10 - 1;
            int[] iArr = this.f53622b;
            iArr.getClass();
            int i13 = iArr[i12];
            if ((i13 & i10) == i11) {
                Object[] objArr = this.f53623c;
                objArr.getClass();
                if (w7.i9.a(obj, objArr[i12])) {
                    return i12;
                }
            }
            b10 = i13 & d;
        } while (b10 != 0);
        return -1;
    }

    @Override
    public final Set entrySet() {
        b bVar = this.f53626n;
        if (bVar == null) {
            b bVar2 = new b(this, 0);
            this.f53626n = bVar2;
            return bVar2;
        }
        return bVar;
    }

    public final int f(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object c10 = w7.e9.c(i11);
        if (i13 != 0) {
            w7.e9.d(i12 & i14, i13 + 1, c10);
        }
        Object obj = this.f53621a;
        obj.getClass();
        int[] iArr = this.f53622b;
        iArr.getClass();
        for (int i15 = 0; i15 <= i10; i15++) {
            int b10 = w7.e9.b(i15, obj);
            while (b10 != 0) {
                int i16 = b10 - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int b11 = w7.e9.b(i19, c10);
                w7.e9.d(i19, b10, c10);
                iArr[i16] = ((~i14) & i18) | (b11 & i14);
                b10 = i17 & i10;
            }
        }
        this.f53621a = c10;
        this.f53624e = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f53624e & (-32));
        return i14;
    }

    public final Object g(Object obj) {
        if (!c()) {
            int d = d();
            Object obj2 = this.f53621a;
            obj2.getClass();
            int[] iArr = this.f53622b;
            iArr.getClass();
            Object[] objArr = this.f53623c;
            objArr.getClass();
            int a2 = w7.e9.a(obj, null, d, obj2, iArr, objArr, null);
            if (a2 != -1) {
                Object[] objArr2 = this.d;
                objArr2.getClass();
                Object obj3 = objArr2[a2];
                b(a2, d);
                this.f53625f--;
                this.f53624e += 32;
                return obj3;
            }
        }
        return f53620s;
    }

    @Override
    public final Object get(Object obj) {
        Map a2 = a();
        if (a2 != null) {
            return a2.get(obj);
        }
        int e7 = e(obj);
        if (e7 == -1) {
            return null;
        }
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr[e7];
    }

    @Override
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Set keySet() {
        b bVar = this.h;
        if (bVar == null) {
            b bVar2 = new b(this, 1);
            this.h = bVar2;
            return bVar2;
        }
        return bVar;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13 = 32;
        if (c()) {
            if (c()) {
                int i14 = this.f53624e;
                int max = Math.max(i14 + 1, 2);
                int highestOneBit = Integer.highestOneBit(max);
                if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                    highestOneBit = 1073741824;
                }
                int max2 = Math.max(4, highestOneBit);
                this.f53621a = w7.e9.c(max2);
                this.f53624e = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f53624e & (-32));
                this.f53622b = new int[i14];
                this.f53623c = new Object[i14];
                this.d = new Object[i14];
            } else {
                throw new IllegalStateException("Arrays already allocated");
            }
        }
        Map a2 = a();
        if (a2 == null) {
            int[] iArr = this.f53622b;
            iArr.getClass();
            Object[] objArr = this.f53623c;
            objArr.getClass();
            Object[] objArr2 = this.d;
            objArr2.getClass();
            int i15 = this.f53625f;
            int i16 = i15 + 1;
            int a10 = w7.f9.a(obj);
            int d = d();
            int i17 = a10 & d;
            Object obj3 = this.f53621a;
            obj3.getClass();
            int b10 = w7.e9.b(i17, obj3);
            if (b10 == 0) {
                if (i16 > d) {
                    if (d < 32) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    d = f(d, (d + 1) * i12, a10, i15);
                } else {
                    Object obj4 = this.f53621a;
                    obj4.getClass();
                    w7.e9.d(i17, i16, obj4);
                }
                i10 = 1;
            } else {
                int i18 = ~d;
                int i19 = a10 & i18;
                int i20 = 0;
                int i21 = 0;
                while (true) {
                    int i22 = b10 - 1;
                    int i23 = iArr[i22];
                    i10 = 1;
                    int i24 = i23 & i18;
                    int i25 = i13;
                    if (i24 == i19 && w7.i9.a(obj, objArr[i22])) {
                        Object obj5 = objArr2[i22];
                        objArr2[i22] = obj2;
                        return obj5;
                    }
                    int i26 = i23 & d;
                    int i27 = i21 + 1;
                    if (i26 == 0) {
                        if (i27 >= 9) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(d() + 1, 1.0f);
                            if (isEmpty()) {
                                i20 = -1;
                            }
                            while (i20 >= 0) {
                                Object[] objArr3 = this.f53623c;
                                objArr3.getClass();
                                Object obj6 = objArr3[i20];
                                Object[] objArr4 = this.d;
                                objArr4.getClass();
                                linkedHashMap.put(obj6, objArr4[i20]);
                                int i28 = i20 + 1;
                                if (i28 >= this.f53625f) {
                                    i20 = -1;
                                } else {
                                    i20 = i28;
                                }
                            }
                            this.f53621a = linkedHashMap;
                            this.f53622b = null;
                            this.f53623c = null;
                            this.d = null;
                            this.f53624e += 32;
                            return linkedHashMap.put(obj, obj2);
                        } else if (i16 > d) {
                            if (d < i25) {
                                i11 = 4;
                            } else {
                                i11 = 2;
                            }
                            d = f(d, (d + 1) * i11, a10, i15);
                        } else {
                            iArr[i22] = (i16 & d) | i24;
                        }
                    } else {
                        i21 = i27;
                        b10 = i26;
                        i13 = i25;
                    }
                }
            }
            int[] iArr2 = this.f53622b;
            iArr2.getClass();
            int length = iArr2.length;
            if (i16 > length) {
                int i29 = i10;
                int min = Math.min(1073741823, (Math.max(i29, length >>> 1) + length) | i29);
                if (min != length) {
                    int[] iArr3 = this.f53622b;
                    iArr3.getClass();
                    this.f53622b = Arrays.copyOf(iArr3, min);
                    Object[] objArr5 = this.f53623c;
                    objArr5.getClass();
                    this.f53623c = Arrays.copyOf(objArr5, min);
                    Object[] objArr6 = this.d;
                    objArr6.getClass();
                    this.d = Arrays.copyOf(objArr6, min);
                }
            }
            int[] iArr4 = this.f53622b;
            iArr4.getClass();
            iArr4[i15] = (~d) & a10;
            Object[] objArr7 = this.f53623c;
            objArr7.getClass();
            objArr7[i15] = obj;
            Object[] objArr8 = this.d;
            objArr8.getClass();
            objArr8[i15] = obj2;
            this.f53625f = i16;
            this.f53624e += 32;
            return null;
        }
        return a2.put(obj, obj2);
    }

    @Override
    public final Object remove(Object obj) {
        Map a2 = a();
        if (a2 != null) {
            return a2.remove(obj);
        }
        Object g10 = g(obj);
        if (g10 == f53620s) {
            return null;
        }
        return g10;
    }

    @Override
    public final int size() {
        Map a2 = a();
        if (a2 != null) {
            return a2.size();
        }
        return this.f53625f;
    }

    @Override
    public final Collection values() {
        e9.n nVar = this.f53627r;
        if (nVar == null) {
            e9.n nVar2 = new e9.n(5, this);
            this.f53627r = nVar2;
            return nVar2;
        }
        return nVar;
    }
}
