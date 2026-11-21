package org.telegram.ui;

import android.content.DialogInterface;
public final class xe implements DialogInterface.OnShowListener {
    public final int f53861a;
    public final bn f53862b;

    public xe(bn bnVar, int i7) {
        this.f53861a = i7;
        this.f53862b = bnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f53861a) {
            case 0:
                this.f53862b.uc(false);
                return;
            default:
                this.f53862b.uc(false);
                return;
        }
    }
}
