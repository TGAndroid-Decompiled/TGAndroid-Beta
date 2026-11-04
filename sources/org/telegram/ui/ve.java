package org.telegram.ui;

import android.content.DialogInterface;
public final class ve implements DialogInterface.OnShowListener {
    public final int f50466a;
    public final wm f50467b;

    public ve(wm wmVar, int i3) {
        this.f50466a = i3;
        this.f50467b = wmVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f50466a) {
            case 0:
                this.f50467b.qc(false);
                return;
            default:
                this.f50467b.qc(false);
                return;
        }
    }
}
