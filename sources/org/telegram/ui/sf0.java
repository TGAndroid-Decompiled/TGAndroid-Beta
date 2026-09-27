package org.telegram.ui;

import android.content.DialogInterface;
public final class sf0 implements DialogInterface.OnDismissListener {
    public final int f37423a;
    public final wf0 f37424b;

    public sf0(wf0 wf0Var, int i10) {
        this.f37423a = i10;
        this.f37424b = wf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37423a) {
            case 0:
                this.f37424b.f39282s0.finishFragment();
                return;
            default:
                this.f37424b.f39282s0.finishFragment();
                return;
        }
    }
}
