package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class xa1 extends org.telegram.ui.Components.yk0 {

    public final Context f44365c;
    public org.telegram.ui.ActionBar.f6 d;

    public ArrayList f44366e;

    public final ThemeActivity f44367f;

    public xa1(ThemeActivity themeActivity, Context context) {
        this.f44367f = themeActivity;
        this.f44365c = context;
        l();
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f44366e.isEmpty()) {
            return 0;
        }
        return this.f44366e.size() + 1;
    }

    @Override
    public final int j(int i10) {
        return i10 == h() - 1 ? 1 : 0;
    }

    @Override
    public final void l() {
        this.d = this.f44367f.f36237f == 1 ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.A0();
        this.f44366e = new ArrayList(this.d.X);
        super.l();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        View view = o1Var.f5789a;
        int iJ = j(i10);
        if (iJ == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.f6 f6Var = this.d;
            org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f44366e.get(i10);
            innerAccentView.d = f6Var;
            innerAccentView.f36267e = e6Var;
            innerAccentView.a(false);
            return;
        }
        if (iJ != 1) {
            return;
        }
        na1 na1Var = (na1) view;
        org.telegram.ui.ActionBar.f6 f6Var2 = this.d;
        int i11 = na1.f40713c;
        na1Var.getClass();
        if (f6Var2.S >= 8) {
            na1Var.f40715b = new int[]{f6Var2.l(6), f6Var2.l(4), f6Var2.l(7), f6Var2.l(2), f6Var2.l(0), f6Var2.l(5), f6Var2.l(3)};
        } else {
            na1Var.f40715b = new int[7];
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f44365c;
        return i10 != 0 ? new org.telegram.ui.Components.lk0(new na1(context)) : new org.telegram.ui.Components.lk0(new ThemeActivity.InnerAccentView(context));
    }
}
