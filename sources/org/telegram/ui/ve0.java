package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class ve0 extends FrameLayout {
    public static final int F = 0;
    public final PointF D;
    public int E;
    public final e f42507a;
    public final ViewGroup f42508b;
    public final View f42509c;
    public final View d;
    public final View e;
    public final org.telegram.ui.Components.w21 f42510f;
    public final org.telegram.ui.Components.f10 h;
    public final TextView f42511n;
    public final TextView f42512r;
    public final TextView f42513s;
    public final TextView f42514w;
    public final FrameLayout f42515x;
    public boolean f42516y;

    public ve0(Context context, ViewGroup viewGroup, View view, String str, final e eVar) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        PointF pointF = new PointF();
        this.D = pointF;
        this.f42508b = viewGroup;
        this.f42509c = view;
        this.f42507a = eVar;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new e50(this, 9));
        addView(view2, w7.b6.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.w21 w21Var = new org.telegram.ui.Components.w21(getContext());
        this.f42510f = w21Var;
        w21Var.setTransformType(1);
        w21Var.setDrawBackground(false);
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null, false);
        this.h = f10Var;
        f10Var.addView(w21Var, w7.b6.e(56, 56, 17));
        f10Var.a(w21Var);
        f10Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        ve0 ve0Var = this;
                        ve0Var.getClass();
                        eVar.a2(ve0Var);
                        return;
                    case 1:
                        ve0 ve0Var2 = this;
                        ve0Var2.getClass();
                        eVar.getClass();
                        ve0Var2.a();
                        return;
                    default:
                        ve0 ve0Var3 = this;
                        ve0Var3.getClass();
                        eVar.a2(ve0Var3);
                        return;
                }
            }
        });
        f10Var.setContentDescription(org.telegram.messenger.dd.L0(2131751355, null));
        addView(f10Var, w7.b6.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42515x = frameLayout;
        addView(frameLayout, w7.b6.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f42511n = textView;
        textView.setText(org.telegram.messenger.dd.L0(2131751816, null));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (org.telegram.messenger.dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView, w7.b6.d(-1, -2.0f, i10, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f42512r = l4;
        l4.setText(str);
        l4.setTextSize(1, 18.0f);
        l4.setTypeface(org.telegram.messenger.i0.o());
        l4.setSingleLine();
        if (org.telegram.messenger.dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(l4, w7.b6.d(-1, -2.0f, i11, 24.0f, 48.0f, 24.0f, 0.0f));
        int L = org.telegram.messenger.i0.L(16.0f);
        TextView textView2 = new TextView(context);
        this.f42513s = textView2;
        textView2.setText(org.telegram.messenger.dd.L0(2131751336, null));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int L2 = org.telegram.messenger.i0.L(6.0f);
        int i14 = org.telegram.ui.ActionBar.t6.Ki;
        textView2.setBackground(org.telegram.ui.ActionBar.t6.J0(L2, org.telegram.ui.ActionBar.t6.x0(null, i14, false)));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        ve0 ve0Var = this;
                        ve0Var.getClass();
                        eVar.a2(ve0Var);
                        return;
                    case 1:
                        ve0 ve0Var2 = this;
                        ve0Var2.getClass();
                        eVar.getClass();
                        ve0Var2.a();
                        return;
                    default:
                        ve0 ve0Var3 = this;
                        ve0Var3.getClass();
                        eVar.a2(ve0Var3);
                        return;
                }
            }
        });
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i15 = L / 2;
        textView2.setPadding(L, i15, L, i15);
        if (org.telegram.messenger.dd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        float f7 = 8;
        TextView l10 = org.telegram.ui.Cells.f1.l(frameLayout, textView2, w7.b6.d(-2, -2.0f, i12 | 80, f7, f7, f7, f7), context);
        this.f42514w = l10;
        l10.setText(org.telegram.messenger.dd.L0(2131752152, null));
        l10.setSingleLine();
        l10.setTextSize(1, 16.0f);
        l10.setBackground(org.telegram.ui.ActionBar.t6.J0(org.telegram.messenger.i0.L(6.0f), org.telegram.ui.ActionBar.t6.x0(null, i14, false)));
        l10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        ve0 ve0Var = this;
                        ve0Var.getClass();
                        eVar.a2(ve0Var);
                        return;
                    case 1:
                        ve0 ve0Var2 = this;
                        ve0Var2.getClass();
                        eVar.getClass();
                        ve0Var2.a();
                        return;
                    default:
                        ve0 ve0Var3 = this;
                        ve0Var3.getClass();
                        eVar.a2(ve0Var3);
                        return;
                }
            }
        });
        l10.setTypeface(typeface);
        l10.setPadding(L, i15, L, i15);
        if (org.telegram.messenger.dd.X) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout.addView(l10, w7.b6.d(-2, -2.0f, i13 | 80, f7, f7, f7, f7));
        zg.h.b(view, viewGroup, pointF);
        f10Var.setTranslationX(pointF.x);
        f10Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f42516y) {
            return;
        }
        this.f42516y = true;
        ((ff0) this.f42507a.f36703b).f37124a0.f37474b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new ue0(this, 1));
        duration.addUpdateListener(new se0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.gr.f26523f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O9, false);
        org.telegram.ui.Components.w21 w21Var = this.f42510f;
        w21Var.setColor(x02);
        w21Var.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.P9, false));
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, false);
        FrameLayout frameLayout = this.f42515x;
        if (frameLayout.getBackground() == null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(12.0f), x03));
        } else if (x03 != this.E) {
            org.telegram.ui.ActionBar.t6.C1(x03, frameLayout.getBackground());
            frameLayout.invalidate();
        }
        this.E = x03;
        this.f42511n.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21170q5, false));
        this.f42512r.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21038j5, false));
        int i10 = org.telegram.ui.ActionBar.t6.Ki;
        this.f42513s.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.f42514w.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.h.updateColors();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        FrameLayout frameLayout = this.f42515x;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - org.telegram.messenger.i0.L(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
