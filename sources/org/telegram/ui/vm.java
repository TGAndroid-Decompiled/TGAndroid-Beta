package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vm extends ve.d {
    public final int d;
    public final org.telegram.ui.Cells.a0 f43514e;
    public final Object f43515f;

    public vm(Object obj, org.telegram.ui.Cells.a0 a0Var, int i9) {
        this.d = i9;
        this.f43515f = obj;
        this.f43514e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new oj(((cn) this.f43515f).f37236a, 2), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new oj(((cn) this.f43515f).f37236a, 3), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new oj(((cn) this.f43515f).f37236a, 4), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new oj(((cn) this.f43515f).f37236a, 5), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new oj(((cn) this.f43515f).f37236a, 6), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new oj(((cn) this.f43515f).f37236a, 7), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rd(17, this, (org.telegram.ui.Cells.w0) this.f43514e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                cn cnVar = (cn) this.f43515f;
                qn qnVar = cnVar.f37236a;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f43514e;
                qnVar.f42075sb = t1Var.getMessageObject().getId();
                qn qnVar2 = cnVar.f37236a;
                qnVar2.f42088tb = 2;
                qnVar2.f42101ub = null;
                t1Var.invalidate();
                return;
            case 1:
                cn cnVar2 = (cn) this.f43515f;
                qn qnVar3 = cnVar2.f37236a;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.f43514e;
                qnVar3.f42075sb = t1Var2.getMessageObject().getId();
                qn qnVar4 = cnVar2.f37236a;
                qnVar4.f42088tb = 2;
                qnVar4.f42101ub = null;
                t1Var2.invalidate();
                return;
            case 2:
                cn cnVar3 = (cn) this.f43515f;
                qn qnVar5 = cnVar3.f37236a;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.f43514e;
                qnVar5.f42075sb = t1Var3.getMessageObject().getId();
                qn qnVar6 = cnVar3.f37236a;
                qnVar6.f42088tb = 2;
                qnVar6.f42101ub = null;
                t1Var3.invalidate();
                return;
            case 3:
                cn cnVar4 = (cn) this.f43515f;
                qn qnVar7 = cnVar4.f37236a;
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) this.f43514e;
                qnVar7.f42075sb = t1Var4.getMessageObject().getId();
                qn qnVar8 = cnVar4.f37236a;
                qnVar8.f42088tb = 2;
                qnVar8.f42101ub = null;
                t1Var4.invalidate();
                return;
            case 4:
                cn cnVar5 = (cn) this.f43515f;
                qn qnVar9 = cnVar5.f37236a;
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) this.f43514e;
                qnVar9.f42075sb = t1Var5.getMessageObject().getId();
                qn qnVar10 = cnVar5.f37236a;
                qnVar10.f42088tb = 2;
                qnVar10.f42101ub = null;
                t1Var5.invalidate();
                return;
            case 5:
                cn cnVar6 = (cn) this.f43515f;
                qn qnVar11 = cnVar6.f37236a;
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) this.f43514e;
                qnVar11.f42075sb = t1Var6.getMessageObject().getId();
                qn qnVar12 = cnVar6.f37236a;
                qnVar12.f42088tb = 2;
                qnVar12.f42101ub = null;
                t1Var6.invalidate();
                return;
            default:
                tl tlVar = (tl) this.f43515f;
                qn qnVar13 = tlVar.f43027a.M;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.f43514e;
                qnVar13.f42075sb = w0Var.getMessageObject().getId();
                qn qnVar14 = tlVar.f43027a.M;
                qnVar14.f42088tb = 4;
                qnVar14.f42101ub = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
