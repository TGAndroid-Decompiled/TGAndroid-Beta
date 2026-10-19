package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vm extends pf.c {
    public final int d;
    public final org.telegram.ui.Cells.a0 e;
    public final Object f42273f;

    public vm(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f42273f = obj;
        this.e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((cn) this.f42273f).f36032a, 3), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((cn) this.f42273f).f36032a, 4), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((cn) this.f42273f).f36032a, 5), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((cn) this.f42273f).f36032a, 6), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((cn) this.f42273f).f36032a, 7), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((cn) this.f42273f).f36032a, 8), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new eh(8, this, (org.telegram.ui.Cells.w0) this.e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                cn cnVar = (cn) this.f42273f;
                qn qnVar = cnVar.f36032a;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.e;
                qnVar.f40900wb = u1Var.getMessageObject().getId();
                qn qnVar2 = cnVar.f36032a;
                qnVar2.f40914xb = 2;
                qnVar2.f40927yb = null;
                u1Var.invalidate();
                return;
            case 1:
                cn cnVar2 = (cn) this.f42273f;
                qn qnVar3 = cnVar2.f36032a;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.e;
                qnVar3.f40900wb = u1Var2.getMessageObject().getId();
                qn qnVar4 = cnVar2.f36032a;
                qnVar4.f40914xb = 2;
                qnVar4.f40927yb = null;
                u1Var2.invalidate();
                return;
            case 2:
                cn cnVar3 = (cn) this.f42273f;
                qn qnVar5 = cnVar3.f36032a;
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) this.e;
                qnVar5.f40900wb = u1Var3.getMessageObject().getId();
                qn qnVar6 = cnVar3.f36032a;
                qnVar6.f40914xb = 2;
                qnVar6.f40927yb = null;
                u1Var3.invalidate();
                return;
            case 3:
                cn cnVar4 = (cn) this.f42273f;
                qn qnVar7 = cnVar4.f36032a;
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) this.e;
                qnVar7.f40900wb = u1Var4.getMessageObject().getId();
                qn qnVar8 = cnVar4.f36032a;
                qnVar8.f40914xb = 2;
                qnVar8.f40927yb = null;
                u1Var4.invalidate();
                return;
            case 4:
                cn cnVar5 = (cn) this.f42273f;
                qn qnVar9 = cnVar5.f36032a;
                org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) this.e;
                qnVar9.f40900wb = u1Var5.getMessageObject().getId();
                qn qnVar10 = cnVar5.f36032a;
                qnVar10.f40914xb = 2;
                qnVar10.f40927yb = null;
                u1Var5.invalidate();
                return;
            case 5:
                cn cnVar6 = (cn) this.f42273f;
                qn qnVar11 = cnVar6.f36032a;
                org.telegram.ui.Cells.u1 u1Var6 = (org.telegram.ui.Cells.u1) this.e;
                qnVar11.f40900wb = u1Var6.getMessageObject().getId();
                qn qnVar12 = cnVar6.f36032a;
                qnVar12.f40914xb = 2;
                qnVar12.f40927yb = null;
                u1Var6.invalidate();
                return;
            default:
                ul ulVar = (ul) this.f42273f;
                qn qnVar13 = ulVar.f42006a.Q;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                qnVar13.f40900wb = w0Var.getMessageObject().getId();
                qn qnVar14 = ulVar.f42006a.Q;
                qnVar14.f40914xb = 4;
                qnVar14.f40927yb = null;
                w0Var.getMessageObject().flickerLoading = true;
                w0Var.invalidate();
                return;
        }
    }
}
