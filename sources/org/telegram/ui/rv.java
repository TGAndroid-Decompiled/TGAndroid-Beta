package org.telegram.ui;

import android.content.DialogInterface;
public final class rv implements DialogInterface.OnDismissListener {
    public final int f37254a;
    public final uy f37255b;

    public rv(uy uyVar, int i10) {
        this.f37254a = i10;
        this.f37255b = uyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37254a) {
            case 0:
                uy.j0(this.f37255b);
                return;
            case 1:
                uy uyVar = this.f37255b;
                if (uyVar.R3 != null) {
                    uyVar.getMessagesController().removeSuggestion(0L, uyVar.R3);
                    uyVar.R3 = null;
                    uyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f37255b.b4(true);
                return;
            default:
                this.f37255b.b4(true);
                return;
        }
    }
}
