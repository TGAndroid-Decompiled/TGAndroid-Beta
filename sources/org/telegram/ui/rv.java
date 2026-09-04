package org.telegram.ui;

import android.content.DialogInterface;
public final class rv implements DialogInterface.OnDismissListener {
    public final int f40244a;
    public final uy f40245b;

    public rv(uy uyVar, int i10) {
        this.f40244a = i10;
        this.f40245b = uyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40244a) {
            case 0:
                uy.j0(this.f40245b);
                return;
            case 1:
                uy uyVar = this.f40245b;
                if (uyVar.S3 != null) {
                    uyVar.getMessagesController().removeSuggestion(0L, uyVar.S3);
                    uyVar.S3 = null;
                    uyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f40245b.b4(true);
                return;
            default:
                this.f40245b.b4(true);
                return;
        }
    }
}
