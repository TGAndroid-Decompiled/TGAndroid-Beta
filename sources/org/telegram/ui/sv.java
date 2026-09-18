package org.telegram.ui;

import android.content.DialogInterface;
public final class sv implements DialogInterface.OnDismissListener {
    public final int f37560a;
    public final wy f37561b;

    public sv(wy wyVar, int i10) {
        this.f37560a = i10;
        this.f37561b = wyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37560a) {
            case 0:
                wy.j0(this.f37561b);
                return;
            case 1:
                wy wyVar = this.f37561b;
                if (wyVar.R3 != null) {
                    wyVar.getMessagesController().removeSuggestion(0L, wyVar.R3);
                    wyVar.R3 = null;
                    wyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f37561b.b4(true);
                return;
            default:
                this.f37561b.b4(true);
                return;
        }
    }
}
