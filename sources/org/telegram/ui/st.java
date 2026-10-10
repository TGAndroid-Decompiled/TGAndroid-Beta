package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class st implements NotificationCenter.NotificationCenterDelegate {
    public final int f41812a;
    public final View f41813b;

    public st(int i10, View view) {
        this.f41812a = i10;
        this.f41813b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f41812a) {
            case 0:
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) this.f41813b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    caVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((ak0) this.f41813b).invalidate();
                return;
        }
    }
}
