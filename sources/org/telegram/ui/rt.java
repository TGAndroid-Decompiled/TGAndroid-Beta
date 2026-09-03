package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class rt implements NotificationCenter.NotificationCenterDelegate {
    public final int f40935a;
    public final View f40936b;

    public rt(int i10, View view) {
        this.f40935a = i10;
        this.f40936b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f40935a) {
            case 0:
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) this.f40936b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    aaVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((qj0) this.f40936b).invalidate();
                return;
        }
    }
}
