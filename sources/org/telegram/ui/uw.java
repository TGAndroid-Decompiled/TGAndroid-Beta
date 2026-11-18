package org.telegram.ui;

import android.content.Context;
public final class uw implements Runnable {
    public final int f52621a;
    public final vw f52622b;

    public uw(vw vwVar, int i7) {
        this.f52621a = i7;
        this.f52622b = vwVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f52621a) {
            case 0:
                vw vwVar = this.f52622b;
                cx cxVar = vwVar.f52861o0;
                Context context = vwVar.getContext();
                i7 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                cxVar.showDialog(new ug.l0(3, i7, context, cxVar, null));
                return;
            default:
                cx cxVar2 = this.f52622b.f52861o0;
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
