package zd;
public abstract class a extends n1 implements id.c, z {
    public final id.h f61810c;

    public a(id.h hVar, boolean z10) {
        super(z10);
        y((a1) hVar.get(y.f61904b));
        this.f61810c = hVar.plus(this);
    }

    @Override
    public final void H(Object obj) {
        boolean z10;
        if (obj instanceof v) {
            v vVar = (v) obj;
            Throwable th2 = vVar.f61893a;
            if (v.f61892b.get(vVar) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Q(th2, z10);
            return;
        }
        R(obj);
    }

    public final void S(a0 a0Var, a aVar, rd.p pVar) {
        Object invoke;
        int ordinal = a0Var.ordinal();
        gd.k kVar = gd.k.f13488a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            id.h hVar = this.f61810c;
                            Object l10 = ee.a.l(hVar, null);
                            if (!(pVar instanceof kd.a)) {
                                invoke = c8.x0.c(pVar, aVar, this);
                            } else {
                                kotlin.jvm.internal.u.a(2, pVar);
                                invoke = pVar.invoke(aVar, this);
                            }
                            ee.a.g(hVar, l10);
                            if (invoke != jd.a.f17384a) {
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
                c8.x0.b(c8.x0.a(aVar, this, pVar)).resumeWith(kVar);
                return;
            }
            return;
        }
        try {
            ee.a.h(c8.x0.b(c8.x0.a(aVar, this, pVar)), kVar);
        } finally {
            resumeWith(b7.h.a(th2));
        }
    }

    @Override
    public final id.h c() {
        return this.f61810c;
    }

    @Override
    public final id.h getContext() {
        return this.f61810c;
    }

    @Override
    public final String m() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a10 = gd.g.a(obj);
        if (a10 != null) {
            obj = new v(a10, false);
        }
        Object D = D(obj);
        if (D == b0.f61819e) {
            return;
        }
        h(D);
    }

    @Override
    public final void x(androidx.car.app.j jVar) {
        b0.m(this.f61810c, jVar);
    }

    public void R(Object obj) {
    }

    public void Q(Throwable th2, boolean z10) {
    }
}
