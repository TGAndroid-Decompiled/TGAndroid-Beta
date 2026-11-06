package org.telegram.ui;

import android.content.DialogInterface;
public final class w00 implements DialogInterface.OnDismissListener {
    public final int f50871a;
    public final c40 f50872b;

    public w00(c40 c40Var, int i7) {
        this.f50871a = i7;
        this.f50872b = c40Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50871a) {
            case 0:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (this.f50872b.f44604o2 && (T instanceof an)) {
                    ((an) T).ta(true, true);
                    return;
                }
                return;
            case 1:
                this.f50872b.dismiss();
                return;
            case 2:
                this.f50872b.f44637v3 = null;
                return;
            default:
                this.f50872b.f44577i2 = null;
                return;
        }
    }
}
