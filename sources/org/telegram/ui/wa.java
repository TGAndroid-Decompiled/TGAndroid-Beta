package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class wa implements MessagesStorage.IntCallback {
    public final int f44579a;
    public final Object f44580b;

    public wa(Object obj, int i10) {
        this.f44579a = i10;
        this.f44580b = obj;
    }

    @Override
    public final void run(int i10) {
        ku0 ku0Var;
        int i11 = this.f44579a;
        Object obj = this.f44580b;
        switch (i11) {
            case 0:
                ((wb) obj).V0(true);
                return;
            case 1:
                wn wnVar = ((hn) obj).f39938a;
                if (i10 > 0 && wnVar.getParentActivity() != null && wnVar.fragmentView != null) {
                    org.telegram.ui.Components.wc.b0(wnVar).m(org.telegram.ui.Components.vc.I, i10, 0, 0, wnVar.f45309ua).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).m0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f35849y != null && (ku0Var = photoViewer.f35670e0) != null && i10 > 0) {
                    org.telegram.ui.Components.wc.F(ku0Var, true).j();
                    return;
                }
                return;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                int i12 = ProfileActivity.R6;
                if (i10 == 1) {
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i13 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i13);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i13, new Object[0]);
                    profileActivity.J1 = 0;
                    profileActivity.finishFragment();
                    return;
                }
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f36003e1));
                return;
            default:
                cf1 cf1Var = ((he1) obj).f39869a;
                if (i10 == 0) {
                    cf1Var.O0(false);
                    return;
                } else {
                    cf1Var.finishFragment();
                    return;
                }
        }
    }
}
