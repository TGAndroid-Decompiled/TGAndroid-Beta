package p8;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

public abstract class c0 extends u implements Set {

    public static final int f45532c = 0;

    public transient z f45533b;

    public static int s(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static c0 t(int i10, Object... objArr) {
        if (i10 == 0) {
            return r0.f45581s;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new w0(obj);
        }
        int iS = s(i10);
        Object[] objArr2 = new Object[iS];
        int i11 = iS - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i14);
                throw new NullPointerException(sb2.toString());
            }
            int iHashCode = obj2.hashCode();
            int iO = l.o(iHashCode);
            while (true) {
                int i15 = iO & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iO++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new w0(obj4);
        }
        if (s(i13) < iS / 2) {
            return t(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new r0(i12, i11, i13, objArr, objArr2);
    }

    public static c0 u(Collection collection) {
        if ((collection instanceof c0) && !(collection instanceof SortedSet)) {
            c0 c0Var = (c0) collection;
            if (!c0Var.r()) {
                return c0Var;
            }
        }
        Object[] array = collection.toArray();
        return t(array.length, array);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof c0) && (this instanceof r0) && (((c0) obj) instanceof r0) && hashCode() != obj.hashCode()) {
            return false;
        }
        return l.d(this, obj);
    }

    @Override
    public int hashCode() {
        return l.h(this);
    }

    @Override
    public z i() {
        z zVar = this.f45533b;
        if (zVar != null) {
            return zVar;
        }
        z zVarV = v();
        this.f45533b = zVarV;
        return zVarV;
    }

    public z v() {
        Object[] array = toArray(u.f45591a);
        x xVar = z.f45604b;
        return z.s(array.length, array);
    }

    @Override
    public abstract x0 iterator();
}
