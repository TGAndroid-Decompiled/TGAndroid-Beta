package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class sg implements Runnable {
    public final int f52079a;
    public final View f52080b;

    public sg(int i7, View view) {
        this.f52079a = i7;
        this.f52080b = view;
    }

    @Override
    public final void run() {
        int i7 = this.f52079a;
        View view = this.f52080b;
        switch (i7) {
            case 0:
                try {
                    view.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                view.setBackgroundDrawable(null);
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                view.setVisibility(8);
                return;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.f43272f9;
                org.telegram.messenger.g0.E2(view);
                return;
            case 4:
                org.telegram.messenger.bz.I(0);
                ((org.telegram.ui.Cells.w9) view).f32355c.c(org.telegram.messenger.gd.N0(2131744156, null), true, true);
                return;
            case 5:
                org.telegram.messenger.bz.I(1);
                ((org.telegram.ui.Cells.w9) view).f32355c.c(org.telegram.messenger.gd.N0(2131744155, null), true, true);
                return;
            default:
                org.telegram.messenger.bz.I(2);
                ((org.telegram.ui.Cells.w9) view).f32355c.c(org.telegram.messenger.gd.N0(2131744154, null), true, true);
                return;
        }
    }
}
