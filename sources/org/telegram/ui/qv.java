package org.telegram.ui;

import android.content.DialogInterface;
public final class qv implements DialogInterface.OnDismissListener {
    public final int f36943a;
    public final uy f36944b;

    public qv(uy uyVar, int i10) {
        this.f36943a = i10;
        this.f36944b = uyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36943a) {
            case 0:
                uy.j0(this.f36944b);
                return;
            case 1:
                uy uyVar = this.f36944b;
                if (uyVar.S3 != null) {
                    uyVar.getMessagesController().removeSuggestion(0L, uyVar.S3);
                    uyVar.S3 = null;
                    uyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f36944b.b4(true);
                return;
            default:
                this.f36944b.b4(true);
                return;
        }
    }
}
