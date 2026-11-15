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
public final class t50 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public boolean E;
    public Drawable F;
    public CharSequence[] G;
    public String[] H;
    public int I;
    public s50 J;
    public long K;
    public boolean L;
    public org.telegram.messenger.dd M;
    public boolean N;
    public boolean O;
    public int P;
    public final m4 Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Object f51373a;
    public final Object f51374b;
    public final int f51375c;
    public c5.l d;
    public org.telegram.ui.Components.aa f51376e;
    public TextView f51377f;
    public GradientDrawable h;
    public gi.j f51378n;
    public FrameLayout f51379r;
    public ai.j0 f51380s;
    public org.telegram.ui.Components.ch0 f51381w;
    public int f51382x;
    public boolean f51383y;

    public t50() {
        super(null);
        this.f51373a = new Object();
        this.f51374b = new Object();
        this.f51375c = org.telegram.messenger.m10.f24934t0;
        this.f51382x = 0;
        this.f51383y = false;
        this.E = false;
        this.Q = new m4(this, 8);
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t50.Z():void");
    }

    public final void a0(boolean z10) {
        GradientDrawable gradientDrawable = this.h;
        int i7 = org.telegram.ui.ActionBar.j6.Fi;
        gradientDrawable.setColors(new int[]{getThemedColor(i7), getThemedColor(org.telegram.ui.ActionBar.j6.Gi)});
        this.F.setColorFilter(org.telegram.ui.ActionBar.j6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.j6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f28849d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
        this.f51377f.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29089q6, false));
        this.f51378n.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, false));
        gi.j jVar = this.f51378n;
        int L = org.telegram.messenger.g0.L(24.0f);
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hi, false);
        jVar.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 0, x02, x02));
        this.f51381w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.x0(null, i7, false), PorterDuff.Mode.SRC_IN));
        this.f51376e.invalidate();
        this.P = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
        if (z10) {
            s50 s50Var = this.J;
            if (s50Var != null) {
                s50Var.postRunnable(new iz(this, 11));
            }
            for (int i11 = 0; i11 < this.d.getChildCount(); i11++) {
                View childAt = this.d.getChildAt(i11);
                int i12 = org.telegram.ui.ActionBar.j6.G6;
                ((TextView) childAt.findViewWithTag(this.f51373a)).setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i12, false));
                ((TextView) childAt.findViewWithTag(this.f51374b)).setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i12, false));
            }
            return;
        }
        Intro.a(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        Drawable g10 = i5.c.g(context, 2131232775);
        this.F = g10;
        g10.setBounds(0, org.telegram.messenger.g0.L(8.666f), org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131747748, null));
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 0, spannableStringBuilder.length(), 33);
        this.G[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        ?? imageView = new ImageView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView((View) imageView, c8.ja.e(28, 28, 17));
        ai.j0 j0Var = new ai.j0(this, context, frameLayout, 23);
        this.f51380s = j0Var;
        scrollView.addView(j0Var, c8.ja.x(-1, -2, 51));
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624240, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f51381w = ch0Var;
        ch0Var.h = true;
        ch0Var.f33571a0 = true;
        ch0Var.o();
        org.telegram.ui.Components.ch0 ch0Var2 = this.f51381w;
        if (org.telegram.ui.ActionBar.j6.D0().q()) {
            i7 = this.f51381w.f33577e[0] - 1;
        } else {
            i7 = 0;
        }
        ch0Var2.P(i7);
        org.telegram.ui.Components.ch0 ch0Var3 = this.f51381w;
        if (org.telegram.ui.ActionBar.j6.D0().q()) {
            i10 = this.f51381w.f33577e[0] - 1;
        } else {
            i10 = 0;
        }
        ch0Var3.N(i10, false, false);
        if (org.telegram.ui.ActionBar.j6.D0().q()) {
            i11 = 2131754751;
        } else {
            i11 = 2131754750;
        }
        imageView.setContentDescription(org.telegram.messenger.hd.M0(i11, null));
        imageView.setAnimation(this.f51381w);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.vv0(26, this, imageView));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f51379r = frameLayout2;
        this.f51380s.addView(frameLayout2, c8.ja.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.f51379r.addView(textureView, c8.ja.e(200, 150, 17));
        textureView.setSurfaceTextureListener(new r50(this, 0));
        c5.l lVar = new c5.l(context);
        this.d = lVar;
        lVar.setAdapter(new org.telegram.ui.Components.d20(this, 2));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.f51380s.addView(this.d, c8.ja.c(-1.0f, -1));
        this.d.b(new k2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        gi.j jVar = new gi.j(this, context);
        this.f51378n = jVar;
        c8.na.b(jVar, 0.02f, 1.2f);
        this.f51378n.setText(org.telegram.messenger.hd.M0(2131744911, null));
        this.f51378n.setGravity(17);
        this.f51378n.setTypeface(org.telegram.messenger.g0.o());
        this.f51378n.setTextSize(1, 15.0f);
        this.f51378n.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        this.f51380s.addView(this.f51378n, c8.ja.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.f51378n.setOnClickListener(new View.OnClickListener(this) {
            public final t50 f50476b;

            {
                this.f50476b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t50 t50Var = this.f50476b;
                        if (!t50Var.E) {
                            t50Var.E = true;
                            t50Var.presentFragment(new ce0(), true);
                            t50Var.N = true;
                            return;
                        }
                        return;
                    default:
                        t50 t50Var2 = this.f50476b;
                        if (!t50Var2.E && t50Var2.M != null) {
                            t50Var2.E = true;
                            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, view.getContext(), null);
                            t1Var.f29637j0 = false;
                            t1Var.r(1000L);
                            org.telegram.messenger.ns.e().b(new org.telegram.messenger.ms(t50Var2, t1Var, 1), 274);
                            org.telegram.messenger.hd.E0().d(t50Var2.M, true, false, t50Var2.f51375c);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.aa aaVar = new org.telegram.ui.Components.aa(context, this.d, 6);
        this.f51376e = aaVar;
        this.f51380s.addView(aaVar, c8.ja.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f51377f = textView;
        textView.setGravity(17);
        this.f51377f.setTextSize(1, 16.0f);
        this.f51380s.addView(this.f51377f, c8.ja.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f51377f.setOnClickListener(new View.OnClickListener(this) {
            public final t50 f50476b;

            {
                this.f50476b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t50 t50Var = this.f50476b;
                        if (!t50Var.E) {
                            t50Var.E = true;
                            t50Var.presentFragment(new ce0(), true);
                            t50Var.N = true;
                            return;
                        }
                        return;
                    default:
                        t50 t50Var2 = this.f50476b;
                        if (!t50Var2.E && t50Var2.M != null) {
                            t50Var2.E = true;
                            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, view.getContext(), null);
                            t1Var.f29637j0 = false;
                            t1Var.r(1000L);
                            org.telegram.messenger.ns.e().b(new org.telegram.messenger.ms(t50Var2, t1Var, 1), 274);
                            org.telegram.messenger.hd.E0().d(t50Var2.M, true, false, t50Var2.f51375c);
                            return;
                        }
                        return;
                }
            }
        });
        float f10 = 4;
        this.f51380s.addView(frameLayout, c8.ja.d(64, 64.0f, 53, 0.0f, f10, f10, 0.0f));
        this.fragmentView = scrollView;
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25611y4);
        int i12 = this.f51375c;
        org.telegram.messenger.ns.f(i12).c(this, org.telegram.messenger.ns.J2);
        ConnectionsManager.getInstance(i12).updateDcSettings();
        org.telegram.messenger.hd.E0().V0(i12, true);
        Z();
        this.f51383y = true;
        a0(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ns.f25611y4 && i7 != org.telegram.messenger.ns.J2) {
            return;
        }
        Z();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.oa.a(new g6(10, this), org.telegram.ui.ActionBar.j6.f28849d6, org.telegram.ui.ActionBar.j6.f29089q6, org.telegram.ui.ActionBar.j6.P9, org.telegram.ui.ActionBar.j6.Q9, org.telegram.ui.ActionBar.j6.Ji, org.telegram.ui.ActionBar.j6.G6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        if (this.O) {
            AnimatorSet duration = new AnimatorSet().setDuration(50L);
            duration.playTogether(ValueAnimator.ofFloat(new float[0]));
            return duration;
        }
        return null;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.np.e1().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.G = new CharSequence[]{null, org.telegram.messenger.hd.M0(2131747746, null), org.telegram.messenger.hd.M0(2131747744, null), org.telegram.messenger.hd.M0(2131747740, null), org.telegram.messenger.hd.M0(2131747742, null), org.telegram.messenger.hd.M0(2131747738, null)};
        this.H = new String[]{org.telegram.messenger.hd.M0(2131747749, null), org.telegram.messenger.hd.M0(2131747747, null), org.telegram.messenger.hd.M0(2131747745, null), org.telegram.messenger.hd.M0(2131747741, null), org.telegram.messenger.hd.M0(2131747743, null), org.telegram.messenger.hd.M0(2131747739, null)};
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = true;
        org.telegram.messenger.g0.r(this.Q);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25611y4);
        org.telegram.messenger.ns.f(this.f51375c).n(this, org.telegram.messenger.ns.J2);
        org.telegram.messenger.np.e1().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.g0.P3(getParentActivity());
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f51383y) {
            if (org.telegram.messenger.hd.f24101a0) {
                this.d.setCurrentItem(6);
                this.f51382x = 6;
            } else {
                this.d.setCurrentItem(0);
                this.f51382x = 0;
            }
            this.f51383y = false;
        }
        org.telegram.messenger.g0.g2(getParentActivity());
    }

    @Override
    public final void onThemeColorsChanged() {
        m4 m4Var = this.Q;
        try {
            if (this.fragmentView != null) {
                int i7 = org.telegram.ui.ActionBar.j6.Fi;
                int themedColor = getThemedColor(i7);
                int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
                GradientDrawable gradientDrawable = this.h;
                if (gradientDrawable != null) {
                    if (themedColor == this.R) {
                        if (themedColor2 != this.S) {
                        }
                    }
                    this.R = themedColor;
                    this.S = themedColor2;
                    gradientDrawable.setColors(new int[]{themedColor, themedColor2});
                }
                int r12 = org.telegram.ui.ActionBar.j6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.j6.A8));
                Drawable drawable = this.F;
                if (drawable != null && r12 != this.T) {
                    this.T = r12;
                    drawable.setColorFilter(r12, PorterDuff.Mode.MULTIPLY);
                }
                this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
                TextView textView = this.f51377f;
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29089q6, false));
                }
                gi.j jVar = this.f51378n;
                if (jVar != null) {
                    jVar.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, false));
                    org.telegram.ui.ActionBar.j6.H1(this.f51378n.getBackground(), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hi, false), true);
                }
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
                org.telegram.ui.Components.ch0 ch0Var = this.f51381w;
                if (ch0Var != null && x02 != this.U) {
                    this.U = x02;
                    ch0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.aa aaVar = this.f51376e;
                if (aaVar != null) {
                    aaVar.invalidate();
                }
                if (this.d != null) {
                    for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
                        View childAt = this.d.getChildAt(i10);
                        TextView textView2 = (TextView) childAt.findViewWithTag(this.f51373a);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G6, false));
                        }
                        TextView textView3 = (TextView) childAt.findViewWithTag(this.f51374b);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G6, false));
                        }
                    }
                }
                if (this.J != null && this.P != org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false)) {
                    org.telegram.messenger.g0.r(m4Var);
                    org.telegram.messenger.g0.i3(m4Var, 100L);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
