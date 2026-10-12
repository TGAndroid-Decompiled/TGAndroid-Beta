package sc;

import java.nio.ByteBuffer;
public abstract class c {
    public static void a(c5.b0 b0Var, c5.b0 b0Var2) {
        boolean m10;
        int[] iArr = {0};
        do {
            m10 = b0Var.m(iArr[0]);
            iArr[0] = iArr[0] + 1;
            int q6 = b0Var.q(2, iArr);
            if (q6 != 0) {
                if (q6 != 1) {
                    if (q6 == 2) {
                        e2.a0[] a0VarArr = new e2.a0[2];
                        d.e(b0Var, iArr, a0VarArr);
                        b(b0Var, iArr, b0Var2, a0VarArr[0], a0VarArr[1]);
                    } else {
                        throw new Exception(String.format("[%s] Bad compression type '11' at the bit index '%d'.", c.class.getSimpleName(), Integer.valueOf(iArr[0])));
                    }
                } else {
                    b(b0Var, iArr, b0Var2, g.f48145f, f.f48144f);
                }
            } else {
                int i10 = ((iArr[0] + 7) & (-8)) / 8;
                int j3 = ((b0Var.j(i10 + 1) & 255) * 256) + (b0Var.j(i10) & 255);
                int i11 = i10 + 4;
                b0Var2.getClass();
                byte[] array = ((ByteBuffer) b0Var.f4202c).array();
                int capacity = ((ByteBuffer) b0Var2.f4202c).capacity();
                int i12 = b0Var2.f4201b + j3;
                if (capacity < i12) {
                    b0Var2.i(i12 + 1024);
                }
                ((ByteBuffer) b0Var2.f4202c).put(array, i11, j3);
                b0Var2.f4201b += j3;
                iArr[0] = (i11 + j3) * 8;
            }
            if (b0Var.f4201b <= iArr[0] / 8) {
                m10 = true;
                continue;
            }
        } while (!m10);
    }

    public static void b(c5.b0 b0Var, int[] iArr, c5.b0 b0Var2, e2.a0 a0Var, e2.a0 a0Var2) {
        while (true) {
            int k10 = a0Var.k(b0Var, iArr);
            if (k10 == 256) {
                return;
            }
            if (k10 >= 0 && k10 <= 255) {
                b0Var2.o(k10);
            } else {
                int f7 = d.f(b0Var, iArr, k10);
                int d = d.d(b0Var, iArr, a0Var2);
                int i10 = b0Var2.f4201b;
                byte[] bArr = new byte[f7];
                int i11 = i10 - d;
                int i12 = 0;
                int i13 = i11;
                while (i12 < f7) {
                    if (i10 <= i13) {
                        i13 = i11;
                    }
                    bArr[i12] = b0Var2.j(i13);
                    i12++;
                    i13++;
                }
                b0Var2.p(bArr);
            }
        }
    }
}
