package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class wa implements MessagesStorage.IntCallback {
    public final int f37783a;
    public final Object f37784b;

    public wa(Object obj, int i10) {
        this.f37783a = i10;
        this.f37784b = obj;
    }

    @Override
    public final void run(int i10) {
        wu0 wu0Var;
        int i11 = this.f37783a;
        Object obj = this.f37784b;
        switch (i11) {
            case 0:
                ((wb) obj).V0(true);
                return;
            case 1:
                eo eoVar = ((pn) obj).f35881a;
                if (i10 > 0 && eoVar.getParentActivity() != null && eoVar.fragmentView != null) {
                    org.telegram.ui.Components.wc.a0(eoVar).m(org.telegram.ui.Components.vc.I, i10, 0, 0, eoVar.f32316ea).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f30227y != null && (wu0Var = photoViewer.f30049e0) != null && i10 > 0) {
                    org.telegram.ui.Components.wc.F(wu0Var, true).j();
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f30381e1));
                return;
            default:
                ig1 ig1Var = ((nf1) obj).f35264a;
                if (i10 == 0) {
                    ig1Var.O0(false);
                    return;
                } else {
                    ig1Var.finishFragment();
                    return;
                }
        }
    }
}
