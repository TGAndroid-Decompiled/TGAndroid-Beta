package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class ta implements MessagesStorage.IntCallback {
    public final int f41555a;
    public final Object f41556b;

    public ta(Object obj, int i10) {
        this.f41555a = i10;
        this.f41556b = obj;
    }

    @Override
    public final void run(int i10) {
        du0 du0Var;
        int i11 = this.f41555a;
        Object obj = this.f41556b;
        switch (i11) {
            case 0:
                ((sb) obj).V0(true);
                return;
            case 1:
                xn xnVar = ((jn) obj).f38188a;
                if (i10 > 0 && xnVar.getParentActivity() != null && xnVar.fragmentView != null) {
                    org.telegram.ui.Components.qc.a0(xnVar).m(org.telegram.ui.Components.pc.F, i10, 0, 0, xnVar.f43136ba).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f34439y != null && (du0Var = photoViewer.f34230b0) != null && i10 > 0) {
                    org.telegram.ui.Components.qc.F(du0Var, true).j();
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
                    profileActivity.G1 = 0;
                    profileActivity.finishFragment();
                    return;
                }
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f34569b1));
                return;
            default:
                mf1 mf1Var = ((qe1) obj).f40458a;
                if (i10 == 0) {
                    mf1Var.O0(false);
                    return;
                } else {
                    mf1Var.finishFragment();
                    return;
                }
        }
    }
}
