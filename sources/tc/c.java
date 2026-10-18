package tc;

import c5.b0;
import e2.j0;
import java.nio.ByteBuffer;
public abstract class c {
    public static void a(b0 b0Var, b0 b0Var2) {
        boolean o10;
        int[] iArr = {0};
        do {
            o10 = b0Var.o(iArr[0]);
            iArr[0] = iArr[0] + 1;
            int s10 = b0Var.s(2, iArr);
            if (s10 != 0) {
                if (s10 != 1) {
                    if (s10 == 2) {
                        j0[] j0VarArr = new j0[2];
                        d.e(b0Var, iArr, j0VarArr);
                        b(b0Var, iArr, b0Var2, j0VarArr[0], j0VarArr[1]);
                    } else {
                        throw new Exception(String.format("[%s] Bad compression type '11' at the bit index '%d'.", c.class.getSimpleName(), Integer.valueOf(iArr[0])));
                    }
                } else {
                    b(b0Var, iArr, b0Var2, g.e, f.e);
                }
            } else {
                int i10 = ((iArr[0] + 7) & (-8)) / 8;
                int m10 = ((b0Var.m(i10 + 1) & 255) * 256) + (b0Var.m(i10) & 255);
                int i11 = i10 + 4;
                b0Var2.getClass();
                byte[] array = ((ByteBuffer) b0Var.f4704c).array();
                int capacity = ((ByteBuffer) b0Var2.f4704c).capacity();
                int i12 = b0Var2.f4703b + m10;
                if (capacity < i12) {
                    b0Var2.l(i12 + 1024);
                }
                ((ByteBuffer) b0Var2.f4704c).put(array, i11, m10);
                b0Var2.f4703b += m10;
                iArr[0] = (i11 + m10) * 8;
            }
            if (b0Var.f4703b <= iArr[0] / 8) {
                o10 = true;
                continue;
            }
        } while (!o10);
    }

    public static void b(b0 b0Var, int[] iArr, b0 b0Var2, j0 j0Var, j0 j0Var2) {
        while (true) {
            int i10 = j0Var.i(b0Var, iArr);
            if (i10 == 256) {
                return;
            }
            if (i10 >= 0 && i10 <= 255) {
                b0Var2.q(i10);
            } else {
                int f7 = d.f(b0Var, iArr, i10);
                int d = d.d(b0Var, iArr, j0Var2);
                int i11 = b0Var2.f4703b;
                byte[] bArr = new byte[f7];
                int i12 = i11 - d;
                int i13 = 0;
                int i14 = i12;
                while (i13 < f7) {
                    if (i11 <= i14) {
                        i14 = i12;
                    }
                    bArr[i13] = b0Var2.m(i14);
                    i13++;
                    i14++;
                }
                b0Var2.r(bArr);
            }
        }
    }
}
