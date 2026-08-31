package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class rt implements NotificationCenter.NotificationCenterDelegate {
    public final int f41049a;
    public final View f41050b;

    public rt(int i10, View view) {
        this.f41049a = i10;
        this.f41050b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f41049a) {
            case 0:
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) this.f41050b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    aaVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((qj0) this.f41050b).invalidate();
                return;
        }
    }
}
