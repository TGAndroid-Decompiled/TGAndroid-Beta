package org.telegram.ui;

import android.content.DialogInterface;
public final class t20 implements DialogInterface.OnDismissListener {
    public final int f41457a;
    public final d60 f41458b;

    public t20(d60 d60Var, int i10) {
        this.f41457a = i10;
        this.f41458b = d60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41457a) {
            case 0:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (this.f41458b.f36094u0 && (U instanceof xn)) {
                    ((xn) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f41458b.dismiss();
                return;
            case 2:
                this.f41458b.B1 = null;
                return;
            default:
                this.f41458b.f36068o0 = null;
                return;
        }
    }
}
