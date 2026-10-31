package org.telegram.ui;
public final class xj extends ci.o {
    public Runnable W;
    public final un X;

    public xj(un unVar, un unVar2, vj vjVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(unVar2, vjVar, p6Var);
        this.X = unVar;
    }

    @Override
    public final void F() {
        un unVar = this.X;
        if (unVar.f42188aa == -1) {
            unVar.f42188aa = unVar.getNotificationCenter().q(un.f42175gd, unVar.f42188aa, false);
        }
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.W = null;
        }
        wj wjVar = new wj(this, 0);
        this.W = wjVar;
        org.telegram.messenger.i0.g3(wjVar);
    }

    @Override
    public final void W() {
        un unVar = this.X;
        unVar.f42188aa = unVar.getNotificationCenter().q(un.f42175gd, unVar.f42188aa, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.v2.f18448a) {
            org.telegram.messenger.f8.b("chatItemAnimator disable notifications");
        }
        mg.c2 c2Var = unVar.Z.getAdjustPanLayoutHelper().h;
        org.telegram.messenger.i0.r(c2Var);
        c2Var.run();
        org.telegram.ui.Components.ee eeVar = unVar.Z.Y3;
        org.telegram.messenger.i0.r(eeVar);
        eeVar.run();
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
        }
        wj wjVar = new wj(this, 1);
        this.W = wjVar;
        org.telegram.messenger.i0.g3(wjVar);
    }
}
