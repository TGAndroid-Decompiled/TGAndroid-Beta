package org.telegram.ui;
public final class ym extends gf.e {
    public final int d;
    public final org.telegram.ui.Cells.z e;
    public final Object f43861f;

    public ym(Object obj, org.telegram.ui.Cells.z zVar, int i10) {
        this.d = i10;
        this.f43861f = obj;
        this.e = zVar;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f43861f).f37301a, 3), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f43861f).f37301a, 4), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f43861f).f37301a, 5), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f43861f).f37301a, 6), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f43861f).f37301a, 7), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.f43861f).f37301a, 8), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zg(10, this, (org.telegram.ui.Cells.s0) this.e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                fn fnVar = (fn) this.f43861f;
                un unVar = fnVar.f37301a;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.e;
                unVar.Rb = q1Var.getMessageObject().f1();
                un unVar2 = fnVar.f37301a;
                unVar2.Sb = 2;
                unVar2.Tb = null;
                q1Var.invalidate();
                return;
            case 1:
                fn fnVar2 = (fn) this.f43861f;
                un unVar3 = fnVar2.f37301a;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.e;
                unVar3.Rb = q1Var2.getMessageObject().f1();
                un unVar4 = fnVar2.f37301a;
                unVar4.Sb = 2;
                unVar4.Tb = null;
                q1Var2.invalidate();
                return;
            case 2:
                fn fnVar3 = (fn) this.f43861f;
                un unVar5 = fnVar3.f37301a;
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) this.e;
                unVar5.Rb = q1Var3.getMessageObject().f1();
                un unVar6 = fnVar3.f37301a;
                unVar6.Sb = 2;
                unVar6.Tb = null;
                q1Var3.invalidate();
                return;
            case 3:
                fn fnVar4 = (fn) this.f43861f;
                un unVar7 = fnVar4.f37301a;
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) this.e;
                unVar7.Rb = q1Var4.getMessageObject().f1();
                un unVar8 = fnVar4.f37301a;
                unVar8.Sb = 2;
                unVar8.Tb = null;
                q1Var4.invalidate();
                return;
            case 4:
                fn fnVar5 = (fn) this.f43861f;
                un unVar9 = fnVar5.f37301a;
                org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) this.e;
                unVar9.Rb = q1Var5.getMessageObject().f1();
                un unVar10 = fnVar5.f37301a;
                unVar10.Sb = 2;
                unVar10.Tb = null;
                q1Var5.invalidate();
                return;
            case 5:
                fn fnVar6 = (fn) this.f43861f;
                un unVar11 = fnVar6.f37301a;
                org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) this.e;
                unVar11.Rb = q1Var6.getMessageObject().f1();
                un unVar12 = fnVar6.f37301a;
                unVar12.Sb = 2;
                unVar12.Tb = null;
                q1Var6.invalidate();
                return;
            default:
                am amVar = (am) this.f43861f;
                un unVar13 = amVar.f35671a.Q;
                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) this.e;
                unVar13.Rb = s0Var.getMessageObject().f1();
                un unVar14 = amVar.f35671a.Q;
                unVar14.Sb = 4;
                unVar14.Tb = null;
                s0Var.getMessageObject().f16363r = true;
                s0Var.invalidate();
                return;
        }
    }
}
