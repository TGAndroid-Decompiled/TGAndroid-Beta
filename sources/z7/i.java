package z7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public final class i extends AbstractMap implements Serializable {
    public static final Object f59904s = new Object();
    public transient Object f59905a;
    public transient int[] f59906b;
    public transient Object[] f59907c;
    public transient Object[] d;
    public transient int f59908e = Math.min(Math.max(12, 1), 1073741823);
    public transient int f59909f;
    public transient g h;
    public transient g f59910n;
    public transient b8.f f59911r;

    public final Map b() {
        Object obj = this.f59905a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void c(int i3, int i10) {
        Object obj = this.f59905a;
        obj.getClass();
        int[] iArr = this.f59906b;
        iArr.getClass();
        Object[] objArr = this.f59907c;
        objArr.getClass();
        Object[] objArr2 = this.d;
        objArr2.getClass();
        int size = size();
        int i11 = size - 1;
        if (i3 < i11) {
            Object obj2 = objArr[i11];
            objArr[i3] = obj2;
            objArr2[i3] = objArr2[i11];
            objArr[i11] = null;
            objArr2[i11] = null;
            iArr[i3] = iArr[i11];
            iArr[i11] = 0;
            int a10 = x7.t6.a(obj2) & i10;
            int b10 = x7.s6.b(a10, obj);
            if (b10 == size) {
                x7.s6.d(a10, i3 + 1, obj);
                return;
            }
            while (true) {
                int i12 = b10 - 1;
                int i13 = iArr[i12];
                int i14 = i13 & i10;
                if (i14 != size) {
                    b10 = i14;
                } else {
                    iArr[i12] = ((i3 + 1) & i10) | (i13 & (~i10));
                    return;
                }
            }
        } else {
            objArr[i3] = null;
            objArr2[i3] = null;
            iArr[i3] = 0;
        }
    }

    @Override
    public final void clear() {
        if (d()) {
            return;
        }
        this.f59908e += 32;
        Map b10 = b();
        if (b10 != null) {
            this.f59908e = Math.min(Math.max(size(), 3), 1073741823);
            b10.clear();
            this.f59905a = null;
            this.f59909f = 0;
            return;
        }
        Object[] objArr = this.f59907c;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.f59909f, (Object) null);
        Object[] objArr2 = this.d;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.f59909f, (Object) null);
        Object obj = this.f59905a;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.f59906b;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.f59909f, 0);
        this.f59909f = 0;
    }

    @Override
    public final boolean containsKey(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.containsKey(obj);
        }
        if (f(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Map b10 = b();
        if (b10 == null) {
            for (int i3 = 0; i3 < this.f59909f; i3++) {
                Object[] objArr = this.d;
                objArr.getClass();
                if (x7.w6.a(obj, objArr[i3])) {
                    return true;
                }
            }
            return false;
        }
        return b10.containsValue(obj);
    }

    public final boolean d() {
        if (this.f59905a == null) {
            return true;
        }
        return false;
    }

    public final int e() {
        return (1 << (this.f59908e & 31)) - 1;
    }

    @Override
    public final Set entrySet() {
        g gVar = this.f59910n;
        if (gVar == null) {
            g gVar2 = new g(this, 0);
            this.f59910n = gVar2;
            return gVar2;
        }
        return gVar;
    }

    public final int f(Object obj) {
        if (d()) {
            return -1;
        }
        int a10 = x7.t6.a(obj);
        int e10 = e();
        Object obj2 = this.f59905a;
        obj2.getClass();
        int b10 = x7.s6.b(a10 & e10, obj2);
        if (b10 == 0) {
            return -1;
        }
        int i3 = ~e10;
        int i10 = a10 & i3;
        do {
            int i11 = b10 - 1;
            int[] iArr = this.f59906b;
            iArr.getClass();
            int i12 = iArr[i11];
            if ((i12 & i3) == i10) {
                Object[] objArr = this.f59907c;
                objArr.getClass();
                if (x7.w6.a(obj, objArr[i11])) {
                    return i11;
                }
            }
            b10 = i12 & e10;
        } while (b10 != 0);
        return -1;
    }

    public final int g(int i3, int i10, int i11, int i12) {
        Object c2 = x7.s6.c(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            x7.s6.d(i11 & i13, i12 + 1, c2);
        }
        Object obj = this.f59905a;
        obj.getClass();
        int[] iArr = this.f59906b;
        iArr.getClass();
        for (int i14 = 0; i14 <= i3; i14++) {
            int b10 = x7.s6.b(i14, obj);
            while (b10 != 0) {
                int i15 = b10 - 1;
                int i16 = iArr[i15];
                int i17 = ((~i3) & i16) | i14;
                int i18 = i17 & i13;
                int b11 = x7.s6.b(i18, c2);
                x7.s6.d(i18, b10, c2);
                iArr[i15] = ((~i13) & i17) | (b11 & i13);
                b10 = i16 & i3;
            }
        }
        this.f59905a = c2;
        this.f59908e = ((32 - Integer.numberOfLeadingZeros(i13)) & 31) | (this.f59908e & (-32));
        return i13;
    }

    @Override
    public final Object get(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.get(obj);
        }
        int f10 = f(obj);
        if (f10 == -1) {
            return null;
        }
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr[f10];
    }

    public final Object h(Object obj) {
        if (!d()) {
            int e10 = e();
            Object obj2 = this.f59905a;
            obj2.getClass();
            int[] iArr = this.f59906b;
            iArr.getClass();
            Object[] objArr = this.f59907c;
            objArr.getClass();
            int a10 = x7.s6.a(obj, null, e10, obj2, iArr, objArr, null);
            if (a10 != -1) {
                Object[] objArr2 = this.d;
                objArr2.getClass();
                Object obj3 = objArr2[a10];
                c(a10, e10);
                this.f59909f--;
                this.f59908e += 32;
                return obj3;
            }
        }
        return f59904s;
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
        g gVar = this.h;
        if (gVar == null) {
            g gVar2 = new g(this, 1);
            this.h = gVar2;
            return gVar2;
        }
        return gVar;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        int i3;
        int i10;
        int i11;
        int i12 = 32;
        if (d()) {
            if (d()) {
                int i13 = this.f59908e;
                int max = Math.max(i13 + 1, 2);
                int highestOneBit = Integer.highestOneBit(max);
                if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                    highestOneBit = 1073741824;
                }
                int max2 = Math.max(4, highestOneBit);
                this.f59905a = x7.s6.c(max2);
                this.f59908e = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f59908e & (-32));
                this.f59906b = new int[i13];
                this.f59907c = new Object[i13];
                this.d = new Object[i13];
            } else {
                throw new IllegalStateException("Arrays already allocated");
            }
        }
        Map b10 = b();
        if (b10 != null) {
            return b10.put(obj, obj2);
        }
        int[] iArr = this.f59906b;
        iArr.getClass();
        Object[] objArr = this.f59907c;
        objArr.getClass();
        Object[] objArr2 = this.d;
        objArr2.getClass();
        int i14 = this.f59909f;
        int i15 = i14 + 1;
        int a10 = x7.t6.a(obj);
        int e10 = e();
        int i16 = a10 & e10;
        Object obj3 = this.f59905a;
        obj3.getClass();
        int b11 = x7.s6.b(i16, obj3);
        if (b11 == 0) {
            if (i15 > e10) {
                if (e10 < 32) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                e10 = g(e10, (e10 + 1) * i11, a10, i14);
            } else {
                Object obj4 = this.f59905a;
                obj4.getClass();
                x7.s6.d(i16, i15, obj4);
            }
            i3 = 1;
        } else {
            int i17 = ~e10;
            int i18 = a10 & i17;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                int i21 = b11 - 1;
                int i22 = iArr[i21];
                i3 = 1;
                int i23 = i22 & i17;
                int i24 = i12;
                if (i23 == i18 && x7.w6.a(obj, objArr[i21])) {
                    Object obj5 = objArr2[i21];
                    objArr2[i21] = obj2;
                    return obj5;
                }
                int i25 = i22 & e10;
                int i26 = i20 + 1;
                if (i25 == 0) {
                    if (i26 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(e() + 1, 1.0f);
                        if (isEmpty()) {
                            i19 = -1;
                        }
                        while (i19 >= 0) {
                            Object[] objArr3 = this.f59907c;
                            objArr3.getClass();
                            Object obj6 = objArr3[i19];
                            Object[] objArr4 = this.d;
                            objArr4.getClass();
                            linkedHashMap.put(obj6, objArr4[i19]);
                            int i27 = i19 + 1;
                            if (i27 >= this.f59909f) {
                                i19 = -1;
                            } else {
                                i19 = i27;
                            }
                        }
                        this.f59905a = linkedHashMap;
                        this.f59906b = null;
                        this.f59907c = null;
                        this.d = null;
                        this.f59908e += 32;
                        return linkedHashMap.put(obj, obj2);
                    } else if (i15 > e10) {
                        if (e10 < i24) {
                            i10 = 4;
                        } else {
                            i10 = 2;
                        }
                        e10 = g(e10, (e10 + 1) * i10, a10, i14);
                    } else {
                        iArr[i21] = (i15 & e10) | i23;
                    }
                } else {
                    i20 = i26;
                    b11 = i25;
                    i12 = i24;
                }
            }
        }
        int[] iArr2 = this.f59906b;
        iArr2.getClass();
        int length = iArr2.length;
        if (i15 > length) {
            int i28 = i3;
            int min = Math.min(1073741823, (Math.max(i28, length >>> 1) + length) | i28);
            if (min != length) {
                int[] iArr3 = this.f59906b;
                iArr3.getClass();
                this.f59906b = Arrays.copyOf(iArr3, min);
                Object[] objArr5 = this.f59907c;
                objArr5.getClass();
                this.f59907c = Arrays.copyOf(objArr5, min);
                Object[] objArr6 = this.d;
                objArr6.getClass();
                this.d = Arrays.copyOf(objArr6, min);
            }
        }
        int[] iArr4 = this.f59906b;
        iArr4.getClass();
        iArr4[i14] = (~e10) & a10;
        Object[] objArr7 = this.f59907c;
        objArr7.getClass();
        objArr7[i14] = obj;
        Object[] objArr8 = this.d;
        objArr8.getClass();
        objArr8[i14] = obj2;
        this.f59909f = i15;
        this.f59908e += 32;
        return null;
    }

    @Override
    public final Object remove(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.remove(obj);
        }
        Object h = h(obj);
        if (h == f59904s) {
            return null;
        }
        return h;
    }

    @Override
    public final int size() {
        Map b10 = b();
        if (b10 != null) {
            return b10.size();
        }
        return this.f59909f;
    }

    @Override
    public final Collection values() {
        b8.f fVar = this.f59911r;
        if (fVar == null) {
            b8.f fVar2 = new b8.f((Object) this, 6);
            this.f59911r = fVar2;
            return fVar2;
        }
        return fVar;
    }
}
