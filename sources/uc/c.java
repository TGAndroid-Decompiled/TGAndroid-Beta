package uc;

import e2.j0;
import java.nio.ByteBuffer;
public abstract class c {
    public static void a(d5.z zVar, d5.z zVar2) {
        boolean k10;
        int[] iArr = {0};
        do {
            k10 = zVar.k(iArr[0]);
            iArr[0] = iArr[0] + 1;
            int p10 = zVar.p(2, iArr);
            if (p10 != 0) {
                if (p10 != 1) {
                    if (p10 == 2) {
                        j0[] j0VarArr = new j0[2];
                        d.e(zVar, iArr, j0VarArr);
                        b(zVar, iArr, zVar2, j0VarArr[0], j0VarArr[1]);
                    } else {
                        throw new Exception(String.format("[%s] Bad compression type '11' at the bit index '%d'.", c.class.getSimpleName(), Integer.valueOf(iArr[0])));
                    }
                } else {
                    b(zVar, iArr, zVar2, g.e, f.e);
                }
            } else {
                int i10 = ((iArr[0] + 7) & (-8)) / 8;
                int i11 = ((zVar.i(i10 + 1) & 255) * 256) + (zVar.i(i10) & 255);
                int i12 = i10 + 4;
                zVar2.getClass();
                byte[] array = ((ByteBuffer) zVar.f8027c).array();
                int capacity = ((ByteBuffer) zVar2.f8027c).capacity();
                int i13 = zVar2.f8026b + i11;
                if (capacity < i13) {
                    zVar2.h(i13 + 1024);
                }
                ((ByteBuffer) zVar2.f8027c).put(array, i12, i11);
                zVar2.f8026b += i11;
                iArr[0] = (i12 + i11) * 8;
            }
            if (zVar.f8026b <= iArr[0] / 8) {
                k10 = true;
                continue;
            }
        } while (!k10);
    }

    public static void b(d5.z zVar, int[] iArr, d5.z zVar2, j0 j0Var, j0 j0Var2) {
        while (true) {
            int i10 = j0Var.i(zVar, iArr);
            if (i10 == 256) {
                return;
            }
            if (i10 >= 0 && i10 <= 255) {
                zVar2.m(i10);
            } else {
                int f7 = d.f(zVar, iArr, i10);
                int d = d.d(zVar, iArr, j0Var2);
                int i11 = zVar2.f8026b;
                byte[] bArr = new byte[f7];
                int i12 = i11 - d;
                int i13 = 0;
                int i14 = i12;
                while (i13 < f7) {
                    if (i11 <= i14) {
                        i14 = i12;
                    }
                    bArr[i13] = zVar2.i(i14);
                    i13++;
                    i14++;
                }
                zVar2.n(bArr);
            }
        }
    }
}
