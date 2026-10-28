package org.telegram.ui;

import android.content.Context;
public final class vx implements Runnable {
    public final int f44435a;
    public final wx f44436b;

    public vx(wx wxVar, int i10) {
        this.f44435a = i10;
        this.f44436b = wxVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f44435a) {
            case 0:
                wx wxVar = this.f44436b;
                ey eyVar = wxVar.f45420t0;
                Context context = wxVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                eyVar.showDialog(new tg.j0(3, i10, context, eyVar, null));
                return;
            default:
                ey eyVar2 = this.f44436b.f45420t0;
                xw xwVar = eyVar2.M0;
                if (xwVar != null) {
                    xwVar.dismiss();
                    eyVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
