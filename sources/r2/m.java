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
public final class m implements c1 {
    public final int f54250a;
    public final q f54251b;
    public int f54252c = -1;

    public m(q qVar, int i7) {
        this.f54251b = qVar;
        this.f54250a = i7;
    }

    @Override
    public final void a() {
        int i7 = this.f54252c;
        q qVar = this.f54251b;
        if (i7 != -2) {
            if (i7 == -1) {
                qVar.A();
                return;
            } else if (i7 != -3) {
                qVar.A();
                qVar.L[i7].C();
                return;
            } else {
                return;
            }
        }
        qVar.l();
        throw new IOException(p0.p("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.Y.a(this.f54250a).d[0].f10615s, "."));
    }

    public final void b() {
        boolean z9;
        if (this.f54252c == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        q qVar = this.f54251b;
        qVar.l();
        qVar.f54263a0.getClass();
        int[] iArr = qVar.f54263a0;
        int i7 = this.f54250a;
        int i10 = iArr[i7];
        if (i10 == -1) {
            if (qVar.Z.contains(qVar.Y.a(i7))) {
                i10 = -3;
            }
            i10 = -2;
        } else {
            boolean[] zArr = qVar.f54268d0;
            if (!zArr[i10]) {
                zArr[i10] = true;
            }
            i10 = -2;
        }
        this.f54252c = i10;
    }

    public final boolean c() {
        int i7 = this.f54252c;
        if (i7 != -1 && i7 != -3 && i7 != -2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        if (this.f54252c != -3) {
            if (c()) {
                int i7 = this.f54252c;
                q qVar = this.f54251b;
                if (qVar.y() || !qVar.L[i7].A(qVar.f54276j0)) {
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
            int i7 = this.f54252c;
            q qVar = this.f54251b;
            if (!qVar.y()) {
                p pVar = qVar.L[i7];
                int x10 = pVar.x(j3, qVar.f54276j0);
                ArrayList arrayList = qVar.D;
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
                j jVar = (j) obj;
                if (jVar != null && !jVar.g()) {
                    x10 = Math.min(x10, jVar.f(i7) - pVar.v());
                }
                pVar.L(x10);
                return x10;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        u uVar;
        if (this.f54252c == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i10 = this.f54252c;
            q qVar = this.f54251b;
            ArrayList arrayList = qVar.D;
            if (!qVar.y()) {
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((j) arrayList.get(i12)).f54225w;
                        int length = qVar.L.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (qVar.f54268d0[i14] && qVar.L[i14].E() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    m0.X(0, i12, arrayList);
                    j jVar = (j) arrayList.get(0);
                    u uVar2 = jVar.d;
                    if (!uVar2.equals(qVar.W)) {
                        qVar.f54284w.j(qVar.f54264b, uVar2, jVar.f58803e, jVar.f58804f, jVar.h);
                    }
                    qVar.W = uVar2;
                }
                if (arrayList.isEmpty() || ((j) arrayList.get(0)).g()) {
                    int F = qVar.L[i10].F(bVar, hVar, i7, qVar.f54276j0);
                    if (F == -5) {
                        u uVar3 = (u) bVar.f57564c;
                        uVar3.getClass();
                        if (i10 == qVar.R) {
                            int b10 = e1.b(qVar.L[i10].E());
                            while (i11 < arrayList.size() && ((j) arrayList.get(i11)).f54225w != b10) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                uVar = ((j) arrayList.get(i11)).d;
                            } else {
                                uVar = qVar.V;
                                uVar.getClass();
                            }
                            uVar3 = uVar3.d(uVar);
                        }
                        bVar.f57564c = uVar3;
                    }
                    return F;
                }
            }
        }
        return -3;
    }
}
