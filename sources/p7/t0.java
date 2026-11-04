package p7;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import k2.p1;
public class t0 implements Iterable, Serializable {
    public static final t0 f53404c = new t0(u0.f53409a);
    public int f53405a = 0;
    public final byte[] f53406b;

    static {
        int i3 = r0.f53398a;
    }

    public t0(byte[] bArr) {
        bArr.getClass();
        this.f53406b = bArr;
    }

    public static int n(int i3, int i10, int i11) {
        int i12 = i10 - i3;
        if ((i3 | i10 | i12 | (i11 - i10)) < 0) {
            if (i3 >= 0) {
                if (i10 < i3) {
                    throw new IndexOutOfBoundsException(a1.g.n(i3, i10, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(a1.g.n(i10, i11, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException(p1.j(i3, "Beginning index: ", " < 0"));
        }
        return i12;
    }

    public static t0 o(int i3, byte[] bArr) {
        n(0, i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        return new t0(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof t0) && k() == ((t0) obj).k()) {
                if (k() != 0) {
                    if (obj instanceof t0) {
                        t0 t0Var = (t0) obj;
                        int i3 = this.f53405a;
                        int i10 = t0Var.f53405a;
                        if (i3 == 0 || i10 == 0 || i3 == i10) {
                            int k10 = k();
                            if (k10 <= t0Var.k()) {
                                if (k10 <= t0Var.k()) {
                                    byte[] bArr = t0Var.f53406b;
                                    int j10 = j() + k10;
                                    int j11 = j();
                                    int j12 = t0Var.j();
                                    while (j11 < j10) {
                                        if (this.f53406b[j11] != bArr[j12]) {
                                            return false;
                                        }
                                        j11++;
                                        j12++;
                                    }
                                    return true;
                                }
                                throw new IllegalArgumentException(a1.g.n(k10, t0Var.k(), "Ran off end of other: 0, ", ", "));
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

    public byte h(int i3) {
        return this.f53406b[i3];
    }

    public final int hashCode() {
        int i3 = this.f53405a;
        if (i3 == 0) {
            int k10 = k();
            int j10 = j();
            byte[] bArr = u0.f53409a;
            int i10 = k10;
            for (int i11 = j10; i11 < j10 + k10; i11++) {
                i10 = (i10 * 31) + this.f53406b[i11];
            }
            if (i10 == 0) {
                i10 = 1;
            }
            this.f53405a = i10;
            return i10;
        }
        return i3;
    }

    public byte i(int i3) {
        return this.f53406b[i3];
    }

    @Override
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public int j() {
        return 0;
    }

    public int k() {
        return this.f53406b.length;
    }

    public void l(int i3, byte[] bArr) {
        System.arraycopy(this.f53406b, 0, bArr, 0, i3);
    }

    public final ByteArrayInputStream m() {
        return new ByteArrayInputStream(this.f53406b, j(), k());
    }

    public final byte[] p() {
        int k10 = k();
        if (k10 == 0) {
            return u0.f53409a;
        }
        byte[] bArr = new byte[k10];
        l(k10, bArr);
        return bArr;
    }

    public final String toString() {
        t0 s0Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int k10 = k();
        if (k() <= 50) {
            concat = a.d(this);
        } else {
            int n4 = n(0, 47, k());
            if (n4 == 0) {
                s0Var = f53404c;
            } else {
                s0Var = new s0(this.f53406b, j(), n4);
            }
            concat = a.d(s0Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(k10);
        sb2.append(" contents=\"");
        return a1.g.s(sb2, concat, "\">");
    }
}
