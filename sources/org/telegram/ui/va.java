package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class va implements MessagesStorage.IntCallback {
    public final int f42153a;
    public final Object f42154b;

    public va(Object obj, int i10) {
        this.f42153a = i10;
        this.f42154b = obj;
    }

    @Override
    public final void run(int i10) {
        bu0 bu0Var;
        int i11 = this.f42153a;
        Object obj = this.f42154b;
        switch (i11) {
            case 0:
                ((vb) obj).U0(true);
                return;
            case 1:
                qn qnVar = ((cn) obj).f36010a;
                if (i10 > 0 && qnVar.getParentActivity() != null && qnVar.fragmentView != null) {
                    org.telegram.ui.Components.xc.a0(qnVar).m(org.telegram.ui.Components.wc.I, i10, 0, 0, qnVar.f40673ea).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f33457y != null && (bu0Var = photoViewer.f33278e0) != null && i10 > 0) {
                    org.telegram.ui.Components.xc.F(bu0Var, true).j();
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
                    profileActivity.K1 = 0;
                    profileActivity.finishFragment();
                    return;
                }
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f33619f1));
                return;
            default:
                re1 re1Var = ((wd1) obj).f42543a;
                if (i10 == 0) {
                    re1Var.O0(false);
                    return;
                } else {
                    re1Var.finishFragment();
                    return;
                }
        }
    }
}
