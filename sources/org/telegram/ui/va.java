package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class va implements MessagesStorage.IntCallback {
    public final int f38393a;
    public final Object f38394b;

    public va(Object obj, int i10) {
        this.f38393a = i10;
        this.f38394b = obj;
    }

    @Override
    public final void run(int i10) {
        vu0 vu0Var;
        int i11 = this.f38393a;
        Object obj = this.f38394b;
        switch (i11) {
            case 0:
                ((vb) obj).U0(true);
                return;
            case 1:
                zn znVar = ((ln) obj).f35408a;
                if (i10 > 0 && znVar.getParentActivity() != null && znVar.fragmentView != null) {
                    org.telegram.ui.Components.xc.a0(znVar).m(org.telegram.ui.Components.wc.I, i10, 0, 0, znVar.f40261ea).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f31359y != null && (vu0Var = photoViewer.f31181e0) != null && i10 > 0) {
                    org.telegram.ui.Components.xc.F(vu0Var, true).j();
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f31513e1));
                return;
            default:
                dg1 dg1Var = ((if1) obj).f34521a;
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
