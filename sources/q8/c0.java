package q8;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
public abstract class c0 extends u implements Set {
    public static final int f46439c = 0;
    public transient z f46440b;

    public static int s(int i10) {
        int max = Math.max(i10, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z10 = false;
        }
        if (z10) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static c0 t(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int s10 = s(i10);
                Object[] objArr2 = new Object[s10];
                int i11 = s10 - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object obj = objArr[i14];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int o10 = l.o(hashCode);
                        while (true) {
                            int i15 = o10 & i11;
                            Object obj2 = objArr2[i15];
                            if (obj2 == null) {
                                objArr[i13] = obj;
                                objArr2[i15] = obj;
                                i12 += hashCode;
                                i13++;
                                break;
                            } else if (obj2.equals(obj)) {
                                break;
                            } else {
                                o10++;
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder(20);
                        sb2.append("at index ");
                        sb2.append(i14);
                        throw new NullPointerException(sb2.toString());
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new w0(obj3);
                } else if (s(i13) < s10 / 2) {
                    return t(i13, objArr);
                } else {
                    int length = objArr.length;
                    if (i13 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i13);
                    }
                    return new r0(i12, i11, i13, objArr, objArr2);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new w0(obj4);
        }
        return r0.f46488s;
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
        z zVar = this.f46440b;
        if (zVar == null) {
            z v = v();
            this.f46440b = v;
            return v;
        }
        return zVar;
    }

    public z v() {
        Object[] array = toArray(u.f46498a);
        x xVar = z.f46511b;
        return z.s(array.length, array);
    }

    @Override
    public abstract x0 iterator();
}
