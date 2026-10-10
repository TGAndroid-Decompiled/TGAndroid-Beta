package org.telegram.ui;

import android.content.DialogInterface;
public final class x20 implements DialogInterface.OnDismissListener {
    public final int f43848a;
    public final g60 f43849b;

    public x20(g60 g60Var, int i10) {
        this.f43848a = i10;
        this.f43849b = g60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43848a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (this.f43849b.f37929x0 && (U instanceof zn)) {
                    ((zn) U).Y9(true, true);
                    return;
                }
                return;
            case 1:
                this.f43849b.dismiss();
                return;
            case 2:
                this.f43849b.E1 = null;
                return;
            default:
                this.f43849b.f37902r0 = null;
                return;
        }
    }
}
