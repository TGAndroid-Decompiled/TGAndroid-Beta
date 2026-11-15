package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class sg implements Runnable {
    public final int f51214a;
    public final View f51215b;

    public sg(int i7, View view) {
        this.f51214a = i7;
        this.f51215b = view;
    }

    @Override
    public final void run() {
        int i7 = this.f51214a;
        View view = this.f51215b;
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
                Drawable[] drawableArr = PhotoViewer.Z8;
                org.telegram.messenger.g0.E2(view);
                return;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                view.setVisibility(8);
                return;
            case 4:
                org.telegram.messenger.gz.I(0);
                ((org.telegram.ui.Cells.v9) view).f31827c.c(org.telegram.messenger.hd.M0(2131744401, null), true, true);
                return;
            case 5:
                org.telegram.messenger.gz.I(1);
                ((org.telegram.ui.Cells.v9) view).f31827c.c(org.telegram.messenger.hd.M0(2131744400, null), true, true);
                return;
            default:
                org.telegram.messenger.gz.I(2);
                ((org.telegram.ui.Cells.v9) view).f31827c.c(org.telegram.messenger.hd.M0(2131744399, null), true, true);
                return;
        }
    }
}
