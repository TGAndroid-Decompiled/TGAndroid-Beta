package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class yt implements NotificationCenter.NotificationCenterDelegate {
    public final int f41956a;
    public final View f41957b;

    public yt(int i10, View view) {
        this.f41956a = i10;
        this.f41957b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f41956a) {
            case 0:
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) this.f41957b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    caVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((ek0) this.f41957b).invalidate();
                return;
        }
    }
}
