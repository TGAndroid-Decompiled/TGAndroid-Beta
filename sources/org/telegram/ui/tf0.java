package org.telegram.ui;

import android.content.DialogInterface;
public final class tf0 implements DialogInterface.OnDismissListener {
    public final int f42214a;
    public final yf0 f42215b;

    public tf0(yf0 yf0Var, int i10) {
        this.f42214a = i10;
        this.f42215b = yf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42214a) {
            case 0:
                this.f42215b.f44416s0.finishFragment();
                return;
            default:
                this.f42215b.f44416s0.finishFragment();
                return;
        }
    }
}
