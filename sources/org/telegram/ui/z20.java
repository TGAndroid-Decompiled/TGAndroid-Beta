package org.telegram.ui;

import android.content.DialogInterface;
public final class z20 implements DialogInterface.OnDismissListener {
    public final int f43269a;
    public final j60 f43270b;

    public z20(j60 j60Var, int i10) {
        this.f43269a = i10;
        this.f43270b = j60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43269a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (this.f43270b.f37610x0 && (U instanceof co)) {
                    ((co) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f43270b.dismiss();
                return;
            case 2:
                this.f43270b.E1 = null;
                return;
            default:
                this.f43270b.f37583r0 = null;
                return;
        }
    }
}
