package org.telegram.ui;

import android.content.DialogInterface;
public final class u20 implements DialogInterface.OnDismissListener {
    public final int f38298a;
    public final d60 f38299b;

    public u20(d60 d60Var, int i10) {
        this.f38298a = i10;
        this.f38299b = d60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38298a) {
            case 0:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (this.f38299b.f33031x0 && (U instanceof wn)) {
                    ((wn) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f38299b.dismiss();
                return;
            case 2:
                this.f38299b.E1 = null;
                return;
            default:
                this.f38299b.f33004r0 = null;
                return;
        }
    }
}
