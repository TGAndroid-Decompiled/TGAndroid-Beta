package org.telegram.ui;

import android.content.DialogInterface;
public final class we implements DialogInterface.OnDismissListener {
    public final int f41255a;
    public final fo f41256b;

    public we(fo foVar, int i10) {
        this.f41255a = i10;
        this.f41256b = foVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41255a) {
            case 0:
                mk mkVar = this.f41256b.X1;
                if (mkVar != null) {
                    mkVar.c(false);
                    return;
                }
                return;
            case 1:
                fo.a1(this.f41256b);
                return;
            case 2:
                this.f41256b.j8(false, true, 0.0f);
                return;
            case 3:
                this.f41256b.j8(false, true, 0.0f);
                return;
            case 4:
                this.f41256b.j8(false, true, 0.0f);
                return;
            case 5:
                this.f41256b.j8(false, true, 0.0f);
                return;
            case 6:
                this.f41256b.j8(false, true, 0.0f);
                return;
            case 7:
                this.f41256b.j8(false, true, 0.0f);
                return;
            default:
                this.f41256b.Gb = null;
                return;
        }
    }
}
