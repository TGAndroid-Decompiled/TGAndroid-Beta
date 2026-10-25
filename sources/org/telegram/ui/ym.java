package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ym extends qf.c {
    public final int d;
    public final org.telegram.ui.Cells.z e;
    public final Object f46082f;

    public ym(Object obj, org.telegram.ui.Cells.z zVar, int i10) {
        this.d = i10;
        this.f46082f = obj;
        this.e = zVar;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new uj(((fn) this.f46082f).f39420a, 4), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new uj(((fn) this.f46082f).f39420a, 5), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new uj(((fn) this.f46082f).f39420a, 6), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new uj(((fn) this.f46082f).f39420a, 7), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new uj(((fn) this.f46082f).f39420a, 8), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new uj(((fn) this.f46082f).f39420a, 9), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ed(19, this, (org.telegram.ui.Cells.v0) this.e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                fn fnVar = (fn) this.f46082f;
                un unVar = fnVar.f39420a;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.e;
                unVar.Sb = s1Var.getMessageObject().getId();
                un unVar2 = fnVar.f39420a;
                unVar2.Tb = 2;
                unVar2.Ub = null;
                s1Var.invalidate();
                return;
            case 1:
                fn fnVar2 = (fn) this.f46082f;
                un unVar3 = fnVar2.f39420a;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) this.e;
                unVar3.Sb = s1Var2.getMessageObject().getId();
                un unVar4 = fnVar2.f39420a;
                unVar4.Tb = 2;
                unVar4.Ub = null;
                s1Var2.invalidate();
                return;
            case 2:
                fn fnVar3 = (fn) this.f46082f;
                un unVar5 = fnVar3.f39420a;
                org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) this.e;
                unVar5.Sb = s1Var3.getMessageObject().getId();
                un unVar6 = fnVar3.f39420a;
                unVar6.Tb = 2;
                unVar6.Ub = null;
                s1Var3.invalidate();
                return;
            case 3:
                fn fnVar4 = (fn) this.f46082f;
                un unVar7 = fnVar4.f39420a;
                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) this.e;
                unVar7.Sb = s1Var4.getMessageObject().getId();
                un unVar8 = fnVar4.f39420a;
                unVar8.Tb = 2;
                unVar8.Ub = null;
                s1Var4.invalidate();
                return;
            case 4:
                fn fnVar5 = (fn) this.f46082f;
                un unVar9 = fnVar5.f39420a;
                org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) this.e;
                unVar9.Sb = s1Var5.getMessageObject().getId();
                un unVar10 = fnVar5.f39420a;
                unVar10.Tb = 2;
                unVar10.Ub = null;
                s1Var5.invalidate();
                return;
            case 5:
                fn fnVar6 = (fn) this.f46082f;
                un unVar11 = fnVar6.f39420a;
                org.telegram.ui.Cells.s1 s1Var6 = (org.telegram.ui.Cells.s1) this.e;
                unVar11.Sb = s1Var6.getMessageObject().getId();
                un unVar12 = fnVar6.f39420a;
                unVar12.Tb = 2;
                unVar12.Ub = null;
                s1Var6.invalidate();
                return;
            default:
                wl wlVar = (wl) this.f46082f;
                un unVar13 = wlVar.f45515a.Q;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                unVar13.Sb = v0Var.getMessageObject().getId();
                un unVar14 = wlVar.f45515a.Q;
                unVar14.Tb = 4;
                unVar14.Ub = null;
                v0Var.getMessageObject().flickerLoading = true;
                v0Var.invalidate();
                return;
        }
    }
}
