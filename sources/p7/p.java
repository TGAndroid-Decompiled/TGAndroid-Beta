package p7;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;
import k2.p1;
public abstract class p extends i implements Set, j$.util.Set {
    public static final int f53392c = 0;
    public transient n f53393b;

    public static p m(int i3, Object... objArr) {
        if (i3 != 0) {
            if (i3 != 1) {
                int n4 = n(i3);
                Object[] objArr2 = new Object[n4];
                int i10 = n4 - 1;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < i3; i13++) {
                    Object obj = objArr[i13];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int rotateLeft = (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
                        while (true) {
                            int i14 = rotateLeft & i10;
                            Object obj2 = objArr2[i14];
                            if (obj2 == null) {
                                objArr[i12] = obj;
                                objArr2[i14] = obj;
                                i11 += hashCode;
                                i12++;
                                break;
                            } else if (!obj2.equals(obj)) {
                                rotateLeft++;
                            }
                        }
                    } else {
                        throw new NullPointerException(p1.i(i13, "at index "));
                    }
                }
                Arrays.fill(objArr, i12, i3, (Object) null);
                if (i12 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new c0(obj3);
                }
                if (n(i12) < n4 / 2) {
                    return m(i12, objArr);
                }
                if (i12 <= 0) {
                    objArr = Arrays.copyOf(objArr, i12);
                }
                return new z(i11, i10, i12, objArr, objArr2);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new c0(obj4);
        }
        return z.f53420s;
    }

    public static int n(int i3) {
        int max = Math.max(i3, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof p) || !(this instanceof z) || !(((p) obj) instanceof z) || ((z) this).f53421e == obj.hashCode()) {
                if (obj != this) {
                    if (obj instanceof Set) {
                        Set set = (Set) obj;
                        try {
                            if (size() == set.size()) {
                                if (containsAll(set)) {
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        } catch (ClassCastException | NullPointerException unused) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return a.b(this);
    }

    public n o() {
        n nVar = this.f53393b;
        if (nVar == null) {
            n p10 = p();
            this.f53393b = p10;
            return p10;
        }
        return nVar;
    }

    public n p() {
        Object[] array = toArray(i.f53360a);
        j jVar = n.f53383b;
        return n.o(array.length, array);
    }
}
