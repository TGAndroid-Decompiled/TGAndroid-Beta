package zd;

import v7.i7;
import v7.u7;
public abstract class a extends u1 implements id.c, c0 {
    public final id.h f49139c;

    public a(id.h hVar, boolean z10) {
        super(z10);
        x((f1) hVar.get(b0.f49143b));
        this.f49139c = hVar.plus(this);
    }

    @Override
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.f49211b.get((v) obj);
        }
    }

    public final void L(d0 d0Var, a aVar, rd.p pVar) {
        Object invoke;
        Object cVar;
        int ordinal = d0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            id.h hVar = this.f49139c;
                            Object k10 = ee.a.k(hVar, null);
                            if (!(pVar instanceof kd.a)) {
                                kotlin.jvm.internal.i.e(pVar, "<this>");
                                id.h hVar2 = this.f49139c;
                                if (hVar2 == id.i.f11071a) {
                                    cVar = new kd.h(this);
                                } else {
                                    cVar = new kd.c(this, hVar2);
                                }
                                kotlin.jvm.internal.s.a(2, pVar);
                                invoke = pVar.invoke(aVar, cVar);
                            } else {
                                kotlin.jvm.internal.s.a(2, pVar);
                                invoke = pVar.invoke(aVar, this);
                            }
                            ee.a.f(hVar, k10);
                            if (invoke != jd.a.f12959a) {
                                resumeWith(invoke);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            resumeWith(u7.a(th2));
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                kotlin.jvm.internal.i.e(pVar, "<this>");
                w7.g.b(w7.g.a(aVar, this, pVar)).resumeWith(gd.i.f9602a);
                return;
            }
            return;
        }
        i7.a(pVar, aVar, this);
    }

    @Override
    public final id.h c() {
        return this.f49139c;
    }

    @Override
    public final id.h getContext() {
        return this.f49139c;
    }

    @Override
    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a2 = gd.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        Object B = B(obj);
        if (B == e0.e) {
            return;
        }
        g(B);
    }

    @Override
    public final void w(androidx.car.app.j jVar) {
        e0.m(this.f49139c, jVar);
    }
}
