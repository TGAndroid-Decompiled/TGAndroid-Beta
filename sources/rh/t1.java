package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.pv0;
public final class t1 implements pv0 {
    public final int f43765a;
    public final NotificationCenter.NotificationCenterDelegate f43766b;

    public t1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f43765a = i10;
        this.f43766b = notificationCenterDelegate;
    }

    @Override
    public final void G(int i10, boolean z4) {
        switch (this.f43765a) {
            case 0:
                h2 h2Var = ((q2) this.f43766b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    h2Var.e(h2Var.getTopActionBarOffsetY() + (-h2Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((vh.y1) this.f43766b).getClass();
                return;
        }
    }
}
