package v7;

import java.io.IOException;
public abstract class c6 {
    public static int a(byte[] bArr, int i10, com.google.android.gms.internal.play_billing.h1 h1Var) {
        int f7 = f(bArr, i10, h1Var);
        int i11 = h1Var.f5789a;
        if (i11 >= 0) {
            if (i11 <= bArr.length - f7) {
                if (i11 == 0) {
                    h1Var.d = com.google.android.gms.internal.play_billing.l1.f5826c;
                    return f7;
                }
                h1Var.d = com.google.android.gms.internal.play_billing.l1.q(f7, i11, bArr);
                return f7 + i11;
            }
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static int b(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int c(com.google.android.gms.internal.play_billing.t2 t2Var, int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.play_billing.z1 z1Var, com.google.android.gms.internal.play_billing.h1 h1Var) {
        com.google.android.gms.internal.play_billing.v1 zze = t2Var.zze();
        com.google.android.gms.internal.play_billing.t2 t2Var2 = t2Var;
        byte[] bArr2 = bArr;
        int i13 = i12;
        com.google.android.gms.internal.play_billing.h1 h1Var2 = h1Var;
        int k10 = k(zze, t2Var2, bArr2, i11, i13, h1Var2);
        t2Var2.zzf(zze);
        h1Var2.d = zze;
        z1Var.add(zze);
        while (k10 < i13) {
            com.google.android.gms.internal.play_billing.h1 h1Var3 = h1Var2;
            int i14 = i13;
            int f7 = f(bArr2, k10, h1Var3);
            if (i10 != h1Var3.f5789a) {
                break;
            }
            byte[] bArr3 = bArr2;
            com.google.android.gms.internal.play_billing.t2 t2Var3 = t2Var2;
            com.google.android.gms.internal.play_billing.v1 zze2 = t2Var3.zze();
            k10 = k(zze2, t2Var3, bArr3, f7, i14, h1Var3);
            t2Var2 = t2Var3;
            bArr2 = bArr3;
            i13 = i14;
            h1Var2 = h1Var3;
            t2Var2.zzf(zze2);
            h1Var2.d = zze2;
            z1Var.add(zze2);
        }
        return k10;
    }

    public static int d(byte[] bArr, int i10, com.google.android.gms.internal.play_billing.z1 z1Var, com.google.android.gms.internal.play_billing.h1 h1Var) {
        com.google.android.gms.internal.play_billing.w1 w1Var = (com.google.android.gms.internal.play_billing.w1) z1Var;
        int f7 = f(bArr, i10, h1Var);
        int i11 = h1Var.f5789a + f7;
        while (f7 < i11) {
            f7 = f(bArr, f7, h1Var);
            w1Var.o(h1Var.f5789a);
        }
        if (f7 == i11) {
            return f7;
        }
        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int e(int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.play_billing.x2 x2Var, com.google.android.gms.internal.play_billing.h1 h1Var) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                x2Var.c(i10, Integer.valueOf(b(bArr, i11)));
                                return i11 + 4;
                            }
                            throw new IOException("Protocol message contained an invalid tag (zero).");
                        }
                        int i14 = (i10 & (-8)) | 4;
                        com.google.android.gms.internal.play_billing.x2 b10 = com.google.android.gms.internal.play_billing.x2.b();
                        int i15 = h1Var.f5790b + 1;
                        h1Var.f5790b = i15;
                        if (i15 < 100) {
                            int i16 = 0;
                            while (true) {
                                if (i11 >= i12) {
                                    break;
                                }
                                int f7 = f(bArr, i11, h1Var);
                                int i17 = h1Var.f5789a;
                                if (i17 == i14) {
                                    i16 = i17;
                                    i11 = f7;
                                    break;
                                }
                                i11 = e(i17, bArr, f7, i12, b10, h1Var);
                                i16 = i17;
                            }
                            h1Var.f5790b--;
                            if (i11 <= i12 && i16 == i14) {
                                x2Var.c(i10, b10);
                                return i11;
                            }
                            throw new IOException("Failed to parse the message.");
                        }
                        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
                    int f10 = f(bArr, i11, h1Var);
                    int i18 = h1Var.f5789a;
                    if (i18 >= 0) {
                        if (i18 <= bArr.length - f10) {
                            if (i18 == 0) {
                                x2Var.c(i10, com.google.android.gms.internal.play_billing.l1.f5826c);
                            } else {
                                x2Var.c(i10, com.google.android.gms.internal.play_billing.l1.q(f10, i18, bArr));
                            }
                            return f10 + i18;
                        }
                        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                x2Var.c(i10, Long.valueOf(l(i11, bArr)));
                return i11 + 8;
            }
            int i19 = i(bArr, i11, h1Var);
            x2Var.c(i10, Long.valueOf(h1Var.f5791c));
            return i19;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public static int f(byte[] bArr, int i10, com.google.android.gms.internal.play_billing.h1 h1Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            h1Var.f5789a = b10;
            return i11;
        }
        return g(b10, bArr, i11, h1Var);
    }

    public static int g(int i10, byte[] bArr, int i11, com.google.android.gms.internal.play_billing.h1 h1Var) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            h1Var.f5789a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            h1Var.f5789a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            h1Var.f5789a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            h1Var.f5789a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                h1Var.f5789a = i20;
                return i21;
            }
        }
    }

    public static int h(int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.play_billing.z1 z1Var, com.google.android.gms.internal.play_billing.h1 h1Var) {
        com.google.android.gms.internal.play_billing.w1 w1Var = (com.google.android.gms.internal.play_billing.w1) z1Var;
        int f7 = f(bArr, i11, h1Var);
        w1Var.o(h1Var.f5789a);
        while (f7 < i12) {
            int f10 = f(bArr, f7, h1Var);
            if (i10 != h1Var.f5789a) {
                break;
            }
            f7 = f(bArr, f10, h1Var);
            w1Var.o(h1Var.f5789a);
        }
        return f7;
    }

    public static int i(byte[] bArr, int i10, com.google.android.gms.internal.play_billing.h1 h1Var) {
        byte b10;
        long j3 = bArr[i10];
        int i11 = i10 + 1;
        if (j3 >= 0) {
            h1Var.f5791c = j3;
            return i11;
        }
        int i12 = i10 + 2;
        byte b11 = bArr[i11];
        long j10 = (j3 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b11 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j10 |= (b10 & Byte.MAX_VALUE) << i13;
            b11 = bArr[i12];
            i12 = i14;
        }
        h1Var.f5791c = j10;
        return i12;
    }

    public static int j(Object obj, com.google.android.gms.internal.play_billing.t2 t2Var, byte[] bArr, int i10, int i11, int i12, com.google.android.gms.internal.play_billing.h1 h1Var) {
        com.google.android.gms.internal.play_billing.n2 n2Var = (com.google.android.gms.internal.play_billing.n2) t2Var;
        int i13 = h1Var.f5790b + 1;
        h1Var.f5790b = i13;
        if (i13 < 100) {
            int q6 = n2Var.q(obj, bArr, i10, i11, i12, h1Var);
            h1Var.f5790b--;
            h1Var.d = obj;
            return q6;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static int k(Object obj, com.google.android.gms.internal.play_billing.t2 t2Var, byte[] bArr, int i10, int i11, com.google.android.gms.internal.play_billing.h1 h1Var) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = g(i13, bArr, i12, h1Var);
            i13 = h1Var.f5789a;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            int i15 = h1Var.f5790b + 1;
            h1Var.f5790b = i15;
            if (i15 < 100) {
                int i16 = i14 + i13;
                t2Var.e(obj, bArr, i14, i16, h1Var);
                h1Var.f5790b--;
                h1Var.d = obj;
                return i16;
            }
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static long l(int i10, byte[] bArr) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
