package org.telegram.ui;

import android.content.DialogInterface;
public final class w20 implements DialogInterface.OnDismissListener {
    public final int f38513a;
    public final f60 f38514b;

    public w20(f60 f60Var, int i10) {
        this.f38513a = i10;
        this.f38514b = f60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38513a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (this.f38514b.f33194x0 && (U instanceof xn)) {
                    ((xn) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f38514b.dismiss();
                return;
            case 2:
                this.f38514b.E1 = null;
                return;
            default:
                this.f38514b.f33167r0 = null;
                return;
        }
    }
}
