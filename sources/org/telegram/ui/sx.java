package org.telegram.ui;

import android.content.Context;
public final class sx implements Runnable {
    public final int f41662a;
    public final tx f41663b;

    public sx(tx txVar, int i10) {
        this.f41662a = i10;
        this.f41663b = txVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f41662a) {
            case 0:
                tx txVar = this.f41663b;
                ay ayVar = txVar.f41967n0;
                Context context = txVar.getContext();
                i10 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                ayVar.showDialog(new kg.q0(3, i10, context, ayVar, null));
                return;
            default:
                ay ayVar2 = this.f41663b.f41967n0;
                zw zwVar = ayVar2.M0;
                if (zwVar != null) {
                    zwVar.dismiss();
                    ayVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
