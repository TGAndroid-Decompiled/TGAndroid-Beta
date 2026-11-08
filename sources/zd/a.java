package zd;
public abstract class a extends n1 implements id.c, z {
    public final id.h f60038c;

    public a(id.h hVar, boolean z9) {
        super(z9);
        y((a1) hVar.get(y.f60132b));
        this.f60038c = hVar.plus(this);
    }

    @Override
    public final void H(Object obj) {
        boolean z9;
        if (obj instanceof v) {
            v vVar = (v) obj;
            Throwable th2 = vVar.f60121a;
            if (v.f60120b.get(vVar) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            Q(th2, z9);
            return;
        }
        R(obj);
    }

    public final void S(a0 a0Var, a aVar, rd.p pVar) {
        Object invoke;
        int ordinal = a0Var.ordinal();
        gd.k kVar = gd.k.f13829a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            id.h hVar = this.f60038c;
                            Object l10 = ee.a.l(hVar, null);
                            if (!(pVar instanceof kd.a)) {
                                invoke = c8.u0.c(pVar, aVar, this);
                            } else {
                                kotlin.jvm.internal.u.a(2, pVar);
                                invoke = pVar.invoke(aVar, this);
                            }
                            ee.a.g(hVar, l10);
                            if (invoke != jd.a.f16646a) {
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
                c8.u0.b(c8.u0.a(aVar, this, pVar)).resumeWith(kVar);
                return;
            }
            return;
        }
        try {
            ee.a.h(c8.u0.b(c8.u0.a(aVar, this, pVar)), kVar);
        } finally {
            resumeWith(af.b.b(th2));
        }
    }

    @Override
    public final id.h c() {
        return this.f60038c;
    }

    @Override
    public final id.h getContext() {
        return this.f60038c;
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
        if (D == b0.f60047e) {
            return;
        }
        h(D);
    }

    @Override
    public final void x(androidx.car.app.j jVar) {
        b0.m(this.f60038c, jVar);
    }

    public void R(Object obj) {
    }

    public void Q(Throwable th2, boolean z9) {
    }
}
