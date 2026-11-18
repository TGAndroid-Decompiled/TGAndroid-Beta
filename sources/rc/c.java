package rc;

import h2.j0;
import java.nio.ByteBuffer;
public abstract class c {
    public static void a(b3.j jVar, b3.j jVar2) {
        boolean n10;
        int[] iArr = {0};
        do {
            n10 = jVar.n(iArr[0]);
            iArr[0] = iArr[0] + 1;
            int r10 = jVar.r(iArr, 2);
            if (r10 != 0) {
                if (r10 != 1) {
                    if (r10 == 2) {
                        j0[] j0VarArr = new j0[2];
                        d.e(jVar, iArr, j0VarArr);
                        b(jVar, iArr, jVar2, j0VarArr[0], j0VarArr[1]);
                    } else {
                        throw new Exception(String.format("[%s] Bad compression type '11' at the bit index '%d'.", c.class.getSimpleName(), Integer.valueOf(iArr[0])));
                    }
                } else {
                    b(jVar, iArr, jVar2, g.f56509e, f.f56508e);
                }
            } else {
                int i7 = ((iArr[0] + 7) & (-8)) / 8;
                int l10 = ((jVar.l(i7 + 1) & 255) * 256) + (jVar.l(i7) & 255);
                int i10 = i7 + 4;
                jVar2.getClass();
                byte[] array = ((ByteBuffer) jVar.f2902c).array();
                int capacity = ((ByteBuffer) jVar2.f2902c).capacity();
                int i11 = jVar2.f2901b + l10;
                if (capacity < i11) {
                    jVar2.i(i11 + 1024);
                }
                ((ByteBuffer) jVar2.f2902c).put(array, i10, l10);
                jVar2.f2901b += l10;
                iArr[0] = (i10 + l10) * 8;
            }
            if (jVar.f2901b <= iArr[0] / 8) {
                n10 = true;
                continue;
            }
        } while (!n10);
    }

    public static void b(b3.j jVar, int[] iArr, b3.j jVar2, j0 j0Var, j0 j0Var2) {
        while (true) {
            int m10 = j0Var.m(jVar, iArr);
            if (m10 == 256) {
                return;
            }
            if (m10 >= 0 && m10 <= 255) {
                jVar2.p(m10);
            } else {
                int f10 = d.f(jVar, iArr, m10);
                int d = d.d(jVar, iArr, j0Var2);
                int i7 = jVar2.f2901b;
                byte[] bArr = new byte[f10];
                int i10 = i7 - d;
                int i11 = 0;
                int i12 = i10;
                while (i11 < f10) {
                    if (i7 <= i12) {
                        i12 = i10;
                    }
                    bArr[i11] = jVar2.l(i12);
                    i11++;
                    i12++;
                }
                jVar2.q(bArr);
            }
        }
    }
}
