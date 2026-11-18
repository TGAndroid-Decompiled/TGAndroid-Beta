package r2;

import a8.la;
import a8.p0;
import c8.k1;
import e2.u;
import h2.l0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import x2.d1;
public final class l implements d1 {
    public final int f56398a;
    public final p f56399b;
    public int f56400c = -1;

    public l(p pVar, int i7) {
        this.f56399b = pVar;
        this.f56398a = i7;
    }

    @Override
    public final void a() {
        int i7 = this.f56400c;
        p pVar = this.f56399b;
        if (i7 != -2) {
            if (i7 == -1) {
                pVar.E();
                return;
            } else if (i7 != -3) {
                pVar.E();
                pVar.M[i7].C();
                return;
            } else {
                return;
            }
        }
        pVar.h();
        throw new IOException(p0.p("Unable to bind a sample queue to TrackGroup with MIME type ", pVar.Z.a(this.f56398a).d[0].f10769s, "."));
    }

    public final void b() {
        boolean z10;
        if (this.f56400c == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        p pVar = this.f56399b;
        pVar.h();
        pVar.f56413b0.getClass();
        int[] iArr = pVar.f56413b0;
        int i7 = this.f56398a;
        int i10 = iArr[i7];
        if (i10 == -1) {
            if (pVar.f56411a0.contains(pVar.Z.a(i7))) {
                i10 = -3;
            }
            i10 = -2;
        } else {
            boolean[] zArr = pVar.f56418e0;
            if (!zArr[i10]) {
                zArr[i10] = true;
            }
            i10 = -2;
        }
        this.f56400c = i10;
    }

    public final boolean c() {
        int i7 = this.f56400c;
        if (i7 != -1 && i7 != -3 && i7 != -2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean h() {
        if (this.f56400c != -3) {
            if (c()) {
                int i7 = this.f56400c;
                p pVar = this.f56399b;
                if (pVar.C() || !pVar.M[i7].A(pVar.f56425k0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int j(long j3) {
        Object next;
        Object obj;
        if (c()) {
            int i7 = this.f56400c;
            p pVar = this.f56399b;
            if (!pVar.C()) {
                o oVar = pVar.M[i7];
                int x10 = oVar.x(j3, pVar.f56425k0);
                ArrayList arrayList = pVar.E;
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        obj = i5.c.h(1, arrayList);
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
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        u uVar;
        if (this.f56400c == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i10 = this.f56400c;
            p pVar = this.f56399b;
            ArrayList arrayList = pVar.E;
            if (!pVar.C()) {
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((i) arrayList.get(i12)).f56373w;
                        int length = pVar.M.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (pVar.f56418e0[i14] && pVar.M[i14].E() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    l0.X(0, i12, arrayList);
                    i iVar = (i) arrayList.get(0);
                    u uVar2 = iVar.d;
                    if (!uVar2.equals(pVar.X)) {
                        pVar.f56433w.j(pVar.f56412b, uVar2, iVar.f60683e, iVar.f60684f, iVar.h);
                    }
                    pVar.X = uVar2;
                }
                if (arrayList.isEmpty() || ((i) arrayList.get(0)).g()) {
                    int F = pVar.M[i10].F(aVar, hVar, i7, pVar.f56425k0);
                    if (F == -5) {
                        u uVar3 = (u) aVar.f18184c;
                        uVar3.getClass();
                        if (i10 == pVar.S) {
                            int b10 = k1.b(pVar.M[i10].E());
                            while (i11 < arrayList.size() && ((i) arrayList.get(i11)).f56373w != b10) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                uVar = ((i) arrayList.get(i11)).d;
                            } else {
                                uVar = pVar.W;
                                uVar.getClass();
                            }
                            uVar3 = uVar3.d(uVar);
                        }
                        aVar.f18184c = uVar3;
                    }
                    return F;
                }
            }
        }
        return -3;
    }
}
