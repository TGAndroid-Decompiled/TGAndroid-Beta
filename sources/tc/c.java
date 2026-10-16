package tc;

import c5.c0;
import e2.j0;
import java.nio.ByteBuffer;
public abstract class c {
    public static void a(c0 c0Var, c0 c0Var2) {
        boolean i10;
        int[] iArr = {0};
        do {
            i10 = c0Var.i(iArr[0]);
            iArr[0] = iArr[0] + 1;
            int n10 = c0Var.n(2, iArr);
            if (n10 != 0) {
                if (n10 != 1) {
                    if (n10 == 2) {
                        j0[] j0VarArr = new j0[2];
                        d.e(c0Var, iArr, j0VarArr);
                        b(c0Var, iArr, c0Var2, j0VarArr[0], j0VarArr[1]);
                    } else {
                        throw new Exception(String.format("[%s] Bad compression type '11' at the bit index '%d'.", c.class.getSimpleName(), Integer.valueOf(iArr[0])));
                    }
                } else {
                    b(c0Var, iArr, c0Var2, g.f45579f, f.f45578f);
                }
            } else {
                int i11 = ((iArr[0] + 7) & (-8)) / 8;
                int g10 = ((c0Var.g(i11 + 1) & 255) * 256) + (c0Var.g(i11) & 255);
                int i12 = i11 + 4;
                c0Var2.getClass();
                byte[] array = ((ByteBuffer) c0Var.f4356c).array();
                int capacity = ((ByteBuffer) c0Var2.f4356c).capacity();
                int i13 = c0Var2.f4355b + g10;
                if (capacity < i13) {
                    c0Var2.f(i13 + 1024);
                }
                ((ByteBuffer) c0Var2.f4356c).put(array, i12, g10);
                c0Var2.f4355b += g10;
                iArr[0] = (i12 + g10) * 8;
            }
            if (c0Var.f4355b <= iArr[0] / 8) {
                i10 = true;
                continue;
            }
        } while (!i10);
    }

    public static void b(c0 c0Var, int[] iArr, c0 c0Var2, j0 j0Var, j0 j0Var2) {
        while (true) {
            int k10 = j0Var.k(c0Var, iArr);
            if (k10 == 256) {
                return;
            }
            if (k10 >= 0 && k10 <= 255) {
                c0Var2.k(k10);
            } else {
                int f7 = d.f(c0Var, iArr, k10);
                int d = d.d(c0Var, iArr, j0Var2);
                int i10 = c0Var2.f4355b;
                byte[] bArr = new byte[f7];
                int i11 = i10 - d;
                int i12 = 0;
                int i13 = i11;
                while (i12 < f7) {
                    if (i10 <= i13) {
                        i13 = i11;
                    }
                    bArr[i12] = c0Var2.g(i13);
                    i12++;
                    i13++;
                }
                c0Var2.m(bArr);
            }
        }
    }
}
