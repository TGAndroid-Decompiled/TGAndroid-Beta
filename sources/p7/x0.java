package p7;

import java.util.Arrays;
public final class x0 extends d1 {
    public final t0 f53416a;

    public x0(t0 t0Var) {
        this.f53416a = t0Var;
    }

    @Override
    public final int compareTo(Object obj) {
        d1 d1Var = (d1) obj;
        int zza = d1Var.zza();
        int c2 = d1.c((byte) 64);
        if (c2 != zza) {
            return c2 - d1Var.zza();
        }
        t0 t0Var = ((x0) d1Var).f53416a;
        t0 t0Var2 = this.f53416a;
        byte[] bArr = t0Var2.f53406b;
        int length = bArr.length;
        byte[] bArr2 = t0Var.f53406b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return q0.f53397a.compare(t0Var2.p(), t0Var.p());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x0.class != obj.getClass()) {
            return false;
        }
        return this.f53416a.equals(((x0) obj).f53416a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d1.c((byte) 64)), this.f53416a});
    }

    public final String toString() {
        k0 k0Var;
        int i3;
        boolean z10;
        l0 l0Var = n0.d;
        n0 n0Var = l0Var.f53386c;
        if (n0Var == null) {
            k0 k0Var2 = l0Var.f53384a;
            char[] cArr = k0Var2.f53373b;
            int i10 = 0;
            while (true) {
                if (i10 < cArr.length) {
                    char c2 = cArr[i10];
                    if (c2 >= 'a' && c2 <= 'z') {
                        int i11 = 0;
                        while (true) {
                            if (i11 < cArr.length) {
                                char c10 = cArr[i11];
                                if (c10 >= 'A' && c10 <= 'Z') {
                                    z10 = true;
                                    break;
                                }
                                i11++;
                            } else {
                                z10 = false;
                                break;
                            }
                        }
                        if (!z10) {
                            char[] cArr2 = new char[cArr.length];
                            for (int i12 = 0; i12 < cArr.length; i12++) {
                                char c11 = cArr[i12];
                                if (c11 >= 97 && c11 <= 122) {
                                    c11 ^= 32;
                                }
                                cArr2[i12] = (char) c11;
                            }
                            k0Var = new k0(k0Var2.f53372a.concat(".upperCase()"), cArr2);
                            byte[] bArr = k0Var.f53377g;
                            if (k0Var2.h && !k0Var.h) {
                                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                                for (i3 = 65; i3 <= 90; i3++) {
                                    int i13 = i3 | 32;
                                    byte b10 = bArr[i3];
                                    byte b11 = bArr[i13];
                                    if (b10 == -1) {
                                        copyOf[i3] = b11;
                                    } else {
                                        char c12 = (char) i3;
                                        char c13 = (char) i13;
                                        if (b11 == -1) {
                                            copyOf[i13] = b10;
                                        } else {
                                            throw new IllegalStateException(a.c("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c12), Character.valueOf(c13)));
                                        }
                                    }
                                }
                                k0Var = new k0(k0Var.f53372a.concat(".ignoreCase()"), k0Var.f53373b, copyOf, true);
                            }
                        } else {
                            throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                        }
                    } else {
                        i10++;
                    }
                } else {
                    k0Var = k0Var2;
                    break;
                }
            }
            if (k0Var == k0Var2) {
                n0Var = l0Var;
            } else {
                n0Var = new l0(k0Var);
            }
            l0Var.f53386c = n0Var;
        }
        byte[] p10 = this.f53416a.p();
        return a1.g.q("h'", n0Var.c(p10.length, p10), "'");
    }

    @Override
    public final int zza() {
        return d1.c((byte) 64);
    }
}
