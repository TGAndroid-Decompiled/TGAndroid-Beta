package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;
public final class vb1 extends org.telegram.ui.Components.ql0 {
    public final Context f39068c;
    public org.telegram.ui.ActionBar.i6 d;
    public ArrayList e;
    public final ThemeActivity f39069f;

    public vb1(ThemeActivity themeActivity, Context context) {
        this.f39069f = themeActivity;
        this.f39068c = context;
        l();
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
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
        org.telegram.ui.ActionBar.i6 A0;
        if (this.f39069f.f32313f == 1) {
            A0 = org.telegram.ui.ActionBar.j6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.j6.A0();
        }
        this.d = A0;
        this.e = new ArrayList(this.d.Y);
        super.l();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        View view = l1Var.f5774a;
        int j10 = j(i10);
        if (j10 != 0) {
            if (j10 != 1) {
                return;
            }
            lb1 lb1Var = (lb1) view;
            org.telegram.ui.ActionBar.i6 i6Var = this.d;
            int i11 = lb1.f35730c;
            lb1Var.getClass();
            if (i6Var.T >= 8) {
                lb1Var.f35732b = new int[]{i6Var.l(6), i6Var.l(4), i6Var.l(7), i6Var.l(2), i6Var.l(0), i6Var.l(5), i6Var.l(3)};
                return;
            } else {
                lb1Var.f35732b = new int[7];
                return;
            }
        }
        ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
        innerAccentView.d = this.d;
        innerAccentView.e = (org.telegram.ui.ActionBar.h6) this.e.get(i10);
        innerAccentView.a(false);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f39068c;
        if (i10 != 0) {
            return new f2.l1(new lb1(context));
        }
        return new f2.l1(new ThemeActivity.InnerAccentView(context));
    }
}
