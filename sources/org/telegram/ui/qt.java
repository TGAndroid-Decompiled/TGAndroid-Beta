package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class qt implements NotificationCenter.NotificationCenterDelegate {
    public final int f36614a;
    public final View f36615b;

    public qt(int i10, View view) {
        this.f36614a = i10;
        this.f36615b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f36614a) {
            case 0:
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) this.f36615b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    faVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((tj0) this.f36615b).invalidate();
                return;
        }
    }
}
