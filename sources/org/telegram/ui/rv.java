package org.telegram.ui;

import android.content.DialogInterface;
public final class rv implements DialogInterface.OnDismissListener {
    public final int f40271a;
    public final uy f40272b;

    public rv(uy uyVar, int i10) {
        this.f40271a = i10;
        this.f40272b = uyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40271a) {
            case 0:
                uy.j0(this.f40272b);
                return;
            case 1:
                uy uyVar = this.f40272b;
                if (uyVar.S3 != null) {
                    uyVar.getMessagesController().removeSuggestion(0L, uyVar.S3);
                    uyVar.S3 = null;
                    uyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f40272b.b4(true);
                return;
            default:
                this.f40272b.b4(true);
                return;
        }
    }
}
