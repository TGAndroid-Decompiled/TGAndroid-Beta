package org.telegram.ui;

import android.content.DialogInterface;
public final class xf0 implements DialogInterface.OnDismissListener {
    public final int f39554a;
    public final bg0 f39555b;

    public xf0(bg0 bg0Var, int i10) {
        this.f39554a = i10;
        this.f39555b = bg0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39554a) {
            case 0:
                this.f39555b.f32436s0.finishFragment();
                return;
            default:
                this.f39555b.f32436s0.finishFragment();
                return;
        }
    }
}
