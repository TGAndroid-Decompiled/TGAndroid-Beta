package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wm extends pf.c {
    public final int d;
    public final org.telegram.ui.Cells.z e;
    public final Object f43372f;

    public wm(Object obj, org.telegram.ui.Cells.z zVar, int i10) {
        this.d = i10;
        this.f43372f = obj;
        this.e = zVar;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((dn) this.f43372f).f36651a, 3), 250L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((dn) this.f43372f).f36651a, 4), 250L);
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((dn) this.f43372f).f36651a, 5), 250L);
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((dn) this.f43372f).f36651a, 6), 250L);
                    return;
                }
                return;
            case 4:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((dn) this.f43372f).f36651a, 7), 250L);
                    return;
                }
                return;
            case 5:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new tj(((dn) this.f43372f).f36651a, 8), 250L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new eh(8, this, (org.telegram.ui.Cells.v0) this.e), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                dn dnVar = (dn) this.f43372f;
                sn snVar = dnVar.f36651a;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                snVar.Jb = t1Var.getMessageObject().getId();
                sn snVar2 = dnVar.f36651a;
                snVar2.Kb = 2;
                snVar2.Lb = null;
                t1Var.invalidate();
                return;
            case 1:
                dn dnVar2 = (dn) this.f43372f;
                sn snVar3 = dnVar2.f36651a;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.e;
                snVar3.Jb = t1Var2.getMessageObject().getId();
                sn snVar4 = dnVar2.f36651a;
                snVar4.Kb = 2;
                snVar4.Lb = null;
                t1Var2.invalidate();
                return;
            case 2:
                dn dnVar3 = (dn) this.f43372f;
                sn snVar5 = dnVar3.f36651a;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.e;
                snVar5.Jb = t1Var3.getMessageObject().getId();
                sn snVar6 = dnVar3.f36651a;
                snVar6.Kb = 2;
                snVar6.Lb = null;
                t1Var3.invalidate();
                return;
            case 3:
                dn dnVar4 = (dn) this.f43372f;
                sn snVar7 = dnVar4.f36651a;
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) this.e;
                snVar7.Jb = t1Var4.getMessageObject().getId();
                sn snVar8 = dnVar4.f36651a;
                snVar8.Kb = 2;
                snVar8.Lb = null;
                t1Var4.invalidate();
                return;
            case 4:
                dn dnVar5 = (dn) this.f43372f;
                sn snVar9 = dnVar5.f36651a;
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) this.e;
                snVar9.Jb = t1Var5.getMessageObject().getId();
                sn snVar10 = dnVar5.f36651a;
                snVar10.Kb = 2;
                snVar10.Lb = null;
                t1Var5.invalidate();
                return;
            case 5:
                dn dnVar6 = (dn) this.f43372f;
                sn snVar11 = dnVar6.f36651a;
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) this.e;
                snVar11.Jb = t1Var6.getMessageObject().getId();
                sn snVar12 = dnVar6.f36651a;
                snVar12.Kb = 2;
                snVar12.Lb = null;
                t1Var6.invalidate();
                return;
            default:
                vl vlVar = (vl) this.f43372f;
                sn snVar13 = vlVar.f42759a.Q;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                snVar13.Jb = v0Var.getMessageObject().getId();
                sn snVar14 = vlVar.f42759a.Q;
                snVar14.Kb = 4;
                snVar14.Lb = null;
                v0Var.getMessageObject().flickerLoading = true;
                v0Var.invalidate();
                return;
        }
    }
}
