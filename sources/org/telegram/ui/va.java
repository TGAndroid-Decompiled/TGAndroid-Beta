package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class va implements MessagesStorage.IntCallback {
    public final int f42672a;
    public final Object f42673b;

    public va(Object obj, int i10) {
        this.f42672a = i10;
        this.f42673b = obj;
    }

    @Override
    public final void run(int i10) {
        eu0 eu0Var;
        int i11 = this.f42672a;
        Object obj = this.f42673b;
        switch (i11) {
            case 0:
                ((vb) obj).U0(true);
                return;
            case 1:
                sn snVar = ((dn) obj).f36660a;
                if (i10 > 0 && snVar.getParentActivity() != null && snVar.fragmentView != null) {
                    org.telegram.ui.Components.xc.a0(snVar).m(org.telegram.ui.Components.wc.I, i10, 0, 0, snVar.f41654qa).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f33759y != null && (eu0Var = photoViewer.f33580e0) != null && i10 > 0) {
                    org.telegram.ui.Components.xc.F(eu0Var, true).j();
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f33921f1));
                return;
            default:
                ye1 ye1Var = ((ce1) obj).f36346a;
                if (i10 == 0) {
                    ye1Var.N0(false);
                    return;
                } else {
                    ye1Var.finishFragment();
                    return;
                }
        }
    }
}
