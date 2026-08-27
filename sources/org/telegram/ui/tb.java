package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

public final class tb implements d5.d {

    public final int f42847a;

    public final Object f42848b;

    public tb(Object obj, int i10) {
        this.f42847a = i10;
        this.f42848b = obj;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f42847a;
        Object obj2 = this.f42848b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(24, (yb) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new rd(0, (fe) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                break;
            case 2:
                Pattern pattern = LaunchActivity.f35496x1;
                ((j90) obj2).run();
                break;
            case 3:
                View view = (View) obj;
                ap0 ap0Var = ((vo0) obj2).f43505f0;
                if (view instanceof yo0) {
                    view.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                    ((yo0) view).b();
                } else if (view instanceof org.telegram.ui.Cells.l8) {
                    view.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                    ((org.telegram.ui.Cells.l8) view).v();
                } else if (view instanceof uo0) {
                    int i11 = org.telegram.ui.ActionBar.g6.f23053d6;
                    view.setBackgroundColor(ap0Var.getThemedColor(i11));
                    uo0 uo0Var = (uo0) view;
                    ap0 ap0Var2 = uo0Var.d.f43505f0;
                    uo0Var.setBackgroundColor(ap0Var2.getThemedColor(i11));
                    uo0Var.f43266a.setTextColor(ap0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                } else if (view instanceof org.telegram.ui.Cells.j4) {
                    view.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                } else if (view instanceof lo0) {
                    ((lo0) view).d.invalidate();
                } else if (view instanceof gh.j2) {
                    view.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                    ((gh.j2) view).b();
                } else if (view instanceof to0) {
                    ((to0) view).a();
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Long l10 = (Long) obj;
                if (!n2Var.isFinished) {
                    if (l10 == null || l10.longValue() == Long.MAX_VALUE) {
                        AndroidUtilities.runOnUIThread(new tq0(2));
                    } else {
                        n2Var.presentFragment(ProfileActivity.m4(l10.longValue()), true);
                    }
                    break;
                }
                break;
            default:
                ((we1) obj2).T = (TL_stories.TL_premium_boostsStatus) obj;
                break;
        }
    }
}
