package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class va implements MessagesStorage.IntCallback {
    public final int f42640a;
    public final Object f42641b;

    public va(Object obj, int i10) {
        this.f42640a = i10;
        this.f42641b = obj;
    }

    @Override
    public final void run(int i10) {
        du0 du0Var;
        int i11 = this.f42640a;
        Object obj = this.f42641b;
        switch (i11) {
            case 0:
                ((vb) obj).U0(true);
                return;
            case 1:
                sn snVar = ((dn) obj).f36651a;
                if (i10 > 0 && snVar.getParentActivity() != null && snVar.fragmentView != null) {
                    org.telegram.ui.Components.vc.a0(snVar).m(org.telegram.ui.Components.uc.I, i10, 0, 0, snVar.f41651qa).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f33761y != null && (du0Var = photoViewer.f33582e0) != null && i10 > 0) {
                    org.telegram.ui.Components.vc.F(du0Var, true).j();
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
                    profileActivity.K1 = 0;
                    profileActivity.finishFragment();
                    return;
                }
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f33923f1));
                return;
            default:
                xe1 xe1Var = ((be1) obj).f36058a;
                if (i10 == 0) {
                    xe1Var.N0(false);
                    return;
                } else {
                    xe1Var.finishFragment();
                    return;
                }
        }
    }
}
