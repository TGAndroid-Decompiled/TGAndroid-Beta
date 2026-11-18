package org.telegram.ui;

import android.content.DialogInterface;
public final class xe implements DialogInterface.OnShowListener {
    public final int f53824a;
    public final bn f53825b;

    public xe(bn bnVar, int i7) {
        this.f53824a = i7;
        this.f53825b = bnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f53824a) {
            case 0:
                this.f53825b.uc(false);
                return;
            default:
                this.f53825b.uc(false);
                return;
        }
    }
}
