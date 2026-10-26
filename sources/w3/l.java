package w3;

import c3.f0;
import c3.k0;
import e2.x;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
public final class l implements c3.o {
    public long A;
    public c3.q B;
    public k[] C;
    public long[][] D;
    public int E;
    public l3.b F;
    public final z3.k f50713a;
    public final int f50714b;
    public final boolean f50715c;
    public final x d;
    public final x e;
    public final x f50716f;
    public final x f50717g;
    public final ArrayDeque h;
    public final o f50718i;
    public final ArrayList f50719j;
    public s1 f50720k;
    public int f50721l;
    public int f50722m;
    public long f50723n;
    public int f50724o;
    public x f50725p;
    public int f50726q;
    public int f50727r;
    public int f50728s;
    public int f50729t;
    public boolean f50730u;
    public boolean v;
    public boolean f50731w;
    public long f50732x;
    public boolean f50733y;
    public boolean f50734z;

    public l(z3.k kVar, int i10) {
        boolean z10;
        int i11;
        this.f50713a = kVar;
        this.f50714b = i10;
        if ((i10 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50715c = z10;
        g0 g0Var = i0.f10287b;
        this.f50720k = s1.e;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f50721l = i11;
        this.f50718i = new o();
        this.f50719j = new ArrayList();
        this.f50717g = new x(16);
        this.h = new ArrayDeque();
        this.d = new x(f2.q.f10111a);
        this.e = new x(6);
        this.f50716f = new x();
        this.f50726q = -1;
        this.B = c3.q.f6091i;
        this.C = new k[0];
    }

    @Override
    public final boolean a(c3.p pVar) {
        boolean z10;
        s1 s1Var;
        if ((this.f50714b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0 m10 = p.m(pVar, false, z10);
        if (m10 != null) {
            s1Var = i0.y(m10);
        } else {
            g0 g0Var = i0.f10287b;
            s1Var = s1.e;
        }
        this.f50720k = s1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(c3.q qVar) {
        if ((this.f50714b & 16) == 0) {
            qVar = new c2.b(qVar, this.f50713a);
        }
        this.B = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        k[] kVarArr;
        this.h.clear();
        this.f50724o = 0;
        this.f50726q = -1;
        this.f50727r = 0;
        this.f50728s = 0;
        this.f50729t = 0;
        this.f50730u = false;
        this.f50734z = false;
        if (j10 == 0) {
            if (this.f50721l != 3) {
                this.f50721l = 0;
                this.f50724o = 0;
                return;
            }
            o oVar = this.f50718i;
            oVar.f50738a.clear();
            oVar.f50739b = 0;
            this.f50719j.clear();
            return;
        }
        for (k kVar : this.C) {
            t tVar = kVar.f50710b;
            int a2 = tVar.a(j11);
            if (a2 == -1) {
                a2 = tVar.b(j11);
            }
            kVar.e = a2;
            k0 k0Var = kVar.d;
            if (k0Var != null) {
                k0Var.f6074b = false;
                k0Var.f6075c = 0;
            }
        }
    }

    @Override
    public final List e() {
        return this.f50720k;
    }

    @Override
    public final int f(c3.p r43, c3.s r44) {
        throw new UnsupportedOperationException("Method not decompiled: w3.l.f(c3.p, c3.s):int");
    }

    public final void g(long r48) {
        throw new UnsupportedOperationException("Method not decompiled: w3.l.g(long):void");
    }

    @Override
    public final c3.o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
