package org.telegram.ui;

import android.content.DialogInterface;
public final class we implements DialogInterface.OnDismissListener {
    public final int f40940a;
    public final fo f40941b;

    public we(fo foVar, int i10) {
        this.f40940a = i10;
        this.f40941b = foVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40940a) {
            case 0:
                mk mkVar = this.f40941b.X1;
                if (mkVar != null) {
                    mkVar.c(false);
                    return;
                }
                return;
            case 1:
                fo.a1(this.f40941b);
                return;
            case 2:
                this.f40941b.j8(false, true, 0.0f);
                return;
            case 3:
                this.f40941b.j8(false, true, 0.0f);
                return;
            case 4:
                this.f40941b.j8(false, true, 0.0f);
                return;
            case 5:
                this.f40941b.j8(false, true, 0.0f);
                return;
            case 6:
                this.f40941b.j8(false, true, 0.0f);
                return;
            case 7:
                this.f40941b.j8(false, true, 0.0f);
                return;
            default:
                this.f40941b.Gb = null;
                return;
        }
    }
}
