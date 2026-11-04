package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class x51 extends org.telegram.ui.Components.sj0 {
    public final Context f51833c;
    public org.telegram.ui.ActionBar.j6 d;
    public ArrayList f51834e;
    public final ThemeActivity f51835f;

    public x51(ThemeActivity themeActivity, Context context) {
        this.f51835f = themeActivity;
        this.f51833c = context;
        f();
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        if (this.f51834e.isEmpty()) {
            return 0;
        }
        return this.f51834e.size() + 1;
    }

    @Override
    public final int d(int i3) {
        if (i3 == b() - 1) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void f() {
        org.telegram.ui.ActionBar.j6 D0;
        if (this.f51835f.f42050f == 1) {
            D0 = org.telegram.ui.ActionBar.k6.J;
        } else {
            D0 = org.telegram.ui.ActionBar.k6.D0();
        }
        this.d = D0;
        this.f51834e = new ArrayList(this.d.f27680c0);
        super.f();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        View view = d1Var.f55540a;
        int d = d(i3);
        if (d != 0) {
            if (d != 1) {
                return;
            }
            o51 o51Var = (o51) view;
            org.telegram.ui.ActionBar.j6 j6Var = this.d;
            int i10 = o51.f48199c;
            o51Var.getClass();
            if (j6Var.X >= 8) {
                o51Var.f48201b = new int[]{j6Var.l(6), j6Var.l(4), j6Var.l(7), j6Var.l(2), j6Var.l(0), j6Var.l(5), j6Var.l(3)};
                return;
            } else {
                o51Var.f48201b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.f42080e = (org.telegram.ui.ActionBar.g6) this.f51834e.get(i3);
        innerAccentView.a(false);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        Context context = this.f51833c;
        if (i3 != 0) {
            return new u4.d1(new o51(context));
        }
        return new u4.d1(new ThemeActivity.InnerAccentView(context));
    }
}
