package org.telegram.ui;

import android.content.DialogInterface;
public final class zc0 implements DialogInterface.OnDismissListener {
    public final int f52653a;
    public final dd0 f52654b;

    public zc0(dd0 dd0Var, int i3) {
        this.f52653a = i3;
        this.f52654b = dd0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52653a) {
            case 0:
                this.f52654b.f44663v0.finishFragment();
                return;
            default:
                this.f52654b.f44663v0.finishFragment();
                return;
        }
    }
}
