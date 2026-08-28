package x6;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;
public abstract class o extends h implements Set, j$.util.Set {
    public static final int f49045c = 0;
    public transient m f49046b;

    public static o r(int i9, Object... objArr) {
        if (i9 != 0) {
            if (i9 != 1) {
                int s10 = s(i9);
                Object[] objArr2 = new Object[s10];
                int i10 = s10 - 1;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < i9; i13++) {
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
                        throw new NullPointerException(j3.r0.l(i13, "at index "));
                    }
                }
                Arrays.fill(objArr, i12, i9, (Object) null);
                if (i12 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new b0(obj3);
                }
                if (s(i12) < s10 / 2) {
                    return r(i12, objArr);
                }
                if (i12 <= 0) {
                    objArr = Arrays.copyOf(objArr, i12);
                }
                return new y(i11, i10, i12, objArr, objArr2);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new b0(obj4);
        }
        return y.f49073s;
    }

    public static int s(int i9) {
        int max = Math.max(i9, 2);
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
            if (!(obj instanceof o) || !(this instanceof y) || !(((o) obj) instanceof y) || ((y) this).f49074e == obj.hashCode()) {
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

    public m t() {
        m mVar = this.f49046b;
        if (mVar == null) {
            m u10 = u();
            this.f49046b = u10;
            return u10;
        }
        return mVar;
    }

    public m u() {
        Object[] array = toArray(h.f49013a);
        i iVar = m.f49036b;
        return m.t(array.length, array);
    }
}
