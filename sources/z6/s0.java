package z6;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
public class s0 implements Iterable, Serializable {
    public static final s0 f50757c = new s0(t0.f50762a);
    public int f50758a = 0;
    public final byte[] f50759b;

    static {
        int i10 = q0.f50751a;
    }

    public s0(byte[] bArr) {
        bArr.getClass();
        this.f50759b = bArr;
    }

    public static int s(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 >= 0) {
                if (i11 < i10) {
                    throw new IndexOutOfBoundsException(a4.w.k(i10, i11, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(a4.w.k(i11, i12, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException(j7.l1.l(i10, "Beginning index: ", " < 0"));
        }
        return i13;
    }

    public static s0 t(int i10, byte[] bArr) {
        s(0, i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return new s0(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof s0) && p() == ((s0) obj).p()) {
                if (p() != 0) {
                    if (obj instanceof s0) {
                        s0 s0Var = (s0) obj;
                        int i10 = this.f50758a;
                        int i11 = s0Var.f50758a;
                        if (i10 == 0 || i11 == 0 || i10 == i11) {
                            int p10 = p();
                            if (p10 <= s0Var.p()) {
                                if (p10 <= s0Var.p()) {
                                    byte[] bArr = s0Var.f50759b;
                                    int o10 = o() + p10;
                                    int o11 = o();
                                    int o12 = s0Var.o();
                                    while (o11 < o10) {
                                        if (this.f50759b[o11] != bArr[o12]) {
                                            return false;
                                        }
                                        o11++;
                                        o12++;
                                    }
                                    return true;
                                }
                                throw new IllegalArgumentException(a4.w.k(p10, s0Var.p(), "Ran off end of other: 0, ", ", "));
                            }
                            int p11 = p();
                            throw new IllegalArgumentException("Length too large: " + p10 + p11);
                        }
                        return false;
                    }
                    return obj.equals(this);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f50758a;
        if (i10 == 0) {
            int p10 = p();
            int o10 = o();
            byte[] bArr = t0.f50762a;
            int i11 = p10;
            for (int i12 = o10; i12 < o10 + p10; i12++) {
                i11 = (i11 * 31) + this.f50759b[i12];
            }
            if (i11 == 0) {
                i11 = 1;
            }
            this.f50758a = i11;
            return i11;
        }
        return i10;
    }

    public byte i(int i10) {
        return this.f50759b[i10];
    }

    @Override
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public byte n(int i10) {
        return this.f50759b[i10];
    }

    public int o() {
        return 0;
    }

    public int p() {
        return this.f50759b.length;
    }

    public void q(int i10, byte[] bArr) {
        System.arraycopy(this.f50759b, 0, bArr, 0, i10);
    }

    public final ByteArrayInputStream r() {
        return new ByteArrayInputStream(this.f50759b, o(), p());
    }

    public final String toString() {
        s0 r0Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int p10 = p();
        if (p() <= 50) {
            concat = a.d(this);
        } else {
            int s10 = s(0, 47, p());
            if (s10 == 0) {
                r0Var = f50757c;
            } else {
                r0Var = new r0(this.f50759b, o(), s10);
            }
            concat = a.d(r0Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(p10);
        sb2.append(" contents=\"");
        return a4.w.q(sb2, concat, "\">");
    }

    public final byte[] u() {
        int p10 = p();
        if (p10 == 0) {
            return t0.f50762a;
        }
        byte[] bArr = new byte[p10];
        q(p10, bArr);
        return bArr;
    }
}
