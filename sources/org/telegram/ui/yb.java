package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class yb implements e2.h {
    public final int f39897a;
    public final Object f39898b;

    public yb(Object obj, int i10) {
        this.f39897a = i10;
        this.f39898b = obj;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f39897a;
        Object obj2 = this.f39898b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(18, (dc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
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
                wp0 wp0Var = (wp0) obj2;
                View view = (View) obj;
                cq0 cq0Var = wp0Var.f39235p0;
                if (view instanceof zp0) {
                    view.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19109d6));
                    ((zp0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.s8) {
                    view.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19109d6));
                    ((org.telegram.ui.Cells.s8) view).v();
                    return;
                } else if (view instanceof vp0) {
                    int i11 = org.telegram.ui.ActionBar.j6.f19109d6;
                    view.setBackgroundColor(cq0Var.getThemedColor(i11));
                    vp0 vp0Var = (vp0) view;
                    cq0 cq0Var2 = vp0Var.d.f39235p0;
                    vp0Var.setBackgroundColor(cq0Var2.getThemedColor(i11));
                    vp0Var.f38606a.setTextColor(cq0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n4) {
                    view.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19109d6));
                    return;
                } else if (view instanceof kp0) {
                    ((kp0) view).d.invalidate();
                    return;
                } else if (view instanceof bq0) {
                    wp0Var.l((bq0) view);
                    return;
                } else if (view instanceof up0) {
                    ((up0) view).a();
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
                        AndroidUtilities.runOnUIThread(new u21(0));
                        return;
                    }
                }
                return;
            default:
                ((fg1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
        }
    }
}
