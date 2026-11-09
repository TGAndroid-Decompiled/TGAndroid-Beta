package org.telegram.ui;

import android.content.Context;
public final class qw implements Runnable {
    public final int f49201a;
    public final rw f49202b;

    public qw(rw rwVar, int i7) {
        this.f49201a = i7;
        this.f49202b = rwVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f49201a) {
            case 0:
                rw rwVar = this.f49202b;
                yw ywVar = rwVar.f49616n0;
                Context context = rwVar.getContext();
                i7 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                ywVar.showDialog(new ug.i0(3, i7, context, ywVar, null));
                return;
            default:
                yw ywVar2 = this.f49202b.f49616n0;
                wv wvVar = ywVar2.M0;
                if (wvVar != null) {
                    wvVar.dismiss();
                    ywVar2.M0 = null;
                    return;
                }
                return;
        }
    }
}
