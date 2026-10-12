package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class yt implements NotificationCenter.NotificationCenterDelegate {
    public final int f42279a;
    public final View f42280b;

    public yt(int i10, View view) {
        this.f42279a = i10;
        this.f42280b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f42279a) {
            case 0:
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) this.f42280b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    caVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((fk0) this.f42280b).invalidate();
                return;
        }
    }
}
