package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class ua implements MessagesStorage.IntCallback {
    public final int f38001a;
    public final Object f38002b;

    public ua(Object obj, int i10) {
        this.f38001a = i10;
        this.f38002b = obj;
    }

    @Override
    public final void run(int i10) {
        ou0 ou0Var;
        int i11 = this.f38001a;
        Object obj = this.f38002b;
        switch (i11) {
            case 0:
                ((ub) obj).U0(true);
                return;
            case 1:
                xn xnVar = ((jn) obj).f34487a;
                if (i10 > 0 && xnVar.getParentActivity() != null && xnVar.fragmentView != null) {
                    org.telegram.ui.Components.xc.a0(xnVar).m(org.telegram.ui.Components.wc.I, i10, 0, 0, xnVar.f39370ea).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f31086y != null && (ou0Var = photoViewer.f30908e0) != null && i10 > 0) {
                    org.telegram.ui.Components.xc.F(ou0Var, true).j();
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f31240e1));
                return;
            default:
                wf1 wf1Var = ((bf1) obj).f32103a;
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
