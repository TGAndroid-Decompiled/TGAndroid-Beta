package org.telegram.ui;

import android.content.DialogInterface;
public final class xf implements DialogInterface.OnDismissListener {
    public final int f44581a;
    public final tn f44582b;

    public xf(tn tnVar, int i10) {
        this.f44581a = i10;
        this.f44582b = tnVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44581a) {
            case 0:
                tn.B0(this.f44582b);
                return;
            case 1:
                this.f44582b.g8(false, true, 0.0f);
                return;
            case 2:
                this.f44582b.g8(false, true, 0.0f);
                return;
            case 3:
                this.f44582b.g8(false, true, 0.0f);
                return;
            case 4:
                this.f44582b.g8(false, true, 0.0f);
                return;
            case 5:
                this.f44582b.g8(false, true, 0.0f);
                return;
            case 6:
                this.f44582b.g8(false, true, 0.0f);
                return;
            case 7:
                this.f44582b.Cb = null;
                return;
            default:
                yj yjVar = this.f44582b.T1;
                if (yjVar != null) {
                    yjVar.c(false);
                    return;
                }
                return;
        }
    }
}
