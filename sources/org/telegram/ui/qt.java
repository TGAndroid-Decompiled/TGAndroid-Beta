package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class qt implements NotificationCenter.NotificationCenterDelegate {
    public final int f37838a;
    public final View f37839b;

    public qt(int i10, View view) {
        this.f37838a = i10;
        this.f37839b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f37838a) {
            case 0:
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) this.f37839b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    aaVar.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((pj0) this.f37839b).invalidate();
                return;
        }
    }
}
