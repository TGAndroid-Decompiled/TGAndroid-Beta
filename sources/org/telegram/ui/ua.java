package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class ua implements MessagesStorage.IntCallback {
    public final int f38378a;
    public final Object f38379b;

    public ua(Object obj, int i10) {
        this.f38378a = i10;
        this.f38379b = obj;
    }

    @Override
    public final void run(int i10) {
        nu0 nu0Var;
        int i11 = this.f38378a;
        Object obj = this.f38379b;
        switch (i11) {
            case 0:
                ((ub) obj).U0(true);
                return;
            case 1:
                wn wnVar = ((in) obj).f34557a;
                if (i10 > 0 && wnVar.getParentActivity() != null && wnVar.fragmentView != null) {
                    org.telegram.ui.Components.xc.a0(wnVar).m(org.telegram.ui.Components.wc.I, i10, 0, 0, wnVar.f39469ea).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f31401y != null && (nu0Var = photoViewer.f31223e0) != null && i10 > 0) {
                    org.telegram.ui.Components.xc.F(nu0Var, true).j();
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f31555e1));
                return;
            default:
                wf1 wf1Var = ((bf1) obj).f32415a;
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
