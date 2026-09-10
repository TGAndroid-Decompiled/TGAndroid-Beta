package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class zb implements e2.h {
    public final int f39251a;
    public final Object f39252b;

    public zb(Object obj, int i10) {
        this.f39251a = i10;
        this.f39252b = obj;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f39251a;
        Object obj2 = this.f39252b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new n(15, (ec) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new n(21, (le) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                Pattern pattern = LaunchActivity.B1;
                ((aa0) obj2).run();
                return;
            case 3:
                up0 up0Var = (up0) obj2;
                View view = (View) obj;
                bq0 bq0Var = up0Var.f37324p0;
                if (view instanceof xp0) {
                    view.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                    ((xp0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.s8) {
                    view.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                    ((org.telegram.ui.Cells.s8) view).v();
                    return;
                } else if (view instanceof tp0) {
                    int i11 = org.telegram.ui.ActionBar.j6.f17928d6;
                    view.setBackgroundColor(bq0Var.getThemedColor(i11));
                    tp0 tp0Var = (tp0) view;
                    bq0 bq0Var2 = tp0Var.d.f37324p0;
                    tp0Var.setBackgroundColor(bq0Var2.getThemedColor(i11));
                    tp0Var.f36984a.setTextColor(bq0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m4) {
                    view.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                    return;
                } else if (view instanceof ip0) {
                    ((ip0) view).d.invalidate();
                    return;
                } else if (view instanceof aq0) {
                    up0Var.l((aq0) view);
                    return;
                } else if (view instanceof sp0) {
                    ((sp0) view).a();
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                Long l4 = (Long) obj;
                if (!p2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        p2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c30(23));
                        return;
                    }
                }
                return;
            default:
                ((ig1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
        }
    }
}
