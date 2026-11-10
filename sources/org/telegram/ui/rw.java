package org.telegram.ui;

import android.content.Context;
public final class rw implements Runnable {
    public final int f49582a;
    public final sw f49583b;

    public rw(sw swVar, int i7) {
        this.f49582a = i7;
        this.f49583b = swVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f49582a) {
            case 0:
                sw swVar = this.f49583b;
                zw zwVar = swVar.f49970n0;
                Context context = swVar.getContext();
                i7 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                zwVar.showDialog(new ug.i0(3, i7, context, zwVar, null));
                return;
            default:
                zw zwVar2 = this.f49583b.f49970n0;
                xv xvVar = zwVar2.M0;
                if (xvVar != null) {
                    xvVar.dismiss();
                    zwVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
