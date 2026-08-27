package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

public final class ub0 extends AnimatorListenerAdapter {

    public final int f43178a;

    public final float f43179b;

    public final vb0 f43180c;

    public ub0(vb0 vb0Var, float f10, int i10) {
        this.f43178a = i10;
        this.f43180c = vb0Var;
        this.f43179b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43178a) {
            case 0:
                vb0 vb0Var = this.f43180c;
                TextView textView = vb0Var.f43406f;
                int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23423y6, false);
                int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23234n6, false);
                float f10 = this.f43179b;
                vb0Var.f43409s = f10;
                textView.setTextColor(i0.b.d(f10, iW0, iW1));
                break;
            default:
                vb0 vb0Var2 = this.f43180c;
                TextView textView2 = vb0Var2.d;
                int iW2 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23423y6, false);
                int iW3 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23234n6, false);
                float f11 = this.f43179b;
                vb0Var2.f43410w = f11;
                textView2.setTextColor(i0.b.d(f11, iW2, iW3));
                break;
        }
    }
}
