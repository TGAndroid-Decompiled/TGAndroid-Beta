package t3;

import a8.ga;
import c8.ca;
import e2.q0;
import e2.s0;
import h2.m0;
import h2.x;
import h9.f0;
import h9.i0;
import h9.t1;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
public final class h extends ca {
    public static final s0.b f55400b = new s0.b(18);
    public final g f55401a;

    public h(g gVar) {
        this.f55401a = gVar;
    }

    public static a d(x xVar, int i7, int i10) {
        int v;
        String str;
        byte[] copyOfRange;
        int A = xVar.A();
        Charset s5 = s(A);
        int i11 = i7 - 1;
        byte[] bArr = new byte[i11];
        xVar.k(0, i11, bArr);
        if (i10 == 2) {
            str = "image/" + ga.c(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            v = 2;
        } else {
            v = v(0, bArr);
            String c10 = ga.c(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
            if (c10.indexOf(47) == -1) {
                str = "image/".concat(c10);
            } else {
                str = c10;
            }
        }
        int i12 = bArr[v + 1] & 255;
        int i13 = v + 2;
        int u10 = u(i13, A, bArr);
        String str2 = new String(bArr, i13, u10 - i13, s5);
        int r10 = r(A) + u10;
        if (i11 <= r10) {
            copyOfRange = m0.f14113b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, r10, i11);
        }
        return new a(i12, str, str2, copyOfRange);
    }

    public static c e(x xVar, int i7, int i10, boolean z9, int i11, g gVar) {
        long j3;
        int i12 = xVar.f14163b;
        int v = v(i12, xVar.f14162a);
        String str = new String(xVar.f14162a, i12, v - i12, StandardCharsets.ISO_8859_1);
        xVar.N(v + 1);
        int m10 = xVar.m();
        int m11 = xVar.m();
        long C = xVar.C();
        if (C == 4294967295L) {
            C = -1;
        }
        long C2 = xVar.C();
        if (C2 == 4294967295L) {
            j3 = -1;
        } else {
            j3 = C2;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = i12 + i7;
        while (xVar.f14163b < i13) {
            i h = h(i10, xVar, z9, i11, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new c(str, m10, m11, C, j3, (i[]) arrayList.toArray(new i[0]));
    }

    public static d f(x xVar, int i7, int i10, boolean z9, int i11, g gVar) {
        boolean z10;
        boolean z11;
        int i12 = xVar.f14163b;
        int v = v(i12, xVar.f14162a);
        String str = new String(xVar.f14162a, i12, v - i12, StandardCharsets.ISO_8859_1);
        xVar.N(v + 1);
        int A = xVar.A();
        if ((A & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((A & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int A2 = xVar.A();
        String[] strArr = new String[A2];
        for (int i13 = 0; i13 < A2; i13++) {
            int i14 = xVar.f14163b;
            int v10 = v(i14, xVar.f14162a);
            strArr[i13] = new String(xVar.f14162a, i14, v10 - i14, StandardCharsets.ISO_8859_1);
            xVar.N(v10 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = i12 + i7;
        while (xVar.f14163b < i15) {
            i h = h(i10, xVar, z9, i11, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new d(str, z10, z11, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e g(int i7, x xVar) {
        if (i7 < 4) {
            return null;
        }
        int A = xVar.A();
        Charset s5 = s(A);
        byte[] bArr = new byte[3];
        xVar.k(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i10 = i7 - 4;
        byte[] bArr2 = new byte[i10];
        xVar.k(0, i10, bArr2);
        int u10 = u(0, A, bArr2);
        String str2 = new String(bArr2, 0, u10, s5);
        int r10 = r(A) + u10;
        return new e(str, str2, l(bArr2, r10, u(r10, A, bArr2), s5));
    }

    public static t3.i h(int r19, h2.x r20, boolean r21, int r22, t3.g r23) {
        throw new UnsupportedOperationException("Method not decompiled: t3.h.h(int, h2.x, boolean, int, t3.g):t3.i");
    }

    public static f i(int i7, x xVar) {
        byte[] copyOfRange;
        int A = xVar.A();
        Charset s5 = s(A);
        int i10 = i7 - 1;
        byte[] bArr = new byte[i10];
        xVar.k(0, i10, bArr);
        int v = v(0, bArr);
        String n10 = s0.n(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
        int i11 = v + 1;
        int u10 = u(i11, A, bArr);
        String l10 = l(bArr, i11, u10, s5);
        int r10 = r(A) + u10;
        int u11 = u(r10, A, bArr);
        String l11 = l(bArr, r10, u11, s5);
        int r11 = r(A) + u11;
        if (i10 <= r11) {
            copyOfRange = m0.f14113b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, r11, i10);
        }
        return new f(n10, copyOfRange, l10, l11);
    }

    public static l j(int i7, x xVar) {
        int H = xVar.H();
        int D = xVar.D();
        int D2 = xVar.D();
        int A = xVar.A();
        int A2 = xVar.A();
        d4.f fVar = new d4.f();
        fVar.I(xVar);
        int i10 = ((i7 - 10) * 8) / (A + A2);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int j3 = fVar.j(A);
            int j10 = fVar.j(A2);
            iArr[i11] = j3;
            iArr2[i11] = j10;
        }
        return new l(H, D, D2, iArr, iArr2);
    }

    public static m k(int i7, x xVar) {
        byte[] copyOfRange;
        byte[] bArr = new byte[i7];
        xVar.k(0, i7, bArr);
        int v = v(0, bArr);
        String str = new String(bArr, 0, v, StandardCharsets.ISO_8859_1);
        int i10 = v + 1;
        if (i7 <= i10) {
            copyOfRange = m0.f14113b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, i10, i7);
        }
        return new m(str, copyOfRange);
    }

    public static String l(byte[] bArr, int i7, int i10, Charset charset) {
        if (i10 > i7 && i10 <= bArr.length) {
            return new String(bArr, i7, i10 - i7, charset);
        }
        return "";
    }

    public static n m(int i7, x xVar, String str) {
        if (i7 < 1) {
            return null;
        }
        int A = xVar.A();
        int i10 = i7 - 1;
        byte[] bArr = new byte[i10];
        xVar.k(0, i10, bArr);
        return new n(str, null, n(A, 0, bArr));
    }

    public static t1 n(int i7, int i10, byte[] bArr) {
        if (i10 >= bArr.length) {
            return i0.u("");
        }
        f0 p10 = i0.p();
        int u10 = u(i10, i7, bArr);
        while (i10 < u10) {
            p10.c(new String(bArr, i10, u10 - i10, s(i7)));
            i10 = r(i7) + u10;
            u10 = u(i10, i7, bArr);
        }
        t1 f10 = p10.f();
        if (f10.isEmpty()) {
            return i0.u("");
        }
        return f10;
    }

    public static n o(int i7, x xVar) {
        if (i7 < 1) {
            return null;
        }
        int A = xVar.A();
        int i10 = i7 - 1;
        byte[] bArr = new byte[i10];
        xVar.k(0, i10, bArr);
        int u10 = u(0, A, bArr);
        return new n("TXXX", new String(bArr, 0, u10, s(A)), n(A, r(A) + u10, bArr));
    }

    public static o p(int i7, x xVar, String str) {
        byte[] bArr = new byte[i7];
        xVar.k(0, i7, bArr);
        return new o(str, null, new String(bArr, 0, v(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static o q(int i7, x xVar) {
        if (i7 < 1) {
            return null;
        }
        int A = xVar.A();
        int i10 = i7 - 1;
        byte[] bArr = new byte[i10];
        xVar.k(0, i10, bArr);
        int u10 = u(0, A, bArr);
        String str = new String(bArr, 0, u10, s(A));
        int r10 = r(A) + u10;
        return new o("WXXX", str, l(bArr, r10, v(r10, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int r(int i7) {
        if (i7 != 0 && i7 != 3) {
            return 2;
        }
        return 1;
    }

    public static Charset s(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return StandardCharsets.ISO_8859_1;
                }
                return StandardCharsets.UTF_8;
            }
            return StandardCharsets.UTF_16BE;
        }
        return StandardCharsets.UTF_16;
    }

    public static String t(int i7, int i10, int i11, int i12, int i13) {
        if (i7 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int u(int i7, int i10, byte[] bArr) {
        int v = v(i7, bArr);
        if (i10 != 0 && i10 != 3) {
            while (v < bArr.length - 1) {
                if ((v - i7) % 2 == 0 && bArr[v + 1] == 0) {
                    return v;
                }
                v = v(v + 1, bArr);
            }
            return bArr.length;
        }
        return v;
    }

    public static int v(int i7, byte[] bArr) {
        while (i7 < bArr.length) {
            if (bArr[i7] == 0) {
                return i7;
            }
            i7++;
        }
        return bArr.length;
    }

    public static int w(int i7, x xVar) {
        byte[] bArr = xVar.f14162a;
        int i10 = xVar.f14163b;
        int i11 = i10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < i10 + i7) {
                if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                    System.arraycopy(bArr, i11 + 2, bArr, i12, (i7 - (i11 - i10)) - 2);
                    i7--;
                }
                i11 = i12;
            } else {
                return i7;
            }
        }
    }

    public static boolean x(h2.x r18, int r19, int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: t3.h.x(h2.x, int, int, boolean):boolean");
    }

    @Override
    public final q0 b(o3.a aVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    public final e2.q0 c(int r13, byte[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: t3.h.c(int, byte[]):e2.q0");
    }
}
