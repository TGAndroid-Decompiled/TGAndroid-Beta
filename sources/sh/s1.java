package sh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.pv0;
public final class s1 implements pv0 {
    public final int f47674a;
    public final NotificationCenter.NotificationCenterDelegate f47675b;

    public s1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f47674a = i10;
        this.f47675b = notificationCenterDelegate;
    }

    @Override
    public final void G(int i10, boolean z4) {
        switch (this.f47674a) {
            case 0:
                g2 g2Var = ((p2) this.f47675b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    g2Var.e(g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((wh.z1) this.f47675b).getClass();
                return;
        }
    }
}
