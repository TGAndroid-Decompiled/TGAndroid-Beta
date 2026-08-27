package pa;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class l extends ua.a {
    public static final k E = new k();
    public static final Object F = new Object();
    public Object[] A;
    public int B;
    public String[] C;
    public int[] D;

    @Override
    public final void C() {
        int iB = m1.j.b(x());
        if (iB == 1) {
            e();
            return;
        }
        if (iB != 9) {
            if (iB == 3) {
                f();
                return;
            }
            if (iB == 4) {
                I(true);
                return;
            }
            K();
            int i10 = this.B;
            if (i10 > 0) {
                int[] iArr = this.D;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
        }
    }

    public final void F(int i10) {
        if (x() == i10) {
            return;
        }
        throw new IllegalStateException("Expected " + s3.c.n(i10) + " but was " + s3.c.n(x()) + H());
    }

    public final String G(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.B;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.A;
            Object obj = objArr[i10];
            if (obj instanceof ma.h) {
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
            } else if ((obj instanceof ma.l) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.C[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    public final String H() {
        return " at path " + G(false);
    }

    public final String I(boolean z10) {
        F(5);
        Map.Entry entry = (Map.Entry) ((Iterator) J()).next();
        String str = (String) entry.getKey();
        this.C[this.B - 1] = z10 ? "<skipped>" : str;
        L(entry.getValue());
        return str;
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
        L(((ma.h) J()).f17909a.iterator());
        this.D[this.B - 1] = 0;
    }

    @Override
    public final void b() {
        F(3);
        L(((oa.j) ((ma.l) J()).f17911a.entrySet()).iterator());
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
        int iX = x();
        return (iX == 4 || iX == 2 || iX == 10) ? false : true;
    }

    @Override
    public final boolean n() {
        F(8);
        boolean zP = ((ma.m) K()).p();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return zP;
    }

    @Override
    public final double o() throws ua.c {
        int iX = x();
        if (iX != 7 && iX != 6) {
            throw new IllegalStateException("Expected " + s3.c.n(7) + " but was " + s3.c.n(iX) + H());
        }
        double dQ = ((ma.m) J()).q();
        if (Double.isNaN(dQ) || Double.isInfinite(dQ)) {
            throw new ua.c("JSON forbids NaN and infinities: " + dQ);
        }
        K();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return dQ;
    }

    @Override
    public final int p() {
        int iX = x();
        if (iX != 7 && iX != 6) {
            throw new IllegalStateException("Expected " + s3.c.n(7) + " but was " + s3.c.n(iX) + H());
        }
        ma.m mVar = (ma.m) J();
        int iIntValue = mVar.f17912a instanceof Number ? mVar.r().intValue() : Integer.parseInt(mVar.n());
        K();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return iIntValue;
    }

    @Override
    public final long q() {
        int iX = x();
        if (iX != 7 && iX != 6) {
            throw new IllegalStateException("Expected " + s3.c.n(7) + " but was " + s3.c.n(iX) + H());
        }
        ma.m mVar = (ma.m) J();
        long jLongValue = mVar.f17912a instanceof Number ? mVar.r().longValue() : Long.parseLong(mVar.n());
        K();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return jLongValue;
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
        int iX = x();
        if (iX != 6 && iX != 7) {
            throw new IllegalStateException("Expected " + s3.c.n(6) + " but was " + s3.c.n(iX) + H());
        }
        String strN = ((ma.m) K()).n();
        int i10 = this.B;
        if (i10 > 0) {
            int[] iArr = this.D;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return strN;
    }

    @Override
    public final int x() {
        if (this.B == 0) {
            return 10;
        }
        Object objJ = J();
        if (objJ instanceof Iterator) {
            boolean z10 = this.A[this.B - 2] instanceof ma.l;
            Iterator it = (Iterator) objJ;
            if (!it.hasNext()) {
                return z10 ? 4 : 2;
            }
            if (z10) {
                return 5;
            }
            L(it.next());
            return x();
        }
        if (objJ instanceof ma.l) {
            return 3;
        }
        if (objJ instanceof ma.h) {
            return 1;
        }
        if (objJ instanceof ma.m) {
            Serializable serializable = ((ma.m) objJ).f17912a;
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
        }
        if (objJ instanceof ma.k) {
            return 9;
        }
        if (objJ == F) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new ua.c("Custom JsonElement subclass " + objJ.getClass().getName() + " is not supported");
    }
}
