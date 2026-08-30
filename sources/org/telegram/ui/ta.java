package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class ta implements MessagesStorage.IntCallback {
    public final int f38624a;
    public final Object f38625b;

    public ta(Object obj, int i10) {
        this.f38624a = i10;
        this.f38625b = obj;
    }

    @Override
    public final void run(int i10) {
        bu0 bu0Var;
        int i11 = this.f38624a;
        Object obj = this.f38625b;
        switch (i11) {
            case 0:
                ((sb) obj).V0(true);
                return;
            case 1:
                xn xnVar = ((jn) obj).f35381a;
                if (i10 > 0 && xnVar.getParentActivity() != null && xnVar.fragmentView != null) {
                    org.telegram.ui.Components.qc.a0(xnVar).m(org.telegram.ui.Components.pc.F, i10, 0, 0, xnVar.f39968ba).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f31913y != null && (bu0Var = photoViewer.f31705b0) != null && i10 > 0) {
                    org.telegram.ui.Components.qc.F(bu0Var, true).j();
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f32037b1));
                return;
            default:
                kf1 kf1Var = ((oe1) obj).f36886a;
                if (i10 == 0) {
                    kf1Var.O0(false);
                    return;
                } else {
                    kf1Var.finishFragment();
                    return;
                }
        }
    }
}
