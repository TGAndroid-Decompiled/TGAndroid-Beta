package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class vb implements h5.d {
    public final int f42194a;
    public final Object f42195b;

    public vb(Object obj, int i10) {
        this.f42194a = i10;
        this.f42195b = obj;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f42194a;
        Object obj2 = this.f42195b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(29, (ac) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new fc(5, (ke) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                Pattern pattern = LaunchActivity.f34134y1;
                ((s90) obj2).run();
                return;
            case 3:
                View view = (View) obj;
                ip0 ip0Var = ((dp0) obj2).f36282g0;
                if (view instanceof gp0) {
                    view.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                    ((gp0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.o8) {
                    view.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                    ((org.telegram.ui.Cells.o8) view).v();
                    return;
                } else if (view instanceof cp0) {
                    int i11 = org.telegram.ui.ActionBar.k6.f21659d6;
                    view.setBackgroundColor(ip0Var.getThemedColor(i11));
                    cp0 cp0Var = (cp0) view;
                    ip0 ip0Var2 = cp0Var.d.f36282g0;
                    cp0Var.setBackgroundColor(ip0Var2.getThemedColor(i11));
                    cp0Var.f35887a.setTextColor(ip0Var2.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m4) {
                    view.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                    return;
                } else if (view instanceof to0) {
                    ((to0) view).d.invalidate();
                    return;
                } else if (view instanceof lh.f2) {
                    view.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                    ((lh.f2) view).b();
                    return;
                } else if (view instanceof bp0) {
                    ((bp0) view).a();
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                Long l10 = (Long) obj;
                if (!p2Var.isFinished) {
                    if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                        p2Var.presentFragment(ProfileActivity.m4(l10.longValue()), true);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new sj0(3));
                        return;
                    }
                }
                return;
            default:
                ((mf1) obj2).U = (TL_stories.TL_premium_boostsStatus) obj;
                return;
        }
    }
}
