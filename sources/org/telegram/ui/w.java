package org.telegram.ui;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f38840a;
    public final i4 f38841b;

    public w(i4 i4Var, int i10) {
        this.f38840a = i10;
        this.f38841b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38840a) {
            case 0:
                this.f38841b.f36411c.d(true);
                return;
            default:
                this.f38841b.f34385k0 = null;
                return;
        }
    }
}
