package q3;

import b2.p0;
import b2.r0;
import e2.d0;
import e2.v;
import e9.a1;
import e9.f0;
import e9.i0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.ui.sw0;
import v7.r6;
public final class i extends w7.l {
    public static final sw0 f44153b = new sw0(13);
    public final g f44154a;

    public i(g gVar) {
        this.f44154a = gVar;
    }

    public static a d(v vVar, int i10, int i11) {
        int v;
        String str;
        byte[] copyOfRange;
        int x10 = vVar.x();
        Charset s10 = s(x10);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        vVar.h(0, i12, bArr);
        if (i11 == 2) {
            str = "image/" + r6.b(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            v = 2;
        } else {
            v = v(0, bArr);
            String b10 = r6.b(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
            if (b10.indexOf(47) == -1) {
                str = "image/".concat(b10);
            } else {
                str = b10;
            }
        }
        int i13 = bArr[v + 1] & 255;
        int i14 = v + 2;
        int u10 = u(i14, x10, bArr);
        String str2 = new String(bArr, i14, u10 - i14, s10);
        int r10 = r(x10) + u10;
        if (i12 <= r10) {
            copyOfRange = d0.f8738b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, r10, i12);
        }
        return new a(i13, str, str2, copyOfRange);
    }

    public static c e(v vVar, int i10, int i11, boolean z10, int i12, g gVar) {
        long j3;
        int i13 = vVar.f8790b;
        int v = v(i13, vVar.f8789a);
        String str = new String(vVar.f8789a, i13, v - i13, StandardCharsets.ISO_8859_1);
        vVar.J(v + 1);
        int j10 = vVar.j();
        int j11 = vVar.j();
        long z11 = vVar.z();
        if (z11 == 4294967295L) {
            z11 = -1;
        }
        long z12 = vVar.z();
        if (z12 == 4294967295L) {
            j3 = -1;
        } else {
            j3 = z12;
        }
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (vVar.f8790b < i14) {
            j h = h(i11, vVar, z10, i12, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new c(str, j10, j11, z11, j3, (j[]) arrayList.toArray(new j[0]));
    }

    public static d f(v vVar, int i10, int i11, boolean z10, int i12, g gVar) {
        boolean z11;
        boolean z12;
        int i13 = vVar.f8790b;
        int v = v(i13, vVar.f8789a);
        String str = new String(vVar.f8789a, i13, v - i13, StandardCharsets.ISO_8859_1);
        vVar.J(v + 1);
        int x10 = vVar.x();
        if ((x10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((x10 & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        int x11 = vVar.x();
        String[] strArr = new String[x11];
        for (int i14 = 0; i14 < x11; i14++) {
            int i15 = vVar.f8790b;
            int v9 = v(i15, vVar.f8789a);
            strArr[i14] = new String(vVar.f8789a, i15, v9 - i15, StandardCharsets.ISO_8859_1);
            vVar.J(v9 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (vVar.f8790b < i16) {
            j h = h(i11, vVar, z10, i12, gVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new d(str, z11, z12, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e g(int i10, v vVar) {
        if (i10 < 4) {
            return null;
        }
        int x10 = vVar.x();
        Charset s10 = s(x10);
        byte[] bArr = new byte[3];
        vVar.h(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        vVar.h(0, i11, bArr2);
        int u10 = u(0, x10, bArr2);
        String str2 = new String(bArr2, 0, u10, s10);
        int r10 = r(x10) + u10;
        return new e(str, str2, l(bArr2, r10, u(r10, x10, bArr2), s10));
    }

    public static q3.j h(int r19, e2.v r20, boolean r21, int r22, q3.g r23) {
        throw new UnsupportedOperationException("Method not decompiled: q3.i.h(int, e2.v, boolean, int, q3.g):q3.j");
    }

    public static f i(int i10, v vVar) {
        byte[] copyOfRange;
        int x10 = vVar.x();
        Charset s10 = s(x10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        vVar.h(0, i11, bArr);
        int v = v(0, bArr);
        String n10 = r0.n(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
        int i12 = v + 1;
        int u10 = u(i12, x10, bArr);
        String l4 = l(bArr, i12, u10, s10);
        int r10 = r(x10) + u10;
        int u11 = u(r10, x10, bArr);
        String l10 = l(bArr, r10, u11, s10);
        int r11 = r(x10) + u11;
        if (i11 <= r11) {
            copyOfRange = d0.f8738b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, r11, i11);
        }
        return new f(n10, copyOfRange, l4, l10);
    }

    public static m j(int i10, v vVar) {
        int D = vVar.D();
        int A = vVar.A();
        int A2 = vVar.A();
        int x10 = vVar.x();
        int x11 = vVar.x();
        a4.h hVar = new a4.h();
        hVar.p(vVar);
        int i11 = ((i10 - 10) * 8) / (x10 + x11);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = hVar.i(x10);
            int i14 = hVar.i(x11);
            iArr[i12] = i13;
            iArr2[i12] = i14;
        }
        return new m(D, A, A2, iArr, iArr2);
    }

    public static n k(int i10, v vVar) {
        byte[] copyOfRange;
        byte[] bArr = new byte[i10];
        vVar.h(0, i10, bArr);
        int v = v(0, bArr);
        String str = new String(bArr, 0, v, StandardCharsets.ISO_8859_1);
        int i11 = v + 1;
        if (i10 <= i11) {
            copyOfRange = d0.f8738b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, i11, i10);
        }
        return new n(str, copyOfRange);
    }

    public static String l(byte[] bArr, int i10, int i11, Charset charset) {
        if (i11 > i10 && i11 <= bArr.length) {
            return new String(bArr, i10, i11 - i10, charset);
        }
        return "";
    }

    public static o m(int i10, v vVar, String str) {
        if (i10 < 1) {
            return null;
        }
        int x10 = vVar.x();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        vVar.h(0, i11, bArr);
        return new o(str, null, n(x10, 0, bArr));
    }

    public static a1 n(int i10, int i11, byte[] bArr) {
        if (i11 >= bArr.length) {
            return i0.z("");
        }
        f0 u10 = i0.u();
        int u11 = u(i11, i10, bArr);
        while (i11 < u11) {
            u10.b(new String(bArr, i11, u11 - i11, s(i10)));
            i11 = r(i10) + u11;
            u11 = u(i11, i10, bArr);
        }
        a1 i12 = u10.i();
        if (i12.isEmpty()) {
            return i0.z("");
        }
        return i12;
    }

    public static o o(int i10, v vVar) {
        if (i10 < 1) {
            return null;
        }
        int x10 = vVar.x();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        vVar.h(0, i11, bArr);
        int u10 = u(0, x10, bArr);
        return new o("TXXX", new String(bArr, 0, u10, s(x10)), n(x10, r(x10) + u10, bArr));
    }

    public static p p(int i10, v vVar, String str) {
        byte[] bArr = new byte[i10];
        vVar.h(0, i10, bArr);
        return new p(str, null, new String(bArr, 0, v(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static p q(int i10, v vVar) {
        if (i10 < 1) {
            return null;
        }
        int x10 = vVar.x();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        vVar.h(0, i11, bArr);
        int u10 = u(0, x10, bArr);
        String str = new String(bArr, 0, u10, s(x10));
        int r10 = r(x10) + u10;
        return new p("WXXX", str, l(bArr, r10, v(r10, bArr), StandardCharsets.ISO_8859_1));
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

    public static int w(int i10, v vVar) {
        byte[] bArr = vVar.f8789a;
        int i11 = vVar.f8790b;
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

    public static boolean x(e2.v r18, int r19, int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: q3.i.x(e2.v, int, int, boolean):boolean");
    }

    @Override
    public final p0 b(l3.a aVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    public final b2.p0 c(int r13, byte[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: q3.i.c(int, byte[]):b2.p0");
    }
}
