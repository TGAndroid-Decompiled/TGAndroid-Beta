package wd;
public final class a2 extends be.q {
    public final ThreadLocal f57461e;
    private volatile boolean threadLocalIsSet;

    public a2(fd.c r3, fd.h r4) {
        throw new UnsupportedOperationException("Method not decompiled: wd.a2.<init>(fd.c, fd.h):void");
    }

    public final boolean T() {
        boolean z10;
        if (this.threadLocalIsSet && this.f57461e.get() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f57461e.remove();
        return !z10;
    }

    public final void U(fd.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f57461e.set(new dd.e(hVar, obj));
    }

    @Override
    public final void h(Object obj) {
        if (this.threadLocalIsSet) {
            dd.e eVar = (dd.e) this.f57461e.get();
            if (eVar != null) {
                be.a.g((fd.h) eVar.f8790a, eVar.f8791b);
            }
            this.f57461e.remove();
        }
        Object s6 = b0.s(obj);
        fd.c cVar = this.d;
        fd.h context = cVar.getContext();
        a2 a2Var = null;
        Object l10 = be.a.l(context, null);
        if (l10 != be.a.d) {
            a2Var = b0.x(cVar, context, l10);
        }
        try {
            this.d.resumeWith(s6);
            if (a2Var != null && !a2Var.T()) {
                return;
            }
            be.a.g(context, l10);
        } catch (Throwable th2) {
            if (a2Var == null || a2Var.T()) {
                be.a.g(context, l10);
            }
            throw th2;
        }
    }
}
