package sa;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import vh.w2;
public final class l extends xa.a {
    public static final k F = new k();
    public static final Object G = new Object();
    public Object[] B;
    public int C;
    public String[] D;
    public int[] E;

    @Override
    public final void C() {
        int c3 = m1.j.c(x());
        if (c3 != 1) {
            if (c3 != 9) {
                if (c3 != 3) {
                    if (c3 != 4) {
                        K();
                        int i10 = this.C;
                        if (i10 > 0) {
                            int[] iArr = this.E;
                            int i11 = i10 - 1;
                            iArr[i11] = iArr[i11] + 1;
                            return;
                        }
                        return;
                    }
                    I(true);
                    return;
                }
                f();
                return;
            }
            return;
        }
        e();
    }

    public final void F(int i10) {
        if (x() == i10) {
            return;
        }
        throw new IllegalStateException("Expected " + w2.m(i10) + " but was " + w2.m(x()) + H());
    }

    public final String G(boolean z4) {
        StringBuilder sb = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.C;
            if (i10 < i11) {
                Object[] objArr = this.B;
                Object obj = objArr[i10];
                if (obj instanceof pa.h) {
                    i10++;
                    if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                        int i12 = this.E[i10];
                        if (z4 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                            i12--;
                        }
                        sb.append('[');
                        sb.append(i12);
                        sb.append(']');
                    }
                } else if ((obj instanceof pa.l) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                    sb.append('.');
                    String str = this.D[i10];
                    if (str != null) {
                        sb.append(str);
                    }
                }
                i10++;
            } else {
                return sb.toString();
            }
        }
    }

    public final String H() {
        return " at path " + G(false);
    }

    public final String I(boolean z4) {
        String str;
        F(5);
        Map.Entry entry = (Map.Entry) ((Iterator) J()).next();
        String str2 = (String) entry.getKey();
        String[] strArr = this.D;
        int i10 = this.C - 1;
        if (z4) {
            str = "<skipped>";
        } else {
            str = str2;
        }
        strArr[i10] = str;
        L(entry.getValue());
        return str2;
    }

    public final Object J() {
        return this.B[this.C - 1];
    }

    public final Object K() {
        Object[] objArr = this.B;
        int i10 = this.C - 1;
        this.C = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void L(Object obj) {
        int i10 = this.C;
        Object[] objArr = this.B;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.B = Arrays.copyOf(objArr, i11);
            this.E = Arrays.copyOf(this.E, i11);
            this.D = (String[]) Arrays.copyOf(this.D, i11);
        }
        Object[] objArr2 = this.B;
        int i12 = this.C;
        this.C = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override
    public final void a() {
        F(1);
        L(((pa.h) J()).f41109a.iterator());
        this.E[this.C - 1] = 0;
    }

    @Override
    public final void b() {
        F(3);
        L(((ra.j) ((pa.l) J()).f41111a.entrySet()).iterator());
    }

    @Override
    public final void close() {
        this.B = new Object[]{G};
        this.C = 1;
    }

    @Override
    public final void e() {
        F(2);
        K();
        K();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override
    public final void f() {
        F(4);
        this.D[this.C - 1] = null;
        K();
        K();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override
    public final String h() {
        return G(false);
    }

    @Override
    public final String j() {
        return G(true);
    }

    @Override
    public final boolean k() {
        int x10 = x();
        if (x10 != 4 && x10 != 2 && x10 != 10) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean n() {
        F(8);
        boolean p10 = ((pa.m) K()).p();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return p10;
    }

    @Override
    public final double o() {
        int x10 = x();
        if (x10 != 7 && x10 != 6) {
            throw new IllegalStateException("Expected " + w2.m(7) + " but was " + w2.m(x10) + H());
        }
        double q10 = ((pa.m) J()).q();
        if (!Double.isNaN(q10) && !Double.isInfinite(q10)) {
            K();
            int i10 = this.C;
            if (i10 > 0) {
                int[] iArr = this.E;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return q10;
        }
        throw new IOException("JSON forbids NaN and infinities: " + q10);
    }

    @Override
    public final int p() {
        int parseInt;
        int x10 = x();
        if (x10 != 7 && x10 != 6) {
            throw new IllegalStateException("Expected " + w2.m(7) + " but was " + w2.m(x10) + H());
        }
        pa.m mVar = (pa.m) J();
        if (mVar.f41112a instanceof Number) {
            parseInt = mVar.r().intValue();
        } else {
            parseInt = Integer.parseInt(mVar.n());
        }
        K();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return parseInt;
    }

    @Override
    public final long q() {
        long parseLong;
        int x10 = x();
        if (x10 != 7 && x10 != 6) {
            throw new IllegalStateException("Expected " + w2.m(7) + " but was " + w2.m(x10) + H());
        }
        pa.m mVar = (pa.m) J();
        if (mVar.f41112a instanceof Number) {
            parseLong = mVar.r().longValue();
        } else {
            parseLong = Long.parseLong(mVar.n());
        }
        K();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return parseLong;
    }

    @Override
    public final String r() {
        return I(false);
    }

    @Override
    public final void t() {
        F(9);
        K();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override
    public final String toString() {
        return l.class.getSimpleName() + H();
    }

    @Override
    public final String v() {
        int x10 = x();
        if (x10 != 6 && x10 != 7) {
            throw new IllegalStateException("Expected " + w2.m(6) + " but was " + w2.m(x10) + H());
        }
        String n10 = ((pa.m) K()).n();
        int i10 = this.C;
        if (i10 > 0) {
            int[] iArr = this.E;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return n10;
    }

    @Override
    public final int x() {
        if (this.C == 0) {
            return 10;
        }
        Object J = J();
        if (J instanceof Iterator) {
            boolean z4 = this.B[this.C - 2] instanceof pa.l;
            Iterator it = (Iterator) J;
            if (it.hasNext()) {
                if (z4) {
                    return 5;
                }
                L(it.next());
                return x();
            } else if (!z4) {
                return 2;
            } else {
                return 4;
            }
        } else if (J instanceof pa.l) {
            return 3;
        } else {
            if (J instanceof pa.h) {
                return 1;
            }
            if (J instanceof pa.m) {
                Serializable serializable = ((pa.m) J).f41112a;
                if (serializable instanceof String) {
                    return 6;
                }
                if (serializable instanceof Boolean) {
                    return 8;
                }
                if (serializable instanceof Number) {
                    return 7;
                }
                throw new AssertionError();
            } else if (J instanceof pa.k) {
                return 9;
            } else {
                if (J == G) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new IOException("Custom JsonElement subclass " + J.getClass().getName() + " is not supported");
            }
        }
    }
}
