package t4;

import h5.d0;
import j3.n0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import k7.y7;
import kf.k0;
import o4.l0;
public final class n implements l0 {
    public final int f44590a;
    public final r f44591b;
    public int f44592c = -1;

    public n(r rVar, int i10) {
        this.f44591b = rVar;
        this.f44590a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f44592c;
        r rVar = this.f44591b;
        if (i10 != -2) {
            if (i10 == -1) {
                rVar.m();
                return;
            } else if (i10 != -3) {
                rVar.m();
                rVar.I[i10].w();
                return;
            } else {
                return;
            }
        }
        rVar.d();
        throw new IOException(android.support.v4.media.a.o("Unable to bind a sample queue to TrackGroup with MIME type ", rVar.V.a(this.f44590a).d[0].C, "."));
    }

    public final void b() {
        boolean z4;
        if (this.f44592c == -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        r rVar = this.f44591b;
        rVar.d();
        rVar.X.getClass();
        int[] iArr = rVar.X;
        int i10 = this.f44590a;
        int i11 = iArr[i10];
        if (i11 == -1) {
            if (rVar.W.contains(rVar.V.a(i10))) {
                i11 = -3;
            }
            i11 = -2;
        } else {
            boolean[] zArr = rVar.f44602a0;
            if (!zArr[i11]) {
                zArr[i11] = true;
            }
            i11 = -2;
        }
        this.f44592c = i11;
    }

    public final boolean c() {
        int i10 = this.f44592c;
        if (i10 != -1 && i10 != -3 && i10 != -2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean d() {
        if (this.f44592c != -3) {
            if (c()) {
                int i10 = this.f44592c;
                r rVar = this.f44591b;
                if (rVar.k() || !rVar.I[i10].u(rVar.f44611g0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int e(long j10) {
        Object next;
        Object obj;
        if (c()) {
            int i10 = this.f44592c;
            r rVar = this.f44591b;
            if (!rVar.k()) {
                q qVar = rVar.I[i10];
                int s6 = qVar.s(j10, rVar.f44611g0);
                ArrayList arrayList = rVar.f44621y;
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        obj = k0.i(1, arrayList);
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
                k kVar = (k) obj;
                if (kVar != null && !kVar.X) {
                    s6 = Math.min(s6, kVar.g(i10) - qVar.q());
                }
                qVar.E(s6);
                return s6;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final int f(f7.b bVar, n3.i iVar, int i10) {
        n0 n0Var;
        if (this.f44592c == -3) {
            iVar.a(4);
            return -4;
        }
        if (c()) {
            int i11 = this.f44592c;
            r rVar = this.f44591b;
            ArrayList arrayList = rVar.f44621y;
            if (!rVar.k()) {
                int i12 = 0;
                if (!arrayList.isEmpty()) {
                    int i13 = 0;
                    loop0: while (i13 < arrayList.size() - 1) {
                        int i14 = ((k) arrayList.get(i13)).v;
                        int length = rVar.I.length;
                        for (int i15 = 0; i15 < length; i15++) {
                            if (rVar.f44602a0[i15] && rVar.I[i15].y() == i14) {
                                break loop0;
                            }
                        }
                        i13++;
                    }
                    d0.L(0, i13, arrayList);
                    k kVar = (k) arrayList.get(0);
                    n0 n0Var2 = kVar.d;
                    if (!n0Var2.equals(rVar.T)) {
                        rVar.v.h(rVar.f44603b, n0Var2, kVar.e, kVar.f42762f, kVar.h);
                    }
                    rVar.T = n0Var2;
                }
                if (arrayList.isEmpty() || ((k) arrayList.get(0)).X) {
                    int z4 = rVar.I[i11].z(bVar, iVar, i10, rVar.f44611g0);
                    if (z4 == -5) {
                        n0 n0Var3 = (n0) bVar.f6002c;
                        n0Var3.getClass();
                        if (i11 == rVar.O) {
                            int a2 = y7.a(rVar.I[i11].y());
                            while (i12 < arrayList.size() && ((k) arrayList.get(i12)).v != a2) {
                                i12++;
                            }
                            if (i12 < arrayList.size()) {
                                n0Var = ((k) arrayList.get(i12)).d;
                            } else {
                                n0Var = rVar.S;
                                n0Var.getClass();
                            }
                            n0Var3 = n0Var3.c(n0Var);
                        }
                        bVar.f6002c = n0Var3;
                    }
                    return z4;
                }
            }
        }
        return -3;
    }
}
