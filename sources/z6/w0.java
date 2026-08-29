package z6;

import java.util.Arrays;
public final class w0 extends c1 {
    public final s0 f50769a;

    public w0(s0 s0Var) {
        this.f50769a = s0Var;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c3 = c1.c((byte) 64);
        if (c3 != zza) {
            return c3 - c1Var.zza();
        }
        s0 s0Var = ((w0) c1Var).f50769a;
        s0 s0Var2 = this.f50769a;
        byte[] bArr = s0Var2.f50759b;
        int length = bArr.length;
        byte[] bArr2 = s0Var.f50759b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return p0.f50750a.compare(s0Var2.u(), s0Var.u());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        return this.f50769a.equals(((w0) obj).f50769a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) 64)), this.f50769a});
    }

    public final String toString() {
        j0 j0Var;
        int i10;
        boolean z10;
        k0 k0Var = m0.d;
        m0 m0Var = k0Var.f50739c;
        if (m0Var == null) {
            j0 j0Var2 = k0Var.f50737a;
            char[] cArr = j0Var2.f50726b;
            int i11 = 0;
            while (true) {
                if (i11 < cArr.length) {
                    char c3 = cArr[i11];
                    if (c3 >= 'a' && c3 <= 'z') {
                        int i12 = 0;
                        while (true) {
                            if (i12 < cArr.length) {
                                char c6 = cArr[i12];
                                if (c6 >= 'A' && c6 <= 'Z') {
                                    z10 = true;
                                    break;
                                }
                                i12++;
                            } else {
                                z10 = false;
                                break;
                            }
                        }
                        if (!z10) {
                            char[] cArr2 = new char[cArr.length];
                            for (int i13 = 0; i13 < cArr.length; i13++) {
                                char c10 = cArr[i13];
                                if (c10 >= 97 && c10 <= 122) {
                                    c10 ^= 32;
                                }
                                cArr2[i13] = (char) c10;
                            }
                            j0Var = new j0(j0Var2.f50725a.concat(".upperCase()"), cArr2);
                            byte[] bArr = j0Var.f50730g;
                            if (j0Var2.h && !j0Var.h) {
                                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                                for (i10 = 65; i10 <= 90; i10++) {
                                    int i14 = i10 | 32;
                                    byte b10 = bArr[i10];
                                    byte b11 = bArr[i14];
                                    if (b10 == -1) {
                                        copyOf[i10] = b11;
                                    } else {
                                        char c11 = (char) i10;
                                        char c12 = (char) i14;
                                        if (b11 == -1) {
                                            copyOf[i14] = b10;
                                        } else {
                                            throw new IllegalStateException(a.c("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c11), Character.valueOf(c12)));
                                        }
                                    }
                                }
                                j0Var = new j0(j0Var.f50725a.concat(".ignoreCase()"), j0Var.f50726b, copyOf, true);
                            }
                        } else {
                            throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                        }
                    } else {
                        i11++;
                    }
                } else {
                    j0Var = j0Var2;
                    break;
                }
            }
            if (j0Var == j0Var2) {
                m0Var = k0Var;
            } else {
                m0Var = new k0(j0Var);
            }
            k0Var.f50739c = m0Var;
        }
        byte[] u10 = this.f50769a.u();
        return a4.w.n("h'", m0Var.c(u10.length, u10), "'");
    }

    @Override
    public final int zza() {
        return c1.c((byte) 64);
    }
}
