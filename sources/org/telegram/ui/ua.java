package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class ua implements MessagesStorage.IntCallback {
    public final int f37876a;
    public final Object f37877b;

    public ua(Object obj, int i10) {
        this.f37876a = i10;
        this.f37877b = obj;
    }

    @Override
    public final void run(int i10) {
        vu0 vu0Var;
        int i11 = this.f37876a;
        Object obj = this.f37877b;
        switch (i11) {
            case 0:
                ((ub) obj).U0(true);
                return;
            case 1:
                bo boVar = ((nn) obj).f36017a;
                if (i10 > 0 && boVar.getParentActivity() != null && boVar.fragmentView != null) {
                    org.telegram.ui.Components.vc.a0(boVar).m(org.telegram.ui.Components.uc.I, i10, 0, 0, boVar.f32293ea).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f31112y != null && (vu0Var = photoViewer.f30934e0) != null && i10 > 0) {
                    org.telegram.ui.Components.vc.F(vu0Var, true).j();
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f31266e1));
                return;
            default:
                eg1 eg1Var = ((jf1) obj).f34903a;
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
