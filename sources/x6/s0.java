package x6;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
public class s0 implements Iterable, Serializable {
    public static final s0 f49057c = new s0(t0.f49062a);
    public int f49058a = 0;
    public final byte[] f49059b;

    static {
        int i9 = q0.f49051a;
    }

    public s0(byte[] bArr) {
        bArr.getClass();
        this.f49059b = bArr;
    }

    public static int s(int i9, int i10, int i11) {
        int i12 = i10 - i9;
        if ((i9 | i10 | i12 | (i11 - i10)) < 0) {
            if (i9 >= 0) {
                if (i10 < i9) {
                    throw new IndexOutOfBoundsException(aa.d.k(i9, i10, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(aa.d.k(i10, i11, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException(j3.r0.m(i9, "Beginning index: ", " < 0"));
        }
        return i12;
    }

    public static s0 t(int i9, byte[] bArr) {
        s(0, i9, bArr.length);
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, 0, bArr2, 0, i9);
        return new s0(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof s0) && p() == ((s0) obj).p()) {
                if (p() != 0) {
                    if (obj instanceof s0) {
                        s0 s0Var = (s0) obj;
                        int i9 = this.f49058a;
                        int i10 = s0Var.f49058a;
                        if (i9 == 0 || i10 == 0 || i9 == i10) {
                            int p6 = p();
                            if (p6 <= s0Var.p()) {
                                if (p6 <= s0Var.p()) {
                                    byte[] bArr = s0Var.f49059b;
                                    int o6 = o() + p6;
                                    int o9 = o();
                                    int o10 = s0Var.o();
                                    while (o9 < o6) {
                                        if (this.f49059b[o9] != bArr[o10]) {
                                            return false;
                                        }
                                        o9++;
                                        o10++;
                                    }
                                    return true;
                                }
                                throw new IllegalArgumentException(aa.d.k(p6, s0Var.p(), "Ran off end of other: 0, ", ", "));
                            }
                            int p9 = p();
                            throw new IllegalArgumentException("Length too large: " + p6 + p9);
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
        int i9 = this.f49058a;
        if (i9 == 0) {
            int p6 = p();
            int o6 = o();
            byte[] bArr = t0.f49062a;
            int i10 = p6;
            for (int i11 = o6; i11 < o6 + p6; i11++) {
                i10 = (i10 * 31) + this.f49059b[i11];
            }
            if (i10 == 0) {
                i10 = 1;
            }
            this.f49058a = i10;
            return i10;
        }
        return i9;
    }

    public byte i(int i9) {
        return this.f49059b[i9];
    }

    @Override
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public byte n(int i9) {
        return this.f49059b[i9];
    }

    public int o() {
        return 0;
    }

    public int p() {
        return this.f49059b.length;
    }

    public void q(int i9, byte[] bArr) {
        System.arraycopy(this.f49059b, 0, bArr, 0, i9);
    }

    public final ByteArrayInputStream r() {
        return new ByteArrayInputStream(this.f49059b, o(), p());
    }

    public final String toString() {
        s0 r0Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int p6 = p();
        if (p() <= 50) {
            concat = a.d(this);
        } else {
            int s10 = s(0, 47, p());
            if (s10 == 0) {
                r0Var = f49057c;
            } else {
                r0Var = new r0(this.f49059b, o(), s10);
            }
            concat = a.d(r0Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(p6);
        sb2.append(" contents=\"");
        return aa.d.r(sb2, concat, "\">");
    }

    public final byte[] u() {
        int p6 = p();
        if (p6 == 0) {
            return t0.f49062a;
        }
        byte[] bArr = new byte[p6];
        q(p6, bArr);
        return bArr;
    }
}
