package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class va implements MessagesStorage.IntCallback {
    public final int f42806a;
    public final Object f42807b;

    public va(Object obj, int i10) {
        this.f42806a = i10;
        this.f42807b = obj;
    }

    @Override
    public final void run(int i10) {
        wu0 wu0Var;
        int i11 = this.f42806a;
        Object obj = this.f42807b;
        switch (i11) {
            case 0:
                ((vb) obj).U0(true);
                return;
            case 1:
                zn znVar = ((ln) obj).f39680a;
                if (i10 > 0 && znVar.getParentActivity() != null && znVar.fragmentView != null) {
                    org.telegram.ui.Components.ad.a0(znVar).m(org.telegram.ui.Components.zc.I, i10, 0, 0, znVar.f44807ea).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f34120y != null && (wu0Var = photoViewer.f33942e0) != null && i10 > 0) {
                    org.telegram.ui.Components.ad.F(wu0Var, true).j();
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f34281e1));
                return;
            default:
                fg1 fg1Var = ((kf1) obj).f39319a;
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
