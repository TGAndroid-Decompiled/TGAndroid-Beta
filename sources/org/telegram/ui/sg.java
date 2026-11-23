package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class sg implements Runnable {
    public final int f52038a;
    public final View f52039b;

    public sg(int i7, View view) {
        this.f52038a = i7;
        this.f52039b = view;
    }

    @Override
    public final void run() {
        int i7 = this.f52038a;
        View view = this.f52039b;
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
                org.telegram.messenger.cz.I(0);
                ((org.telegram.ui.Cells.x9) view).f32362c.c(org.telegram.messenger.hd.N0(2131744158, null), true, true);
                return;
            case 5:
                org.telegram.messenger.cz.I(1);
                ((org.telegram.ui.Cells.x9) view).f32362c.c(org.telegram.messenger.hd.N0(2131744157, null), true, true);
                return;
            default:
                org.telegram.messenger.cz.I(2);
                ((org.telegram.ui.Cells.x9) view).f32362c.c(org.telegram.messenger.hd.N0(2131744156, null), true, true);
                return;
        }
    }
}
