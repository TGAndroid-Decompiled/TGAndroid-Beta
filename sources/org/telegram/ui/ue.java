package org.telegram.ui;

import android.content.DialogInterface;
public final class ue implements DialogInterface.OnDismissListener {
    public final int f42501a;
    public final eo f42502b;

    public ue(eo eoVar, int i10) {
        this.f42501a = i10;
        this.f42502b = eoVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42501a) {
            case 0:
                mk mkVar = this.f42502b.X1;
                if (mkVar != null) {
                    mkVar.c(false);
                    return;
                }
                return;
            case 1:
                eo.a1(this.f42502b);
                return;
            case 2:
                this.f42502b.j8(false, true, 0.0f);
                return;
            case 3:
                this.f42502b.j8(false, true, 0.0f);
                return;
            case 4:
                this.f42502b.j8(false, true, 0.0f);
                return;
            case 5:
                this.f42502b.j8(false, true, 0.0f);
                return;
            case 6:
                this.f42502b.j8(false, true, 0.0f);
                return;
            case 7:
                this.f42502b.j8(false, true, 0.0f);
                return;
            default:
                this.f42502b.Gb = null;
                return;
        }
    }
}
