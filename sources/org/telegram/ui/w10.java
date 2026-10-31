package org.telegram.ui;

import android.content.DialogInterface;
public final class w10 implements DialogInterface.OnDismissListener {
    public final int f42859a;
    public final b50 f42860b;

    public w10(b50 b50Var, int i10) {
        this.f42859a = i10;
        this.f42860b = b50Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42859a) {
            case 0:
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (this.f42860b.f36055o2 && (T instanceof un)) {
                    ((un) T).ja(true, true);
                    return;
                }
                return;
            case 1:
                this.f42860b.dismiss();
                return;
            case 2:
                this.f42860b.f36089v3 = null;
                return;
            default:
                this.f42860b.f36027i2 = null;
                return;
        }
    }
}
