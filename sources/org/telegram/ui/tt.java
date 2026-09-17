package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class tt implements NotificationCenter.NotificationCenterDelegate {
    public final int f40853a;
    public final View f40854b;

    public tt(int i10, View view) {
        this.f40853a = i10;
        this.f40854b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f40853a) {
            case 0:
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) this.f40854b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    eaVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((bk0) this.f40854b).invalidate();
                return;
        }
    }
}
