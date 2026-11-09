package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class rd0 extends FrameLayout {
    public static final int F = 0;
    public final PointF D;
    public int E;
    public final f f49459a;
    public final ViewGroup f49460b;
    public final View f49461c;
    public final View d;
    public final View f49462e;
    public final org.telegram.ui.Components.u11 f49463f;
    public final org.telegram.ui.Components.q00 h;
    public final TextView f49464n;
    public final TextView f49465r;
    public final TextView f49466s;
    public final TextView f49467w;
    public final FrameLayout f49468x;
    public boolean f49469y;

    public rd0(Context context, ViewGroup viewGroup, View view, String str, final f fVar) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        PointF pointF = new PointF();
        this.D = pointF;
        this.f49460b = viewGroup;
        this.f49461c = view;
        this.f49459a = fVar;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new i40(this, 9));
        addView(view2, c8.ha.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.f49462e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.u11 u11Var = new org.telegram.ui.Components.u11(getContext());
        this.f49463f = u11Var;
        u11Var.setTransformType(1);
        u11Var.setDrawBackground(false);
        org.telegram.ui.Components.q00 q00Var = new org.telegram.ui.Components.q00(context, null, false);
        this.h = q00Var;
        q00Var.addView(u11Var, c8.ha.e(56, 56, 17));
        q00Var.a(u11Var);
        q00Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        rd0 rd0Var = this;
                        rd0Var.getClass();
                        fVar.X1(rd0Var);
                        return;
                    case 1:
                        rd0 rd0Var2 = this;
                        rd0Var2.getClass();
                        fVar.getClass();
                        rd0Var2.a();
                        return;
                    default:
                        rd0 rd0Var3 = this;
                        rd0Var3.getClass();
                        fVar.X1(rd0Var3);
                        return;
                }
            }
        });
        q00Var.setContentDescription(org.telegram.messenger.id.M0(2131751354, null));
        addView(q00Var, c8.ha.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49468x = frameLayout;
        addView(frameLayout, c8.ha.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f49464n = textView;
        textView.setText(org.telegram.messenger.id.M0(2131751816, null));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (org.telegram.messenger.id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        TextView i13 = org.telegram.ui.Cells.f1.i(frameLayout, textView, c8.ha.d(-1, -2.0f, i7, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.f49465r = i13;
        i13.setText(str);
        i13.setTextSize(1, 18.0f);
        i13.setTypeface(org.telegram.messenger.g0.o());
        i13.setSingleLine();
        if (org.telegram.messenger.id.f23157a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(i13, c8.ha.d(-1, -2.0f, i10, 24.0f, 48.0f, 24.0f, 0.0f));
        int L = org.telegram.messenger.g0.L(16.0f);
        TextView textView2 = new TextView(context);
        this.f49466s = textView2;
        textView2.setText(org.telegram.messenger.id.M0(2131751335, null));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i14 = org.telegram.ui.ActionBar.l6.Ki;
        textView2.setBackground(org.telegram.ui.ActionBar.l6.J0(L2, org.telegram.ui.ActionBar.l6.x0(null, i14, false)));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        rd0 rd0Var = this;
                        rd0Var.getClass();
                        fVar.X1(rd0Var);
                        return;
                    case 1:
                        rd0 rd0Var2 = this;
                        rd0Var2.getClass();
                        fVar.getClass();
                        rd0Var2.a();
                        return;
                    default:
                        rd0 rd0Var3 = this;
                        rd0Var3.getClass();
                        fVar.X1(rd0Var3);
                        return;
                }
            }
        });
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i15 = L / 2;
        textView2.setPadding(L, i15, L, i15);
        if (org.telegram.messenger.id.f23157a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        float f10 = 8;
        TextView i16 = org.telegram.ui.Cells.f1.i(frameLayout, textView2, c8.ha.d(-2, -2.0f, i11 | 80, f10, f10, f10, f10), context);
        this.f49467w = i16;
        i16.setText(org.telegram.messenger.id.M0(2131752152, null));
        i16.setSingleLine();
        i16.setTextSize(1, 16.0f);
        i16.setBackground(org.telegram.ui.ActionBar.l6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.l6.x0(null, i14, false)));
        i16.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                switch (r1) {
                    case 0:
                        rd0 rd0Var = this;
                        rd0Var.getClass();
                        fVar.X1(rd0Var);
                        return;
                    case 1:
                        rd0 rd0Var2 = this;
                        rd0Var2.getClass();
                        fVar.getClass();
                        rd0Var2.a();
                        return;
                    default:
                        rd0 rd0Var3 = this;
                        rd0Var3.getClass();
                        fVar.X1(rd0Var3);
                        return;
                }
            }
        });
        i16.setTypeface(typeface);
        i16.setPadding(L, i15, L, i15);
        if (org.telegram.messenger.id.f23157a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        frameLayout.addView(i16, c8.ha.d(-2, -2.0f, i12 | 80, f10, f10, f10, f10));
        jh.k.b(view, viewGroup, pointF);
        q00Var.setTranslationX(pointF.x);
        q00Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.f49469y) {
            return;
        }
        this.f49469y = true;
        ((de0) this.f49459a.f45545b).f44935g0.f45371b0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new qd0(this, 1));
        duration.addUpdateListener(new od0(this, 0));
        duration.setInterpolator(org.telegram.ui.Components.xq.f40458f);
        duration.start();
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.O9, false);
        org.telegram.ui.Components.u11 u11Var = this.f49463f;
        u11Var.setColor(x02);
        u11Var.setBackgroundColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.P9, false));
        int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false);
        FrameLayout frameLayout = this.f49468x;
        if (frameLayout.getBackground() == null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(12.0f), x03));
        } else if (x03 != this.E) {
            org.telegram.ui.ActionBar.l6.C1(x03, frameLayout.getBackground());
            frameLayout.invalidate();
        }
        this.E = x03;
        this.f49464n.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28104q5, false));
        this.f49465r.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27973j5, false));
        int i7 = org.telegram.ui.ActionBar.l6.Ki;
        this.f49466s.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, i7, false));
        this.f49467w.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, i7, false));
        this.h.updateColors();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        FrameLayout frameLayout = this.f49468x;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - org.telegram.messenger.g0.L(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
