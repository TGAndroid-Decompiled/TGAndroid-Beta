package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class st implements NotificationCenter.NotificationCenterDelegate {
    public final int f38307a;
    public final View f38308b;

    public st(int i10, View view) {
        this.f38307a = i10;
        this.f38308b = view;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f38307a) {
            case 0:
                org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) this.f38308b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    z9Var.getTextView().invalidate();
                    return;
                }
                return;
            default:
                ((rj0) this.f38308b).invalidate();
                return;
        }
    }
}
