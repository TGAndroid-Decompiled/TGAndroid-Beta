package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xm extends pf.c {
    public final int d;
    public final org.telegram.ui.Cells.a0 e;
    public final Object f43144f;

    public xm(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f43144f = obj;
        this.e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new vj(((en) this.f43144f).f36557a, 3), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new vj(((en) this.f43144f).f36557a, 4), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new vj(((en) this.f43144f).f36557a, 5), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new vj(((en) this.f43144f).f36557a, 6), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new vj(((en) this.f43144f).f36557a, 7), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new vj(((en) this.f43144f).f36557a, 8), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new gh(8, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                en enVar = (en) this.f43144f;
                sn snVar = enVar.f36557a;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.e;
                snVar.f41416wb = u1Var.getMessageObject().getId();
                sn snVar2 = enVar.f36557a;
                snVar2.f41430xb = 2;
                snVar2.f41443yb = null;
                u1Var.invalidate();
                return;
            case 1:
                en enVar2 = (en) this.f43144f;
                sn snVar3 = enVar2.f36557a;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.e;
                snVar3.f41416wb = u1Var2.getMessageObject().getId();
                sn snVar4 = enVar2.f36557a;
                snVar4.f41430xb = 2;
                snVar4.f41443yb = null;
                u1Var2.invalidate();
                return;
            case 2:
                en enVar3 = (en) this.f43144f;
                sn snVar5 = enVar3.f36557a;
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) this.e;
                snVar5.f41416wb = u1Var3.getMessageObject().getId();
                sn snVar6 = enVar3.f36557a;
                snVar6.f41430xb = 2;
                snVar6.f41443yb = null;
                u1Var3.invalidate();
                return;
            case 3:
                en enVar4 = (en) this.f43144f;
                sn snVar7 = enVar4.f36557a;
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) this.e;
                snVar7.f41416wb = u1Var4.getMessageObject().getId();
                sn snVar8 = enVar4.f36557a;
                snVar8.f41430xb = 2;
                snVar8.f41443yb = null;
                u1Var4.invalidate();
                return;
            case 4:
                en enVar5 = (en) this.f43144f;
                sn snVar9 = enVar5.f36557a;
                org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) this.e;
                snVar9.f41416wb = u1Var5.getMessageObject().getId();
                sn snVar10 = enVar5.f36557a;
                snVar10.f41430xb = 2;
                snVar10.f41443yb = null;
                u1Var5.invalidate();
                return;
            case 5:
                en enVar6 = (en) this.f43144f;
                sn snVar11 = enVar6.f36557a;
                org.telegram.ui.Cells.u1 u1Var6 = (org.telegram.ui.Cells.u1) this.e;
                snVar11.f41416wb = u1Var6.getMessageObject().getId();
                sn snVar12 = enVar6.f36557a;
                snVar12.f41430xb = 2;
                snVar12.f41443yb = null;
                u1Var6.invalidate();
                return;
            default:
                wl wlVar = (wl) this.f43144f;
                sn snVar13 = wlVar.f42877a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                snVar13.f41416wb = w0Var.getMessageObject().getId();
                sn snVar14 = wlVar.f42877a.Q;
                snVar14.f41430xb = 4;
                snVar14.f41443yb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
