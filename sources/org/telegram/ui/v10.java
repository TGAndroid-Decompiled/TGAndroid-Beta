package org.telegram.ui;

import android.content.DialogInterface;
public final class v10 implements DialogInterface.OnDismissListener {
    public final int f42383a;
    public final a50 f42384b;

    public v10(a50 a50Var, int i10) {
        this.f42383a = i10;
        this.f42384b = a50Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42383a) {
            case 0:
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (this.f42384b.f35639o2 && (T instanceof un)) {
                    ((un) T).oa(true, true);
                    return;
                }
                return;
            case 1:
                this.f42384b.dismiss();
                return;
            case 2:
                this.f42384b.f35673v3 = null;
                return;
            default:
                this.f42384b.f35611i2 = null;
                return;
        }
    }
}
