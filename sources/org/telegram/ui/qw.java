package org.telegram.ui;

import android.content.Context;
public final class qw implements Runnable {
    public final int f50796a;
    public final rw f50797b;

    public qw(rw rwVar, int i7) {
        this.f50796a = i7;
        this.f50797b = rwVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f50796a) {
            case 0:
                rw rwVar = this.f50797b;
                yw ywVar = rwVar.f51038o0;
                Context context = rwVar.getContext();
                i7 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                ywVar.showDialog(new ug.j0(3, i7, context, ywVar, null));
                return;
            default:
                yw ywVar2 = this.f50797b.f51038o0;
                wv wvVar = ywVar2.N0;
                if (wvVar != null) {
                    wvVar.dismiss();
                    ywVar2.N0 = null;
                    return;
                }
                return;
        }
    }
}
