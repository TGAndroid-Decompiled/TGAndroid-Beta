package y6;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;

public class m0 {
    public static final k0 d;

    public final j0 f49754a;

    public final Character f49755b;

    public volatile m0 f49756c;

    static {
        new l0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new l0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new m0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new m0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new k0(new j0("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public m0(j0 j0Var, Character ch2) {
        this.f49754a = j0Var;
        if (ch2 != null) {
            byte[] bArr = j0Var.f49747g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(a.c("Padding character %s was already in alphabet", ch2));
            }
        }
        this.f49755b = ch2;
    }

    public void a(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        a.m(0, i10, bArr.length);
        while (i11 < i10) {
            j0 j0Var = this.f49754a;
            b(sb2, bArr, i11, Math.min(j0Var.f49746f, i10 - i11));
            i11 += j0Var.f49746f;
        }
    }

    public final void b(StringBuilder sb2, byte[] bArr, int i10, int i11) {
        a.m(i10, i10 + i11, bArr.length);
        j0 j0Var = this.f49754a;
        int i12 = j0Var.f49746f;
        int i13 = j0Var.d;
        if (i11 > i12) {
            throw new IllegalArgumentException();
        }
        int i14 = 0;
        long j10 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            j10 = (j10 | ((long) (bArr[i10 + i15] & 255))) << 8;
        }
        int i16 = (i11 + 1) * 8;
        while (i14 < i11 * 8) {
            sb2.append(j0Var.f49743b[((int) (j10 >>> ((i16 - i13) - i14))) & j0Var.f49744c]);
            i14 += i13;
        }
        if (this.f49755b != null) {
            while (i14 < j0Var.f49746f * 8) {
                sb2.append('=');
                i14 += i13;
            }
        }
    }

    public final String c(int i10, byte[] bArr) {
        a.m(0, i10, bArr.length);
        j0 j0Var = this.f49754a;
        int i11 = j0Var.f49746f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(j0Var.f49745e * a.a(i10, i11));
        try {
            a(sb2, bArr, i10);
            return sb2.toString();
        } catch (IOException e9) {
            throw new AssertionError(e9);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            if (this.f49754a.equals(m0Var.f49754a) && Objects.equals(this.f49755b, m0Var.f49755b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f49754a.hashCode() ^ Objects.hashCode(this.f49755b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        j0 j0Var = this.f49754a;
        sb2.append(j0Var);
        if (8 % j0Var.d != 0) {
            Character ch2 = this.f49755b;
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
