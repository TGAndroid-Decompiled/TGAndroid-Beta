package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class ya1 extends org.telegram.ui.Components.hm0 {
    public final Context f43375c;
    public org.telegram.ui.ActionBar.g6 d;
    public ArrayList e;
    public final ThemeActivity f43376f;

    public ya1(ThemeActivity themeActivity, Context context) {
        this.f43376f = themeActivity;
        this.f43375c = context;
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
        if (this.f43376f.f33890f == 1) {
            B0 = org.telegram.ui.ActionBar.h6.J;
        } else {
            B0 = org.telegram.ui.ActionBar.h6.B0();
        }
        this.d = B0;
        this.e = new ArrayList(this.d.f20880b0);
        super.l();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.f45938a;
        int j10 = j(i10);
        if (j10 != 0) {
            if (j10 != 1) {
                return;
            }
            oa1 oa1Var = (oa1) view;
            org.telegram.ui.ActionBar.g6 g6Var = this.d;
            int i11 = oa1.f39700c;
            oa1Var.getClass();
            if (g6Var.W >= 8) {
                oa1Var.f39702b = new int[]{g6Var.l(6), g6Var.l(4), g6Var.l(7), g6Var.l(2), g6Var.l(0), g6Var.l(5), g6Var.l(3)};
                return;
            } else {
                oa1Var.f39702b = new int[7];
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
        Context context = this.f43375c;
        if (i10 != 0) {
            return new s4.b1(new oa1(context));
        }
        return new s4.b1(new ThemeActivity.InnerAccentView(context));
    }
}
