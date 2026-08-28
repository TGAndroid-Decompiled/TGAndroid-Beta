package org.telegram.ui;

import android.content.DialogInterface;
public final class zf implements DialogInterface.OnDismissListener {
    public final int f45129a;
    public final qn f45130b;

    public zf(qn qnVar, int i9) {
        this.f45129a = i9;
        this.f45130b = qnVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45129a) {
            case 0:
                qn.A0(this.f45130b);
                return;
            case 1:
                this.f45130b.g8(false, true, 0.0f);
                return;
            case 2:
                this.f45130b.g8(false, true, 0.0f);
                return;
            case 3:
                this.f45130b.g8(false, true, 0.0f);
                return;
            case 4:
                this.f45130b.g8(false, true, 0.0f);
                return;
            case 5:
                this.f45130b.g8(false, true, 0.0f);
                return;
            case 6:
                this.f45130b.g8(false, true, 0.0f);
                return;
            case 7:
                this.f45130b.Cb = null;
                return;
            default:
                vj vjVar = this.f45130b.T1;
                if (vjVar != null) {
                    vjVar.c(false);
                    return;
                }
                return;
        }
    }
}
