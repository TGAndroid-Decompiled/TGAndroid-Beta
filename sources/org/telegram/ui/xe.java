package org.telegram.ui;

import android.content.DialogInterface;
public final class xe implements DialogInterface.OnShowListener {
    public final int f53785a;
    public final bn f53786b;

    public xe(bn bnVar, int i7) {
        this.f53785a = i7;
        this.f53786b = bnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f53785a) {
            case 0:
                this.f53786b.uc(false);
                return;
            default:
                this.f53786b.uc(false);
                return;
        }
    }
}
