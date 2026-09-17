package org.telegram.ui;

import android.content.DialogInterface;
public final class rv implements DialogInterface.OnDismissListener {
    public final int f40272a;
    public final uy f40273b;

    public rv(uy uyVar, int i10) {
        this.f40272a = i10;
        this.f40273b = uyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40272a) {
            case 0:
                uy.j0(this.f40273b);
                return;
            case 1:
                uy uyVar = this.f40273b;
                if (uyVar.S3 != null) {
                    uyVar.getMessagesController().removeSuggestion(0L, uyVar.S3);
                    uyVar.S3 = null;
                    uyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f40273b.b4(true);
                return;
            default:
                this.f40273b.b4(true);
                return;
        }
    }
}
