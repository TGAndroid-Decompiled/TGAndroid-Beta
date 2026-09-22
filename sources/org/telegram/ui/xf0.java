package org.telegram.ui;

import android.content.DialogInterface;
public final class xf0 implements DialogInterface.OnDismissListener {
    public final int f39578a;
    public final bg0 f39579b;

    public xf0(bg0 bg0Var, int i10) {
        this.f39578a = i10;
        this.f39579b = bg0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39578a) {
            case 0:
                this.f39579b.f32454s0.finishFragment();
                return;
            default:
                this.f39579b.f32454s0.finishFragment();
                return;
        }
    }
}
