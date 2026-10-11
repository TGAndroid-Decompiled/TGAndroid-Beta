package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class rt implements NotificationCenter.NotificationCenterDelegate {
    public final int f41543a;
    public final View f41544b;

    public rt(int i10, View view) {
        this.f41543a = i10;
        this.f41544b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f41543a) {
            case 0:
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) this.f41544b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    caVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((zj0) this.f41544b).invalidate();
                return;
        }
    }
}
