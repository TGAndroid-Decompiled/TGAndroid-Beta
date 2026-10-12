package org.telegram.ui;

import android.content.DialogInterface;
public final class vv implements DialogInterface.OnDismissListener {
    public final int f41086a;
    public final yy f41087b;

    public vv(yy yyVar, int i10) {
        this.f41086a = i10;
        this.f41087b = yyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41086a) {
            case 0:
                yy.h0(this.f41087b);
                return;
            case 1:
                yy yyVar = this.f41087b;
                if (yyVar.R3 != null) {
                    yyVar.getMessagesController().removeSuggestion(0L, yyVar.R3);
                    yyVar.R3 = null;
                    yyVar.I4();
                    return;
                }
                return;
            case 2:
                this.f41087b.Y3(true);
                return;
            default:
                this.f41087b.Y3(true);
                return;
        }
    }
}
