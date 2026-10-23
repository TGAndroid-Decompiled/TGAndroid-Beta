package q3;

import b2.t0;
import b2.v0;
import e2.m0;
import e2.x;
import e9.k0;
import e9.n0;
import e9.x1;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.ui.web.d0;
import v7.s6;
public final class h extends w7.m {
    public static final d0 f44790b = new d0(4);
    public final g f44791a;

    public h(g gVar) {
        this.f44791a = gVar;
    }

    public static a d(x xVar, int i10, int i11) {
        int v;
        String str;
        byte[] copyOfRange;
        int A = xVar.A();
        Charset s10 = s(A);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        xVar.k(0, i12, bArr);
        if (i11 == 2) {
            str = "image/" + s6.c(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            v = 2;
        } else {
            v = v(0, bArr);
            String c10 = s6.c(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
            if (c10.indexOf(47) == -1) {
                str = "image/".concat(c10);
            } else {
                str = c10;
            }
        }
        int i13 = bArr[v + 1] & 255;
        int i14 = v + 2;
        int u10 = u(i14, A, bArr);
        String str2 = new String(bArr, i14, u10 - i14, s10);
        int r10 = r(A) + u10;
        if (i12 <= r10) {
            copyOfRange = m0.f8260b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, r10, i12);
        }
        return new a(i13, str, str2, copyOfRange);
    }

    public static c e(x xVar, int i10, int i11, boolean z10, int i12, g gVar) {
        long j10;
        int i13 = xVar.f8299b;
        int v = v(i13, xVar.f8298a);
        String str = new String(xVar.f8298a, i13, v - i13, StandardCharsets.ISO_8859_1);
        xVar.N(v + 1);
        int m10 = xVar.m();
        int m11 = xVar.m();
        long C = xVar.C();
        if (C == 4294967295L) {
            C = -1;
        }
        long C2 = xVar.C();
        if (C2 == 4294967295L) {
            j10 = -1;
        } else {
            j10 = C2;
        }
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (xVar.f8299b < i14) {
            i h = h(i11, xVar, z10, i12, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new c(str, m10, m11, C, j10, (i[]) arrayList.toArray(new i[0]));
    }

    public static d f(x xVar, int i10, int i11, boolean z10, int i12, g gVar) {
        boolean z11;
        boolean z12;
        int i13 = xVar.f8299b;
        int v = v(i13, xVar.f8298a);
        String str = new String(xVar.f8298a, i13, v - i13, StandardCharsets.ISO_8859_1);
        xVar.N(v + 1);
        int A = xVar.A();
        if ((A & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((A & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        int A2 = xVar.A();
        String[] strArr = new String[A2];
        for (int i14 = 0; i14 < A2; i14++) {
            int i15 = xVar.f8299b;
            int v10 = v(i15, xVar.f8298a);
            strArr[i14] = new String(xVar.f8298a, i15, v10 - i15, StandardCharsets.ISO_8859_1);
            xVar.N(v10 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (xVar.f8299b < i16) {
            i h = h(i11, xVar, z10, i12, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e g(int i10, x xVar) {
        if (i10 < 4) {
            return null;
        }
        int A = xVar.A();
        Charset s10 = s(A);
        byte[] bArr = new byte[3];
        xVar.k(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        xVar.k(0, i11, bArr2);
        int u10 = u(0, A, bArr2);
        String str2 = new String(bArr2, 0, u10, s10);
        int r10 = r(A) + u10;
        return new e(str, str2, l(bArr2, r10, u(r10, A, bArr2), s10));
    }

    public static q3.i h(int r19, e2.x r20, boolean r21, int r22, q3.g r23) {
        throw new UnsupportedOperationException("Method not decompiled: q3.h.h(int, e2.x, boolean, int, q3.g):q3.i");
    }

    public static f i(int i10, x xVar) {
        byte[] copyOfRange;
        int A = xVar.A();
        Charset s10 = s(A);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        xVar.k(0, i11, bArr);
        int v = v(0, bArr);
        String n10 = v0.n(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
        int i12 = v + 1;
        int u10 = u(i12, A, bArr);
        String l4 = l(bArr, i12, u10, s10);
        int r10 = r(A) + u10;
        int u11 = u(r10, A, bArr);
        String l10 = l(bArr, r10, u11, s10);
        int r11 = r(A) + u11;
        if (i11 <= r11) {
            copyOfRange = m0.f8260b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, r11, i11);
        }
        return new f(n10, copyOfRange, l4, l10);
    }

    public static l j(int i10, x xVar) {
        int H = xVar.H();
        int D = xVar.D();
        int D2 = xVar.D();
        int A = xVar.A();
        int A2 = xVar.A();
        a4.g gVar = new a4.g();
        gVar.l(xVar);
        int i11 = ((i10 - 10) * 8) / (A + A2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int g10 = gVar.g(A);
            int g11 = gVar.g(A2);
            iArr[i12] = g10;
            iArr2[i12] = g11;
        }
        return new l(H, D, D2, iArr, iArr2);
    }

    public static m k(int i10, x xVar) {
        byte[] copyOfRange;
        byte[] bArr = new byte[i10];
        xVar.k(0, i10, bArr);
        int v = v(0, bArr);
        String str = new String(bArr, 0, v, StandardCharsets.ISO_8859_1);
        int i11 = v + 1;
        if (i10 <= i11) {
            copyOfRange = m0.f8260b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, i11, i10);
        }
        return new m(str, copyOfRange);
    }

    public static String l(byte[] bArr, int i10, int i11, Charset charset) {
        if (i11 > i10 && i11 <= bArr.length) {
            return new String(bArr, i10, i11 - i10, charset);
        }
        return "";
    }

    public static n m(int i10, x xVar, String str) {
        if (i10 < 1) {
            return null;
        }
        int A = xVar.A();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        xVar.k(0, i11, bArr);
        return new n(str, null, n(A, 0, bArr));
    }

    public static x1 n(int i10, int i11, byte[] bArr) {
        if (i11 >= bArr.length) {
            return n0.y("");
        }
        k0 t10 = n0.t();
        int u10 = u(i11, i10, bArr);
        while (i11 < u10) {
            t10.c(new String(bArr, i11, u10 - i11, s(i10)));
            i11 = r(i10) + u10;
            u10 = u(i11, i10, bArr);
        }
        x1 f7 = t10.f();
        if (f7.isEmpty()) {
            return n0.y("");
        }
        return f7;
    }

    public static n o(int i10, x xVar) {
        if (i10 < 1) {
            return null;
        }
        int A = xVar.A();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        xVar.k(0, i11, bArr);
        int u10 = u(0, A, bArr);
        return new n("TXXX", new String(bArr, 0, u10, s(A)), n(A, r(A) + u10, bArr));
    }

    public static o p(int i10, x xVar, String str) {
        byte[] bArr = new byte[i10];
        xVar.k(0, i10, bArr);
        return new o(str, null, new String(bArr, 0, v(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static o q(int i10, x xVar) {
        if (i10 < 1) {
            return null;
        }
        int A = xVar.A();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        xVar.k(0, i11, bArr);
        int u10 = u(0, A, bArr);
        String str = new String(bArr, 0, u10, s(A));
        int r10 = r(A) + u10;
        return new o("WXXX", str, l(bArr, r10, v(r10, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int r(int i10) {
        if (i10 != 0 && i10 != 3) {
            return 2;
        }
        return 1;
    }

    public static Charset s(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return StandardCharsets.ISO_8859_1;
                }
                return StandardCharsets.UTF_8;
            }
            return StandardCharsets.UTF_16BE;
        }
        return StandardCharsets.UTF_16;
    }

    public static String t(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int u(int i10, int i11, byte[] bArr) {
        int v = v(i10, bArr);
        if (i11 != 0 && i11 != 3) {
            while (v < bArr.length - 1) {
                if ((v - i10) % 2 == 0 && bArr[v + 1] == 0) {
                    return v;
                }
                v = v(v + 1, bArr);
            }
            return bArr.length;
        }
        return v;
    }

    public static int v(int i10, byte[] bArr) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int w(int i10, x xVar) {
        byte[] bArr = xVar.f8298a;
        int i11 = xVar.f8299b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 < i11 + i10) {
                if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                    System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                    i10--;
                }
                i12 = i13;
            } else {
                return i10;
            }
        }
    }

    public static boolean x(e2.x r18, int r19, int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: q3.h.x(e2.x, int, int, boolean):boolean");
    }

    @Override
    public final t0 b(l3.a aVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    public final b2.t0 c(int r13, byte[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: q3.h.c(int, byte[]):b2.t0");
    }
}
