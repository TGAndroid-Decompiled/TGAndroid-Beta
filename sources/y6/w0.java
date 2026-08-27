package y6;

import java.util.Arrays;

public final class w0 extends c1 {

    public final s0 f49786a;

    public w0(s0 s0Var) {
        this.f49786a = s0Var;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int iZza = c1Var.zza();
        int iC = c1.c((byte) 64);
        if (iC != iZza) {
            return iC - c1Var.zza();
        }
        s0 s0Var = ((w0) c1Var).f49786a;
        s0 s0Var2 = this.f49786a;
        byte[] bArr = s0Var2.f49776b;
        int length = bArr.length;
        byte[] bArr2 = s0Var.f49776b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return p0.f49767a.compare(s0Var2.u(), s0Var.u());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            return this.f49786a.equals(((w0) obj).f49786a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) 64)), this.f49786a});
    }

    public final String toString() {
        j0 j0Var;
        int i10;
        boolean z10;
        k0 k0Var = m0.d;
        m0 k0Var2 = k0Var.f49756c;
        if (k0Var2 == null) {
            j0 j0Var2 = k0Var.f49754a;
            char[] cArr = j0Var2.f49743b;
            int i11 = 0;
            while (true) {
                if (i11 >= cArr.length) {
                    j0Var = j0Var2;
                    break;
                }
                char c10 = cArr[i11];
                if (c10 >= 'a' && c10 <= 'z') {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= cArr.length) {
                            z10 = false;
                            break;
                        }
                        char c11 = cArr[i12];
                        if (c11 >= 'A' && c11 <= 'Z') {
                            z10 = true;
                            break;
                        }
                        i12++;
                    }
                    if (!z10) {
                        char[] cArr2 = new char[cArr.length];
                        for (int i13 = 0; i13 < cArr.length; i13++) {
                            char c12 = cArr[i13];
                            if (c12 >= 97 && c12 <= 122) {
                                c12 ^= 32;
                            }
                            cArr2[i13] = (char) c12;
                        }
                        j0Var = new j0(j0Var2.f49742a.concat(".upperCase()"), cArr2);
                        byte[] bArr = j0Var.f49747g;
                        if (!j0Var2.h || j0Var.h) {
                            break;
                            break;
                        }
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i10 = 65; i10 <= 90; i10++) {
                            int i14 = i10 | 32;
                            byte b10 = bArr[i10];
                            byte b11 = bArr[i14];
                            if (b10 == -1) {
                                bArrCopyOf[i10] = b11;
                            } else {
                                char c13 = (char) i10;
                                char c14 = (char) i14;
                                if (b11 != -1) {
                                    throw new IllegalStateException(a.c("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c13), Character.valueOf(c14)));
                                }
                                bArrCopyOf[i14] = b10;
                            }
                        }
                        j0Var = new j0(j0Var.f49742a.concat(".ignoreCase()"), j0Var.f49743b, bArrCopyOf, true);
                        break;
                    }
                    throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                }
                i11++;
            }
            k0Var2 = j0Var == j0Var2 ? k0Var : new k0(j0Var);
            k0Var.f49756c = k0Var2;
        }
        byte[] bArrU = this.f49786a.u();
        return a9.p.m("h'", k0Var2.c(bArrU.length, bArrU), "'");
    }

    @Override
    public final int zza() {
        return c1.c((byte) 64);
    }
}
