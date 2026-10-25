package s3;

import a4.g;
import a8.wd;
import b2.t0;
import b2.u0;
import e2.k0;
import e2.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jg.s0;
public final class c extends wd {
    public final x f47658a = new x();
    public final g f47659b = new g();
    public k0 f47660c;

    @Override
    public final u0 b(l3.a aVar, ByteBuffer byteBuffer) {
        Object obj;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j10;
        boolean z14;
        boolean z15;
        boolean z16;
        long j11;
        long j12;
        k0 k0Var = this.f47660c;
        if (k0Var == null || aVar.f16857r != k0Var.e()) {
            k0 k0Var2 = new k0(aVar.e);
            this.f47660c = k0Var2;
            k0Var2.a(aVar.e - aVar.f16857r);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        x xVar = this.f47658a;
        xVar.L(limit, array);
        g gVar = this.f47659b;
        gVar.k(limit, array);
        gVar.o(39);
        long g7 = (gVar.g(1) << 32) | gVar.g(32);
        gVar.o(20);
        int g10 = gVar.g(12);
        int g11 = gVar.g(8);
        xVar.O(14);
        if (g11 != 0) {
            if (g11 != 255) {
                if (g11 != 4) {
                    if (g11 != 5) {
                        if (g11 != 6) {
                            obj = null;
                        } else {
                            k0 k0Var3 = this.f47660c;
                            long d = a.d(g7, xVar);
                            obj = new a(d, k0Var3.b(d), 1);
                        }
                    } else {
                        k0 k0Var4 = this.f47660c;
                        xVar.C();
                        if ((xVar.A() & 128) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        List list = Collections.EMPTY_LIST;
                        if (!z13) {
                            int A = xVar.A();
                            if ((A & 64) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((A & 32) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if ((A & 16) != 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z14 && !z16) {
                                j11 = a.d(g7, xVar);
                            } else {
                                j11 = -9223372036854775807L;
                            }
                            if (!z14) {
                                int A2 = xVar.A();
                                ArrayList arrayList = new ArrayList(A2);
                                for (int i10 = 0; i10 < A2; i10++) {
                                    xVar.A();
                                    if (!z16) {
                                        j12 = a.d(g7, xVar);
                                    } else {
                                        j12 = -9223372036854775807L;
                                    }
                                    k0Var4.b(j12);
                                    arrayList.add(new Object());
                                }
                                list = arrayList;
                            }
                            if (z15) {
                                xVar.A();
                                xVar.C();
                            }
                            xVar.H();
                            xVar.A();
                            xVar.A();
                            j10 = j11;
                        } else {
                            j10 = -9223372036854775807L;
                        }
                        obj = new d(j10, k0Var4.b(j10), list);
                    }
                } else {
                    int A3 = xVar.A();
                    ArrayList arrayList2 = new ArrayList(A3);
                    for (int i11 = 0; i11 < A3; i11++) {
                        xVar.C();
                        if ((xVar.A() & 128) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        if (!z10) {
                            int A4 = xVar.A();
                            if ((A4 & 64) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if ((A4 & 32) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z11) {
                                xVar.C();
                            }
                            if (!z11) {
                                int A5 = xVar.A();
                                ArrayList arrayList4 = new ArrayList(A5);
                                for (int i12 = 0; i12 < A5; i12++) {
                                    xVar.A();
                                    xVar.C();
                                    arrayList4.add(new qb.a(22));
                                }
                                arrayList3 = arrayList4;
                            }
                            if (z12) {
                                xVar.A();
                                xVar.C();
                            }
                            xVar.H();
                            xVar.A();
                            xVar.A();
                        }
                        arrayList2.add(new s0(arrayList3));
                    }
                    obj = new f(arrayList2);
                }
            } else {
                long C = xVar.C();
                int i13 = g10 - 4;
                xVar.k(0, i13, new byte[i13]);
                obj = new a(C, g7, 0);
            }
        } else {
            obj = new Object();
        }
        if (obj == null) {
            return new u0(new t0[0]);
        }
        return new u0(obj);
    }
}
