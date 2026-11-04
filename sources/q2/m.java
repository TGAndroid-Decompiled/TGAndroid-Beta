package q2;

import b8.od;
import b8.zb;
import d2.v;
import g2.n0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import k2.p1;
import w2.d1;
public final class m implements d1 {
    public final int f53729a;
    public final q f53730b;
    public int f53731c = -1;

    public m(q qVar, int i3) {
        this.f53730b = qVar;
        this.f53729a = i3;
    }

    @Override
    public final void a() {
        int i3 = this.f53731c;
        q qVar = this.f53730b;
        if (i3 != -2) {
            if (i3 == -1) {
                qVar.C();
                return;
            } else if (i3 != -3) {
                qVar.C();
                qVar.M[i3].C();
                return;
            } else {
                return;
            }
        }
        qVar.m();
        throw new IOException(a1.g.q("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.Z.a(this.f53729a).d[0].f8489s, "."));
    }

    public final void b() {
        boolean z10;
        if (this.f53731c == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        q qVar = this.f53730b;
        qVar.m();
        qVar.f53744b0.getClass();
        int[] iArr = qVar.f53744b0;
        int i3 = this.f53729a;
        int i10 = iArr[i3];
        if (i10 == -1) {
            if (qVar.f53742a0.contains(qVar.Z.a(i3))) {
                i10 = -3;
            }
            i10 = -2;
        } else {
            boolean[] zArr = qVar.f53749e0;
            if (!zArr[i10]) {
                zArr[i10] = true;
            }
            i10 = -2;
        }
        this.f53731c = i10;
    }

    public final boolean c() {
        int i3 = this.f53731c;
        if (i3 != -1 && i3 != -3 && i3 != -2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        if (this.f53731c != -3) {
            if (c()) {
                int i3 = this.f53731c;
                q qVar = this.f53730b;
                if (qVar.A() || !qVar.M[i3].A(qVar.f53756k0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int m(long j10) {
        Object next;
        Object obj;
        if (c()) {
            int i3 = this.f53731c;
            q qVar = this.f53730b;
            if (!qVar.A()) {
                p pVar = qVar.M[i3];
                int x10 = pVar.x(j10, qVar.f53756k0);
                ArrayList arrayList = qVar.E;
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        obj = p1.h(1, arrayList);
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
                    x10 = Math.min(x10, jVar.f(i3) - pVar.v());
                }
                pVar.L(x10);
                return x10;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final int o(tf.b bVar, j2.h hVar, int i3) {
        v vVar;
        if (this.f53731c == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i10 = this.f53731c;
            q qVar = this.f53730b;
            ArrayList arrayList = qVar.E;
            if (!qVar.A()) {
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((j) arrayList.get(i12)).f53704w;
                        int length = qVar.M.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (qVar.f53749e0[i14] && qVar.M[i14].E() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    n0.X(0, i12, arrayList);
                    j jVar = (j) arrayList.get(0);
                    v vVar2 = jVar.d;
                    if (!vVar2.equals(qVar.X)) {
                        qVar.f53764w.k(qVar.f53743b, vVar2, jVar.f58151e, jVar.f58152f, jVar.h);
                    }
                    qVar.X = vVar2;
                }
                if (arrayList.isEmpty() || ((j) arrayList.get(0)).g()) {
                    int F = qVar.M[i10].F(bVar, hVar, i3, qVar.f53756k0);
                    if (F == -5) {
                        v vVar3 = (v) bVar.f55095b;
                        vVar3.getClass();
                        if (i10 == qVar.S) {
                            int b10 = od.b(qVar.M[i10].E());
                            while (i11 < arrayList.size() && ((j) arrayList.get(i11)).f53704w != b10) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                vVar = ((j) arrayList.get(i11)).d;
                            } else {
                                vVar = qVar.W;
                                vVar.getClass();
                            }
                            vVar3 = vVar3.d(vVar);
                        }
                        bVar.f55095b = vVar3;
                    }
                    return F;
                }
            }
        }
        return -3;
    }
}
