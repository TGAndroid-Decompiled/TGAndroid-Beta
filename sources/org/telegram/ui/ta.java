package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class ta implements MessagesStorage.IntCallback {
    public final int f41483a;
    public final Object f41484b;

    public ta(Object obj, int i10) {
        this.f41483a = i10;
        this.f41484b = obj;
    }

    @Override
    public final void run(int i10) {
        iu0 iu0Var;
        int i11 = this.f41483a;
        Object obj = this.f41484b;
        switch (i11) {
            case 0:
                ((sb) obj).V0(true);
                return;
            case 1:
                xn xnVar = ((jn) obj).f38085a;
                if (i10 > 0 && xnVar.getParentActivity() != null && xnVar.fragmentView != null) {
                    org.telegram.ui.Components.qc.a0(xnVar).m(org.telegram.ui.Components.pc.F, i10, 0, 0, xnVar.f43114ba).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f34439y != null && (iu0Var = photoViewer.f34230b0) != null && i10 > 0) {
                    org.telegram.ui.Components.qc.F(iu0Var, true).j();
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
                sf1 sf1Var = ((we1) obj).f42418a;
                if (i10 == 0) {
                    sf1Var.O0(false);
                    return;
                } else {
                    sf1Var.finishFragment();
                    return;
                }
        }
    }
}
