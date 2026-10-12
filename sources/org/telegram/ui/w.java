package org.telegram.ui;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f43017a;
    public final i4 f43018b;

    public w(i4 i4Var, int i10) {
        this.f43017a = i10;
        this.f43018b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43017a) {
            case 0:
                this.f43018b.f43070c.d(true);
                return;
            default:
                this.f43018b.f38655k0 = null;
                return;
        }
    }
}
