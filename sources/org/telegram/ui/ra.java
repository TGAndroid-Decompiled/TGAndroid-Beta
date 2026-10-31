package org.telegram.ui;

import android.graphics.RectF;
public final class ra implements org.telegram.messenger.bs {
    public final int f41186a;
    public final Object f41187b;

    public ra(Object obj, int i10) {
        this.f41186a = i10;
        this.f41187b = obj;
    }

    @Override
    public final void a(int i10) {
        as0 as0Var;
        int i11 = this.f41186a;
        Object obj = this.f41187b;
        switch (i11) {
            case 0:
                ((sb) obj).Y0(true);
                return;
            case 1:
                un unVar = ((fn) obj).f37301a;
                if (i10 > 0 && unVar.getParentActivity() != null && unVar.fragmentView != null) {
                    org.telegram.ui.Components.cc.a0(unVar).m(org.telegram.ui.Components.bc.I, i10, 0, 0, unVar.f42477xa).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).p0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.D != null && (as0Var = photoViewer.f33470e0) != null && i10 > 0) {
                    org.telegram.ui.Components.cc.F(as0Var, true).j();
                    return;
                }
                return;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.R6;
                if (i10 == 1) {
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.I1 = 0;
                    profileActivity.finishFragment();
                    return;
                }
                profileActivity.getNotificationCenter().k(79, Long.valueOf(profileActivity.f33796d1));
                return;
            default:
                pb1 pb1Var = ((va1) obj).f42692a;
                if (i10 == 0) {
                    pb1Var.R0(false);
                    return;
                } else {
                    pb1Var.finishFragment();
                    return;
                }
        }
    }
}
