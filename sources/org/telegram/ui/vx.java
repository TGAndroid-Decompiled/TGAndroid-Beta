package org.telegram.ui;

import android.content.Context;
public final class vx implements Runnable {
    public final int f42834a;
    public final wx f42835b;

    public vx(wx wxVar, int i10) {
        this.f42834a = i10;
        this.f42835b = wxVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f42834a) {
            case 0:
                wx wxVar = this.f42835b;
                ey eyVar = wxVar.E0;
                Context context = wxVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                eyVar.showDialog(new sg.j0(3, i10, context, eyVar, null));
                return;
            default:
                ey eyVar2 = this.f42835b.E0;
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
