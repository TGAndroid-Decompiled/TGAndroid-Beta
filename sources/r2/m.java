package r2;

import a8.ja;
import a8.p0;
import c8.g1;
import e2.u;
import h2.l0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import x2.b1;
public final class m implements b1 {
    public final int f55824a;
    public final q f55825b;
    public int f55826c = -1;

    public m(q qVar, int i7) {
        this.f55825b = qVar;
        this.f55824a = i7;
    }

    @Override
    public final void a() {
        int i7 = this.f55826c;
        q qVar = this.f55825b;
        if (i7 != -2) {
            if (i7 == -1) {
                qVar.E();
                return;
            } else if (i7 != -3) {
                qVar.E();
                qVar.M[i7].C();
                return;
            } else {
                return;
            }
        }
        qVar.n();
        throw new IOException(p0.p("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.Z.a(this.f55824a).d[0].f10451s, "."));
    }

    public final void b() {
        boolean z10;
        if (this.f55826c == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        q qVar = this.f55825b;
        qVar.n();
        qVar.f55839b0.getClass();
        int[] iArr = qVar.f55839b0;
        int i7 = this.f55824a;
        int i10 = iArr[i7];
        if (i10 == -1) {
            if (qVar.f55837a0.contains(qVar.Z.a(i7))) {
                i10 = -3;
            }
            i10 = -2;
        } else {
            boolean[] zArr = qVar.f55844e0;
            if (!zArr[i10]) {
                zArr[i10] = true;
            }
            i10 = -2;
        }
        this.f55826c = i10;
    }

    public final boolean c() {
        int i7 = this.f55826c;
        if (i7 != -1 && i7 != -3 && i7 != -2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        if (this.f55826c != -3) {
            if (c()) {
                int i7 = this.f55826c;
                q qVar = this.f55825b;
                if (qVar.C() || !qVar.M[i7].A(qVar.f55851k0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int n(long j3) {
        Object next;
        Object obj;
        if (c()) {
            int i7 = this.f55826c;
            q qVar = this.f55825b;
            if (!qVar.C()) {
                p pVar = qVar.M[i7];
                int x10 = pVar.x(j3, qVar.f55851k0);
                ArrayList arrayList = qVar.E;
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
                    x10 = Math.min(x10, iVar.f(i7) - pVar.v());
                }
                pVar.L(x10);
                return x10;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final int q(k8.a aVar, k2.h hVar, int i7) {
        u uVar;
        if (this.f55826c == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i10 = this.f55826c;
            q qVar = this.f55825b;
            ArrayList arrayList = qVar.E;
            if (!qVar.C()) {
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((i) arrayList.get(i12)).f55798w;
                        int length = qVar.M.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (qVar.f55844e0[i14] && qVar.M[i14].E() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    l0.X(0, i12, arrayList);
                    i iVar = (i) arrayList.get(0);
                    u uVar2 = iVar.d;
                    if (!uVar2.equals(qVar.X)) {
                        qVar.f55859w.i(qVar.f55838b, uVar2, iVar.f60118e, iVar.f60119f, iVar.h);
                    }
                    qVar.X = uVar2;
                }
                if (arrayList.isEmpty() || ((i) arrayList.get(0)).g()) {
                    int F = qVar.M[i10].F(aVar, hVar, i7, qVar.f55851k0);
                    if (F == -5) {
                        u uVar3 = (u) aVar.f17789c;
                        uVar3.getClass();
                        if (i10 == qVar.S) {
                            int b10 = g1.b(qVar.M[i10].E());
                            while (i11 < arrayList.size() && ((i) arrayList.get(i11)).f55798w != b10) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                uVar = ((i) arrayList.get(i11)).d;
                            } else {
                                uVar = qVar.W;
                                uVar.getClass();
                            }
                            uVar3 = uVar3.d(uVar);
                        }
                        aVar.f17789c = uVar3;
                    }
                    return F;
                }
            }
        }
        return -3;
    }
}
