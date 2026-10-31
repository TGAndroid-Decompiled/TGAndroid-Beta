package org.telegram.ui;

import android.content.DialogInterface;
public final class qu implements DialogInterface.OnClickListener {
    public final int f41067a;
    public final int f41068b;

    public qu(int i10, int i11) {
        this.f41067a = i11;
        this.f41068b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f41067a) {
            case 0:
                int i11 = 2 - i10;
                if (i11 == this.f41068b) {
                    org.telegram.messenger.tz.w(-1);
                    return;
                } else {
                    org.telegram.messenger.tz.w(i11);
                    return;
                }
            default:
                int i12 = 2 - i10;
                if (i12 == this.f41068b) {
                    org.telegram.messenger.tz.w(-1);
                    return;
                } else {
                    org.telegram.messenger.tz.w(i12);
                    return;
                }
        }
    }
}
