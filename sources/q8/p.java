package q8;

import i7.o6;
import i7.p7;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public final class p extends AbstractMap implements Serializable {
    public static final Object f46474s = new Object();
    public transient Object f46475a;
    public transient int[] f46476b;
    public transient Object[] f46477c;
    public transient Object[] d;
    public transient int f46478e;
    public transient int f46479f;
    public transient n h;
    public transient n f46480n;
    public transient j7.m f46481r;

    public static p a() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f46478e = p7.b(8, 1);
        return abstractMap;
    }

    public final Map b() {
        Object obj = this.f46475a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.f46478e & 31)) - 1;
    }

    @Override
    public final void clear() {
        if (f()) {
            return;
        }
        this.f46478e += 32;
        Map b10 = b();
        if (b10 != null) {
            this.f46478e = p7.b(size(), 3);
            b10.clear();
            this.f46475a = null;
            this.f46479f = 0;
            return;
        }
        Arrays.fill(i(), 0, this.f46479f, (Object) null);
        Arrays.fill(j(), 0, this.f46479f, (Object) null);
        Object obj = this.f46475a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.f46479f, 0);
        this.f46479f = 0;
    }

    @Override
    public final boolean containsKey(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.containsKey(obj);
        }
        if (d(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f46479f; i10++) {
            if (o6.a(obj, j()[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int p10 = l.p(obj);
        int c3 = c();
        Object obj2 = this.f46475a;
        Objects.requireNonNull(obj2);
        int q6 = l.q(p10 & c3, obj2);
        if (q6 == 0) {
            return -1;
        }
        int i10 = ~c3;
        int i11 = p10 & i10;
        do {
            int i12 = q6 - 1;
            int i13 = h()[i12];
            if ((i13 & i10) == i11 && o6.a(obj, i()[i12])) {
                return i12;
            }
            q6 = i13 & c3;
        } while (q6 != 0);
        return -1;
    }

    public final void e(int i10, int i11) {
        Object obj = this.f46475a;
        Objects.requireNonNull(obj);
        int[] h = h();
        Object[] i12 = i();
        Object[] j10 = j();
        int size = size();
        int i13 = size - 1;
        if (i10 < i13) {
            Object obj2 = i12[i13];
            i12[i10] = obj2;
            j10[i10] = j10[i13];
            i12[i13] = null;
            j10[i13] = null;
            h[i10] = h[i13];
            h[i13] = 0;
            int p10 = l.p(obj2) & i11;
            int q6 = l.q(p10, obj);
            if (q6 == size) {
                l.r(p10, i10 + 1, obj);
                return;
            }
            while (true) {
                int i14 = q6 - 1;
                int i15 = h[i14];
                int i16 = i15 & i11;
                if (i16 == size) {
                    h[i14] = l.j(i15, i10 + 1, i11);
                    return;
                }
                q6 = i16;
            }
        } else {
            i12[i10] = null;
            j10[i10] = null;
            h[i10] = 0;
        }
    }

    @Override
    public final Set entrySet() {
        n nVar = this.f46480n;
        if (nVar == null) {
            n nVar2 = new n(this, 0);
            this.f46480n = nVar2;
            return nVar2;
        }
        return nVar;
    }

    public final boolean f() {
        if (this.f46475a == null) {
            return true;
        }
        return false;
    }

    public final Object g(Object obj) {
        if (!f()) {
            int c3 = c();
            Object obj2 = this.f46475a;
            Objects.requireNonNull(obj2);
            int m10 = l.m(obj, null, c3, obj2, h(), i(), null);
            if (m10 != -1) {
                Object obj3 = j()[m10];
                e(m10, c3);
                this.f46479f--;
                this.f46478e += 32;
                return obj3;
            }
        }
        return f46474s;
    }

    @Override
    public final Object get(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.get(obj);
        }
        int d = d(obj);
        if (d == -1) {
            return null;
        }
        return j()[d];
    }

    public final int[] h() {
        int[] iArr = this.f46476b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.f46477c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object[] j() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i10, int i11, int i12, int i13) {
        Object b10 = l.b(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            l.r(i12 & i14, i13 + 1, b10);
        }
        Object obj = this.f46475a;
        Objects.requireNonNull(obj);
        int[] h = h();
        for (int i15 = 0; i15 <= i10; i15++) {
            int q6 = l.q(i15, obj);
            while (q6 != 0) {
                int i16 = q6 - 1;
                int i17 = h[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int q9 = l.q(i19, b10);
                l.r(i19, q6, b10);
                h[i16] = l.j(i18, q9, i14);
                q6 = i17 & i10;
            }
        }
        this.f46475a = b10;
        this.f46478e = l.j(this.f46478e, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    @Override
    public final Set keySet() {
        n nVar = this.h;
        if (nVar == null) {
            n nVar2 = new n(this, 1);
            this.h = nVar2;
            return nVar2;
        }
        return nVar;
    }

    @Override
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        throw new UnsupportedOperationException("Method not decompiled: q8.p.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override
    public final Object remove(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.remove(obj);
        }
        Object g10 = g(obj);
        if (g10 == f46474s) {
            return null;
        }
        return g10;
    }

    @Override
    public final int size() {
        Map b10 = b();
        if (b10 != null) {
            return b10.size();
        }
        return this.f46479f;
    }

    @Override
    public final Collection values() {
        j7.m mVar = this.f46481r;
        if (mVar == null) {
            j7.m mVar2 = new j7.m(5, this);
            this.f46481r = mVar2;
            return mVar2;
        }
        return mVar;
    }
}
