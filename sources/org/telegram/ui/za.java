package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class za implements MessagesStorage.IntCallback {
    public final int f42251a;
    public final Object f42252b;

    public za(Object obj, int i10) {
        this.f42251a = i10;
        this.f42252b = obj;
    }

    @Override
    public final void run(int i10) {
        bv0 bv0Var;
        int i11 = this.f42251a;
        Object obj = this.f42252b;
        switch (i11) {
            case 0:
                ((ac) obj).U0(true);
                return;
            case 1:
                fo foVar = ((qn) obj).f39190a;
                if (i10 > 0 && foVar.getParentActivity() != null && foVar.fragmentView != null) {
                    org.telegram.ui.Components.zc.a0(foVar).m(org.telegram.ui.Components.yc.I, i10, 0, 0, foVar.f35633ea).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f32107y != null && (bv0Var = photoViewer.f31928e0) != null && i10 > 0) {
                    org.telegram.ui.Components.zc.F(bv0Var, true).j();
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f32261e1));
                return;
            default:
                kg1 kg1Var = ((pf1) obj).f38916a;
                if (i10 == 0) {
                    kg1Var.O0(false);
                    return;
                } else {
                    kg1Var.finishFragment();
                    return;
                }
        }
    }
}
