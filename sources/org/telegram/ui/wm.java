package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class wm extends we.d {
    public final int d;

    public final org.telegram.ui.Cells.a0 f44145e;

    public final Object f44146f;

    public wm(Object obj, org.telegram.ui.Cells.a0 a0Var, int i10) {
        this.d = i10;
        this.f44146f = obj;
        this.f44145e = a0Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new qj(((dn) this.f44146f).f37446a, 2), 250L);
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new qj(((dn) this.f44146f).f37446a, 3), 250L);
                }
                break;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new qj(((dn) this.f44146f).f37446a, 4), 250L);
                }
                break;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new qj(((dn) this.f44146f).f37446a, 5), 250L);
                }
                break;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new qj(((dn) this.f44146f).f37446a, 6), 250L);
                }
                break;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new qj(((dn) this.f44146f).f37446a, 7), 250L);
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new rd(17, this, (org.telegram.ui.Cells.v0) this.f44145e), 250L);
                }
                break;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                dn dnVar = (dn) this.f44146f;
                rn rnVar = dnVar.f37446a;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f44145e;
                rnVar.f42211sb = s1Var.getMessageObject().getId();
                rn rnVar2 = dnVar.f37446a;
                rnVar2.f42224tb = 2;
                rnVar2.f42237ub = null;
                s1Var.invalidate();
                break;
            case 1:
                dn dnVar2 = (dn) this.f44146f;
                rn rnVar3 = dnVar2.f37446a;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) this.f44145e;
                rnVar3.f42211sb = s1Var2.getMessageObject().getId();
                rn rnVar4 = dnVar2.f37446a;
                rnVar4.f42224tb = 2;
                rnVar4.f42237ub = null;
                s1Var2.invalidate();
                break;
            case 2:
                dn dnVar3 = (dn) this.f44146f;
                rn rnVar5 = dnVar3.f37446a;
                org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) this.f44145e;
                rnVar5.f42211sb = s1Var3.getMessageObject().getId();
                rn rnVar6 = dnVar3.f37446a;
                rnVar6.f42224tb = 2;
                rnVar6.f42237ub = null;
                s1Var3.invalidate();
                break;
            case 3:
                dn dnVar4 = (dn) this.f44146f;
                rn rnVar7 = dnVar4.f37446a;
                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) this.f44145e;
                rnVar7.f42211sb = s1Var4.getMessageObject().getId();
                rn rnVar8 = dnVar4.f37446a;
                rnVar8.f42224tb = 2;
                rnVar8.f42237ub = null;
                s1Var4.invalidate();
                break;
            case 4:
                dn dnVar5 = (dn) this.f44146f;
                rn rnVar9 = dnVar5.f37446a;
                org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) this.f44145e;
                rnVar9.f42211sb = s1Var5.getMessageObject().getId();
                rn rnVar10 = dnVar5.f37446a;
                rnVar10.f42224tb = 2;
                rnVar10.f42237ub = null;
                s1Var5.invalidate();
                break;
            case 5:
                dn dnVar6 = (dn) this.f44146f;
                rn rnVar11 = dnVar6.f37446a;
                org.telegram.ui.Cells.s1 s1Var6 = (org.telegram.ui.Cells.s1) this.f44145e;
                rnVar11.f42211sb = s1Var6.getMessageObject().getId();
                rn rnVar12 = dnVar6.f37446a;
                rnVar12.f42224tb = 2;
                rnVar12.f42237ub = null;
                s1Var6.invalidate();
                break;
            default:
                ul ulVar = (ul) this.f44146f;
                rn rnVar13 = ulVar.f43247a.M;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.f44145e;
                rnVar13.f42211sb = v0Var.getMessageObject().getId();
                rn rnVar14 = ulVar.f43247a.M;
                rnVar14.f42224tb = 4;
                rnVar14.f42237ub = null;
                v0Var.getMessageObject().flickerLoading = true;
                v0Var.invalidate();
                break;
        }
    }
}
