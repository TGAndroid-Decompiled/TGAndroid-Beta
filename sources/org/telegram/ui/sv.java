package org.telegram.ui;

import android.content.DialogInterface;
public final class sv implements DialogInterface.OnDismissListener {
    public final int f41990a;
    public final vy f41991b;

    public sv(vy vyVar, int i10) {
        this.f41990a = i10;
        this.f41991b = vyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41990a) {
            case 0:
                vy.h0(this.f41991b);
                return;
            case 1:
                vy vyVar = this.f41991b;
                if (vyVar.R3 != null) {
                    vyVar.getMessagesController().removeSuggestion(0L, vyVar.R3);
                    vyVar.R3 = null;
                    vyVar.I4();
                    return;
                }
                return;
            case 2:
                this.f41991b.Y3(true);
                return;
            default:
                this.f41991b.Y3(true);
                return;
        }
    }
}
