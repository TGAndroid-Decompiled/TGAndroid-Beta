package qa;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
public final class l extends va.a {
    public static final k E = new k();
    public static final Object F = new Object();
    public Object[] A;
    public int B;
    public String[] C;
    public int[] D;

    @Override
    public final void C() {
        int b10 = m1.j.b(x());
        if (b10 != 1) {
            if (b10 != 9) {
                if (b10 != 3) {
                    if (b10 != 4) {
                        K();
                        int i10 = this.B;
                        if (i10 > 0) {
                            int[] iArr = this.D;
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
        throw new IllegalStateException("Expected " + u3.c.m(i10) + " but was " + u3.c.m(x()) + H());
    }

    public final String G(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.B;
            if (i10 < i11) {
                Object[] objArr = this.A;
                Object obj = objArr[i10];
                if (obj instanceof na.h) {
                    i10++;
                    if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                        int i12 = this.D[i10];
                        if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                            i12--;
                        }
                        sb2.append('[');
                        sb2.append(i12);
                        sb2.append(']');
                    }
                } else if ((obj instanceof na.l) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                    sb2.append('.');
                    String str = this.C[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
                i10++;
            } else {
                return sb2.toString();
            }
        }
    }

    public final String H() {
        return " at path " + G(false);
    }

    public final String I(boolean z10) {
        String str;
        F(5);
        Map.Entry entry = (Map.Entry) ((Iterator) J()).next();
        String str2 = (String) entry.getKey();
        String[] strArr = this.C;
        int i10 = this.B - 1;
        if (z10) {
            str = "<skipped>";
        } else {
            str = str2;
        }
        strArr[i10] = str;
        L(entry.getValue());
        return str2;
    }

    public final Object J() {
        return this.A[this.B - 1];
    }

    public final Object K() {
        Object[] objArr = this.A;
        int i10 = this.B - 1;
        this.B = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void L(Object obj) {
        int i10 = this.B;
        Object[] objArr = this.A;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.A = Arrays.copyOf(objArr, i11);
            this.D = Arrays.copyOf(this.D, i11);
            this.C = (String[]) Arrays.copyOf(this.C, i11);
        }
        Object[] objArr2 = this.A;
        int i12 = this.B;
        this.B = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override
    public final void a() {
        F(1);
        L(((na.h) J()).f17192a.iterator());
        this.D[this.B - 1] = 0;
    }

    @Override
    public final void b() {
        F(3);
        L(((pa.j) ((na.l) J()).f17194a.entrySet()).iterator());
    }

    @Override
    public final void close() {
        this.A = new Object[]{F};
        this.B = 1;
    }

    @Override
    public final void e() {
        F(2);
        K();
        K();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override
    public final void f() {
        F(4);
        this.C[this.B - 1] = null;
        K();
        K();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
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
        int x4 = x();
        if (x4 != 4 && x4 != 2 && x4 != 10) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean n() {
        F(8);
        boolean p10 = ((na.m) K()).p();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return p10;
    }

    @Override
    public final double o() {
        int x4 = x();
        if (x4 != 7 && x4 != 6) {
            throw new IllegalStateException("Expected " + u3.c.m(7) + " but was " + u3.c.m(x4) + H());
        }
        double q6 = ((na.m) J()).q();
        if (!Double.isNaN(q6) && !Double.isInfinite(q6)) {
            K();
            int i10 = this.B;
            if (i10 > 0) {
                int[] iArr = this.D;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return q6;
        }
        throw new IOException("JSON forbids NaN and infinities: " + q6);
    }

    @Override
    public final int p() {
        int parseInt;
        int x4 = x();
        if (x4 != 7 && x4 != 6) {
            throw new IllegalStateException("Expected " + u3.c.m(7) + " but was " + u3.c.m(x4) + H());
        }
        na.m mVar = (na.m) J();
        if (mVar.f17195a instanceof Number) {
            parseInt = mVar.r().intValue();
        } else {
            parseInt = Integer.parseInt(mVar.n());
        }
        K();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return parseInt;
    }

    @Override
    public final long q() {
        long parseLong;
        int x4 = x();
        if (x4 != 7 && x4 != 6) {
            throw new IllegalStateException("Expected " + u3.c.m(7) + " but was " + u3.c.m(x4) + H());
        }
        na.m mVar = (na.m) J();
        if (mVar.f17195a instanceof Number) {
            parseLong = mVar.r().longValue();
        } else {
            parseLong = Long.parseLong(mVar.n());
        }
        K();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
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
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
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
        int x4 = x();
        if (x4 != 6 && x4 != 7) {
            throw new IllegalStateException("Expected " + u3.c.m(6) + " but was " + u3.c.m(x4) + H());
        }
        String n10 = ((na.m) K()).n();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return n10;
    }

    @Override
    public final int x() {
        if (this.B == 0) {
            return 10;
        }
        Object J = J();
        if (J instanceof Iterator) {
            boolean z10 = this.A[this.B - 2] instanceof na.l;
            Iterator it = (Iterator) J;
            if (it.hasNext()) {
                if (z10) {
                    return 5;
                }
                L(it.next());
                return x();
            } else if (!z10) {
                return 2;
            } else {
                return 4;
            }
        } else if (J instanceof na.l) {
            return 3;
        } else {
            if (J instanceof na.h) {
                return 1;
            }
            if (J instanceof na.m) {
                Serializable serializable = ((na.m) J).f17195a;
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
            } else if (J instanceof na.k) {
                return 9;
            } else {
                if (J == F) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new IOException("Custom JsonElement subclass " + J.getClass().getName() + " is not supported");
            }
        }
    }
}
