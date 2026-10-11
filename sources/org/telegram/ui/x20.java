package org.telegram.ui;

import android.content.DialogInterface;
public final class x20 implements DialogInterface.OnDismissListener {
    public final int f43943a;
    public final g60 f43944b;

    public x20(g60 g60Var, int i10) {
        this.f43943a = i10;
        this.f43944b = g60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43943a) {
            case 0:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (this.f43944b.f37965x0 && (U instanceof zn)) {
                    ((zn) U).Y9(true, true);
                    return;
                }
                return;
            case 1:
                this.f43944b.dismiss();
                return;
            case 2:
                this.f43944b.E1 = null;
                return;
            default:
                this.f43944b.f37938r0 = null;
                return;
        }
    }
}
