package p8;

import h7.u6;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class p extends AbstractMap implements Serializable {

    public static final Object f45567s = new Object();

    public transient Object f45568a;

    public transient int[] f45569b;

    public transient Object[] f45570c;
    public transient Object[] d;

    public transient int f45571e;

    public transient int f45572f;
    public transient n h;

    public transient n f45573n;

    public transient i7.m f45574r;

    public static p a() {
        p pVar = new p();
        pVar.f45571e = u6.b(8, 1);
        return pVar;
    }

    public final Map b() {
        Object obj = this.f45568a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.f45571e & 31)) - 1;
    }

    @Override
    public final void clear() {
        if (f()) {
            return;
        }
        this.f45571e += 32;
        Map mapB = b();
        if (mapB != null) {
            this.f45571e = u6.b(size(), 3);
            mapB.clear();
            this.f45568a = null;
            this.f45572f = 0;
            return;
        }
        Arrays.fill(i(), 0, this.f45572f, (Object) null);
        Arrays.fill(j(), 0, this.f45572f, (Object) null);
        Object obj = this.f45568a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.f45572f, 0);
        this.f45572f = 0;
    }

    @Override
    public final boolean containsKey(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.containsKey(obj);
        }
        return d(obj) != -1;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f45572f; i10++) {
            if (h7.e0.a(obj, j()[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int iP = l.p(obj);
        int iC = c();
        Object obj2 = this.f45568a;
        Objects.requireNonNull(obj2);
        int iQ = l.q(iP & iC, obj2);
        if (iQ == 0) {
            return -1;
        }
        int i10 = ~iC;
        int i11 = iP & i10;
        do {
            int i12 = iQ - 1;
            int i13 = h()[i12];
            if ((i13 & i10) == i11 && h7.e0.a(obj, i()[i12])) {
                return i12;
            }
            iQ = i13 & iC;
        } while (iQ != 0);
        return -1;
    }

    public final void e(int i10, int i11) {
        Object obj = this.f45568a;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        Object[] objArrI = i();
        Object[] objArrJ = j();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrI[i10] = null;
            objArrJ[i10] = null;
            iArrH[i10] = 0;
            return;
        }
        Object obj2 = objArrI[i12];
        objArrI[i10] = obj2;
        objArrJ[i10] = objArrJ[i12];
        objArrI[i12] = null;
        objArrJ[i12] = null;
        iArrH[i10] = iArrH[i12];
        iArrH[i12] = 0;
        int iP = l.p(obj2) & i11;
        int iQ = l.q(iP, obj);
        if (iQ == size) {
            l.r(iP, i10 + 1, obj);
            return;
        }
        while (true) {
            int i13 = iQ - 1;
            int i14 = iArrH[i13];
            int i15 = i14 & i11;
            if (i15 == size) {
                iArrH[i13] = l.j(i14, i10 + 1, i11);
                return;
            }
            iQ = i15;
        }
    }

    @Override
    public final Set entrySet() {
        n nVar = this.f45573n;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this, 0);
        this.f45573n = nVar2;
        return nVar2;
    }

    public final boolean f() {
        return this.f45568a == null;
    }

    public final Object g(Object obj) {
        if (!f()) {
            int iC = c();
            Object obj2 = this.f45568a;
            Objects.requireNonNull(obj2);
            int iM = l.m(obj, null, iC, obj2, h(), i(), null);
            if (iM != -1) {
                Object obj3 = j()[iM];
                e(iM, iC);
                this.f45572f--;
                this.f45571e += 32;
                return obj3;
            }
        }
        return f45567s;
    }

    @Override
    public final Object get(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.get(obj);
        }
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        return j()[iD];
    }

    public final int[] h() {
        int[] iArr = this.f45569b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.f45570c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i10, int i11, int i12, int i13) {
        Object objB = l.b(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            l.r(i12 & i14, i13 + 1, objB);
        }
        Object obj = this.f45568a;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iQ = l.q(i15, obj);
            while (iQ != 0) {
                int i16 = iQ - 1;
                int i17 = iArrH[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iQ2 = l.q(i19, objB);
                l.r(i19, iQ, objB);
                iArrH[i16] = l.j(i18, iQ2, i14);
                iQ = i17 & i10;
            }
        }
        this.f45568a = objB;
        this.f45571e = l.j(this.f45571e, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    @Override
    public final Set keySet() {
        n nVar = this.h;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this, 1);
        this.h = nVar2;
        return nVar2;
    }

    @Override
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        throw new UnsupportedOperationException("Method not decompiled: p8.p.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override
    public final Object remove(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.remove(obj);
        }
        Object objG = g(obj);
        if (objG == f45567s) {
            return null;
        }
        return objG;
    }

    @Override
    public final int size() {
        Map mapB = b();
        return mapB != null ? mapB.size() : this.f45572f;
    }

    @Override
    public final Collection values() {
        i7.m mVar = this.f45574r;
        if (mVar != null) {
            return mVar;
        }
        i7.m mVar2 = new i7.m(5, this);
        this.f45574r = mVar2;
        return mVar2;
    }
}
