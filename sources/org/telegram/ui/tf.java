package org.telegram.ui;

import android.content.DialogInterface;
public final class tf implements DialogInterface.OnShowListener {
    public final int f42181a;
    public final eo f42182b;

    public tf(eo eoVar, int i10) {
        this.f42181a = i10;
        this.f42182b = eoVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f42181a) {
            case 0:
                this.f42182b.Rb(false);
                return;
            default:
                this.f42182b.Rb(false);
                return;
        }
    }
}
