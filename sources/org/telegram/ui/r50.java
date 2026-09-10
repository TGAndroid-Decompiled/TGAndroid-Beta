package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class r50 implements Runnable {
    public final int f36232a;
    public final s50 f36233b;

    public r50(s50 s50Var, int i10) {
        this.f36232a = i10;
        this.f36233b = s50Var;
    }

    @Override
    public final void run() {
        switch (this.f36232a) {
            case 0:
                s50 s50Var = this.f36233b;
                t50 t50Var = s50Var.f36551b;
                if (t50Var != null) {
                    t50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new r50(s50Var, 2), 16L);
                return;
            case 1:
                t50 t50Var2 = this.f36233b.f36551b;
                if (t50Var2 != null) {
                    t50Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
