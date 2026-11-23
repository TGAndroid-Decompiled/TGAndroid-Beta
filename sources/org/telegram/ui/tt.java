package org.telegram.ui;

import android.content.DialogInterface;
public final class tt implements DialogInterface.OnClickListener {
    public final int f52390a;
    public final int f52391b;

    public tt(int i7, int i10) {
        this.f52390a = i10;
        this.f52391b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f52390a) {
            case 0:
                int i10 = 2 - i7;
                if (i10 == this.f52391b) {
                    org.telegram.messenger.cz.w(-1);
                    return;
                } else {
                    org.telegram.messenger.cz.w(i10);
                    return;
                }
            default:
                int i11 = 2 - i7;
                if (i11 == this.f52391b) {
                    org.telegram.messenger.cz.w(-1);
                    return;
                } else {
                    org.telegram.messenger.cz.w(i11);
                    return;
                }
        }
    }
}
