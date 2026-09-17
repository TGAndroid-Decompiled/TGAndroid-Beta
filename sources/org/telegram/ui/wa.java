package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
public final class wa implements MessagesStorage.IntCallback {
    public final int f38626a;
    public final Object f38627b;

    public wa(Object obj, int i10) {
        this.f38626a = i10;
        this.f38627b = obj;
    }

    @Override
    public final void run(int i10) {
        xu0 xu0Var;
        int i11 = this.f38626a;
        Object obj = this.f38627b;
        switch (i11) {
            case 0:
                ((wb) obj).U0(true);
                return;
            case 1:
                bo boVar = ((nn) obj).f36134a;
                if (i10 > 0 && boVar.getParentActivity() != null && boVar.fragmentView != null) {
                    org.telegram.ui.Components.vc.a0(boVar).m(org.telegram.ui.Components.uc.I, i10, 0, 0, boVar.f32275ea).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.f31128y != null && (xu0Var = photoViewer.f30950e0) != null && i10 > 0) {
                    org.telegram.ui.Components.vc.F(xu0Var, true).j();
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
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f31282e1));
                return;
            default:
                fg1 fg1Var = ((kf1) obj).f35270a;
                if (i10 == 0) {
                    fg1Var.O0(false);
                    return;
                } else {
                    fg1Var.finishFragment();
                    return;
                }
        }
    }
}
