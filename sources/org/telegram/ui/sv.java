package org.telegram.ui;

import android.content.DialogInterface;
public final class sv implements DialogInterface.OnDismissListener {
    public final int f41994a;
    public final vy f41995b;

    public sv(vy vyVar, int i10) {
        this.f41994a = i10;
        this.f41995b = vyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41994a) {
            case 0:
                vy.h0(this.f41995b);
                return;
            case 1:
                vy vyVar = this.f41995b;
                if (vyVar.R3 != null) {
                    vyVar.getMessagesController().removeSuggestion(0L, vyVar.R3);
                    vyVar.R3 = null;
                    vyVar.I4();
                    return;
                }
                return;
            case 2:
                this.f41995b.Y3(true);
                return;
            default:
                this.f41995b.Y3(true);
                return;
        }
    }
}
