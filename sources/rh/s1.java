package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.pv0;
public final class s1 implements pv0 {
    public final int f43817a;
    public final NotificationCenter.NotificationCenterDelegate f43818b;

    public s1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f43817a = i10;
        this.f43818b = notificationCenterDelegate;
    }

    @Override
    public final void G(int i10, boolean z4) {
        switch (this.f43817a) {
            case 0:
                g2 g2Var = ((p2) this.f43818b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    g2Var.e(g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((vh.y1) this.f43818b).getClass();
                return;
        }
    }
}
