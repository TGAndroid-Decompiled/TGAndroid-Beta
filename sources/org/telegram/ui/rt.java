package org.telegram.ui;

import android.content.DialogInterface;
public final class rt implements DialogInterface.OnClickListener {
    public final int f49570a;
    public final int f49571b;

    public rt(int i7, int i10) {
        this.f49570a = i10;
        this.f49571b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f49570a) {
            case 0:
                int i10 = 2 - i7;
                if (i10 == this.f49571b) {
                    org.telegram.messenger.iz.w(-1);
                    return;
                } else {
                    org.telegram.messenger.iz.w(i10);
                    return;
                }
            default:
                int i11 = 2 - i7;
                if (i11 == this.f49571b) {
                    org.telegram.messenger.iz.w(-1);
                    return;
                } else {
                    org.telegram.messenger.iz.w(i11);
                    return;
                }
        }
    }
}
