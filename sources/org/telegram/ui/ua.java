package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class ua implements MessagesStorage.IntCallback {
    public final int f37919a;
    public final Object f37920b;

    public ua(Object obj, int i10) {
        this.f37919a = i10;
        this.f37920b = obj;
    }

    @Override
    public final void run(int i10) {
        vu0 vu0Var;
        int i11 = this.f37919a;
        Object obj = this.f37920b;
        switch (i11) {
            case 0:
                ((ub) obj).U0(true);
                return;
            case 1:
                bo boVar = ((nn) obj).f36012a;
                if (i10 > 0 && boVar.getParentActivity() != null && boVar.fragmentView != null) {
                    org.telegram.ui.Components.vc.a0(boVar).m(org.telegram.ui.Components.uc.I, i10, 0, 0, boVar.f32297ea).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f31114y != null && (vu0Var = photoViewer.f30936e0) != null && i10 > 0) {
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f31269e1));
                return;
            default:
                dg1 dg1Var = ((if1) obj).f34665a;
                if (i10 == 0) {
                    dg1Var.O0(false);
                    return;
                } else {
                    dg1Var.finishFragment();
                    return;
                }
        }
    }
}
