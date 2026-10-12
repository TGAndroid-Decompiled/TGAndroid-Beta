package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class ya implements MessagesStorage.IntCallback {
    public final int f44381a;
    public final Object f44382b;

    public ya(Object obj, int i10) {
        this.f44381a = i10;
        this.f44382b = obj;
    }

    @Override
    public final void run(int i10) {
        yu0 yu0Var;
        int i11 = this.f44381a;
        Object obj = this.f44382b;
        switch (i11) {
            case 0:
                ((yb) obj).U0(true);
                return;
            case 1:
                eo eoVar = ((pn) obj).f41000a;
                if (i10 > 0 && eoVar.getParentActivity() != null && eoVar.fragmentView != null) {
                    org.telegram.ui.Components.zc.a0(eoVar).m(org.telegram.ui.Components.yc.I, i10, 0, 0, eoVar.f37256ea).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f33921y != null && (yu0Var = photoViewer.f33743e0) != null && i10 > 0) {
                    org.telegram.ui.Components.zc.F(yu0Var, true).j();
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f34082e1));
                return;
            default:
                hg1 hg1Var = ((mf1) obj).f40036a;
                if (i10 == 0) {
                    hg1Var.O0(false);
                    return;
                } else {
                    hg1Var.finishFragment();
                    return;
                }
        }
    }
}
