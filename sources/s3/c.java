package s3;

import a4.g;
import b2.s0;
import b2.t0;
import e2.k0;
import e2.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ki.t1;
import w7.m;
public final class c extends m {
    public final x f46307a = new x();
    public final g f46308b = new g();
    public k0 f46309c;

    @Override
    public final t0 b(l3.a aVar, ByteBuffer byteBuffer) {
        int i10;
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
        boolean z17;
        long j12;
        k0 k0Var = this.f46309c;
        if (k0Var == null || aVar.f15956r != k0Var.e()) {
            k0 k0Var2 = new k0(aVar.e);
            this.f46309c = k0Var2;
            k0Var2.a(aVar.e - aVar.f15956r);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        x xVar = this.f46307a;
        xVar.L(limit, array);
        g gVar = this.f46308b;
        gVar.k(limit, array);
        gVar.o(39);
        long g10 = (gVar.g(1) << 32) | gVar.g(32);
        gVar.o(20);
        int g11 = gVar.g(12);
        int g12 = gVar.g(8);
        xVar.O(14);
        if (g12 != 0) {
            if (g12 != 255) {
                if (g12 != 4) {
                    if (g12 != 5) {
                        if (g12 != 6) {
                            obj = null;
                        } else {
                            k0 k0Var3 = this.f46309c;
                            long d = a.d(g10, xVar);
                            obj = new a(d, k0Var3.b(d), 1);
                        }
                    } else {
                        k0 k0Var4 = this.f46309c;
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
                                j11 = a.d(g10, xVar);
                            } else {
                                j11 = -9223372036854775807L;
                            }
                            if (!z14) {
                                int A2 = xVar.A();
                                ArrayList arrayList = new ArrayList(A2);
                                int i11 = 0;
                                while (i11 < A2) {
                                    xVar.A();
                                    if (!z16) {
                                        z17 = z16;
                                        j12 = a.d(g10, xVar);
                                    } else {
                                        z17 = z16;
                                        j12 = -9223372036854775807L;
                                    }
                                    k0Var4.b(j12);
                                    arrayList.add(new rb.b(22));
                                    i11++;
                                    z16 = z17;
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
                    for (int i12 = 0; i12 < A3; i12++) {
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
                                for (int i13 = 0; i13 < A5; i13++) {
                                    xVar.A();
                                    xVar.C();
                                    arrayList4.add(new sb.a(22));
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
                        arrayList2.add(new t1(arrayList3));
                    }
                    obj = new f(arrayList2);
                }
                i10 = 0;
            } else {
                long C = xVar.C();
                int i14 = g11 - 4;
                i10 = 0;
                xVar.k(0, i14, new byte[i14]);
                obj = new a(C, g10, 0);
            }
        } else {
            i10 = 0;
            obj = new Object();
        }
        if (obj == null) {
            return new t0(new s0[i10]);
        }
        s0[] s0VarArr = new s0[1];
        s0VarArr[i10] = obj;
        return new t0(s0VarArr);
    }
}
