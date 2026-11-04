package wd;

import b8.ib;
import b8.jc;
public abstract class a extends n1 implements fd.c, z {
    public final fd.h f57457c;

    public a(fd.h hVar, boolean z10) {
        super(z10);
        y((a1) hVar.get(y.f57551b));
        this.f57457c = hVar.plus(this);
    }

    @Override
    public final void H(Object obj) {
        boolean z10;
        if (obj instanceof v) {
            v vVar = (v) obj;
            Throwable th2 = vVar.f57540a;
            if (v.f57539b.get(vVar) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Q(th2, z10);
            return;
        }
        R(obj);
    }

    public final void S(a0 a0Var, a aVar, od.p pVar) {
        Object invoke;
        int ordinal = a0Var.ordinal();
        dd.k kVar = dd.k.f8801a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            fd.h hVar = this.f57457c;
                            Object l10 = be.a.l(hVar, null);
                            if (!(pVar instanceof hd.a)) {
                                invoke = jc.c(pVar, aVar, this);
                            } else {
                                kotlin.jvm.internal.u.a(2, pVar);
                                invoke = pVar.invoke(aVar, this);
                            }
                            be.a.g(hVar, l10);
                            if (invoke != gd.a.f12241a) {
                                resumeWith(invoke);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                kotlin.jvm.internal.j.e(pVar, "<this>");
                jc.b(jc.a(aVar, this, pVar)).resumeWith(kVar);
                return;
            }
            return;
        }
        try {
            be.a.h(jc.b(jc.a(aVar, this, pVar)), kVar);
        } finally {
            resumeWith(ib.a(th2));
        }
    }

    @Override
    public final fd.h c() {
        return this.f57457c;
    }

    @Override
    public final fd.h getContext() {
        return this.f57457c;
    }

    @Override
    public final String m() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a10 = dd.g.a(obj);
        if (a10 != null) {
            obj = new v(a10, false);
        }
        Object D = D(obj);
        if (D == b0.f57466e) {
            return;
        }
        h(D);
    }

    @Override
    public final void x(androidx.car.app.j jVar) {
        b0.m(this.f57457c, jVar);
    }

    public void R(Object obj) {
    }

    public void Q(Throwable th2, boolean z10) {
    }
}
