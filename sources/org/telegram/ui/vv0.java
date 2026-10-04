package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vv0 implements Runnable {
    public final int f41843a;
    public final gw0 f41844b;

    public vv0(gw0 gw0Var, int i10) {
        this.f41843a = i10;
        this.f41844b = gw0Var;
    }

    @Override
    public final void run() {
        switch (this.f41843a) {
            case 0:
                gw0 gw0Var = this.f41844b;
                AndroidUtilities.runOnUIThread(new vv0(gw0Var, 3));
                org.telegram.ui.Cells.u1 u1Var = gw0Var.L;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    org.telegram.ui.Cells.u1 u1Var2 = gw0Var.L;
                    u1Var2.L7 = null;
                    u1Var2.invalidate();
                }
                um umVar = gw0Var.f36749e0;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    gw0Var.f36749e0 = null;
                    return;
                }
                return;
            case 1:
                this.f41844b.c(false);
                return;
            case 2:
                this.f41844b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public vv0(gw0 gw0Var, boolean z10) {
        this.f41843a = 0;
        this.f41844b = gw0Var;
    }
}
