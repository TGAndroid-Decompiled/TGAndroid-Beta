package s3;

import a4.h;
import b2.o0;
import b2.p0;
import e2.b0;
import e2.v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m.g3;
import w7.l;
public final class c extends l {
    public final v f41567a = new v();
    public final h f41568b = new h();
    public b0 f41569c;

    @Override
    public final p0 b(l3.a aVar, ByteBuffer byteBuffer) {
        Object obj;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j3;
        boolean z14;
        boolean z15;
        boolean z16;
        long j10;
        long j11;
        b0 b0Var = this.f41569c;
        if (b0Var == null || aVar.f12770r != b0Var.e()) {
            b0 b0Var2 = new b0(aVar.e);
            this.f41569c = b0Var2;
            b0Var2.a(aVar.e - aVar.f12770r);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        v vVar = this.f41567a;
        vVar.H(limit, array);
        h hVar = this.f41568b;
        hVar.o(limit, array);
        hVar.t(39);
        long i10 = (hVar.i(1) << 32) | hVar.i(32);
        hVar.t(20);
        int i11 = hVar.i(12);
        int i12 = hVar.i(8);
        vVar.K(14);
        if (i12 != 0) {
            if (i12 != 255) {
                if (i12 != 4) {
                    if (i12 != 5) {
                        if (i12 != 6) {
                            obj = null;
                        } else {
                            b0 b0Var3 = this.f41569c;
                            long d = a.d(i10, vVar);
                            obj = new a(d, b0Var3.b(d), 1);
                        }
                    } else {
                        b0 b0Var4 = this.f41569c;
                        vVar.z();
                        if ((vVar.x() & 128) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        List list = Collections.EMPTY_LIST;
                        if (!z13) {
                            int x10 = vVar.x();
                            if ((x10 & 64) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((x10 & 32) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if ((x10 & 16) != 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z14 && !z16) {
                                j10 = a.d(i10, vVar);
                            } else {
                                j10 = -9223372036854775807L;
                            }
                            if (!z14) {
                                int x11 = vVar.x();
                                ArrayList arrayList = new ArrayList(x11);
                                for (int i13 = 0; i13 < x11; i13++) {
                                    vVar.x();
                                    if (!z16) {
                                        j11 = a.d(i10, vVar);
                                    } else {
                                        j11 = -9223372036854775807L;
                                    }
                                    b0Var4.b(j11);
                                    arrayList.add(new rb.a(21));
                                }
                                list = arrayList;
                            }
                            if (z15) {
                                vVar.x();
                                vVar.z();
                            }
                            vVar.D();
                            vVar.x();
                            vVar.x();
                            j3 = j10;
                        } else {
                            j3 = -9223372036854775807L;
                        }
                        obj = new d(j3, b0Var4.b(j3), list);
                    }
                } else {
                    int x12 = vVar.x();
                    ArrayList arrayList2 = new ArrayList(x12);
                    for (int i14 = 0; i14 < x12; i14++) {
                        vVar.z();
                        if ((vVar.x() & 128) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        if (!z10) {
                            int x13 = vVar.x();
                            if ((x13 & 64) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if ((x13 & 32) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z11) {
                                vVar.z();
                            }
                            if (!z11) {
                                int x14 = vVar.x();
                                ArrayList arrayList4 = new ArrayList(x14);
                                for (int i15 = 0; i15 < x14; i15++) {
                                    vVar.x();
                                    vVar.z();
                                    arrayList4.add(new Object());
                                }
                                arrayList3 = arrayList4;
                            }
                            if (z12) {
                                vVar.x();
                                vVar.z();
                            }
                            vVar.D();
                            vVar.x();
                            vVar.x();
                        }
                        arrayList2.add(new g3(arrayList3));
                    }
                    obj = new f(arrayList2);
                }
            } else {
                long z17 = vVar.z();
                int i16 = i11 - 4;
                vVar.h(0, i16, new byte[i16]);
                obj = new a(z17, i10, 0);
            }
        } else {
            obj = new Object();
        }
        if (obj == null) {
            return new p0(new o0[0]);
        }
        return new p0(obj);
    }
}
