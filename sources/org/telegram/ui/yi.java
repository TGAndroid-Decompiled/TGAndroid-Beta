package org.telegram.ui;
public final class yi extends ni.l {
    public Runnable W;
    public final wm X;

    public yi(wm wmVar, wm wmVar2, wi wiVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(wmVar2, wiVar, e6Var);
        this.X = wmVar;
    }

    @Override
    public final void F() {
        wm wmVar = this.X;
        if (wmVar.f51261ba == -1) {
            wmVar.f51261ba = wmVar.getNotificationCenter().q(wm.f51233pd, wmVar.f51261ba, false);
        }
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        xi xiVar = new xi(this, 1);
        this.W = xiVar;
        org.telegram.messenger.g0.h3(xiVar);
    }

    @Override
    public final void W() {
        wm wmVar = this.X;
        wmVar.f51261ba = wmVar.getNotificationCenter().q(wm.f51233pd, wmVar.f51261ba, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.r2.f25040a) {
            org.telegram.messenger.a8.b("chatItemAnimator disable notifications");
        }
        mi.b0 b0Var = wmVar.f51237a0.getAdjustPanLayoutHelper().h;
        org.telegram.messenger.g0.r(b0Var);
        b0Var.run();
        org.telegram.ui.Components.he heVar = wmVar.f51237a0.Z3;
        org.telegram.messenger.g0.r(heVar);
        heVar.run();
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        xi xiVar = new xi(this, 0);
        this.W = xiVar;
        org.telegram.messenger.g0.h3(xiVar);
    }
}
