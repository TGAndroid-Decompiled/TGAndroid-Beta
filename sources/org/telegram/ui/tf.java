package org.telegram.ui;

import android.content.DialogInterface;
public final class tf implements DialogInterface.OnShowListener {
    public final int f42179a;
    public final eo f42180b;

    public tf(eo eoVar, int i10) {
        this.f42179a = i10;
        this.f42180b = eoVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f42179a) {
            case 0:
                this.f42180b.Rb(false);
                return;
            default:
                this.f42180b.Rb(false);
                return;
        }
    }
}
