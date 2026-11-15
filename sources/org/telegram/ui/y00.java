package org.telegram.ui;

import android.content.DialogInterface;
public final class y00 implements DialogInterface.OnDismissListener {
    public final int f53368a;
    public final c40 f53369b;

    public y00(c40 c40Var, int i7) {
        this.f53368a = i7;
        this.f53369b = c40Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f53368a) {
            case 0:
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (this.f53369b.f45960s2 && (T instanceof an)) {
                    ((an) T).wa(true, true);
                    return;
                }
                return;
            case 1:
                this.f53369b.dismiss();
                return;
            case 2:
                this.f53369b.D3 = null;
                return;
            default:
                this.f53369b.f45932m2 = null;
                return;
        }
    }
}
