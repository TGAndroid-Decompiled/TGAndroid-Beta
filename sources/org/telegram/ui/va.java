package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class va implements MessagesStorage.IntCallback {
    public final int f38464a;
    public final Object f38465b;

    public va(Object obj, int i10) {
        this.f38464a = i10;
        this.f38465b = obj;
    }

    @Override
    public final void run(int i10) {
        vu0 vu0Var;
        int i11 = this.f38464a;
        Object obj = this.f38465b;
        switch (i11) {
            case 0:
                ((vb) obj).U0(true);
                return;
            case 1:
                zn znVar = ((ln) obj).f35482a;
                if (i10 > 0 && znVar.getParentActivity() != null && znVar.fragmentView != null) {
                    org.telegram.ui.Components.xc.a0(znVar).m(org.telegram.ui.Components.wc.I, i10, 0, 0, znVar.f40303ea).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f31399y != null && (vu0Var = photoViewer.f31221e0) != null && i10 > 0) {
                    org.telegram.ui.Components.xc.F(vu0Var, true).j();
                    return;
                }
                return;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i10 == 1) {
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.J1 = 0;
                    profileActivity.finishFragment();
                    return;
                }
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f31553e1));
                return;
            default:
                fg1 fg1Var = ((kf1) obj).f35173a;
                if (i10 == 0) {
                    fg1Var.O0(false);
                    return;
                } else {
                    fg1Var.finishFragment();
                    return;
                }
        }
    }
}
