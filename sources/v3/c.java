package v3;

import c8.ca;
import e2.p0;
import e2.q0;
import h2.k0;
import h2.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.Components.n;
public final class c extends ca {
    public final x f56984a = new x();
    public final d4.f f56985b = new d4.f();
    public k0 f56986c;

    @Override
    public final q0 b(o3.a aVar, ByteBuffer byteBuffer) {
        Object obj;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        long j3;
        boolean z13;
        boolean z14;
        boolean z15;
        long j10;
        long j11;
        k0 k0Var = this.f56986c;
        if (k0Var == null || aVar.f20793r != k0Var.e()) {
            k0 k0Var2 = new k0(aVar.f17176e);
            this.f56986c = k0Var2;
            k0Var2.a(aVar.f17176e - aVar.f20793r);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        x xVar = this.f56984a;
        xVar.L(limit, array);
        d4.f fVar = this.f56985b;
        fVar.H(limit, array);
        fVar.L(39);
        long j12 = (fVar.j(1) << 32) | fVar.j(32);
        fVar.L(20);
        int j13 = fVar.j(12);
        int j14 = fVar.j(8);
        xVar.O(14);
        if (j14 != 0) {
            if (j14 != 255) {
                if (j14 != 4) {
                    if (j14 != 5) {
                        if (j14 != 6) {
                            obj = null;
                        } else {
                            k0 k0Var3 = this.f56986c;
                            long d = a.d(j12, xVar);
                            obj = new a(d, 1, k0Var3.b(d));
                        }
                    } else {
                        k0 k0Var4 = this.f56986c;
                        xVar.C();
                        if ((xVar.A() & 128) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        List list = Collections.EMPTY_LIST;
                        if (!z12) {
                            int A = xVar.A();
                            if ((A & 64) != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if ((A & 32) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((A & 16) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z13 && !z15) {
                                j10 = a.d(j12, xVar);
                            } else {
                                j10 = -9223372036854775807L;
                            }
                            if (!z13) {
                                int A2 = xVar.A();
                                ArrayList arrayList = new ArrayList(A2);
                                for (int i7 = 0; i7 < A2; i7++) {
                                    xVar.A();
                                    if (!z15) {
                                        j11 = a.d(j12, xVar);
                                    } else {
                                        j11 = -9223372036854775807L;
                                    }
                                    k0Var4.b(j11);
                                    arrayList.add(new pb.b(26));
                                }
                                list = arrayList;
                            }
                            if (z14) {
                                xVar.A();
                                xVar.C();
                            }
                            xVar.H();
                            xVar.A();
                            xVar.A();
                            j3 = j10;
                        } else {
                            j3 = -9223372036854775807L;
                        }
                        obj = new d(j3, k0Var4.b(j3), list);
                    }
                } else {
                    int A3 = xVar.A();
                    ArrayList arrayList2 = new ArrayList(A3);
                    for (int i10 = 0; i10 < A3; i10++) {
                        xVar.C();
                        if ((xVar.A() & 128) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        if (!z9) {
                            int A4 = xVar.A();
                            if ((A4 & 64) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if ((A4 & 32) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z10) {
                                xVar.C();
                            }
                            if (!z10) {
                                int A5 = xVar.A();
                                ArrayList arrayList4 = new ArrayList(A5);
                                for (int i11 = 0; i11 < A5; i11++) {
                                    xVar.A();
                                    xVar.C();
                                    arrayList4.add(new qb.a(26));
                                }
                                arrayList3 = arrayList4;
                            }
                            if (z11) {
                                xVar.A();
                                xVar.C();
                            }
                            xVar.H();
                            xVar.A();
                            xVar.A();
                        }
                        arrayList2.add(new n(arrayList3));
                    }
                    obj = new f(arrayList2);
                }
            } else {
                long C = xVar.C();
                int i12 = j13 - 4;
                xVar.k(0, i12, new byte[i12]);
                obj = new a(C, 0, j12);
            }
        } else {
            obj = new Object();
        }
        if (obj == null) {
            return new q0(new p0[0]);
        }
        return new q0(obj);
    }
}
