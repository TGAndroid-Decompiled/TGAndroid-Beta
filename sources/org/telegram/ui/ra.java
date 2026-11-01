package org.telegram.ui;

import android.graphics.RectF;
public final class ra implements org.telegram.messenger.cs {
    public final int f41021a;
    public final Object f41022b;

    public ra(Object obj, int i10) {
        this.f41021a = i10;
        this.f41022b = obj;
    }

    @Override
    public final void a(int i10) {
        zr0 zr0Var;
        int i11 = this.f41021a;
        Object obj = this.f41022b;
        switch (i11) {
            case 0:
                ((sb) obj).Z0(true);
                return;
            case 1:
                un unVar = ((fn) obj).f37191a;
                if (i10 > 0 && unVar.getParentActivity() != null && unVar.fragmentView != null) {
                    org.telegram.ui.Components.cc.a0(unVar).m(org.telegram.ui.Components.bc.I, i10, 0, 0, unVar.f42288xa).j();
                    return;
                }
                return;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).q0(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.D != null && (zr0Var = photoViewer.f33477e0) != null && i10 > 0) {
                    org.telegram.ui.Components.cc.F(zr0Var, true).j();
                    return;
                }
                return;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.S6;
                if (i10 == 1) {
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.I1 = 0;
                    profileActivity.finishFragment();
                    return;
                }
                profileActivity.getNotificationCenter().k(79, Long.valueOf(profileActivity.f33803d1));
                return;
            default:
                nb1 nb1Var = ((ta1) obj).f41604a;
                if (i10 == 0) {
                    nb1Var.S0(false);
                    return;
                } else {
                    nb1Var.finishFragment();
                    return;
                }
        }
    }
}
