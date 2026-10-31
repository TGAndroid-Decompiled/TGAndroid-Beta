package td;
public final class h2 extends yd.s {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    public h2(cd.c r3, cd.h r4) {
        throw new UnsupportedOperationException("Method not decompiled: td.h2.<init>(cd.c, cd.h):void");
    }

    public final boolean M() {
        boolean z10;
        if (this.threadLocalIsSet && this.e.get() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e.remove();
        return !z10;
    }

    public final void N(cd.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new ad.e(hVar, obj));
    }

    @Override
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            ad.e eVar = (ad.e) this.e.get();
            if (eVar != null) {
                yd.a.f((cd.h) eVar.f393a, eVar.f394b);
            }
            this.e.remove();
        }
        Object r10 = e0.r(obj);
        cd.c cVar = this.d;
        cd.h context = cVar.getContext();
        h2 h2Var = null;
        Object k10 = yd.a.k(context, null);
        if (k10 != yd.a.f54394f) {
            h2Var = e0.v(cVar, context, k10);
        }
        try {
            this.d.resumeWith(r10);
            if (h2Var != null && !h2Var.M()) {
                return;
            }
            yd.a.f(context, k10);
        } catch (Throwable th2) {
            if (h2Var == null || h2Var.M()) {
                yd.a.f(context, k10);
            }
            throw th2;
        }
    }
}
