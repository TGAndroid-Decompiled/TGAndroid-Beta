package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ym extends ye.c {
    public final int d;
    public final org.telegram.ui.Cells.a0 f44907e;
    public final Object f44908f;

    public ym(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f44908f = obj;
        this.f44907e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rj(((fn) this.f44908f).f38212a, 2), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rj(((fn) this.f44908f).f38212a, 3), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rj(((fn) this.f44908f).f38212a, 4), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rj(((fn) this.f44908f).f38212a, 5), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rj(((fn) this.f44908f).f38212a, 6), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rj(((fn) this.f44908f).f38212a, 7), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new vf(14, this, (org.telegram.ui.Cells.v0) this.f44907e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                fn fnVar = (fn) this.f44908f;
                tn tnVar = fnVar.f38212a;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f44907e;
                tnVar.f42971sb = s1Var.getMessageObject().getId();
                tn tnVar2 = fnVar.f38212a;
                tnVar2.f42984tb = 2;
                tnVar2.f42997ub = null;
                s1Var.invalidate();
                return;
            case 1:
                fn fnVar2 = (fn) this.f44908f;
                tn tnVar3 = fnVar2.f38212a;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) this.f44907e;
                tnVar3.f42971sb = s1Var2.getMessageObject().getId();
                tn tnVar4 = fnVar2.f38212a;
                tnVar4.f42984tb = 2;
                tnVar4.f42997ub = null;
                s1Var2.invalidate();
                return;
            case 2:
                fn fnVar3 = (fn) this.f44908f;
                tn tnVar5 = fnVar3.f38212a;
                org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) this.f44907e;
                tnVar5.f42971sb = s1Var3.getMessageObject().getId();
                tn tnVar6 = fnVar3.f38212a;
                tnVar6.f42984tb = 2;
                tnVar6.f42997ub = null;
                s1Var3.invalidate();
                return;
            case 3:
                fn fnVar4 = (fn) this.f44908f;
                tn tnVar7 = fnVar4.f38212a;
                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) this.f44907e;
                tnVar7.f42971sb = s1Var4.getMessageObject().getId();
                tn tnVar8 = fnVar4.f38212a;
                tnVar8.f42984tb = 2;
                tnVar8.f42997ub = null;
                s1Var4.invalidate();
                return;
            case 4:
                fn fnVar5 = (fn) this.f44908f;
                tn tnVar9 = fnVar5.f38212a;
                org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) this.f44907e;
                tnVar9.f42971sb = s1Var5.getMessageObject().getId();
                tn tnVar10 = fnVar5.f38212a;
                tnVar10.f42984tb = 2;
                tnVar10.f42997ub = null;
                s1Var5.invalidate();
                return;
            case 5:
                fn fnVar6 = (fn) this.f44908f;
                tn tnVar11 = fnVar6.f38212a;
                org.telegram.ui.Cells.s1 s1Var6 = (org.telegram.ui.Cells.s1) this.f44907e;
                tnVar11.f42971sb = s1Var6.getMessageObject().getId();
                tn tnVar12 = fnVar6.f38212a;
                tnVar12.f42984tb = 2;
                tnVar12.f42997ub = null;
                s1Var6.invalidate();
                return;
            default:
                vl vlVar = (vl) this.f44908f;
                tn tnVar13 = vlVar.f43618a.M;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.f44907e;
                tnVar13.f42971sb = v0Var.getMessageObject().getId();
                tn tnVar14 = vlVar.f43618a.M;
                tnVar14.f42984tb = 4;
                tnVar14.f42997ub = null;
                v0Var.getMessageObject().flickerLoading = true;
                v0Var.invalidate();
                return;
        }
    }
}
