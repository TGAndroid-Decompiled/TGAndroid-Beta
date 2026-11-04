package u3;

import b8.te;
import d2.r0;
import d2.s0;
import g2.l0;
import g2.y;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class c extends te {
    public final y f55477a = new y();
    public final c4.f f55478b = new c4.f();
    public l0 f55479c;

    @Override
    public final s0 b(n3.a aVar, ByteBuffer byteBuffer) {
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
        l0 l0Var = this.f55479c;
        if (l0Var == null || aVar.f20212r != l0Var.e()) {
            l0 l0Var2 = new l0(aVar.f16158e);
            this.f55479c = l0Var2;
            l0Var2.a(aVar.f16158e - aVar.f20212r);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        y yVar = this.f55477a;
        yVar.L(limit, array);
        c4.f fVar = this.f55478b;
        fVar.H(limit, array);
        fVar.L(39);
        long j13 = (fVar.j(1) << 32) | fVar.j(32);
        fVar.L(20);
        int j14 = fVar.j(12);
        int j15 = fVar.j(8);
        yVar.O(14);
        if (j15 != 0) {
            if (j15 != 255) {
                if (j15 != 4) {
                    if (j15 != 5) {
                        if (j15 != 6) {
                            obj = null;
                        } else {
                            l0 l0Var3 = this.f55479c;
                            long d = a.d(j13, yVar);
                            obj = new a(d, 1, l0Var3.b(d));
                        }
                    } else {
                        l0 l0Var4 = this.f55479c;
                        yVar.C();
                        if ((yVar.A() & 128) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        List list = Collections.EMPTY_LIST;
                        if (!z13) {
                            int A = yVar.A();
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
                                j11 = a.d(j13, yVar);
                            } else {
                                j11 = -9223372036854775807L;
                            }
                            if (!z14) {
                                int A2 = yVar.A();
                                ArrayList arrayList = new ArrayList(A2);
                                for (int i3 = 0; i3 < A2; i3++) {
                                    yVar.A();
                                    if (!z16) {
                                        j12 = a.d(j13, yVar);
                                    } else {
                                        j12 = -9223372036854775807L;
                                    }
                                    l0Var4.b(j12);
                                    arrayList.add(new kb.a(25));
                                }
                                list = arrayList;
                            }
                            if (z15) {
                                yVar.A();
                                yVar.C();
                            }
                            yVar.H();
                            yVar.A();
                            yVar.A();
                            j10 = j11;
                        } else {
                            j10 = -9223372036854775807L;
                        }
                        obj = new d(j10, l0Var4.b(j10), list);
                    }
                } else {
                    int A3 = yVar.A();
                    ArrayList arrayList2 = new ArrayList(A3);
                    for (int i10 = 0; i10 < A3; i10++) {
                        yVar.C();
                        if ((yVar.A() & 128) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        if (!z10) {
                            int A4 = yVar.A();
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
                                yVar.C();
                            }
                            if (!z11) {
                                int A5 = yVar.A();
                                ArrayList arrayList4 = new ArrayList(A5);
                                for (int i11 = 0; i11 < A5; i11++) {
                                    yVar.A();
                                    yVar.C();
                                    arrayList4.add(new mb.b(25));
                                }
                                arrayList3 = arrayList4;
                            }
                            if (z12) {
                                yVar.A();
                                yVar.C();
                            }
                            yVar.H();
                            yVar.A();
                            yVar.A();
                        }
                        ?? obj2 = new Object();
                        obj2.f40562a = DesugarCollections.unmodifiableList(arrayList3);
                        arrayList2.add(obj2);
                    }
                    obj = new f(arrayList2);
                }
            } else {
                long C = yVar.C();
                int i12 = j14 - 4;
                yVar.k(0, i12, new byte[i12]);
                obj = new a(C, 0, j13);
            }
        } else {
            obj = new Object();
        }
        if (obj == null) {
            return new s0(new r0[0]);
        }
        return new s0(obj);
    }
}
