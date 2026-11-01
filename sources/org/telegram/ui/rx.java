package org.telegram.ui;

import android.content.Context;
public final class rx implements Runnable {
    public final int f41167a;
    public final sx f41168b;

    public rx(sx sxVar, int i10) {
        this.f41167a = i10;
        this.f41168b = sxVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f41167a) {
            case 0:
                sx sxVar = this.f41168b;
                zx zxVar = sxVar.f41487n0;
                Context context = sxVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                zxVar.showDialog(new kg.q0(3, i10, context, zxVar, null));
                return;
            default:
                zx zxVar2 = this.f41168b.f41487n0;
                yw ywVar = zxVar2.M0;
                if (ywVar != null) {
                    ywVar.dismiss();
                    zxVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
