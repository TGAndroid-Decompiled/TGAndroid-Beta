package org.telegram.ui;

import android.content.DialogInterface;
public final class vf0 implements DialogInterface.OnDismissListener {
    public final int f42887a;
    public final zf0 f42888b;

    public vf0(zf0 zf0Var, int i10) {
        this.f42887a = i10;
        this.f42888b = zf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42887a) {
            case 0:
                this.f42888b.f44656s0.finishFragment();
                return;
            default:
                this.f42888b.f44656s0.finishFragment();
                return;
        }
    }
}
