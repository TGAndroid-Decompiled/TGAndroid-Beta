package org.telegram.ui;

import android.content.DialogInterface;
public final class qv implements DialogInterface.OnDismissListener {
    public final int f36945a;
    public final uy f36946b;

    public qv(uy uyVar, int i10) {
        this.f36945a = i10;
        this.f36946b = uyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36945a) {
            case 0:
                uy.j0(this.f36946b);
                return;
            case 1:
                uy uyVar = this.f36946b;
                if (uyVar.R3 != null) {
                    uyVar.getMessagesController().removeSuggestion(0L, uyVar.R3);
                    uyVar.R3 = null;
                    uyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f36946b.b4(true);
                return;
            default:
                this.f36946b.b4(true);
                return;
        }
    }
}
