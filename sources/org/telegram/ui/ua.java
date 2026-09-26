package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class ua implements MessagesStorage.IntCallback {
    public final int f38377a;
    public final Object f38378b;

    public ua(Object obj, int i10) {
        this.f38377a = i10;
        this.f38378b = obj;
    }

    @Override
    public final void run(int i10) {
        nu0 nu0Var;
        int i11 = this.f38377a;
        Object obj = this.f38378b;
        switch (i11) {
            case 0:
                ((ub) obj).U0(true);
                return;
            case 1:
                wn wnVar = ((in) obj).f34556a;
                if (i10 > 0 && wnVar.getParentActivity() != null && wnVar.fragmentView != null) {
                    org.telegram.ui.Components.xc.a0(wnVar).m(org.telegram.ui.Components.wc.I, i10, 0, 0, wnVar.f39468ea).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f31400y != null && (nu0Var = photoViewer.f31222e0) != null && i10 > 0) {
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f31554e1));
                return;
            default:
                wf1 wf1Var = ((bf1) obj).f32414a;
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
