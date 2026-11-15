package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class u90 extends AnimatorListenerAdapter {
    public final int f51831a;
    public final float f51832b;
    public final v90 f51833c;

    public u90(v90 v90Var, float f10, int i7) {
        this.f51831a = i7;
        this.f51833c = v90Var;
        this.f51832b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51831a) {
            case 0:
                v90 v90Var = this.f51833c;
                TextView textView = v90Var.f52168f;
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false);
                int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29031n6, false);
                float f10 = this.f51832b;
                v90Var.f52171s = f10;
                textView.setTextColor(i0.a.f(f10, x02, x03));
                return;
            default:
                v90 v90Var2 = this.f51833c;
                TextView textView2 = v90Var2.d;
                int x04 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false);
                int x05 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29031n6, false);
                float f11 = this.f51832b;
                v90Var2.f52173x = f11;
                textView2.setTextColor(i0.a.f(f11, x04, x05));
                return;
        }
    }
}
