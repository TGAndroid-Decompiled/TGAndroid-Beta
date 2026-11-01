package td;

import v7.w6;
import w7.w9;
public abstract class a extends u1 implements cd.c, c0 {
    public final cd.h f48608c;

    public a(cd.h hVar, boolean z10) {
        super(z10);
        x((f1) hVar.get(b0.f48612b));
        this.f48608c = hVar.plus(this);
    }

    @Override
    public final void F(Object obj) {
        if (obj instanceof v) {
            v.f48681b.get((v) obj);
        }
    }

    public final void L(d0 d0Var, a aVar, ld.p pVar) {
        Object invoke;
        Object cVar;
        int ordinal = d0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            cd.h hVar = this.f48608c;
                            Object k10 = yd.a.k(hVar, null);
                            if (!(pVar instanceof ed.a)) {
                                kotlin.jvm.internal.i.e(pVar, "<this>");
                                cd.h hVar2 = this.f48608c;
                                if (hVar2 == cd.i.f4123a) {
                                    cVar = new ed.h(this);
                                } else {
                                    cVar = new ed.c(this, hVar2);
                                }
                                kotlin.jvm.internal.s.a(2, pVar);
                                invoke = pVar.invoke(aVar, cVar);
                            } else {
                                kotlin.jvm.internal.s.a(2, pVar);
                                invoke = pVar.invoke(aVar, this);
                            }
                            yd.a.f(hVar, k10);
                            if (invoke != dd.a.f5864a) {
                                resumeWith(invoke);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            resumeWith(l9.b.a(th2));
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                kotlin.jvm.internal.i.e(pVar, "<this>");
                w6.b(w6.a(aVar, this, pVar)).resumeWith(ad.j.f401a);
                return;
            }
            return;
        }
        w9.a(pVar, aVar, this);
    }

    @Override
    public final cd.h c() {
        return this.f48608c;
    }

    @Override
    public final cd.h getContext() {
        return this.f48608c;
    }

    @Override
    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a2 = ad.g.a(obj);
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
    public final void w(ad.d dVar) {
        e0.m(this.f48608c, dVar);
    }
}
