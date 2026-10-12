package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class vt implements NotificationCenter.NotificationCenterDelegate {
    public final int f42848a;
    public final View f42849b;

    public vt(int i10, View view) {
        this.f42848a = i10;
        this.f42849b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f42848a) {
            case 0:
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) this.f42849b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    caVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((bk0) this.f42849b).invalidate();
                return;
        }
    }
}
