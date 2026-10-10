package sc;

import java.nio.ByteBuffer;
public abstract class c {
    public static void a(c5.b0 b0Var, c5.b0 b0Var2) {
        boolean j3;
        int[] iArr = {0};
        do {
            j3 = b0Var.j(iArr[0]);
            iArr[0] = iArr[0] + 1;
            int o9 = b0Var.o(2, iArr);
            if (o9 != 0) {
                if (o9 != 1) {
                    if (o9 == 2) {
                        e2.a0[] a0VarArr = new e2.a0[2];
                        d.e(b0Var, iArr, a0VarArr);
                        b(b0Var, iArr, b0Var2, a0VarArr[0], a0VarArr[1]);
                    } else {
                        throw new Exception(String.format("[%s] Bad compression type '11' at the bit index '%d'.", c.class.getSimpleName(), Integer.valueOf(iArr[0])));
                    }
                } else {
                    b(b0Var, iArr, b0Var2, g.f47950f, f.f47949f);
                }
            } else {
                int i10 = ((iArr[0] + 7) & (-8)) / 8;
                int h = ((b0Var.h(i10 + 1) & 255) * 256) + (b0Var.h(i10) & 255);
                int i11 = i10 + 4;
                b0Var2.getClass();
                byte[] array = ((ByteBuffer) b0Var.f4204c).array();
                int capacity = ((ByteBuffer) b0Var2.f4204c).capacity();
                int i12 = b0Var2.f4203b + h;
                if (capacity < i12) {
                    b0Var2.g(i12 + 1024);
                }
                ((ByteBuffer) b0Var2.f4204c).put(array, i11, h);
                b0Var2.f4203b += h;
                iArr[0] = (i11 + h) * 8;
            }
            if (b0Var.f4203b <= iArr[0] / 8) {
                j3 = true;
                continue;
            }
        } while (!j3);
    }

    public static void b(c5.b0 b0Var, int[] iArr, c5.b0 b0Var2, e2.a0 a0Var, e2.a0 a0Var2) {
        while (true) {
            int k10 = a0Var.k(b0Var, iArr);
            if (k10 == 256) {
                return;
            }
            if (k10 >= 0 && k10 <= 255) {
                b0Var2.l(k10);
            } else {
                int f7 = d.f(b0Var, iArr, k10);
                int d = d.d(b0Var, iArr, a0Var2);
                int i10 = b0Var2.f4203b;
                byte[] bArr = new byte[f7];
                int i11 = i10 - d;
                int i12 = 0;
                int i13 = i11;
                while (i12 < f7) {
                    if (i10 <= i13) {
                        i13 = i11;
                    }
                    bArr[i12] = b0Var2.h(i13);
                    i12++;
                    i13++;
                }
                b0Var2.n(bArr);
            }
        }
    }
}
