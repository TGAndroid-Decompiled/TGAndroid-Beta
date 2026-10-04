package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class wa implements MessagesStorage.IntCallback {
    public final int f42015a;
    public final Object f42016b;

    public wa(Object obj, int i10) {
        this.f42015a = i10;
        this.f42016b = obj;
    }

    @Override
    public final void run(int i10) {
        qu0 qu0Var;
        int i11 = this.f42015a;
        Object obj = this.f42016b;
        switch (i11) {
            case 0:
                ((wb) obj).U0(true);
                return;
            case 1:
                yn ynVar = ((kn) obj).f38008a;
                if (i10 > 0 && ynVar.getParentActivity() != null && ynVar.fragmentView != null) {
                    org.telegram.ui.Components.yc.a0(ynVar).m(org.telegram.ui.Components.xc.I, i10, 0, 0, ynVar.f43307ca).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f34079y != null && (qu0Var = photoViewer.f33901e0) != null && i10 > 0) {
                    org.telegram.ui.Components.yc.F(qu0Var, true).j();
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f34240e1));
                return;
            default:
                yf1 yf1Var = ((df1) obj).f35765a;
                if (i10 == 0) {
                    yf1Var.O0(false);
                    return;
                } else {
                    yf1Var.finishFragment();
                    return;
                }
        }
    }
}
