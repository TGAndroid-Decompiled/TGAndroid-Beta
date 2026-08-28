package x6;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
public class m0 {
    public static final k0 d;
    public final j0 f49037a;
    public final Character f49038b;
    public volatile m0 f49039c;

    static {
        new l0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new l0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new m0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new m0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new k0(new j0("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public m0(j0 j0Var, Character ch2) {
        this.f49037a = j0Var;
        if (ch2 != null) {
            byte[] bArr = j0Var.f49030g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(a.c("Padding character %s was already in alphabet", ch2));
            }
        }
        this.f49038b = ch2;
    }

    public void a(StringBuilder sb2, byte[] bArr, int i9) {
        int i10 = 0;
        a.m(0, i9, bArr.length);
        while (i10 < i9) {
            j0 j0Var = this.f49037a;
            b(sb2, bArr, i10, Math.min(j0Var.f49029f, i9 - i10));
            i10 += j0Var.f49029f;
        }
    }

    public final void b(StringBuilder sb2, byte[] bArr, int i9, int i10) {
        a.m(i9, i9 + i10, bArr.length);
        j0 j0Var = this.f49037a;
        int i11 = j0Var.f49029f;
        int i12 = j0Var.d;
        if (i10 <= i11) {
            int i13 = 0;
            long j10 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                j10 = (j10 | (bArr[i9 + i14] & 255)) << 8;
            }
            int i15 = (i10 + 1) * 8;
            while (i13 < i10 * 8) {
                sb2.append(j0Var.f49026b[((int) (j10 >>> ((i15 - i12) - i13))) & j0Var.f49027c]);
                i13 += i12;
            }
            if (this.f49038b != null) {
                while (i13 < j0Var.f49029f * 8) {
                    sb2.append('=');
                    i13 += i12;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public final String c(int i9, byte[] bArr) {
        a.m(0, i9, bArr.length);
        j0 j0Var = this.f49037a;
        int i10 = j0Var.f49029f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(j0Var.f49028e * a.a(i9, i10));
        try {
            a(sb2, bArr, i9);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            if (this.f49037a.equals(m0Var.f49037a) && Objects.equals(this.f49038b, m0Var.f49038b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f49037a.hashCode() ^ Objects.hashCode(this.f49038b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        j0 j0Var = this.f49037a;
        sb2.append(j0Var);
        if (8 % j0Var.d != 0) {
            Character ch2 = this.f49038b;
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
