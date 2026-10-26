package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class wa implements MessagesStorage.IntCallback {
    public final int f45055a;
    public final Object f45056b;

    public wa(Object obj, int i10) {
        this.f45055a = i10;
        this.f45056b = obj;
    }

    @Override
    public final void run(int i10) {
        iu0 iu0Var;
        int i11 = this.f45055a;
        Object obj = this.f45056b;
        switch (i11) {
            case 0:
                ((wb) obj).V0(true);
                return;
            case 1:
                un unVar = ((fn) obj).f39423a;
                if (i10 > 0 && unVar.getParentActivity() != null && unVar.fragmentView != null) {
                    org.telegram.ui.Components.wc.b0(unVar).m(org.telegram.ui.Components.vc.I, i10, 0, 0, unVar.f44388qa).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).m0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f35825y != null && (iu0Var = photoViewer.f35646e0) != null && i10 > 0) {
                    org.telegram.ui.Components.wc.F(iu0Var, true).j();
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f35979e1));
                return;
            default:
                af1 af1Var = ((fe1) obj).f39353a;
                if (i10 == 0) {
                    af1Var.O0(false);
                    return;
                } else {
                    af1Var.finishFragment();
                    return;
                }
        }
    }
}
