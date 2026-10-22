package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class wa1 extends org.telegram.ui.Components.im0 {
    public final Context f42528c;
    public org.telegram.ui.ActionBar.g6 d;
    public ArrayList e;
    public final ThemeActivity f42529f;

    public wa1(ThemeActivity themeActivity, Context context) {
        this.f42529f = themeActivity;
        this.f42528c = context;
        l();
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == h() - 1) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.g6 B0;
        if (this.f42529f.f33908f == 1) {
            B0 = org.telegram.ui.ActionBar.h6.J;
        } else {
            B0 = org.telegram.ui.ActionBar.h6.B0();
        }
        this.d = B0;
        this.e = new ArrayList(this.d.f20887b0);
        super.l();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.f45920a;
        int j10 = j(i10);
        if (j10 != 0) {
            if (j10 != 1) {
                return;
            }
            ma1 ma1Var = (ma1) view;
            org.telegram.ui.ActionBar.g6 g6Var = this.d;
            int i11 = ma1.f39171c;
            ma1Var.getClass();
            if (g6Var.W >= 8) {
                ma1Var.f39173b = new int[]{g6Var.l(6), g6Var.l(4), g6Var.l(7), g6Var.l(2), g6Var.l(0), g6Var.l(5), g6Var.l(3)};
                return;
            } else {
                ma1Var.f39173b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.e = (org.telegram.ui.ActionBar.f6) this.e.get(i10);
        innerAccentView.a(false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f42528c;
        if (i10 != 0) {
            return new s4.b1(new ma1(context));
        }
        return new s4.b1(new ThemeActivity.InnerAccentView(context));
    }
}
