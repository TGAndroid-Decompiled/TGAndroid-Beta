package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class st implements NotificationCenter.NotificationCenterDelegate {
    public final int f40620a;
    public final View f40621b;

    public st(int i10, View view) {
        this.f40620a = i10;
        this.f40621b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f40620a) {
            case 0:
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) this.f40621b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    eaVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((xj0) this.f40621b).invalidate();
                return;
        }
    }
}
