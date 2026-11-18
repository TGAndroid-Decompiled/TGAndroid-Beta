package org.telegram.ui;

import android.content.DialogInterface;
public final class xe implements DialogInterface.OnShowListener {
    public final int f53819a;
    public final bn f53820b;

    public xe(bn bnVar, int i7) {
        this.f53819a = i7;
        this.f53820b = bnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f53819a) {
            case 0:
                this.f53820b.uc(false);
                return;
            default:
                this.f53820b.uc(false);
                return;
        }
    }
}
