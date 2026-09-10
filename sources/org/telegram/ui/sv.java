package org.telegram.ui;

import android.content.DialogInterface;
public final class sv implements DialogInterface.OnDismissListener {
    public final int f36764a;
    public final wy f36765b;

    public sv(wy wyVar, int i10) {
        this.f36764a = i10;
        this.f36765b = wyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36764a) {
            case 0:
                wy.j0(this.f36765b);
                return;
            case 1:
                wy wyVar = this.f36765b;
                if (wyVar.S3 != null) {
                    wyVar.getMessagesController().removeSuggestion(0L, wyVar.S3);
                    wyVar.S3 = null;
                    wyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f36765b.b4(true);
                return;
            default:
                this.f36765b.b4(true);
                return;
        }
    }
}
