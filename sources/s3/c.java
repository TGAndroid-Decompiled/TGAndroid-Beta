package s3;

import a4.g;
import b2.t0;
import b2.u0;
import e2.k0;
import e2.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m2.t;
import t7.u;
import w7.l;
public final class c extends l {
    public final x f47858a = new x();
    public final g f47859b = new g();
    public k0 f47860c;

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
        k0 k0Var = this.f47860c;
        if (k0Var == null || aVar.f11637r != k0Var.e()) {
            k0 k0Var2 = new k0(aVar.e);
            this.f47860c = k0Var2;
            k0Var2.a(aVar.e - aVar.f11637r);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        x xVar = this.f47858a;
        xVar.L(limit, array);
        g gVar = this.f47859b;
        gVar.b0(limit, array);
        gVar.f0(39);
        long i10 = (gVar.i(1) << 32) | gVar.i(32);
        gVar.f0(20);
        int i11 = gVar.i(12);
        int i12 = gVar.i(8);
        xVar.O(14);
        if (i12 != 0) {
            if (i12 != 255) {
                if (i12 != 4) {
                    if (i12 != 5) {
                        if (i12 != 6) {
                            obj = null;
                        } else {
                            k0 k0Var3 = this.f47860c;
                            long d = a.d(i10, xVar);
                            obj = new a(d, 1, k0Var3.b(d));
                        }
                    } else {
                        k0 k0Var4 = this.f47860c;
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
                                j11 = a.d(i10, xVar);
                            } else {
                                j11 = -9223372036854775807L;
                            }
                            if (!z14) {
                                int A2 = xVar.A();
                                ArrayList arrayList = new ArrayList(A2);
                                for (int i13 = 0; i13 < A2; i13++) {
                                    xVar.A();
                                    if (!z16) {
                                        j12 = a.d(i10, xVar);
                                    } else {
                                        j12 = -9223372036854775807L;
                                    }
                                    k0Var4.b(j12);
                                    arrayList.add(new u(19));
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
                    for (int i14 = 0; i14 < A3; i14++) {
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
                                for (int i15 = 0; i15 < A5; i15++) {
                                    xVar.A();
                                    xVar.C();
                                    arrayList4.add(new hb.a(20));
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
                        arrayList2.add(new t(arrayList3));
                    }
                    obj = new f(arrayList2);
                }
            } else {
                long C = xVar.C();
                int i16 = i11 - 4;
                xVar.k(0, i16, new byte[i16]);
                obj = new a(C, 0, i10);
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
