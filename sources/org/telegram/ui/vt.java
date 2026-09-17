package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class vt implements NotificationCenter.NotificationCenterDelegate {
    public final int f38500a;
    public final View f38501b;

    public vt(int i10, View view) {
        this.f38500a = i10;
        this.f38501b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f38500a) {
            case 0:
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) this.f38501b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    eaVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((bk0) this.f38501b).invalidate();
                return;
        }
    }
}
