package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class tt implements NotificationCenter.NotificationCenterDelegate {
    public final int f37781a;
    public final View f37782b;

    public tt(int i10, View view) {
        this.f37781a = i10;
        this.f37782b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f37781a) {
            case 0:
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) this.f37782b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    eaVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((zj0) this.f37782b).invalidate();
                return;
        }
    }
}
