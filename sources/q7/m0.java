package q7;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
public class m0 {
    public static final k0 d;
    public final j0 f56065a;
    public final Character f56066b;
    public volatile m0 f56067c;

    static {
        new l0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new l0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new m0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new m0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new k0(new j0("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public m0(j0 j0Var, Character ch2) {
        this.f56065a = j0Var;
        if (ch2 != null) {
            byte[] bArr = j0Var.f56058g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(a.c("Padding character %s was already in alphabet", ch2));
            }
        }
        this.f56066b = ch2;
    }

    public void a(StringBuilder sb2, byte[] bArr, int i7) {
        int i10 = 0;
        a.m(0, i7, bArr.length);
        while (i10 < i7) {
            j0 j0Var = this.f56065a;
            b(sb2, bArr, i10, Math.min(j0Var.f56057f, i7 - i10));
            i10 += j0Var.f56057f;
        }
    }

    public final void b(StringBuilder sb2, byte[] bArr, int i7, int i10) {
        a.m(i7, i7 + i10, bArr.length);
        j0 j0Var = this.f56065a;
        int i11 = j0Var.f56057f;
        int i12 = j0Var.d;
        if (i10 <= i11) {
            int i13 = 0;
            long j3 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                j3 = (j3 | (bArr[i7 + i14] & 255)) << 8;
            }
            int i15 = (i10 + 1) * 8;
            while (i13 < i10 * 8) {
                sb2.append(j0Var.f56054b[((int) (j3 >>> ((i15 - i12) - i13))) & j0Var.f56055c]);
                i13 += i12;
            }
            if (this.f56066b != null) {
                while (i13 < j0Var.f56057f * 8) {
                    sb2.append('=');
                    i13 += i12;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public final String c(int i7, byte[] bArr) {
        a.m(0, i7, bArr.length);
        j0 j0Var = this.f56065a;
        int i10 = j0Var.f56057f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(j0Var.f56056e * a.a(i7, i10));
        try {
            a(sb2, bArr, i7);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            if (this.f56065a.equals(m0Var.f56065a) && Objects.equals(this.f56066b, m0Var.f56066b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f56065a.hashCode() ^ Objects.hashCode(this.f56066b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        j0 j0Var = this.f56065a;
        sb2.append(j0Var);
        if (8 % j0Var.d != 0) {
            Character ch2 = this.f56066b;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public m0(String str, String str2) {
        this(new j0(str, str2.toCharArray()), (Character) '=');
    }
}
