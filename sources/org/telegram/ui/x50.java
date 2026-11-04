package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class x50 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.k5 f51829a;
    public final org.telegram.ui.Components.x8 f51830b;
    public boolean f51831c;
    public int d;
    public final y50 f51832e;

    public x50(y50 y50Var, Context context) {
        super(context);
        this.f51832e = y50Var;
        int i3 = org.telegram.ui.ActionBar.k6.f27972i6;
        this.d = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f51829a = k5Var;
        k5Var.setTextSize(16);
        k5Var.setEllipsizeByGradient(true);
        k5Var.setRightPadding(org.telegram.messenger.g0.L(68.0f));
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.f27988j5, null);
        addView(k5Var, b8.mf.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.x8 x8Var = new org.telegram.ui.Components.x8(context, false);
        this.f51830b = x8Var;
        x8Var.f40266a.f39947a = true;
        x8Var.setStyle(11);
        x8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(x8Var, b8.mf.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.x0(null, i3, false), 0, 4));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        this.f51831c = true;
        org.telegram.ui.ActionBar.k5 k5Var = this.f51829a;
        k5Var.setVisibility(8);
        super.onMeasure(i3, i10);
        k5Var.setVisibility(0);
        k5Var.getLayoutParams().width = getMeasuredWidth();
        this.f51831c = false;
        this.f51832e.g();
        super.onMeasure(i3, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f51831c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27972i6, false);
            if (x02 != this.d) {
                this.d = x02;
                org.telegram.ui.ActionBar.k6.H1(getBackground(), x02, true);
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
