package org.telegram.ui;

import android.content.DialogInterface;
public final class u20 implements DialogInterface.OnDismissListener {
    public final int f38672a;
    public final e60 f38673b;

    public u20(e60 e60Var, int i10) {
        this.f38672a = i10;
        this.f38673b = e60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38672a) {
            case 0:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (this.f38673b.f33699u0 && (U instanceof zn)) {
                    ((zn) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f38673b.dismiss();
                return;
            case 2:
                this.f38673b.B1 = null;
                return;
            default:
                this.f38673b.f33673o0 = null;
                return;
        }
    }
}
