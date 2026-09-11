package zd;
public final class g2 extends ee.s {
    public final ThreadLocal f51557e;
    private volatile boolean threadLocalIsSet;

    public g2(id.c r3, id.h r4) {
        throw new UnsupportedOperationException("Method not decompiled: zd.g2.<init>(id.c, id.h):void");
    }

    public final boolean M() {
        boolean z10;
        if (this.threadLocalIsSet && this.f51557e.get() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51557e.remove();
        return !z10;
    }

    public final void N(id.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f51557e.set(new gd.d(hVar, obj));
    }

    @Override
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            gd.d dVar = (gd.d) this.f51557e.get();
            if (dVar != null) {
                ee.a.f((id.h) dVar.f10580a, dVar.f10581b);
            }
            this.f51557e.remove();
        }
        Object r10 = e0.r(obj);
        id.c cVar = this.d;
        id.h context = cVar.getContext();
        g2 g2Var = null;
        Object k10 = ee.a.k(context, null);
        if (k10 != ee.a.f9064f) {
            g2Var = e0.v(cVar, context, k10);
        }
        try {
            this.d.resumeWith(r10);
            if (g2Var != null && !g2Var.M()) {
                return;
            }
            ee.a.f(context, k10);
        } catch (Throwable th2) {
            if (g2Var == null || g2Var.M()) {
                ee.a.f(context, k10);
            }
            throw th2;
        }
    }
}
