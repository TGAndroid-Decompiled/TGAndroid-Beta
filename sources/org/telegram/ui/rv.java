package org.telegram.ui;

import android.content.DialogInterface;
public final class rv implements DialogInterface.OnDismissListener {
    public final int f37232a;
    public final uy f37233b;

    public rv(uy uyVar, int i10) {
        this.f37232a = i10;
        this.f37233b = uyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37232a) {
            case 0:
                uy.j0(this.f37233b);
                return;
            case 1:
                uy uyVar = this.f37233b;
                if (uyVar.R3 != null) {
                    uyVar.getMessagesController().removeSuggestion(0L, uyVar.R3);
                    uyVar.R3 = null;
                    uyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f37233b.b4(true);
                return;
            default:
                this.f37233b.b4(true);
                return;
        }
    }
}
