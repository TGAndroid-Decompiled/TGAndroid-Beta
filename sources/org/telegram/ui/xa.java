package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class xa implements MessagesStorage.IntCallback {
    public final int f39588a;
    public final Object f39589b;

    public xa(Object obj, int i10) {
        this.f39588a = i10;
        this.f39589b = obj;
    }

    @Override
    public final void run(int i10) {
        qu0 qu0Var;
        int i11 = this.f39588a;
        Object obj = this.f39589b;
        switch (i11) {
            case 0:
                ((wb) obj).U0(true);
                return;
            case 1:
                xn xnVar = ((jn) obj).f34766a;
                if (i10 > 0 && xnVar.getParentActivity() != null && xnVar.fragmentView != null) {
                    org.telegram.ui.Components.xc.a0(xnVar).m(org.telegram.ui.Components.wc.I, i10, 0, 0, xnVar.f39750ea).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f31403y != null && (qu0Var = photoViewer.f31225e0) != null && i10 > 0) {
                    org.telegram.ui.Components.xc.F(qu0Var, true).j();
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f31557e1));
                return;
            default:
                wf1 wf1Var = ((bf1) obj).f32351a;
                if (i10 == 0) {
                    wf1Var.O0(false);
                    return;
                } else {
                    wf1Var.finishFragment();
                    return;
                }
        }
    }
}
