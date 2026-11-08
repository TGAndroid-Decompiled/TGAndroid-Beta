package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class tg implements Runnable {
    public final int f50042a;
    public final View f50043b;

    public tg(int i7, View view) {
        this.f50042a = i7;
        this.f50043b = view;
    }

    @Override
    public final void run() {
        int i7 = this.f50042a;
        View view = this.f50043b;
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
                Drawable[] drawableArr = PhotoViewer.Y8;
                org.telegram.messenger.g0.E2(view);
                return;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                view.setVisibility(8);
                return;
            case 4:
                org.telegram.messenger.iz.I(0);
                ((org.telegram.ui.Cells.w9) view).f30748c.c(org.telegram.messenger.id.M0(2131744404, null), true, true);
                return;
            case 5:
                org.telegram.messenger.iz.I(1);
                ((org.telegram.ui.Cells.w9) view).f30748c.c(org.telegram.messenger.id.M0(2131744403, null), true, true);
                return;
            default:
                org.telegram.messenger.iz.I(2);
                ((org.telegram.ui.Cells.w9) view).f30748c.c(org.telegram.messenger.id.M0(2131744402, null), true, true);
                return;
        }
    }
}
