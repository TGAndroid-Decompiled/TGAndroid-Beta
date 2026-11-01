package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class x71 extends org.telegram.ui.Components.tk0 {
    public final Context f43278c;
    public org.telegram.ui.ActionBar.s6 d;
    public ArrayList e;
    public final ThemeActivity f43279f;

    public x71(ThemeActivity themeActivity, Context context) {
        this.f43279f = themeActivity;
        this.f43278c = context;
        f();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int b() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override
    public final int d(int i10) {
        if (i10 == b() - 1) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void f() {
        org.telegram.ui.ActionBar.s6 D0;
        if (this.f43279f.f34102f == 1) {
            D0 = org.telegram.ui.ActionBar.t6.J;
        } else {
            D0 = org.telegram.ui.ActionBar.t6.D0();
        }
        this.d = D0;
        this.e = new ArrayList(this.d.f20805b0);
        super.f();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        View view = c1Var.f47909a;
        int d = d(i10);
        if (d != 0) {
            if (d != 1) {
                return;
            }
            o71 o71Var = (o71) view;
            org.telegram.ui.ActionBar.s6 s6Var = this.d;
            int i11 = o71.f40071c;
            o71Var.getClass();
            if (s6Var.W >= 8) {
                o71Var.f40073b = new int[]{s6Var.l(6), s6Var.l(4), s6Var.l(7), s6Var.l(2), s6Var.l(0), s6Var.l(5), s6Var.l(3)};
                return;
            } else {
                o71Var.f40073b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.e = (org.telegram.ui.ActionBar.r6) this.e.get(i10);
        innerAccentView.a(false);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        Context context = this.f43278c;
        if (i10 != 0) {
            return new s4.c1(new o71(context));
        }
        return new s4.c1(new ThemeActivity.InnerAccentView(context));
    }
}
