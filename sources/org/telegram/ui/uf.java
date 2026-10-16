package org.telegram.ui;

import android.content.DialogInterface;
public final class uf implements DialogInterface.OnShowListener {
    public final int f40386a;
    public final fo f40387b;

    public uf(fo foVar, int i10) {
        this.f40386a = i10;
        this.f40387b = foVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f40386a) {
            case 0:
                this.f40387b.Rb(false);
                return;
            default:
                this.f40387b.Rb(false);
                return;
        }
    }
}
