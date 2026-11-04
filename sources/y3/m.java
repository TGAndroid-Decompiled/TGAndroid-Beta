package y3;

import e3.f0;
import e3.j0;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
public final class m implements e3.o {
    public long A;
    public e3.q B;
    public l[] C;
    public long[][] D;
    public int E;
    public n3.b F;
    public final b4.k f58963a;
    public final int f58964b;
    public final boolean f58965c;
    public final y d;
    public final y f58966e;
    public final y f58967f;
    public final y f58968g;
    public final ArrayDeque h;
    public final p f58969i;
    public final ArrayList f58970j;
    public s1 f58971k;
    public int f58972l;
    public int f58973m;
    public long f58974n;
    public int f58975o;
    public y f58976p;
    public int f58977q;
    public int f58978r;
    public int f58979s;
    public int f58980t;
    public boolean f58981u;
    public boolean v;
    public boolean f58982w;
    public long f58983x;
    public boolean f58984y;
    public boolean f58985z;

    public m(b4.k kVar, int i3) {
        boolean z10;
        int i10;
        this.f58963a = kVar;
        this.f58964b = i3;
        if ((i3 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f58965c = z10;
        g0 g0Var = i0.f12083b;
        this.f58971k = s1.f12146e;
        if ((i3 & 4) != 0) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        this.f58972l = i10;
        this.f58969i = new p();
        this.f58970j = new ArrayList();
        this.f58968g = new y(16);
        this.h = new ArrayDeque();
        this.d = new y(h2.o.f14158a);
        this.f58966e = new y(6);
        this.f58967f = new y();
        this.f58977q = -1;
        this.B = e3.q.f9505k;
        this.C = new l[0];
    }

    @Override
    public final boolean b(e3.p pVar) {
        boolean z10;
        s1 s1Var;
        if ((this.f58964b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 m10 = q.m(pVar, false, z10);
        if (m10 != null) {
            s1Var = i0.u(m10);
        } else {
            g0 g0Var = i0.f12083b;
            s1Var = s1.f12146e;
        }
        this.f58971k = s1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(e3.q qVar) {
        if ((this.f58964b & 16) == 0) {
            qVar = new b4.n(qVar, this.f58963a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        l[] lVarArr;
        this.h.clear();
        this.f58975o = 0;
        this.f58977q = -1;
        this.f58978r = 0;
        this.f58979s = 0;
        this.f58980t = 0;
        this.f58981u = false;
        this.f58985z = false;
        if (j10 == 0) {
            if (this.f58972l != 3) {
                this.f58972l = 0;
                this.f58975o = 0;
                return;
            }
            p pVar = this.f58969i;
            pVar.f58990a.clear();
            pVar.f58991b = 0;
            this.f58970j.clear();
            return;
        }
        for (l lVar : this.C) {
            u uVar = lVar.f58959b;
            int a10 = uVar.a(j11);
            if (a10 == -1) {
                a10 = uVar.b(j11);
            }
            lVar.f58961e = a10;
            j0 j0Var = lVar.d;
            if (j0Var != null) {
                j0Var.f9480b = false;
                j0Var.f9481c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f58971k;
    }

    @Override
    public final int f(e3.p r43, e3.s r44) {
        throw new UnsupportedOperationException("Method not decompiled: y3.m.f(e3.p, e3.s):int");
    }

    public final void g(long r48) {
        throw new UnsupportedOperationException("Method not decompiled: y3.m.g(long):void");
    }

    @Override
    public final e3.o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
