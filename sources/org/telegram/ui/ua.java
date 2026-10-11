package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class ua implements MessagesStorage.IntCallback {
    public final int f42496a;
    public final Object f42497b;

    public ua(Object obj, int i10) {
        this.f42496a = i10;
        this.f42497b = obj;
    }

    @Override
    public final void run(int i10) {
        vu0 vu0Var;
        int i11 = this.f42496a;
        Object obj = this.f42497b;
        switch (i11) {
            case 0:
                ((ub) obj).U0(true);
                return;
            case 1:
                zn znVar = ((ln) obj).f39735a;
                if (i10 > 0 && znVar.getParentActivity() != null && znVar.fragmentView != null) {
                    org.telegram.ui.Components.ad.a0(znVar).m(org.telegram.ui.Components.zc.I, i10, 0, 0, znVar.f44796ea).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f34144y != null && (vu0Var = photoViewer.f33966e0) != null && i10 > 0) {
                    org.telegram.ui.Components.ad.F(vu0Var, true).j();
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f34305e1));
                return;
            default:
                eg1 eg1Var = ((jf1) obj).f39071a;
                if (i10 == 0) {
                    eg1Var.O0(false);
                    return;
                } else {
                    eg1Var.finishFragment();
                    return;
                }
        }
    }
}
