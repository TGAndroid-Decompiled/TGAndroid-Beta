package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class za implements MessagesStorage.IntCallback {
    public final int f42577a;
    public final Object f42578b;

    public za(Object obj, int i10) {
        this.f42577a = i10;
        this.f42578b = obj;
    }

    @Override
    public final void run(int i10) {
        cv0 cv0Var;
        int i11 = this.f42577a;
        Object obj = this.f42578b;
        switch (i11) {
            case 0:
                ((ac) obj).U0(true);
                return;
            case 1:
                fo foVar = ((qn) obj).f39497a;
                if (i10 > 0 && foVar.getParentActivity() != null && foVar.fragmentView != null) {
                    org.telegram.ui.Components.zc.a0(foVar).m(org.telegram.ui.Components.yc.I, i10, 0, 0, foVar.f35932ea).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f32405y != null && (cv0Var = photoViewer.f32226e0) != null && i10 > 0) {
                    org.telegram.ui.Components.zc.F(cv0Var, true).j();
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f32559e1));
                return;
            default:
                lg1 lg1Var = ((qf1) obj).f39437a;
                if (i10 == 0) {
                    lg1Var.O0(false);
                    return;
                } else {
                    lg1Var.finishFragment();
                    return;
                }
        }
    }
}
