package zd;
public final class a2 extends ee.q {
    public final ThreadLocal f59943e;
    private volatile boolean threadLocalIsSet;

    public a2(id.c r3, id.h r4) {
        throw new UnsupportedOperationException("Method not decompiled: zd.a2.<init>(id.c, id.h):void");
    }

    public final boolean T() {
        boolean z9;
        if (this.threadLocalIsSet && this.f59943e.get() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f59943e.remove();
        return !z9;
    }

    public final void U(id.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f59943e.set(new gd.e(hVar, obj));
    }

    @Override
    public final void h(Object obj) {
        if (this.threadLocalIsSet) {
            gd.e eVar = (gd.e) this.f59943e.get();
            if (eVar != null) {
                ee.a.g((id.h) eVar.f13818a, eVar.f13819b);
            }
            this.f59943e.remove();
        }
        Object s5 = b0.s(obj);
        id.c cVar = this.d;
        id.h context = cVar.getContext();
        a2 a2Var = null;
        Object l10 = ee.a.l(context, null);
        if (l10 != ee.a.d) {
            a2Var = b0.x(cVar, context, l10);
        }
        try {
            this.d.resumeWith(s5);
            if (a2Var != null && !a2Var.T()) {
                return;
            }
            ee.a.g(context, l10);
        } catch (Throwable th2) {
            if (a2Var == null || a2Var.T()) {
                ee.a.g(context, l10);
            }
            throw th2;
        }
    }
}
