package org.telegram.ui;

import android.content.DialogInterface;
public final class y00 implements DialogInterface.OnDismissListener {
    public final int f51805a;
    public final e40 f51806b;

    public y00(e40 e40Var, int i7) {
        this.f51805a = i7;
        this.f51806b = e40Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f51805a) {
            case 0:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (this.f51806b.f45247o2 && (T instanceof cn)) {
                    ((cn) T).va(true, true);
                    return;
                }
                return;
            case 1:
                this.f51806b.dismiss();
                return;
            case 2:
                this.f51806b.f45280v3 = null;
                return;
            default:
                this.f51806b.f45220i2 = null;
                return;
        }
    }
}
