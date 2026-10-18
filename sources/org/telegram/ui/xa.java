package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class xa implements MessagesStorage.IntCallback {
    public final int f43055a;
    public final Object f43056b;

    public xa(Object obj, int i10) {
        this.f43055a = i10;
        this.f43056b = obj;
    }

    @Override
    public final void run(int i10) {
        du0 du0Var;
        int i11 = this.f43055a;
        Object obj = this.f43056b;
        switch (i11) {
            case 0:
                ((xb) obj).U0(true);
                return;
            case 1:
                sn snVar = ((en) obj).f36573a;
                if (i10 > 0 && snVar.getParentActivity() != null && snVar.fragmentView != null) {
                    org.telegram.ui.Components.xc.a0(snVar).m(org.telegram.ui.Components.wc.I, i10, 0, 0, snVar.f41226ea).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f33452y != null && (du0Var = photoViewer.f33273e0) != null && i10 > 0) {
                    org.telegram.ui.Components.xc.F(du0Var, true).j();
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f33614f1));
                return;
            default:
                te1 te1Var = ((yd1) obj).f43417a;
                if (i10 == 0) {
                    te1Var.O0(false);
                    return;
                } else {
                    te1Var.finishFragment();
                    return;
                }
        }
    }
}
