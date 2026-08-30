package org.telegram.ui;

import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class vb implements h5.d {
    public final int f39137a;
    public final Object f39138b;

    public vb(Object obj, int i10) {
        this.f39137a = i10;
        this.f39138b = obj;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f39137a;
        Object obj2 = this.f39138b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new yb(0, (bc) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new yb(6, (ke) obj2, (TL_stories.TL_premium_boostsStatus) obj));
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                Pattern pattern = LaunchActivity.f31612y1;
                ((r90) obj2).run();
                return;
            case 3:
                View view = (View) obj;
                gp0 gp0Var = ((bp0) obj2).f33007g0;
                if (view instanceof ep0) {
                    view.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                    ((ep0) view).b();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.o8) {
                    view.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                    ((org.telegram.ui.Cells.o8) view).v();
                    return;
                } else if (view instanceof ap0) {
                    int i11 = org.telegram.ui.ActionBar.j6.f19906d6;
                    view.setBackgroundColor(gp0Var.getThemedColor(i11));
                    ap0 ap0Var = (ap0) view;
                    gp0 gp0Var2 = ap0Var.d.f33007g0;
                    ap0Var.setBackgroundColor(gp0Var2.getThemedColor(i11));
                    ap0Var.f32685a.setTextColor(gp0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m4) {
                    view.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                    return;
                } else if (view instanceof ro0) {
                    ((ro0) view).d.invalidate();
                    return;
                } else if (view instanceof kh.g2) {
                    view.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                    ((kh.g2) view).b();
                    return;
                } else if (view instanceof zo0) {
                    ((zo0) view).a();
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
                        AndroidUtilities.runOnUIThread(new c21(1));
                        return;
                    }
                }
                return;
            default:
                ((kf1) obj2).U = (TL_stories.TL_premium_boostsStatus) obj;
                return;
        }
    }
}
