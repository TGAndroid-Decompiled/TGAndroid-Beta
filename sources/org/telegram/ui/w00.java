package org.telegram.ui;

import android.content.DialogInterface;
public final class w00 implements DialogInterface.OnDismissListener {
    public final int f50815a;
    public final c40 f50816b;

    public w00(c40 c40Var, int i7) {
        this.f50815a = i7;
        this.f50816b = c40Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50815a) {
            case 0:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (this.f50816b.f44607o2 && (T instanceof an)) {
                    ((an) T).ta(true, true);
                    return;
                }
                return;
            case 1:
                this.f50816b.dismiss();
                return;
            case 2:
                this.f50816b.f44640v3 = null;
                return;
            default:
                this.f50816b.f44580i2 = null;
                return;
        }
    }
}
