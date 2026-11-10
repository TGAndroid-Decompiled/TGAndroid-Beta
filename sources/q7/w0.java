package q7;

import java.util.Arrays;
public final class w0 extends c1 {
    public final s0 f54045a;

    public w0(s0 s0Var) {
        this.f54045a = s0Var;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c10 = c1.c((byte) 64);
        if (c10 != zza) {
            return c10 - c1Var.zza();
        }
        s0 s0Var = ((w0) c1Var).f54045a;
        s0 s0Var2 = this.f54045a;
        byte[] bArr = s0Var2.f54035b;
        int length = bArr.length;
        byte[] bArr2 = s0Var.f54035b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return p0.f54026a.compare(s0Var2.p(), s0Var.p());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        return this.f54045a.equals(((w0) obj).f54045a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) 64)), this.f54045a});
    }

    public final String toString() {
        j0 j0Var;
        int i7;
        boolean z9;
        k0 k0Var = m0.d;
        m0 m0Var = k0Var.f54015c;
        if (m0Var == null) {
            j0 j0Var2 = k0Var.f54013a;
            char[] cArr = j0Var2.f54002b;
            int i10 = 0;
            while (true) {
                if (i10 < cArr.length) {
                    char c10 = cArr[i10];
                    if (c10 >= 'a' && c10 <= 'z') {
                        int i11 = 0;
                        while (true) {
                            if (i11 < cArr.length) {
                                char c11 = cArr[i11];
                                if (c11 >= 'A' && c11 <= 'Z') {
                                    z9 = true;
                                    break;
                                }
                                i11++;
                            } else {
                                z9 = false;
                                break;
                            }
                        }
                        if (!z9) {
                            char[] cArr2 = new char[cArr.length];
                            for (int i12 = 0; i12 < cArr.length; i12++) {
                                char c12 = cArr[i12];
                                if (c12 >= 97 && c12 <= 122) {
                                    c12 ^= 32;
                                }
                                cArr2[i12] = (char) c12;
                            }
                            j0Var = new j0(j0Var2.f54001a.concat(".upperCase()"), cArr2);
                            byte[] bArr = j0Var.f54006g;
                            if (j0Var2.h && !j0Var.h) {
                                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                                for (i7 = 65; i7 <= 90; i7++) {
                                    int i13 = i7 | 32;
                                    byte b10 = bArr[i7];
                                    byte b11 = bArr[i13];
                                    if (b10 == -1) {
                                        copyOf[i7] = b11;
                                    } else {
                                        char c13 = (char) i7;
                                        char c14 = (char) i13;
                                        if (b11 == -1) {
                                            copyOf[i13] = b10;
                                        } else {
                                            throw new IllegalStateException(a.c("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c13), Character.valueOf(c14)));
                                        }
                                    }
                                }
                                j0Var = new j0(j0Var.f54001a.concat(".ignoreCase()"), j0Var.f54002b, copyOf, true);
                            }
                        } else {
                            throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                        }
                    } else {
                        i10++;
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
            k0Var.f54015c = m0Var;
        }
        byte[] p10 = this.f54045a.p();
        return a8.p0.p("h'", m0Var.c(p10.length, p10), "'");
    }

    @Override
    public final int zza() {
        return c1.c((byte) 64);
    }
}
