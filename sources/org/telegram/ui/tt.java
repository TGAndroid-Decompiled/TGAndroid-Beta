package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class tt implements NotificationCenter.NotificationCenterDelegate {
    public final int f37877a;
    public final View f37878b;

    public tt(int i10, View view) {
        this.f37877a = i10;
        this.f37878b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f37877a) {
            case 0:
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) this.f37878b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    faVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((ck0) this.f37878b).invalidate();
                return;
        }
    }
}
