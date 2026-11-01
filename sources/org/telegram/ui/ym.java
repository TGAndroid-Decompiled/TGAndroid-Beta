package org.telegram.ui;
public final class ym extends gf.e {
    public final int d;
    public final org.telegram.ui.Cells.z e;
    public final Object f43684f;

    public ym(Object obj, org.telegram.ui.Cells.z zVar, int i10) {
        this.d = i10;
        this.f43684f = obj;
        this.e = zVar;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f43684f).f37191a, 2), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f43684f).f37191a, 3), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f43684f).f37191a, 4), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f43684f).f37191a, 5), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f43684f).f37191a, 6), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f43684f).f37191a, 7), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new ch(10, this, (org.telegram.ui.Cells.s0) this.e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                fn fnVar = (fn) this.f43684f;
                un unVar = fnVar.f37191a;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.e;
                unVar.Sb = q1Var.getMessageObject().f1();
                un unVar2 = fnVar.f37191a;
                unVar2.Tb = 2;
                unVar2.Ub = null;
                q1Var.invalidate();
                return;
            case 1:
                fn fnVar2 = (fn) this.f43684f;
                un unVar3 = fnVar2.f37191a;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.e;
                unVar3.Sb = q1Var2.getMessageObject().f1();
                un unVar4 = fnVar2.f37191a;
                unVar4.Tb = 2;
                unVar4.Ub = null;
                q1Var2.invalidate();
                return;
            case 2:
                fn fnVar3 = (fn) this.f43684f;
                un unVar5 = fnVar3.f37191a;
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) this.e;
                unVar5.Sb = q1Var3.getMessageObject().f1();
                un unVar6 = fnVar3.f37191a;
                unVar6.Tb = 2;
                unVar6.Ub = null;
                q1Var3.invalidate();
                return;
            case 3:
                fn fnVar4 = (fn) this.f43684f;
                un unVar7 = fnVar4.f37191a;
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) this.e;
                unVar7.Sb = q1Var4.getMessageObject().f1();
                un unVar8 = fnVar4.f37191a;
                unVar8.Tb = 2;
                unVar8.Ub = null;
                q1Var4.invalidate();
                return;
            case 4:
                fn fnVar5 = (fn) this.f43684f;
                un unVar9 = fnVar5.f37191a;
                org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) this.e;
                unVar9.Sb = q1Var5.getMessageObject().f1();
                un unVar10 = fnVar5.f37191a;
                unVar10.Tb = 2;
                unVar10.Ub = null;
                q1Var5.invalidate();
                return;
            case 5:
                fn fnVar6 = (fn) this.f43684f;
                un unVar11 = fnVar6.f37191a;
                org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) this.e;
                unVar11.Sb = q1Var6.getMessageObject().f1();
                un unVar12 = fnVar6.f37191a;
                unVar12.Tb = 2;
                unVar12.Ub = null;
                q1Var6.invalidate();
                return;
            default:
                am amVar = (am) this.f43684f;
                un unVar13 = amVar.f35805a.Q;
                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) this.e;
                unVar13.Sb = s0Var.getMessageObject().f1();
                un unVar14 = amVar.f35805a.Q;
                unVar14.Tb = 4;
                unVar14.Ub = null;
                s0Var.getMessageObject().f16716r = true;
                s0Var.invalidate();
                return;
        }
    }
}
