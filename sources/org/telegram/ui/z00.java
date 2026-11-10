package org.telegram.ui;

import android.content.DialogInterface;
public final class z00 implements DialogInterface.OnDismissListener {
    public final int f52163a;
    public final f40 f52164b;

    public z00(f40 f40Var, int i7) {
        this.f52163a = i7;
        this.f52164b = f40Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52163a) {
            case 0:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (this.f52164b.f45574r2 && (T instanceof cn)) {
                    ((cn) T).va(true, true);
                    return;
                }
                return;
            case 1:
                this.f52164b.dismiss();
                return;
            case 2:
                this.f52164b.f45608y3 = null;
                return;
            default:
                this.f52164b.f45546l2 = null;
                return;
        }
    }
}
