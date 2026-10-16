package org.telegram.ui;

import android.content.DialogInterface;
public final class vv implements DialogInterface.OnDismissListener {
    public final int f40767a;
    public final yy f40768b;

    public vv(yy yyVar, int i10) {
        this.f40767a = i10;
        this.f40768b = yyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40767a) {
            case 0:
                yy.Y(this.f40768b);
                return;
            case 1:
                yy yyVar = this.f40768b;
                if (yyVar.S3 != null) {
                    yyVar.getMessagesController().removeSuggestion(0L, yyVar.S3);
                    yyVar.S3 = null;
                    yyVar.J4();
                    return;
                }
                return;
            case 2:
                this.f40768b.Z3(true);
                return;
            default:
                this.f40768b.Z3(true);
                return;
        }
    }
}
