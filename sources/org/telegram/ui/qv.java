package org.telegram.ui;

import android.content.DialogInterface;
public final class qv implements DialogInterface.OnDismissListener {
    public final int f39890a;
    public final uy f39891b;

    public qv(uy uyVar, int i10) {
        this.f39890a = i10;
        this.f39891b = uyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39890a) {
            case 0:
                uy.i0(this.f39891b);
                return;
            case 1:
                uy uyVar = this.f39891b;
                if (uyVar.R3 != null) {
                    uyVar.getMessagesController().removeSuggestion(0L, uyVar.R3);
                    uyVar.R3 = null;
                    uyVar.U4();
                    return;
                }
                return;
            case 2:
                this.f39891b.k4(true);
                return;
            default:
                this.f39891b.k4(true);
                return;
        }
    }
}
