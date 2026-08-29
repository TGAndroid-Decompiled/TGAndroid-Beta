package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.gv0;
public final class s1 implements gv0 {
    public final int f46049a;
    public final NotificationCenter.NotificationCenterDelegate f46050b;

    public s1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f46049a = i10;
        this.f46050b = notificationCenterDelegate;
    }

    @Override
    public final void G(int i10, boolean z10) {
        switch (this.f46049a) {
            case 0:
                g2 g2Var = ((p2) this.f46050b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    g2Var.e(g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((th.x1) this.f46050b).getClass();
                return;
        }
    }
}
