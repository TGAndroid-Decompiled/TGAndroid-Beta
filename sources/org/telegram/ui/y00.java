package org.telegram.ui;

import android.content.DialogInterface;
public final class y00 implements DialogInterface.OnDismissListener {
    public final int f53364a;
    public final c40 f53365b;

    public y00(c40 c40Var, int i7) {
        this.f53364a = i7;
        this.f53365b = c40Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f53364a) {
            case 0:
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (this.f53365b.f45971s2 && (T instanceof an)) {
                    ((an) T).wa(true, true);
                    return;
                }
                return;
            case 1:
                this.f53365b.dismiss();
                return;
            case 2:
                this.f53365b.D3 = null;
                return;
            default:
                this.f53365b.f45943m2 = null;
                return;
        }
    }
}
