package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;

public final class ra implements MessagesStorage.IntCallback {

    public final int f41879a;

    public final Object f41880b;

    public ra(Object obj, int i10) {
        this.f41879a = i10;
        this.f41880b = obj;
    }

    @Override
    public final void run(int i10) {
        ut0 ut0Var;
        int i11 = this.f41879a;
        Object obj = this.f41880b;
        switch (i11) {
            case 0:
                ((qb) obj).V0(true);
                break;
            case 1:
                rn rnVar = ((dn) obj).f37446a;
                if (i10 > 0 && rnVar.getParentActivity() != null && rnVar.fragmentView != null) {
                    org.telegram.ui.Components.mc.a0(rnVar).m(org.telegram.ui.Components.lc.E, i10, 0, 0, rnVar.f41983aa).j();
                    break;
                }
                break;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f35800y != null && (ut0Var = photoViewer.f35583a0) != null && i10 > 0) {
                    org.telegram.ui.Components.mc.F(ut0Var, true).j();
                    break;
                }
                break;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i10 != 1) {
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f35923a1));
                } else {
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.F1 = 0;
                    profileActivity.finishFragment();
                }
                break;
            default:
                we1 we1Var = ((be1) obj).f36804a;
                if (i10 != 0) {
                    we1Var.finishFragment();
                } else {
                    we1Var.O0(false);
                }
                break;
        }
    }
}
