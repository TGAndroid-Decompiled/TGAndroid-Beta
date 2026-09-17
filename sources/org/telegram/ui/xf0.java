package org.telegram.ui;

import android.content.DialogInterface;
public final class xf0 implements DialogInterface.OnDismissListener {
    public final int f39608a;
    public final bg0 f39609b;

    public xf0(bg0 bg0Var, int i10) {
        this.f39608a = i10;
        this.f39609b = bg0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39608a) {
            case 0:
                this.f39609b.f32153s0.finishFragment();
                return;
            default:
                this.f39609b.f32153s0.finishFragment();
                return;
        }
    }
}
