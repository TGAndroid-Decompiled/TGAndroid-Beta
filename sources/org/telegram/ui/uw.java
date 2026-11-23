package org.telegram.ui;

import android.content.Context;
public final class uw implements Runnable {
    public final int f52646a;
    public final vw f52647b;

    public uw(vw vwVar, int i7) {
        this.f52646a = i7;
        this.f52647b = vwVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f52646a) {
            case 0:
                vw vwVar = this.f52647b;
                cx cxVar = vwVar.f52874o0;
                Context context = vwVar.getContext();
                i7 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                cxVar.showDialog(new ug.k0(3, i7, context, cxVar, null));
                return;
            default:
                cx cxVar2 = this.f52647b.f52874o0;
                zv zvVar = cxVar2.N0;
                if (zvVar != null) {
                    zvVar.dismiss();
                    cxVar2.N0 = null;
                    return;
                }
                return;
        }
    }
}
