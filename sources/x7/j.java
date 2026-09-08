package x7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public final class j extends AbstractMap implements Serializable {
    public static final Object f49072s = new Object();
    public transient Object f49073a;
    public transient int[] f49074b;
    public transient Object[] f49075c;
    public transient Object[] d;
    public transient int f49076e = Math.min(Math.max(12, 1), 1073741823);
    public transient int f49077f;
    public transient h h;
    public transient h f49078n;
    public transient e9.n f49079r;

    public final Map a() {
        Object obj = this.f49073a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void b(int i10, int i11) {
        Object obj = this.f49073a;
        obj.getClass();
        int[] iArr = this.f49074b;
        iArr.getClass();
        Object[] objArr = this.f49075c;
        objArr.getClass();
        Object[] objArr2 = this.d;
        objArr2.getClass();
        int size = size();
        int i12 = size - 1;
        if (i10 < i12) {
            Object obj2 = objArr[i12];
            objArr[i10] = obj2;
            objArr2[i10] = objArr2[i12];
            objArr[i12] = null;
            objArr2[i12] = null;
            iArr[i10] = iArr[i12];
            iArr[i12] = 0;
            int a2 = w7.i8.a(obj2) & i11;
            int b10 = w7.h8.b(a2, obj);
            if (b10 == size) {
                w7.h8.d(a2, i10 + 1, obj);
                return;
            }
            while (true) {
                int i13 = b10 - 1;
                int i14 = iArr[i13];
                int i15 = i14 & i11;
                if (i15 != size) {
                    b10 = i15;
                } else {
                    iArr[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
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
        if (this.f49073a == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void clear() {
        if (c()) {
            return;
        }
        this.f49076e += 32;
        Map a2 = a();
        if (a2 != null) {
            this.f49076e = Math.min(Math.max(size(), 3), 1073741823);
            a2.clear();
            this.f49073a = null;
            this.f49077f = 0;
            return;
        }
        Object[] objArr = this.f49075c;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.f49077f, (Object) null);
        Object[] objArr2 = this.d;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.f49077f, (Object) null);
        Object obj = this.f49073a;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.f49074b;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.f49077f, 0);
        this.f49077f = 0;
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
            for (int i10 = 0; i10 < this.f49077f; i10++) {
                Object[] objArr = this.d;
                objArr.getClass();
                if (w7.l8.a(obj, objArr[i10])) {
                    return true;
                }
            }
            return false;
        }
        return a2.containsValue(obj);
    }

    public final int d() {
        return (1 << (this.f49076e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (c()) {
            return -1;
        }
        int a2 = w7.i8.a(obj);
        int d = d();
        Object obj2 = this.f49073a;
        obj2.getClass();
        int b10 = w7.h8.b(a2 & d, obj2);
        if (b10 == 0) {
            return -1;
        }
        int i10 = ~d;
        int i11 = a2 & i10;
        do {
            int i12 = b10 - 1;
            int[] iArr = this.f49074b;
            iArr.getClass();
            int i13 = iArr[i12];
            if ((i13 & i10) == i11) {
                Object[] objArr = this.f49075c;
                objArr.getClass();
                if (w7.l8.a(obj, objArr[i12])) {
                    return i12;
                }
            }
            b10 = i13 & d;
        } while (b10 != 0);
        return -1;
    }

    @Override
    public final Set entrySet() {
        h hVar = this.f49078n;
        if (hVar == null) {
            h hVar2 = new h(this, 0);
            this.f49078n = hVar2;
            return hVar2;
        }
        return hVar;
    }

    public final int f(int i10, int i11, int i12, int i13) {
        Object c10 = w7.h8.c(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            w7.h8.d(i12 & i14, i13 + 1, c10);
        }
        Object obj = this.f49073a;
        obj.getClass();
        int[] iArr = this.f49074b;
        iArr.getClass();
        for (int i15 = 0; i15 <= i10; i15++) {
            int b10 = w7.h8.b(i15, obj);
            while (b10 != 0) {
                int i16 = b10 - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int b11 = w7.h8.b(i19, c10);
                w7.h8.d(i19, b10, c10);
                iArr[i16] = ((~i14) & i18) | (b11 & i14);
                b10 = i17 & i10;
            }
        }
        this.f49073a = c10;
        this.f49076e = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f49076e & (-32));
        return i14;
    }

    public final Object g(Object obj) {
        if (!c()) {
            int d = d();
            Object obj2 = this.f49073a;
            obj2.getClass();
            int[] iArr = this.f49074b;
            iArr.getClass();
            Object[] objArr = this.f49075c;
            objArr.getClass();
            int a2 = w7.h8.a(obj, null, d, obj2, iArr, objArr, null);
            if (a2 != -1) {
                Object[] objArr2 = this.d;
                objArr2.getClass();
                Object obj3 = objArr2[a2];
                b(a2, d);
                this.f49077f--;
                this.f49076e += 32;
                return obj3;
            }
        }
        return f49072s;
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
        h hVar = this.h;
        if (hVar == null) {
            h hVar2 = new h(this, 1);
            this.h = hVar2;
            return hVar2;
        }
        return hVar;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        int i10;
        int min;
        int i11;
        if (c()) {
            if (c()) {
                int i12 = this.f49076e;
                int max = Math.max(i12 + 1, 2);
                int highestOneBit = Integer.highestOneBit(max);
                if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                    highestOneBit = 1073741824;
                }
                int max2 = Math.max(4, highestOneBit);
                this.f49073a = w7.h8.c(max2);
                this.f49076e = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f49076e & (-32));
                this.f49074b = new int[i12];
                this.f49075c = new Object[i12];
                this.d = new Object[i12];
            } else {
                throw new IllegalStateException("Arrays already allocated");
            }
        }
        Map a2 = a();
        if (a2 != null) {
            return a2.put(obj, obj2);
        }
        int[] iArr = this.f49074b;
        iArr.getClass();
        Object[] objArr = this.f49075c;
        objArr.getClass();
        Object[] objArr2 = this.d;
        objArr2.getClass();
        int i13 = this.f49077f;
        int i14 = i13 + 1;
        int a10 = w7.i8.a(obj);
        int d = d();
        int i15 = a10 & d;
        Object obj3 = this.f49073a;
        obj3.getClass();
        int b10 = w7.h8.b(i15, obj3);
        if (b10 == 0) {
            if (i14 > d) {
                if (d < 32) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                d = f(d, (d + 1) * i11, a10, i13);
            } else {
                Object obj4 = this.f49073a;
                obj4.getClass();
                w7.h8.d(i15, i14, obj4);
            }
        } else {
            int i16 = ~d;
            int i17 = a10 & i16;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                int i20 = b10 - 1;
                int i21 = iArr[i20];
                int i22 = i21 & i16;
                if (i22 == i17 && w7.l8.a(obj, objArr[i20])) {
                    Object obj5 = objArr2[i20];
                    objArr2[i20] = obj2;
                    return obj5;
                }
                int i23 = i21 & d;
                int i24 = i19 + 1;
                if (i23 == 0) {
                    if (i24 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d() + 1, 1.0f);
                        if (isEmpty()) {
                            i18 = -1;
                        }
                        while (i18 >= 0) {
                            Object[] objArr3 = this.f49075c;
                            objArr3.getClass();
                            Object obj6 = objArr3[i18];
                            Object[] objArr4 = this.d;
                            objArr4.getClass();
                            linkedHashMap.put(obj6, objArr4[i18]);
                            int i25 = i18 + 1;
                            if (i25 >= this.f49077f) {
                                i18 = -1;
                            } else {
                                i18 = i25;
                            }
                        }
                        this.f49073a = linkedHashMap;
                        this.f49074b = null;
                        this.f49075c = null;
                        this.d = null;
                        this.f49076e += 32;
                        return linkedHashMap.put(obj, obj2);
                    } else if (i14 > d) {
                        if (d < 32) {
                            i10 = 4;
                        } else {
                            i10 = 2;
                        }
                        d = f(d, (d + 1) * i10, a10, i13);
                    } else {
                        iArr[i20] = (i14 & d) | i22;
                    }
                } else {
                    i19 = i24;
                    b10 = i23;
                }
            }
        }
        int[] iArr2 = this.f49074b;
        iArr2.getClass();
        int length = iArr2.length;
        if (i14 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr3 = this.f49074b;
            iArr3.getClass();
            this.f49074b = Arrays.copyOf(iArr3, min);
            Object[] objArr5 = this.f49075c;
            objArr5.getClass();
            this.f49075c = Arrays.copyOf(objArr5, min);
            Object[] objArr6 = this.d;
            objArr6.getClass();
            this.d = Arrays.copyOf(objArr6, min);
        }
        int[] iArr4 = this.f49074b;
        iArr4.getClass();
        iArr4[i13] = (~d) & a10;
        Object[] objArr7 = this.f49075c;
        objArr7.getClass();
        objArr7[i13] = obj;
        Object[] objArr8 = this.d;
        objArr8.getClass();
        objArr8[i13] = obj2;
        this.f49077f = i14;
        this.f49076e += 32;
        return null;
    }

    @Override
    public final Object remove(Object obj) {
        Map a2 = a();
        if (a2 != null) {
            return a2.remove(obj);
        }
        Object g10 = g(obj);
        if (g10 == f49072s) {
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
        return this.f49077f;
    }

    @Override
    public final Collection values() {
        e9.n nVar = this.f49079r;
        if (nVar == null) {
            e9.n nVar2 = new e9.n(3, this);
            this.f49079r = nVar2;
            return nVar2;
        }
        return nVar;
    }
}
