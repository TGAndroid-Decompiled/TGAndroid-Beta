package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class vl0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final TextView f50550a;
    public org.telegram.ui.Components.ly0 f50551b;
    public final org.telegram.ui.Components.e5 f50552c;
    public final wl0 d;

    public vl0(wl0 wl0Var, Context context) {
        super(context);
        int i3;
        int i10;
        this.d = wl0Var;
        int i11 = org.telegram.ui.ActionBar.k6.f27878d6;
        cm0 cm0Var = wl0Var.f51221q0;
        org.telegram.ui.ActionBar.r6.i(i11, this, cm0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.f50550a = textView;
        textView.setTextSize(1, 16.0f);
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        boolean z10 = cm0Var.f44388a;
        org.telegram.ui.ActionBar.r6.V(textView, i12, cm0Var.getResourceProvider());
        if (wl0Var.f51218n0 == 1) {
            if (z10) {
                i10 = 2131752312;
            } else {
                i10 = 2131743740;
            }
            textView.setText(org.telegram.messenger.bd.M0(i10, null));
        } else {
            if (z10) {
                i3 = 2131752321;
            } else {
                i3 = 2131743743;
            }
            textView.setText(org.telegram.messenger.bd.M0(i3, null));
        }
        addView(textView, b8.mf.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f50552c = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i3;
        org.telegram.messenger.xo xoVar;
        org.telegram.messenger.wo d;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        wl0 wl0Var = this.d;
        cm0 cm0Var = wl0Var.f51221q0;
        int i11 = wl0Var.h;
        if (i11 < 0) {
            int i12 = org.telegram.ui.ActionBar.k6.f28160s8;
            if (org.telegram.messenger.g0.B(cm0Var.getThemedColor(i12)) > 0.8f) {
                int i13 = org.telegram.ui.ActionBar.k6.f28062n6;
                e6Var4 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.k6.w0(i13, e6Var4);
            } else if (org.telegram.messenger.g0.B(cm0Var.getThemedColor(i12)) < 0.2f) {
                int i14 = org.telegram.ui.ActionBar.k6.A8;
                e6Var3 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i14, e6Var3));
            } else {
                int i15 = org.telegram.ui.ActionBar.k6.f27878d6;
                e6Var = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i15, e6Var);
                e6Var2 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.k6.w(w02, org.telegram.ui.ActionBar.k6.r1(0.7f, cm0.B0(org.telegram.ui.ActionBar.k6.w0(i12, e6Var2))));
            }
        } else if (i11 < 7) {
            return cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f28142r8[i11]);
        } else {
            if (wl0Var.f51218n0 == 1) {
                i10 = ((org.telegram.ui.ActionBar.d2) cm0Var).currentAccount;
                xoVar = org.telegram.messenger.hp.s1(i10).f23099q4;
            } else {
                i3 = ((org.telegram.ui.ActionBar.d2) cm0Var).currentAccount;
                xoVar = org.telegram.messenger.hp.s1(i3).f23109r4;
            }
            if (xoVar != null && (d = xoVar.d(wl0Var.h)) != null) {
                return d.f();
            }
            return cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f28142r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i3;
        wl0 wl0Var = this.d;
        long j10 = wl0Var.f51217n;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.e5 e5Var = this.f50552c;
        if (i10 != 0) {
            e5Var.j(j10, z10);
            this.f50551b = null;
            return;
        }
        e5Var.g(null, z10);
        if (this.f50551b == null) {
            if (wl0Var.f51221q0.f44388a) {
                i3 = 2131752311;
            } else {
                i3 = 2131743739;
            }
            this.f50551b = new org.telegram.ui.Components.ly0(org.telegram.messenger.bd.M0(i3, null), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = org.telegram.messenger.bd.f21784a0;
        org.telegram.ui.Components.e5 e5Var = this.f50552c;
        if (z10) {
            width = org.telegram.messenger.g0.L(21.0f);
        } else {
            width = (getWidth() - e5Var.f33289s) - org.telegram.messenger.g0.L(21.0f);
        }
        int height = (getHeight() - e5Var.f33289s) / 2;
        if (org.telegram.messenger.bd.f21784a0) {
            width2 = org.telegram.messenger.g0.L(21.0f) + e5Var.f33289s;
        } else {
            width2 = getWidth() - org.telegram.messenger.g0.L(21.0f);
        }
        e5Var.setBounds(width, height, width2, (getHeight() + e5Var.f33289s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.e5 e5Var = this.f50552c;
        e5Var.k(valueOf);
        org.telegram.ui.Components.ly0 ly0Var = this.f50551b;
        if (ly0Var != null) {
            ly0Var.c((getMeasuredWidth() - this.f50551b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f51221q0.getThemedColor(org.telegram.ui.ActionBar.k6.f28121q6), canvas);
        } else {
            e5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50552c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50552c.b();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        wl0 wl0Var = this.d;
        setBackgroundColor(wl0Var.f51221q0.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
        this.f50550a.setTextColor(wl0Var.f51221q0.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
