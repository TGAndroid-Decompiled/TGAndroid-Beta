package org.telegram.ui;

import android.content.Context;
public final class wx implements Runnable {
    public final int f44394a;
    public final xx f44395b;

    public wx(xx xxVar, int i10) {
        this.f44394a = i10;
        this.f44395b = xxVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f44394a) {
            case 0:
                xx xxVar = this.f44395b;
                fy fyVar = xxVar.A0;
                Context context = xxVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                fyVar.showDialog(new cg.v0(3, i10, context, fyVar, null));
                return;
            default:
                fy fyVar2 = this.f44395b.A0;
                cx cxVar = fyVar2.I0;
                if (cxVar != null) {
                    cxVar.dismiss();
                    fyVar2.I0 = null;
                    return;
                }
                return;
        }
    }
}
