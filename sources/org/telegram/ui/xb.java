package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class xb implements e2.h {
    public final int f39565a;
    public final Object f39566b;

    public xb(Object obj, int i10) {
        this.f39565a = i10;
        this.f39566b = obj;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f39565a;
        Object obj2 = this.f39566b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(12, (cc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new l4(18, (je) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                Pattern pattern = LaunchActivity.B1;
                ((aa0) obj2).run();
                return;
            case 3:
                up0 up0Var = (up0) obj2;
                View view = (View) obj;
                aq0 aq0Var = up0Var.f38083p0;
                if (view instanceof xp0) {
                    view.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
                    ((xp0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    view.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
                    ((org.telegram.ui.Cells.r8) view).v();
                    return;
                } else if (view instanceof tp0) {
                    int i11 = org.telegram.ui.ActionBar.i6.f18836d6;
                    view.setBackgroundColor(aq0Var.getThemedColor(i11));
                    tp0 tp0Var = (tp0) view;
                    aq0 aq0Var2 = tp0Var.d.f38083p0;
                    tp0Var.setBackgroundColor(aq0Var2.getThemedColor(i11));
                    tp0Var.f37761a.setTextColor(aq0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.l4) {
                    view.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
                    return;
                } else if (view instanceof ip0) {
                    ((ip0) view).d.invalidate();
                    return;
                } else if (view instanceof zp0) {
                    up0Var.l((zp0) view);
                    return;
                } else if (view instanceof sp0) {
                    ((sp0) view).a();
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
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(28));
                        return;
                    }
                }
                return;
            default:
                ((dg1) obj2).X = (TL_stories.TL_premium_boostsStatus) obj;
                return;
        }
    }
}
