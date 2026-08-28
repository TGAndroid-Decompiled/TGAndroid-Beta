package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class sb implements d5.d {
    public final int f42647a;
    public final Object f42648b;

    public sb(Object obj, int i9) {
        this.f42647a = i9;
        this.f42648b = obj;
    }

    @Override
    public final void accept(Object obj) {
        int i9 = this.f42647a;
        Object obj2 = this.f42648b;
        switch (i9) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(24, (xb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new rd(0, (fe) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                Pattern pattern = LaunchActivity.f35493x1;
                ((f90) obj2).run();
                return;
            case 3:
                View view = (View) obj;
                zo0 zo0Var = ((uo0) obj2).f43287f0;
                if (view instanceof xo0) {
                    view.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                    ((xo0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.p8) {
                    view.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                    ((org.telegram.ui.Cells.p8) view).v();
                    return;
                } else if (view instanceof to0) {
                    int i10 = org.telegram.ui.ActionBar.f6.f23001d6;
                    view.setBackgroundColor(zo0Var.getThemedColor(i10));
                    to0 to0Var = (to0) view;
                    zo0 zo0Var2 = to0Var.d.f43287f0;
                    to0Var.setBackgroundColor(zo0Var2.getThemedColor(i10));
                    to0Var.f43046a.setTextColor(zo0Var2.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m4) {
                    view.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                    return;
                } else if (view instanceof ko0) {
                    ((ko0) view).d.invalidate();
                    return;
                } else if (view instanceof fh.o2) {
                    view.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                    ((fh.o2) view).b();
                    return;
                } else if (view instanceof so0) {
                    ((so0) view).a();
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                Long l10 = (Long) obj;
                if (!o2Var.isFinished) {
                    if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                        o2Var.presentFragment(ProfileActivity.m4(l10.longValue()), true);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new lj0(3));
                        return;
                    }
                }
                return;
            default:
                ((we1) obj2).T = (TL_stories.TL_premium_boostsStatus) obj;
                return;
        }
    }
}
