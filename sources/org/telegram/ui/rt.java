package org.telegram.ui;

import android.content.DialogInterface;
public final class rt implements DialogInterface.OnClickListener {
    public final int f51021a;
    public final int f51022b;

    public rt(int i7, int i10) {
        this.f51021a = i10;
        this.f51022b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f51021a) {
            case 0:
                int i10 = 2 - i7;
                if (i10 == this.f51022b) {
                    org.telegram.messenger.gz.w(-1);
                    return;
                } else {
                    org.telegram.messenger.gz.w(i10);
                    return;
                }
            default:
                int i11 = 2 - i7;
                if (i11 == this.f51022b) {
                    org.telegram.messenger.gz.w(-1);
                    return;
                } else {
                    org.telegram.messenger.gz.w(i11);
                    return;
                }
        }
    }
}
