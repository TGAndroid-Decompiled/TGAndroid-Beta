package org.telegram.ui;

import android.content.DialogInterface;
public final class s20 implements DialogInterface.OnDismissListener {
    public final int f38181a;
    public final c60 f38182b;

    public s20(c60 c60Var, int i10) {
        this.f38181a = i10;
        this.f38182b = c60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38181a) {
            case 0:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (this.f38182b.f33180u0 && (U instanceof xn)) {
                    ((xn) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f38182b.dismiss();
                return;
            case 2:
                this.f38182b.B1 = null;
                return;
            default:
                this.f38182b.f33154o0 = null;
                return;
        }
    }
}
