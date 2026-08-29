package z6;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
public class m0 {
    public static final k0 d;
    public final j0 f50737a;
    public final Character f50738b;
    public volatile m0 f50739c;

    static {
        new l0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new l0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new m0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new m0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new k0(new j0("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public m0(j0 j0Var, Character ch2) {
        this.f50737a = j0Var;
        if (ch2 != null) {
            byte[] bArr = j0Var.f50730g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(a.c("Padding character %s was already in alphabet", ch2));
            }
        }
        this.f50738b = ch2;
    }

    public void a(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        a.m(0, i10, bArr.length);
        while (i11 < i10) {
            j0 j0Var = this.f50737a;
            b(sb2, bArr, i11, Math.min(j0Var.f50729f, i10 - i11));
            i11 += j0Var.f50729f;
        }
    }

    public final void b(StringBuilder sb2, byte[] bArr, int i10, int i11) {
        a.m(i10, i10 + i11, bArr.length);
        j0 j0Var = this.f50737a;
        int i12 = j0Var.f50729f;
        int i13 = j0Var.d;
        if (i11 <= i12) {
            int i14 = 0;
            long j10 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                j10 = (j10 | (bArr[i10 + i15] & 255)) << 8;
            }
            int i16 = (i11 + 1) * 8;
            while (i14 < i11 * 8) {
                sb2.append(j0Var.f50726b[((int) (j10 >>> ((i16 - i13) - i14))) & j0Var.f50727c]);
                i14 += i13;
            }
            if (this.f50738b != null) {
                while (i14 < j0Var.f50729f * 8) {
                    sb2.append('=');
                    i14 += i13;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public final String c(int i10, byte[] bArr) {
        a.m(0, i10, bArr.length);
        j0 j0Var = this.f50737a;
        int i11 = j0Var.f50729f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(j0Var.f50728e * a.a(i10, i11));
        try {
            a(sb2, bArr, i10);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            if (this.f50737a.equals(m0Var.f50737a) && Objects.equals(this.f50738b, m0Var.f50738b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f50737a.hashCode() ^ Objects.hashCode(this.f50738b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        j0 j0Var = this.f50737a;
        sb2.append(j0Var);
        if (8 % j0Var.d != 0) {
            Character ch2 = this.f50738b;
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
