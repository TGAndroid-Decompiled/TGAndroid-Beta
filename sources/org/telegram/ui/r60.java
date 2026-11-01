package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Intro;
import org.telegram.tgnet.ConnectionsManager;
public final class r60 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public boolean D;
    public Drawable E;
    public CharSequence[] F;
    public String[] G;
    public int H;
    public q60 I;
    public long J;
    public boolean K;
    public org.telegram.messenger.ad L;
    public boolean M;
    public boolean N;
    public int O;
    public final m4 P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final Object f40980a;
    public final Object f40981b;
    public final int f40982c;
    public z4.g d;
    public org.telegram.ui.Components.y9 e;
    public TextView f40983f;
    public GradientDrawable h;
    public bi.j6 f40984n;
    public FrameLayout f40985r;
    public fg.i f40986s;
    public org.telegram.ui.Components.ci0 f40987w;
    public int f40988x;
    public boolean f40989y;

    public r60() {
        super(null);
        this.f40980a = new Object();
        this.f40981b = new Object();
        this.f40982c = org.telegram.messenger.e20.f15506s0;
        this.f40988x = 0;
        this.f40989y = false;
        this.D = false;
        this.P = new m4(this, 8);
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r60.Z():void");
    }

    public final void a0(boolean z10) {
        GradientDrawable gradientDrawable = this.h;
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.t6.Di)});
        this.E.setColorFilter(org.telegram.ui.ActionBar.t6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.t6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.t6.f20930d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        this.f40983f.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false));
        this.f40984n.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false));
        bi.j6 j6Var = this.f40984n;
        int L = org.telegram.messenger.i0.L(24.0f);
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
        j6Var.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, x02, x02));
        this.f40987w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        this.O = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        if (z10) {
            q60 q60Var = this.I;
            if (q60Var != null) {
                q60Var.postRunnable(new yy(this, 11));
            }
            for (int i12 = 0; i12 < this.d.getChildCount(); i12++) {
                View childAt = this.d.getChildAt(i12);
                int i13 = org.telegram.ui.ActionBar.t6.G6;
                ((TextView) childAt.findViewWithTag(this.f40980a)).setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
                ((TextView) childAt.findViewWithTag(this.f40981b)).setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
            }
            return;
        }
        Intro.a(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        Drawable f7 = i0.a.f(context, 2131232771);
        this.E = f7;
        f7.setBounds(0, org.telegram.messenger.i0.L(8.666f), org.telegram.messenger.i0.L(115.0f), org.telegram.messenger.i0.L(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.dd.L0(2131747764, null));
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 0, spannableStringBuilder.length(), 33);
        this.F[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        ?? imageView = new ImageView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView((View) imageView, w7.b6.e(28, 28, 17));
        fg.i iVar = new fg.i(this, context, frameLayout, 20);
        this.f40986s = iVar;
        scrollView.addView(iVar, w7.b6.x(-1, -2, 51));
        org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(2131624237, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        this.f40987w = ci0Var;
        ci0Var.h = true;
        ci0Var.Z = true;
        ci0Var.o();
        org.telegram.ui.Components.ci0 ci0Var2 = this.f40987w;
        if (org.telegram.ui.ActionBar.t6.D0().q()) {
            i10 = this.f40987w.e[0] - 1;
        } else {
            i10 = 0;
        }
        ci0Var2.P(i10);
        org.telegram.ui.Components.ci0 ci0Var3 = this.f40987w;
        if (org.telegram.ui.ActionBar.t6.D0().q()) {
            i11 = this.f40987w.e[0] - 1;
        } else {
            i11 = 0;
        }
        ci0Var3.N(i11, false, false);
        if (org.telegram.ui.ActionBar.t6.D0().q()) {
            i12 = 2131754751;
        } else {
            i12 = 2131754750;
        }
        imageView.setContentDescription(org.telegram.messenger.dd.L0(i12, null));
        imageView.setAnimation(this.f40987w);
        frameLayout.setOnClickListener(new vu(11, this, imageView));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f40985r = frameLayout2;
        this.f40986s.addView(frameLayout2, w7.b6.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.f40985r.addView(textureView, w7.b6.e(200, 150, 17));
        textureView.setSurfaceTextureListener(new p60(this, 0));
        z4.g gVar = new z4.g(context);
        this.d = gVar;
        gVar.setAdapter(new kg.e1(this, 3));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.f40986s.addView(this.d, w7.b6.c(-1.0f, -1));
        this.d.b(new k2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        bi.j6 j6Var = new bi.j6(this, context);
        this.f40984n = j6Var;
        w7.e6.b(j6Var, 0.02f, 1.2f);
        this.f40984n.setText(org.telegram.messenger.dd.L0(2131744929, null));
        this.f40984n.setGravity(17);
        this.f40984n.setTypeface(org.telegram.messenger.i0.o());
        this.f40984n.setTextSize(1, 15.0f);
        this.f40984n.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        this.f40986s.addView(this.f40984n, w7.b6.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.f40984n.setOnClickListener(new View.OnClickListener(this) {
            public final r60 f40051b;

            {
                this.f40051b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        r60 r60Var = this.f40051b;
                        if (!r60Var.D) {
                            r60Var.D = true;
                            r60Var.presentFragment(new gf0(), true);
                            r60Var.M = true;
                            return;
                        }
                        return;
                    default:
                        r60 r60Var2 = this.f40051b;
                        if (!r60Var2.D && r60Var2.L != null) {
                            r60Var2.D = true;
                            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, view.getContext(), null);
                            x1Var.f21489i0 = false;
                            x1Var.r(1000L);
                            org.telegram.messenger.at.e().b(new org.telegram.messenger.zs(r60Var2, x1Var, 1), 274);
                            org.telegram.messenger.dd.D0().d(r60Var2.L, true, false, r60Var2.f40982c);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context, this.d, 6);
        this.e = y9Var;
        this.f40986s.addView(y9Var, w7.b6.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f40983f = textView;
        textView.setGravity(17);
        this.f40983f.setTextSize(1, 16.0f);
        this.f40986s.addView(this.f40983f, w7.b6.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f40983f.setOnClickListener(new View.OnClickListener(this) {
            public final r60 f40051b;

            {
                this.f40051b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        r60 r60Var = this.f40051b;
                        if (!r60Var.D) {
                            r60Var.D = true;
                            r60Var.presentFragment(new gf0(), true);
                            r60Var.M = true;
                            return;
                        }
                        return;
                    default:
                        r60 r60Var2 = this.f40051b;
                        if (!r60Var2.D && r60Var2.L != null) {
                            r60Var2.D = true;
                            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, view.getContext(), null);
                            x1Var.f21489i0 = false;
                            x1Var.r(1000L);
                            org.telegram.messenger.at.e().b(new org.telegram.messenger.zs(r60Var2, x1Var, 1), 274);
                            org.telegram.messenger.dd.D0().d(r60Var2.L, true, false, r60Var2.f40982c);
                            return;
                        }
                        return;
                }
            }
        });
        float f10 = 4;
        this.f40986s.addView(frameLayout, w7.b6.d(64, 64.0f, 53, 0.0f, f10, f10, 0.0f));
        this.fragmentView = scrollView;
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14824y4);
        int i13 = this.f40982c;
        org.telegram.messenger.at.f(i13).c(this, org.telegram.messenger.at.J2);
        ConnectionsManager.getInstance(i13).updateDcSettings();
        org.telegram.messenger.dd.D0().S0(i13, true);
        Z();
        this.f40989y = true;
        a0(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != org.telegram.messenger.at.f14824y4 && i10 != org.telegram.messenger.at.J2) {
            return;
        }
        Z();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.f6.a(new g6(10, this), org.telegram.ui.ActionBar.t6.f20930d6, org.telegram.ui.ActionBar.t6.q6, org.telegram.ui.ActionBar.t6.P9, org.telegram.ui.ActionBar.t6.Q9, org.telegram.ui.ActionBar.t6.Gi, org.telegram.ui.ActionBar.t6.G6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        if (this.N) {
            AnimatorSet duration = new AnimatorSet().setDuration(50L);
            duration.playTogether(ValueAnimator.ofFloat(new float[0]));
            return duration;
        }
        return null;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.wp.d1().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.F = new CharSequence[]{null, org.telegram.messenger.dd.L0(2131747762, null), org.telegram.messenger.dd.L0(2131747760, null), org.telegram.messenger.dd.L0(2131747756, null), org.telegram.messenger.dd.L0(2131747758, null), org.telegram.messenger.dd.L0(2131747754, null)};
        this.G = new String[]{org.telegram.messenger.dd.L0(2131747765, null), org.telegram.messenger.dd.L0(2131747763, null), org.telegram.messenger.dd.L0(2131747761, null), org.telegram.messenger.dd.L0(2131747757, null), org.telegram.messenger.dd.L0(2131747759, null), org.telegram.messenger.dd.L0(2131747755, null)};
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.M = true;
        org.telegram.messenger.i0.r(this.P);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14824y4);
        org.telegram.messenger.at.f(this.f40982c).n(this, org.telegram.messenger.at.J2);
        org.telegram.messenger.wp.d1().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.i0.P3(getParentActivity());
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f40989y) {
            if (org.telegram.messenger.dd.X) {
                this.d.setCurrentItem(6);
                this.f40988x = 6;
            } else {
                this.d.setCurrentItem(0);
                this.f40988x = 0;
            }
            this.f40989y = false;
        }
        org.telegram.messenger.i0.g2(getParentActivity());
    }

    @Override
    public final void onThemeColorsChanged() {
        m4 m4Var = this.P;
        try {
            if (this.fragmentView != null) {
                int i10 = org.telegram.ui.ActionBar.t6.Ci;
                int themedColor = getThemedColor(i10);
                int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.t6.Di);
                GradientDrawable gradientDrawable = this.h;
                if (gradientDrawable != null) {
                    if (themedColor == this.Q) {
                        if (themedColor2 != this.R) {
                        }
                    }
                    this.Q = themedColor;
                    this.R = themedColor2;
                    gradientDrawable.setColors(new int[]{themedColor, themedColor2});
                }
                int r12 = org.telegram.ui.ActionBar.t6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.t6.A8));
                Drawable drawable = this.E;
                if (drawable != null && r12 != this.S) {
                    this.S = r12;
                    drawable.setColorFilter(r12, PorterDuff.Mode.MULTIPLY);
                }
                this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false));
                TextView textView = this.f40983f;
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false));
                }
                bi.j6 j6Var = this.f40984n;
                if (j6Var != null) {
                    j6Var.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false));
                    org.telegram.ui.ActionBar.t6.H1(this.f40984n.getBackground(), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false), true);
                }
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
                org.telegram.ui.Components.ci0 ci0Var = this.f40987w;
                if (ci0Var != null && x02 != this.T) {
                    this.T = x02;
                    ci0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.y9 y9Var = this.e;
                if (y9Var != null) {
                    y9Var.invalidate();
                }
                if (this.d != null) {
                    for (int i11 = 0; i11 < this.d.getChildCount(); i11++) {
                        View childAt = this.d.getChildAt(i11);
                        TextView textView2 = (TextView) childAt.findViewWithTag(this.f40980a);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                        }
                        TextView textView3 = (TextView) childAt.findViewWithTag(this.f40981b);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                        }
                    }
                }
                if (this.I != null && this.O != org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false)) {
                    org.telegram.messenger.i0.r(m4Var);
                    org.telegram.messenger.i0.h3(m4Var, 100L);
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
