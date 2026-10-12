package org.telegram.ui;

import android.content.DialogInterface;
public final class uf implements DialogInterface.OnShowListener {
    public final int f40667a;
    public final fo f40668b;

    public uf(fo foVar, int i10) {
        this.f40667a = i10;
        this.f40668b = foVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f40667a) {
            case 0:
                this.f40668b.Rb(false);
                return;
            default:
                this.f40668b.Rb(false);
                return;
        }
    }
}
