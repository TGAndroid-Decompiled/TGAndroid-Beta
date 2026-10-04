package org.telegram.ui;

import android.content.DialogInterface;
public final class z20 implements DialogInterface.OnDismissListener {
    public final int f43687a;
    public final h60 f43688b;

    public z20(h60 h60Var, int i10) {
        this.f43687a = i10;
        this.f43688b = h60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43687a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (this.f43688b.f36970x0 && (U instanceof yn)) {
                    ((yn) U).S9(true, true);
                    return;
                }
                return;
            case 1:
                this.f43688b.dismiss();
                return;
            case 2:
                this.f43688b.E1 = null;
                return;
            default:
                this.f43688b.f36943r0 = null;
                return;
        }
    }
}
