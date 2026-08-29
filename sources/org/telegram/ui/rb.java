package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class rb implements f5.d {
    public final int f42024a;
    public final Object f42025b;

    public rb(Object obj, int i10) {
        this.f42024a = i10;
        this.f42025b = obj;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f42024a;
        Object obj2 = this.f42025b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(21, (wb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(27, (de) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                Pattern pattern = LaunchActivity.f35560x1;
                ((j90) obj2).run();
                return;
            case 3:
                View view = (View) obj;
                yo0 yo0Var = ((to0) obj2).f43077f0;
                if (view instanceof wo0) {
                    view.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                    ((wo0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m8) {
                    view.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                    ((org.telegram.ui.Cells.m8) view).v();
                    return;
                } else if (view instanceof so0) {
                    int i11 = org.telegram.ui.ActionBar.g6.f23062d6;
                    view.setBackgroundColor(yo0Var.getThemedColor(i11));
                    so0 so0Var = (so0) view;
                    yo0 yo0Var2 = so0Var.d.f43077f0;
                    so0Var.setBackgroundColor(yo0Var2.getThemedColor(i11));
                    so0Var.f42437a.setTextColor(yo0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.k4) {
                    view.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                    return;
                } else if (view instanceof jo0) {
                    ((jo0) view).d.invalidate();
                    return;
                } else if (view instanceof ih.g2) {
                    view.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                    ((ih.g2) view).b();
                    return;
                } else if (view instanceof ro0) {
                    ((ro0) view).a();
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
                        AndroidUtilities.runOnUIThread(new ef0(5));
                        return;
                    }
                }
                return;
            default:
                ((ze1) obj2).T = (TL_stories.TL_premium_boostsStatus) obj;
                return;
        }
    }
}
