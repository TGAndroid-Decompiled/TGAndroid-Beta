package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class xb implements h5.d {
    public final int f39953a;
    public final Object f39954b;

    public xb(Object obj, int i10) {
        this.f39953a = i10;
        this.f39954b = obj;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f39953a;
        Object obj2 = this.f39954b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(29, (cc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hc(5, (me) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                Pattern pattern = LaunchActivity.f31586y1;
                ((t90) obj2).run();
                return;
            case 3:
                hp0 hp0Var = (hp0) obj2;
                View view = (View) obj;
                np0 np0Var = hp0Var.m0;
                if (view instanceof kp0) {
                    view.setBackgroundColor(np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                    ((kp0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n8) {
                    view.setBackgroundColor(np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                    ((org.telegram.ui.Cells.n8) view).v();
                    return;
                } else if (view instanceof gp0) {
                    int i11 = org.telegram.ui.ActionBar.j6.f19881d6;
                    view.setBackgroundColor(np0Var.getThemedColor(i11));
                    gp0 gp0Var = (gp0) view;
                    np0 np0Var2 = gp0Var.d.m0;
                    gp0Var.setBackgroundColor(np0Var2.getThemedColor(i11));
                    gp0Var.f34492a.setTextColor(np0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.l4) {
                    view.setBackgroundColor(np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                    return;
                } else if (view instanceof vo0) {
                    ((vo0) view).d.invalidate();
                    return;
                } else if (view instanceof mp0) {
                    hp0Var.l((mp0) view);
                    return;
                } else if (view instanceof fp0) {
                    ((fp0) view).a();
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
                        AndroidUtilities.runOnUIThread(new j21(1));
                        return;
                    }
                }
                return;
            default:
                ((sf1) obj2).U = (TL_stories.TL_premium_boostsStatus) obj;
                return;
        }
    }
}
