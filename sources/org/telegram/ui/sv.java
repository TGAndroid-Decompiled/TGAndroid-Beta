package org.telegram.ui;

import android.content.DialogInterface;
public final class sv implements DialogInterface.OnDismissListener {
    public final int f37555a;
    public final wy f37556b;

    public sv(wy wyVar, int i10) {
        this.f37555a = i10;
        this.f37556b = wyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37555a) {
            case 0:
                wy.j0(this.f37556b);
                return;
            case 1:
                wy wyVar = this.f37556b;
                if (wyVar.S3 != null) {
                    wyVar.getMessagesController().removeSuggestion(0L, wyVar.S3);
                    wyVar.S3 = null;
                    wyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f37556b.b4(true);
                return;
            default:
                this.f37556b.b4(true);
                return;
        }
    }
}
