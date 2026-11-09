package r2;

import a8.ia;
import a8.p0;
import c8.e1;
import e2.u;
import h2.m0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import x2.c1;
public final class l implements c1 {
    public final int f54354a;
    public final p f54355b;
    public int f54356c = -1;

    public l(p pVar, int i7) {
        this.f54355b = pVar;
        this.f54354a = i7;
    }

    @Override
    public final void a() {
        int i7 = this.f54356c;
        p pVar = this.f54355b;
        if (i7 != -2) {
            if (i7 == -1) {
                pVar.A();
                return;
            } else if (i7 != -3) {
                pVar.A();
                pVar.L[i7].C();
                return;
            } else {
                return;
            }
        }
        pVar.l();
        throw new IOException(p0.p("Unable to bind a sample queue to TrackGroup with MIME type ", pVar.Y.a(this.f54354a).d[0].f10615s, "."));
    }

    public final void b() {
        boolean z9;
        if (this.f54356c == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        p pVar = this.f54355b;
        pVar.l();
        pVar.f54367a0.getClass();
        int[] iArr = pVar.f54367a0;
        int i7 = this.f54354a;
        int i10 = iArr[i7];
        if (i10 == -1) {
            if (pVar.Z.contains(pVar.Y.a(i7))) {
                i10 = -3;
            }
            i10 = -2;
        } else {
            boolean[] zArr = pVar.f54372d0;
            if (!zArr[i10]) {
                zArr[i10] = true;
            }
            i10 = -2;
        }
        this.f54356c = i10;
    }

    public final boolean c() {
        int i7 = this.f54356c;
        if (i7 != -1 && i7 != -3 && i7 != -2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        if (this.f54356c != -3) {
            if (c()) {
                int i7 = this.f54356c;
                p pVar = this.f54355b;
                if (pVar.y() || !pVar.L[i7].A(pVar.f54380j0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int l(long j3) {
        Object next;
        Object obj;
        if (c()) {
            int i7 = this.f54356c;
            p pVar = this.f54355b;
            if (!pVar.y()) {
                o oVar = pVar.L[i7];
                int x10 = oVar.x(j3, pVar.f54380j0);
                ArrayList arrayList = pVar.D;
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        obj = jg.g.i(1, arrayList);
                    }
                    obj = null;
                } else {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        do {
                            next = it.next();
                        } while (it.hasNext());
                        obj = next;
                    }
                    obj = null;
                }
                i iVar = (i) obj;
                if (iVar != null && !iVar.g()) {
                    x10 = Math.min(x10, iVar.f(i7) - oVar.v());
                }
                oVar.L(x10);
                return x10;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        u uVar;
        if (this.f54356c == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i10 = this.f54356c;
            p pVar = this.f54355b;
            ArrayList arrayList = pVar.D;
            if (!pVar.y()) {
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((i) arrayList.get(i12)).f54329w;
                        int length = pVar.L.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (pVar.f54372d0[i14] && pVar.L[i14].E() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    m0.X(0, i12, arrayList);
                    i iVar = (i) arrayList.get(0);
                    u uVar2 = iVar.d;
                    if (!uVar2.equals(pVar.W)) {
                        pVar.f54388w.j(pVar.f54368b, uVar2, iVar.f58907e, iVar.f58908f, iVar.h);
                    }
                    pVar.W = uVar2;
                }
                if (arrayList.isEmpty() || ((i) arrayList.get(0)).g()) {
                    int F = pVar.L[i10].F(bVar, hVar, i7, pVar.f54380j0);
                    if (F == -5) {
                        u uVar3 = (u) bVar.f57668c;
                        uVar3.getClass();
                        if (i10 == pVar.R) {
                            int b10 = e1.b(pVar.L[i10].E());
                            while (i11 < arrayList.size() && ((i) arrayList.get(i11)).f54329w != b10) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                uVar = ((i) arrayList.get(i11)).d;
                            } else {
                                uVar = pVar.V;
                                uVar.getClass();
                            }
                            uVar3 = uVar3.d(uVar);
                        }
                        bVar.f57668c = uVar3;
                    }
                    return F;
                }
            }
        }
        return -3;
    }
}
