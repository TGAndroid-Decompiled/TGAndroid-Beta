package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class v90 extends AnimatorListenerAdapter {
    public final int f52733a;
    public final float f52734b;
    public final w90 f52735c;

    public v90(w90 w90Var, float f10, int i7) {
        this.f52733a = i7;
        this.f52735c = w90Var;
        this.f52734b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52733a) {
            case 0:
                w90 w90Var = this.f52735c;
                TextView textView = w90Var.f53026f;
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29788y6, false);
                int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29578n6, false);
                float f10 = this.f52734b;
                w90Var.f53029s = f10;
                textView.setTextColor(i0.a.f(f10, x02, x03));
                return;
            default:
                w90 w90Var2 = this.f52735c;
                TextView textView2 = w90Var2.d;
                int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29788y6, false);
                int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29578n6, false);
                float f11 = this.f52734b;
                w90Var2.f53031x = f11;
                textView2.setTextColor(i0.a.f(f11, x04, x05));
                return;
        }
    }
}
