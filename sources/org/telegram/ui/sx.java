package org.telegram.ui;

import android.content.Context;
public final class sx implements Runnable {
    public final int f43614a;
    public final tx f43615b;

    public sx(tx txVar, int i10) {
        this.f43614a = i10;
        this.f43615b = txVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f43614a) {
            case 0:
                tx txVar = this.f43615b;
                cy cyVar = txVar.f43930t0;
                Context context = txVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                cyVar.showDialog(new tg.j0(3, i10, context, cyVar, null));
                return;
            default:
                cy cyVar2 = this.f43615b.f43930t0;
                vw vwVar = cyVar2.M0;
                if (vwVar != null) {
                    vwVar.dismiss();
                    cyVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
