package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class va implements MessagesStorage.IntCallback {
    public final int f41494a;
    public final Object f41495b;

    public va(Object obj, int i10) {
        this.f41494a = i10;
        this.f41495b = obj;
    }

    @Override
    public final void run(int i10) {
        uu0 uu0Var;
        int i11 = this.f41494a;
        Object obj = this.f41495b;
        switch (i11) {
            case 0:
                ((ub) obj).V0(true);
                return;
            case 1:
                co coVar = ((on) obj).f39311a;
                if (i10 > 0 && coVar.getParentActivity() != null && coVar.fragmentView != null) {
                    org.telegram.ui.Components.yc.a0(coVar).m(org.telegram.ui.Components.xc.I, i10, 0, 0, coVar.f35275ea).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f33755y != null && (uu0Var = photoViewer.f33577e0) != null && i10 > 0) {
                    org.telegram.ui.Components.yc.F(uu0Var, true).j();
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f33916e1));
                return;
            default:
                eg1 eg1Var = ((jf1) obj).f37793a;
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
