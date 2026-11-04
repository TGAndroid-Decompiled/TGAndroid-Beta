package s3;

import b8.te;
import b8.xb;
import d2.s0;
import d2.u0;
import g2.n0;
import g2.y;
import g9.f0;
import g9.i0;
import g9.s1;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
public final class h extends te {
    public static final s0.b f54622b = new s0.b(13);
    public final g f54623a;

    public h(g gVar) {
        this.f54623a = gVar;
    }

    public static a d(y yVar, int i3, int i10) {
        int v;
        String str;
        byte[] copyOfRange;
        int A = yVar.A();
        Charset s6 = s(A);
        int i11 = i3 - 1;
        byte[] bArr = new byte[i11];
        yVar.k(0, i11, bArr);
        if (i10 == 2) {
            str = "image/" + xb.c(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            v = 2;
        } else {
            v = v(0, bArr);
            String c2 = xb.c(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
            if (c2.indexOf(47) == -1) {
                str = "image/".concat(c2);
            } else {
                str = c2;
            }
        }
        int i12 = bArr[v + 1] & 255;
        int i13 = v + 2;
        int u10 = u(i13, A, bArr);
        String str2 = new String(bArr, i13, u10 - i13, s6);
        int r5 = r(A) + u10;
        if (i11 <= r5) {
            copyOfRange = n0.f11874b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, r5, i11);
        }
        return new a(i12, str, str2, copyOfRange);
    }

    public static c e(y yVar, int i3, int i10, boolean z10, int i11, g gVar) {
        long j10;
        int i12 = yVar.f11924b;
        int v = v(i12, yVar.f11923a);
        String str = new String(yVar.f11923a, i12, v - i12, StandardCharsets.ISO_8859_1);
        yVar.N(v + 1);
        int m10 = yVar.m();
        int m11 = yVar.m();
        long C = yVar.C();
        if (C == 4294967295L) {
            C = -1;
        }
        long C2 = yVar.C();
        if (C2 == 4294967295L) {
            j10 = -1;
        } else {
            j10 = C2;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = i12 + i3;
        while (yVar.f11924b < i13) {
            i h = h(i10, yVar, z10, i11, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new c(str, m10, m11, C, j10, (i[]) arrayList.toArray(new i[0]));
    }

    public static d f(y yVar, int i3, int i10, boolean z10, int i11, g gVar) {
        boolean z11;
        boolean z12;
        int i12 = yVar.f11924b;
        int v = v(i12, yVar.f11923a);
        String str = new String(yVar.f11923a, i12, v - i12, StandardCharsets.ISO_8859_1);
        yVar.N(v + 1);
        int A = yVar.A();
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
        int A2 = yVar.A();
        String[] strArr = new String[A2];
        for (int i13 = 0; i13 < A2; i13++) {
            int i14 = yVar.f11924b;
            int v10 = v(i14, yVar.f11923a);
            strArr[i13] = new String(yVar.f11923a, i14, v10 - i14, StandardCharsets.ISO_8859_1);
            yVar.N(v10 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = i12 + i3;
        while (yVar.f11924b < i15) {
            i h = h(i10, yVar, z10, i11, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e g(int i3, y yVar) {
        if (i3 < 4) {
            return null;
        }
        int A = yVar.A();
        Charset s6 = s(A);
        byte[] bArr = new byte[3];
        yVar.k(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i10 = i3 - 4;
        byte[] bArr2 = new byte[i10];
        yVar.k(0, i10, bArr2);
        int u10 = u(0, A, bArr2);
        String str2 = new String(bArr2, 0, u10, s6);
        int r5 = r(A) + u10;
        return new e(str, str2, l(bArr2, r5, u(r5, A, bArr2), s6));
    }

    public static s3.i h(int r19, g2.y r20, boolean r21, int r22, s3.g r23) {
        throw new UnsupportedOperationException("Method not decompiled: s3.h.h(int, g2.y, boolean, int, s3.g):s3.i");
    }

    public static f i(int i3, y yVar) {
        byte[] copyOfRange;
        int A = yVar.A();
        Charset s6 = s(A);
        int i10 = i3 - 1;
        byte[] bArr = new byte[i10];
        yVar.k(0, i10, bArr);
        int v = v(0, bArr);
        String n4 = u0.n(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
        int i11 = v + 1;
        int u10 = u(i11, A, bArr);
        String l10 = l(bArr, i11, u10, s6);
        int r5 = r(A) + u10;
        int u11 = u(r5, A, bArr);
        String l11 = l(bArr, r5, u11, s6);
        int r9 = r(A) + u11;
        if (i10 <= r9) {
            copyOfRange = n0.f11874b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, r9, i10);
        }
        return new f(n4, copyOfRange, l10, l11);
    }

    public static l j(int i3, y yVar) {
        int H = yVar.H();
        int D = yVar.D();
        int D2 = yVar.D();
        int A = yVar.A();
        int A2 = yVar.A();
        c4.f fVar = new c4.f();
        fVar.I(yVar);
        int i10 = ((i3 - 10) * 8) / (A + A2);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int j10 = fVar.j(A);
            int j11 = fVar.j(A2);
            iArr[i11] = j10;
            iArr2[i11] = j11;
        }
        return new l(H, D, D2, iArr, iArr2);
    }

    public static m k(int i3, y yVar) {
        byte[] copyOfRange;
        byte[] bArr = new byte[i3];
        yVar.k(0, i3, bArr);
        int v = v(0, bArr);
        String str = new String(bArr, 0, v, StandardCharsets.ISO_8859_1);
        int i10 = v + 1;
        if (i3 <= i10) {
            copyOfRange = n0.f11874b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, i10, i3);
        }
        return new m(str, copyOfRange);
    }

    public static String l(byte[] bArr, int i3, int i10, Charset charset) {
        if (i10 > i3 && i10 <= bArr.length) {
            return new String(bArr, i3, i10 - i3, charset);
        }
        return "";
    }

    public static n m(int i3, y yVar, String str) {
        if (i3 < 1) {
            return null;
        }
        int A = yVar.A();
        int i10 = i3 - 1;
        byte[] bArr = new byte[i10];
        yVar.k(0, i10, bArr);
        return new n(str, null, n(A, 0, bArr));
    }

    public static s1 n(int i3, int i10, byte[] bArr) {
        if (i10 >= bArr.length) {
            return i0.u("");
        }
        f0 p10 = i0.p();
        int u10 = u(i10, i3, bArr);
        while (i10 < u10) {
            p10.c(new String(bArr, i10, u10 - i10, s(i3)));
            i10 = r(i3) + u10;
            u10 = u(i10, i3, bArr);
        }
        s1 f10 = p10.f();
        if (f10.isEmpty()) {
            return i0.u("");
        }
        return f10;
    }

    public static n o(int i3, y yVar) {
        if (i3 < 1) {
            return null;
        }
        int A = yVar.A();
        int i10 = i3 - 1;
        byte[] bArr = new byte[i10];
        yVar.k(0, i10, bArr);
        int u10 = u(0, A, bArr);
        return new n("TXXX", new String(bArr, 0, u10, s(A)), n(A, r(A) + u10, bArr));
    }

    public static o p(int i3, y yVar, String str) {
        byte[] bArr = new byte[i3];
        yVar.k(0, i3, bArr);
        return new o(str, null, new String(bArr, 0, v(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static o q(int i3, y yVar) {
        if (i3 < 1) {
            return null;
        }
        int A = yVar.A();
        int i10 = i3 - 1;
        byte[] bArr = new byte[i10];
        yVar.k(0, i10, bArr);
        int u10 = u(0, A, bArr);
        String str = new String(bArr, 0, u10, s(A));
        int r5 = r(A) + u10;
        return new o("WXXX", str, l(bArr, r5, v(r5, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int r(int i3) {
        if (i3 != 0 && i3 != 3) {
            return 2;
        }
        return 1;
    }

    public static Charset s(int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    return StandardCharsets.ISO_8859_1;
                }
                return StandardCharsets.UTF_8;
            }
            return StandardCharsets.UTF_16BE;
        }
        return StandardCharsets.UTF_16;
    }

    public static String t(int i3, int i10, int i11, int i12, int i13) {
        if (i3 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int u(int i3, int i10, byte[] bArr) {
        int v = v(i3, bArr);
        if (i10 != 0 && i10 != 3) {
            while (v < bArr.length - 1) {
                if ((v - i3) % 2 == 0 && bArr[v + 1] == 0) {
                    return v;
                }
                v = v(v + 1, bArr);
            }
            return bArr.length;
        }
        return v;
    }

    public static int v(int i3, byte[] bArr) {
        while (i3 < bArr.length) {
            if (bArr[i3] == 0) {
                return i3;
            }
            i3++;
        }
        return bArr.length;
    }

    public static int w(int i3, y yVar) {
        byte[] bArr = yVar.f11923a;
        int i10 = yVar.f11924b;
        int i11 = i10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < i10 + i3) {
                if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                    System.arraycopy(bArr, i11 + 2, bArr, i12, (i3 - (i11 - i10)) - 2);
                    i3--;
                }
                i11 = i12;
            } else {
                return i3;
            }
        }
    }

    public static boolean x(g2.y r18, int r19, int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: s3.h.x(g2.y, int, int, boolean):boolean");
    }

    @Override
    public final s0 b(n3.a aVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    public final d2.s0 c(int r13, byte[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: s3.h.c(int, byte[]):d2.s0");
    }
}
