package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class va implements MessagesStorage.IntCallback {
    public final int f39060a;
    public final Object f39061b;

    public va(Object obj, int i10) {
        this.f39060a = i10;
        this.f39061b = obj;
    }

    @Override
    public final void run(int i10) {
        iu0 iu0Var;
        int i11 = this.f39060a;
        Object obj = this.f39061b;
        switch (i11) {
            case 0:
                ((ub) obj).V0(true);
                return;
            case 1:
                zn znVar = ((ln) obj).f35808a;
                if (i10 > 0 && znVar.getParentActivity() != null && znVar.fragmentView != null) {
                    org.telegram.ui.Components.qc.a0(znVar).m(org.telegram.ui.Components.pc.F, i10, 0, 0, znVar.f40534ba).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f31887y != null && (iu0Var = photoViewer.f31679b0) != null && i10 > 0) {
                    org.telegram.ui.Components.qc.F(iu0Var, true).j();
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
                    profileActivity.G1 = 0;
                    profileActivity.finishFragment();
                    return;
                }
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f32011b1));
                return;
            default:
                sf1 sf1Var = ((we1) obj).f39354a;
                if (i10 == 0) {
                    sf1Var.O0(false);
                    return;
                } else {
                    sf1Var.finishFragment();
                    return;
                }
        }
    }
}
