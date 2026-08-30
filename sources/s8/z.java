package s8;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
public abstract class z extends q implements Set {
    public static final int f44164c = 0;
    public transient v f44165b;

    public static int s(int i10) {
        int max = Math.max(i10, 2);
        boolean z4 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z4 = false;
        }
        if (z4) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static z t(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int s6 = s(i10);
                Object[] objArr2 = new Object[s6];
                int i11 = s6 - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object obj = objArr[i14];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int m9 = l.m(hashCode);
                        while (true) {
                            int i15 = m9 & i11;
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
                                m9++;
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(20);
                        sb.append("at index ");
                        sb.append(i14);
                        throw new NullPointerException(sb.toString());
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new t0(obj3);
                } else if (s(i13) < s6 / 2) {
                    return t(i13, objArr);
                } else {
                    int length = objArr.length;
                    if (i13 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i13);
                    }
                    return new o0(i12, i11, i13, objArr, objArr2);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new t0(obj4);
        }
        return o0.f44139s;
    }

    public static z u(Collection collection) {
        if ((collection instanceof z) && !(collection instanceof SortedSet)) {
            z zVar = (z) collection;
            if (!zVar.r()) {
                return zVar;
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
        if ((obj instanceof z) && (this instanceof o0) && (((z) obj) instanceof o0) && hashCode() != obj.hashCode()) {
            return false;
        }
        return l.e(this, obj);
    }

    @Override
    public int hashCode() {
        return l.i(this);
    }

    @Override
    public v i() {
        v vVar = this.f44165b;
        if (vVar == null) {
            v v = v();
            this.f44165b = v;
            return v;
        }
        return vVar;
    }

    public v v() {
        Object[] array = toArray(q.f44146a);
        t tVar = v.f44157b;
        return v.s(array.length, array);
    }

    @Override
    public abstract u0 iterator();
}
