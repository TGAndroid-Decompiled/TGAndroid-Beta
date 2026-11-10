package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class sd0 extends FrameLayout {
    public static final int F = 0;
    public final PointF D;
    public int E;
    public final f f49833a;
    public final ViewGroup f49834b;
    public final View f49835c;
    public final View d;
    public final View f49836e;
    public final org.telegram.ui.Components.t11 f49837f;
    public final org.telegram.ui.Components.p00 h;
    public final TextView f49838n;
    public final TextView f49839r;
    public final TextView f49840s;
    public final TextView f49841w;
    public final FrameLayout f49842x;
    public boolean f49843y;

    public sd0(Context context, ViewGroup viewGroup, View view, String str, final f fVar) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        PointF pointF = new PointF();
        this.D = pointF;
        this.f49834b = viewGroup;
        this.f49835c = view;
        this.f49833a = fVar;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new j40(this, 9));
        addView(view2, c8.ha.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.f49836e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.t11 t11Var = new org.telegram.ui.Components.t11(getContext());
        this.f49837f = t11Var;
        t11Var.setTransformType(1);
        t11Var.setDrawBackground(false);
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null, false);
        this.h = p00Var;
        p00Var.addView(t11Var, c8.ha.e(56, 56, 17));
        p00Var.a(t11Var);
        p00Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        sd0 sd0Var = this;
                        sd0Var.getClass();
                        fVar.X1(sd0Var);
                        return;
                    case 1:
                        sd0 sd0Var2 = this;
                        sd0Var2.getClass();
                        fVar.getClass();
                        sd0Var2.a();
                        return;
                    default:
                        sd0 sd0Var3 = this;
                        sd0Var3.getClass();
                        fVar.X1(sd0Var3);
                        return;
                }
            }
        });
        p00Var.setContentDescription(org.telegram.messenger.id.M0(2131751354, null));
        addView(p00Var, c8.ha.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49842x = frameLayout;
        addView(frameLayout, c8.ha.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f49838n = textView;
        textView.setText(org.telegram.messenger.id.M0(2131751816, null));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (org.telegram.messenger.id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        TextView i13 = org.telegram.ui.Cells.f1.i(frameLayout, textView, c8.ha.d(-1, -2.0f, i7, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f49839r = i13;
        i13.setText(str);
        i13.setTextSize(1, 18.0f);
        i13.setTypeface(org.telegram.messenger.g0.o());
        i13.setSingleLine();
        if (org.telegram.messenger.id.f23161a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(i13, c8.ha.d(-1, -2.0f, i10, 24.0f, 48.0f, 24.0f, 0.0f));
        int L = org.telegram.messenger.g0.L(16.0f);
        TextView textView2 = new TextView(context);
        this.f49840s = textView2;
        textView2.setText(org.telegram.messenger.id.M0(2131751335, null));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i14 = org.telegram.ui.ActionBar.m6.Ki;
        textView2.setBackground(org.telegram.ui.ActionBar.m6.J0(L2, org.telegram.ui.ActionBar.m6.x0(null, i14, false)));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        sd0 sd0Var = this;
                        sd0Var.getClass();
                        fVar.X1(sd0Var);
                        return;
                    case 1:
                        sd0 sd0Var2 = this;
                        sd0Var2.getClass();
                        fVar.getClass();
                        sd0Var2.a();
                        return;
                    default:
                        sd0 sd0Var3 = this;
                        sd0Var3.getClass();
                        fVar.X1(sd0Var3);
                        return;
                }
            }
        });
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i15 = L / 2;
        textView2.setPadding(L, i15, L, i15);
        if (org.telegram.messenger.id.f23161a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        float f10 = 8;
        TextView i16 = org.telegram.ui.Cells.f1.i(frameLayout, textView2, c8.ha.d(-2, -2.0f, i11 | 80, f10, f10, f10, f10), context);
        this.f49841w = i16;
        i16.setText(org.telegram.messenger.id.M0(2131752152, null));
        i16.setSingleLine();
        i16.setTextSize(1, 16.0f);
        i16.setBackground(org.telegram.ui.ActionBar.m6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.m6.x0(null, i14, false)));
        i16.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        sd0 sd0Var = this;
                        sd0Var.getClass();
                        fVar.X1(sd0Var);
                        return;
                    case 1:
                        sd0 sd0Var2 = this;
                        sd0Var2.getClass();
                        fVar.getClass();
                        sd0Var2.a();
                        return;
                    default:
                        sd0 sd0Var3 = this;
                        sd0Var3.getClass();
                        fVar.X1(sd0Var3);
                        return;
                }
            }
        });
        i16.setTypeface(typeface);
        i16.setPadding(L, i15, L, i15);
        if (org.telegram.messenger.id.f23161a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        frameLayout.addView(i16, c8.ha.d(-2, -2.0f, i12 | 80, f10, f10, f10, f10));
        jh.k.b(view, viewGroup, pointF);
        p00Var.setTranslationX(pointF.x);
        p00Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f49843y) {
            return;
        }
        this.f49843y = true;
        ((ee0) this.f49833a.f45464b).f45255g0.f45695b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new rd0(this, 1));
        duration.addUpdateListener(new pd0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.wq.f40046f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.O9, false);
        org.telegram.ui.Components.t11 t11Var = this.f49837f;
        t11Var.setColor(x02);
        t11Var.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.P9, false));
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false);
        FrameLayout frameLayout = this.f49842x;
        if (frameLayout.getBackground() == null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(12.0f), x03));
        } else if (x03 != this.E) {
            org.telegram.ui.ActionBar.m6.C1(x03, frameLayout.getBackground());
            frameLayout.invalidate();
        }
        this.E = x03;
        this.f49838n.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28129q5, false));
        this.f49839r.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27998j5, false));
        int i7 = org.telegram.ui.ActionBar.m6.Ki;
        this.f49840s.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.f49841w.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.h.updateColors();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        FrameLayout frameLayout = this.f49842x;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - org.telegram.messenger.g0.L(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
