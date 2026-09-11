package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class xb implements e2.h {
    public final int f42669a;
    public final Object f42670b;

    public xb(Object obj, int i10) {
        this.f42669a = i10;
        this.f42670b = obj;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f42669a;
        Object obj2 = this.f42670b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(18, (cc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(24, (ke) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                Pattern pattern = LaunchActivity.B1;
                ((ba0) obj2).run();
                return;
            case 3:
                vp0 vp0Var = (vp0) obj2;
                View view = (View) obj;
                bq0 bq0Var = vp0Var.f41619p0;
                if (view instanceof yp0) {
                    view.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
                    ((yp0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    view.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
                    ((org.telegram.ui.Cells.r8) view).v();
                    return;
                } else if (view instanceof up0) {
                    int i11 = org.telegram.ui.ActionBar.j6.f20663d6;
                    view.setBackgroundColor(bq0Var.getThemedColor(i11));
                    up0 up0Var = (up0) view;
                    bq0 bq0Var2 = up0Var.d.f41619p0;
                    up0Var.setBackgroundColor(bq0Var2.getThemedColor(i11));
                    up0Var.f41196a.setTextColor(bq0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.l4) {
                    view.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
                    return;
                } else if (view instanceof jp0) {
                    ((jp0) view).d.invalidate();
                    return;
                } else if (view instanceof aq0) {
                    vp0Var.l((aq0) view);
                    return;
                } else if (view instanceof tp0) {
                    ((tp0) view).a();
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Long l4 = (Long) obj;
                if (!n2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        n2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ue(29));
                        return;
                    }
                }
                return;
            default:
                ((eg1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
        }
    }
}
