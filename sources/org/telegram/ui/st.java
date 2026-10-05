package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class st implements NotificationCenter.NotificationCenterDelegate {
    public final int f40632a;
    public final View f40633b;

    public st(int i10, View view) {
        this.f40632a = i10;
        this.f40633b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f40632a) {
            case 0:
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) this.f40633b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    eaVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((xj0) this.f40633b).invalidate();
                return;
        }
    }
}
