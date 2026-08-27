package y6;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

public class s0 implements Iterable, Serializable {

    public static final s0 f49774c = new s0(t0.f49779a);

    public int f49775a = 0;

    public final byte[] f49776b;

    static {
        int i10 = q0.f49768a;
    }

    public s0(byte[] bArr) {
        bArr.getClass();
        this.f49776b = bArr;
    }

    public static int s(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(i0.a.l(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(a9.p.j(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a9.p.j(i11, i12, "End index: ", " >= "));
    }

    public static s0 t(int i10, byte[] bArr) {
        s(0, i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return new s0(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0) || p() != ((s0) obj).p()) {
            return false;
        }
        if (p() == 0) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return obj.equals(this);
        }
        s0 s0Var = (s0) obj;
        int i10 = this.f49775a;
        int i11 = s0Var.f49775a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int iP = p();
        if (iP > s0Var.p()) {
            throw new IllegalArgumentException("Length too large: " + iP + p());
        }
        if (iP > s0Var.p()) {
            throw new IllegalArgumentException(a9.p.j(iP, s0Var.p(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = s0Var.f49776b;
        int iO = o() + iP;
        int iO2 = o();
        int iO3 = s0Var.o();
        while (iO2 < iO) {
            if (this.f49776b[iO2] != bArr[iO3]) {
                return false;
            }
            iO2++;
            iO3++;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f49775a;
        if (i10 != 0) {
            return i10;
        }
        int iP = p();
        int iO = o();
        byte[] bArr = t0.f49779a;
        int i11 = iP;
        for (int i12 = iO; i12 < iO + iP; i12++) {
            i11 = (i11 * 31) + this.f49776b[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f49775a = i11;
        return i11;
    }

    public byte i(int i10) {
        return this.f49776b[i10];
    }

    @Override
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public byte n(int i10) {
        return this.f49776b[i10];
    }

    public int o() {
        return 0;
    }

    public int p() {
        return this.f49776b.length;
    }

    public void q(int i10, byte[] bArr) {
        System.arraycopy(this.f49776b, 0, bArr, 0, i10);
    }

    public final ByteArrayInputStream r() {
        return new ByteArrayInputStream(this.f49776b, o(), p());
    }

    public final String toString() {
        s0 r0Var;
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iP = p();
        if (p() <= 50) {
            strConcat = a.d(this);
        } else {
            int iS = s(0, 47, p());
            if (iS == 0) {
                r0Var = f49774c;
            } else {
                r0Var = new r0(this.f49776b, o(), iS);
            }
            strConcat = a.d(r0Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iP);
        sb2.append(" contents=\"");
        return a9.p.p(sb2, strConcat, "\">");
    }

    public final byte[] u() {
        int iP = p();
        if (iP == 0) {
            return t0.f49779a;
        }
        byte[] bArr = new byte[iP];
        q(iP, bArr);
        return bArr;
    }
}
