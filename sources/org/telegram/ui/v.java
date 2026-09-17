package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f41400a;
    public final i4 f41401b;

    public v(i4 i4Var, int i10) {
        this.f41400a = i10;
        this.f41401b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41400a) {
            case 0:
                this.f41401b.f41463c.d(true);
                return;
            default:
                this.f41401b.f37251k0 = null;
                return;
        }
    }
}
