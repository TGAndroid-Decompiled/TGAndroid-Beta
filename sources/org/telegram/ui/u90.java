package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class u90 extends AnimatorListenerAdapter {
    public final int f51830a;
    public final float f51831b;
    public final v90 f51832c;

    public u90(v90 v90Var, float f10, int i7) {
        this.f51830a = i7;
        this.f51832c = v90Var;
        this.f51831b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51830a) {
            case 0:
                v90 v90Var = this.f51832c;
                TextView textView = v90Var.f52170f;
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false);
                int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29031n6, false);
                float f10 = this.f51831b;
                v90Var.f52173s = f10;
                textView.setTextColor(i0.a.f(f10, x02, x03));
                return;
            default:
                v90 v90Var2 = this.f51832c;
                TextView textView2 = v90Var2.d;
                int x04 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false);
                int x05 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29031n6, false);
                float f11 = this.f51831b;
                v90Var2.f52175x = f11;
                textView2.setTextColor(i0.a.f(f11, x04, x05));
                return;
        }
    }
}
