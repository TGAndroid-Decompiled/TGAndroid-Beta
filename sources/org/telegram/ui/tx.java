package org.telegram.ui;

import android.content.Context;
public final class tx implements Runnable {
    public final int f41764a;
    public final ux f41765b;

    public tx(ux uxVar, int i10) {
        this.f41764a = i10;
        this.f41765b = uxVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f41764a) {
            case 0:
                ux uxVar = this.f41765b;
                cy cyVar = uxVar.E0;
                Context context = uxVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                cyVar.showDialog(new sg.k0(3, i10, context, cyVar, null));
                return;
            default:
                cy cyVar2 = this.f41765b.E0;
                yw ywVar = cyVar2.M0;
                if (ywVar != null) {
                    ywVar.dismiss();
                    cyVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
