package org.telegram.ui;

import android.content.DialogInterface;
public final class qv implements DialogInterface.OnDismissListener {
    public final int f39824a;
    public final uy f39825b;

    public qv(uy uyVar, int i10) {
        this.f39824a = i10;
        this.f39825b = uyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39824a) {
            case 0:
                uy.i0(this.f39825b);
                return;
            case 1:
                uy uyVar = this.f39825b;
                if (uyVar.R3 != null) {
                    uyVar.getMessagesController().removeSuggestion(0L, uyVar.R3);
                    uyVar.R3 = null;
                    uyVar.U4();
                    return;
                }
                return;
            case 2:
                this.f39825b.k4(true);
                return;
            default:
                this.f39825b.k4(true);
                return;
        }
    }
}
