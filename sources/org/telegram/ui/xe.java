package org.telegram.ui;

import android.content.DialogInterface;
public final class xe implements DialogInterface.OnShowListener {
    public final int f53954a;
    public final bn f53955b;

    public xe(bn bnVar, int i7) {
        this.f53954a = i7;
        this.f53955b = bnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f53954a) {
            case 0:
                this.f53955b.uc(false);
                return;
            default:
                this.f53955b.uc(false);
                return;
        }
    }
}
