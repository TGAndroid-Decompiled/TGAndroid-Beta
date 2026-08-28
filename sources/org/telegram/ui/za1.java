package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class za1 extends org.telegram.ui.Components.vk0 {
    public final Context f45097c;
    public org.telegram.ui.ActionBar.e6 d;
    public ArrayList f45098e;
    public final ThemeActivity f45099f;

    public za1(ThemeActivity themeActivity, Context context) {
        this.f45099f = themeActivity;
        this.f45097c = context;
        l();
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f45098e.isEmpty()) {
            return 0;
        }
        return this.f45098e.size() + 1;
    }

    @Override
    public final int j(int i9) {
        if (i9 == h() - 1) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.e6 A0;
        if (this.f45099f.f36234f == 1) {
            A0 = org.telegram.ui.ActionBar.f6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.f6.A0();
        }
        this.d = A0;
        this.f45098e = new ArrayList(this.d.X);
        super.l();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        View view = q1Var.f5501a;
        int j10 = j(i9);
        if (j10 != 0) {
            if (j10 != 1) {
                return;
            }
            pa1 pa1Var = (pa1) view;
            org.telegram.ui.ActionBar.e6 e6Var = this.d;
            int i10 = pa1.f41391c;
            pa1Var.getClass();
            if (e6Var.S >= 8) {
                pa1Var.f41393b = new int[]{e6Var.l(6), e6Var.l(4), e6Var.l(7), e6Var.l(2), e6Var.l(0), e6Var.l(5), e6Var.l(3)};
                return;
            } else {
                pa1Var.f41393b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.f36264e = (org.telegram.ui.ActionBar.d6) this.f45098e.get(i9);
        innerAccentView.a(false);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = this.f45097c;
        if (i9 != 0) {
            return new f2.q1(new pa1(context));
        }
        return new f2.q1(new ThemeActivity.InnerAccentView(context));
    }
}
