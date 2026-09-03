package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class ub1 extends org.telegram.ui.Components.rl0 {
    public final Context f41793c;
    public org.telegram.ui.ActionBar.j6 d;
    public ArrayList f41794e;
    public final ThemeActivity f41795f;

    public ub1(ThemeActivity themeActivity, Context context) {
        this.f41795f = themeActivity;
        this.f41793c = context;
        l();
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f41794e.isEmpty()) {
            return 0;
        }
        return this.f41794e.size() + 1;
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
        org.telegram.ui.ActionBar.j6 A0;
        if (this.f41795f.f34879f == 1) {
            A0 = org.telegram.ui.ActionBar.k6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.k6.A0();
        }
        this.d = A0;
        this.f41794e = new ArrayList(this.d.Y);
        super.l();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        View view = m1Var.f5875a;
        int j10 = j(i10);
        if (j10 != 0) {
            if (j10 != 1) {
                return;
            }
            kb1 kb1Var = (kb1) view;
            org.telegram.ui.ActionBar.j6 j6Var = this.d;
            int i11 = kb1.f38244c;
            kb1Var.getClass();
            if (j6Var.T >= 8) {
                kb1Var.f38246b = new int[]{j6Var.l(6), j6Var.l(4), j6Var.l(7), j6Var.l(2), j6Var.l(0), j6Var.l(5), j6Var.l(3)};
                return;
            } else {
                kb1Var.f38246b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.f34909e = (org.telegram.ui.ActionBar.i6) this.f41794e.get(i10);
        innerAccentView.a(false);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f41793c;
        if (i10 != 0) {
            return new f2.m1(new kb1(context));
        }
        return new f2.m1(new ThemeActivity.InnerAccentView(context));
    }
}
