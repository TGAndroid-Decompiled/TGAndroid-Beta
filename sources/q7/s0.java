package q7;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
public class s0 implements Iterable, Serializable {
    public static final s0 f54022c = new s0(t0.f54027a);
    public int f54023a = 0;
    public final byte[] f54024b;

    static {
        int i7 = q0.f54016a;
    }

    public s0(byte[] bArr) {
        bArr.getClass();
        this.f54024b = bArr;
    }

    public static int n(int i7, int i10, int i11) {
        int i12 = i10 - i7;
        if ((i7 | i10 | i12 | (i11 - i10)) < 0) {
            if (i7 >= 0) {
                if (i10 < i7) {
                    throw new IndexOutOfBoundsException(a8.p0.m(i7, i10, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(a8.p0.m(i10, i11, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException(jg.g.k(i7, "Beginning index: ", " < 0"));
        }
        return i12;
    }

    public static s0 o(int i7, byte[] bArr) {
        n(0, i7, bArr.length);
        byte[] bArr2 = new byte[i7];
        System.arraycopy(bArr, 0, bArr2, 0, i7);
        return new s0(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof s0) && k() == ((s0) obj).k()) {
                if (k() != 0) {
                    if (obj instanceof s0) {
                        s0 s0Var = (s0) obj;
                        int i7 = this.f54023a;
                        int i10 = s0Var.f54023a;
                        if (i7 == 0 || i10 == 0 || i7 == i10) {
                            int k10 = k();
                            if (k10 <= s0Var.k()) {
                                if (k10 <= s0Var.k()) {
                                    byte[] bArr = s0Var.f54024b;
                                    int j3 = j() + k10;
                                    int j10 = j();
                                    int j11 = s0Var.j();
                                    while (j10 < j3) {
                                        if (this.f54024b[j10] != bArr[j11]) {
                                            return false;
                                        }
                                        j10++;
                                        j11++;
                                    }
                                    return true;
                                }
                                throw new IllegalArgumentException(a8.p0.m(k10, s0Var.k(), "Ran off end of other: 0, ", ", "));
                            }
                            int k11 = k();
                            throw new IllegalArgumentException("Length too large: " + k10 + k11);
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

    public byte f(int i7) {
        return this.f54024b[i7];
    }

    public final int hashCode() {
        int i7 = this.f54023a;
        if (i7 == 0) {
            int k10 = k();
            int j3 = j();
            byte[] bArr = t0.f54027a;
            int i10 = k10;
            for (int i11 = j3; i11 < j3 + k10; i11++) {
                i10 = (i10 * 31) + this.f54024b[i11];
            }
            if (i10 == 0) {
                i10 = 1;
            }
            this.f54023a = i10;
            return i10;
        }
        return i7;
    }

    public byte i(int i7) {
        return this.f54024b[i7];
    }

    @Override
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public int j() {
        return 0;
    }

    public int k() {
        return this.f54024b.length;
    }

    public void l(int i7, byte[] bArr) {
        System.arraycopy(this.f54024b, 0, bArr, 0, i7);
    }

    public final ByteArrayInputStream m() {
        return new ByteArrayInputStream(this.f54024b, j(), k());
    }

    public final byte[] p() {
        int k10 = k();
        if (k10 == 0) {
            return t0.f54027a;
        }
        byte[] bArr = new byte[k10];
        l(k10, bArr);
        return bArr;
    }

    public final String toString() {
        s0 r0Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int k10 = k();
        if (k() <= 50) {
            concat = a.d(this);
        } else {
            int n10 = n(0, 47, k());
            if (n10 == 0) {
                r0Var = f54022c;
            } else {
                r0Var = new r0(this.f54024b, j(), n10);
            }
            concat = a.d(r0Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(k10);
        sb2.append(" contents=\"");
        return a8.p0.s(sb2, concat, "\">");
    }
}
