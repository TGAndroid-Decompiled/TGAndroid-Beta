package org.telegram.ui;

import android.content.Context;
public final class vx implements Runnable {
    public final int f42310a;
    public final wx f42311b;

    public vx(wx wxVar, int i10) {
        this.f42310a = i10;
        this.f42311b = wxVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f42310a) {
            case 0:
                wx wxVar = this.f42311b;
                ey eyVar = wxVar.E0;
                Context context = wxVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.n2) eyVar).currentAccount;
                eyVar.showDialog(new sg.j0(3, i10, context, eyVar, null));
                return;
            default:
                ey eyVar2 = this.f42311b.E0;
                ax axVar = eyVar2.M0;
                if (axVar != null) {
                    axVar.dismiss();
                    eyVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
