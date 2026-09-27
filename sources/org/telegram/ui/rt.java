package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class rt implements NotificationCenter.NotificationCenterDelegate {
    public final int f37234a;
    public final View f37235b;

    public rt(int i10, View view) {
        this.f37234a = i10;
        this.f37235b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f37234a) {
            case 0:
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) this.f37235b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    eaVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((vj0) this.f37235b).invalidate();
                return;
        }
    }
}
