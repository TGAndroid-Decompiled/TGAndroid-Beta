package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ut implements NotificationCenter.NotificationCenterDelegate {
    public final int f37338a;
    public final View f37339b;

    public ut(int i10, View view) {
        this.f37338a = i10;
        this.f37339b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f37338a) {
            case 0:
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) this.f37339b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    gaVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((bk0) this.f37339b).invalidate();
                return;
        }
    }
}
