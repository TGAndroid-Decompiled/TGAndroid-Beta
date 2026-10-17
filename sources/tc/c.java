package tc;

import c5.b0;
import e2.j0;
import java.nio.ByteBuffer;
public abstract class c {
    public static void a(b0 b0Var, b0 b0Var2) {
        boolean n10;
        int[] iArr = {0};
        do {
            n10 = b0Var.n(iArr[0]);
            iArr[0] = iArr[0] + 1;
            int r10 = b0Var.r(2, iArr);
            if (r10 != 0) {
                if (r10 != 1) {
                    if (r10 == 2) {
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
                int l4 = ((b0Var.l(i10 + 1) & 255) * 256) + (b0Var.l(i10) & 255);
                int i11 = i10 + 4;
                b0Var2.getClass();
                byte[] array = ((ByteBuffer) b0Var.f4703c).array();
                int capacity = ((ByteBuffer) b0Var2.f4703c).capacity();
                int i12 = b0Var2.f4702b + l4;
                if (capacity < i12) {
                    b0Var2.j(i12 + 1024);
                }
                ((ByteBuffer) b0Var2.f4703c).put(array, i11, l4);
                b0Var2.f4702b += l4;
                iArr[0] = (i11 + l4) * 8;
            }
            if (b0Var.f4702b <= iArr[0] / 8) {
                n10 = true;
                continue;
            }
        } while (!n10);
    }

    public static void b(b0 b0Var, int[] iArr, b0 b0Var2, j0 j0Var, j0 j0Var2) {
        while (true) {
            int i10 = j0Var.i(b0Var, iArr);
            if (i10 == 256) {
                return;
            }
            if (i10 >= 0 && i10 <= 255) {
                b0Var2.p(i10);
            } else {
                int f7 = d.f(b0Var, iArr, i10);
                int d = d.d(b0Var, iArr, j0Var2);
                int i11 = b0Var2.f4702b;
                byte[] bArr = new byte[f7];
                int i12 = i11 - d;
                int i13 = 0;
                int i14 = i12;
                while (i13 < f7) {
                    if (i11 <= i14) {
                        i14 = i12;
                    }
                    bArr[i13] = b0Var2.l(i14);
                    i13++;
                    i14++;
                }
                b0Var2.q(bArr);
            }
        }
    }
}
