package org.telegram.ui;

import android.content.DialogInterface;
public final class w00 implements DialogInterface.OnDismissListener {
    public final int f50866a;
    public final c40 f50867b;

    public w00(c40 c40Var, int i7) {
        this.f50866a = i7;
        this.f50867b = c40Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50866a) {
            case 0:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (this.f50867b.f44584o2 && (T instanceof an)) {
                    ((an) T).ta(true, true);
                    return;
                }
                return;
            case 1:
                this.f50867b.dismiss();
                return;
            case 2:
                this.f50867b.f44617v3 = null;
                return;
            default:
                this.f50867b.f44557i2 = null;
                return;
        }
    }
}
