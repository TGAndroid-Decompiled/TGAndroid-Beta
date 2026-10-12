package org.telegram.ui;

import android.content.DialogInterface;
public final class z20 implements DialogInterface.OnDismissListener {
    public final int f44604a;
    public final i60 f44605b;

    public z20(i60 i60Var, int i10) {
        this.f44604a = i10;
        this.f44605b = i60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44604a) {
            case 0:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (this.f44605b.f38777x0 && (U instanceof eo)) {
                    ((eo) U).Y9(true, true);
                    return;
                }
                return;
            case 1:
                this.f44605b.dismiss();
                return;
            case 2:
                this.f44605b.E1 = null;
                return;
            default:
                this.f44605b.f38750r0 = null;
                return;
        }
    }
}
