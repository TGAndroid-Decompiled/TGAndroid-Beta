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
public final class v50 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public boolean E;
    public Drawable F;
    public CharSequence[] G;
    public String[] H;
    public int I;
    public u50 J;
    public long K;
    public boolean L;
    public org.telegram.messenger.cd M;
    public boolean N;
    public boolean O;
    public int P;
    public final m4 Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Object f52690a;
    public final Object f52691b;
    public final int f52692c;
    public c5.l d;
    public org.telegram.ui.Components.ia f52693e;
    public TextView f52694f;
    public GradientDrawable h;
    public gi.j f52695n;
    public FrameLayout f52696r;
    public ai.k0 f52697s;
    public org.telegram.ui.Components.mh0 f52698w;
    public int f52699x;
    public boolean f52700y;

    public v50() {
        super(null);
        this.f52690a = new Object();
        this.f52691b = new Object();
        this.f52692c = org.telegram.messenger.j10.f24773t0;
        this.f52699x = 0;
        this.f52700y = false;
        this.E = false;
        this.Q = new m4(this, 8);
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v50.Z():void");
    }

    public final void a0(boolean z10) {
        GradientDrawable gradientDrawable = this.h;
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        gradientDrawable.setColors(new int[]{getThemedColor(i7), getThemedColor(org.telegram.ui.ActionBar.n6.Gi)});
        this.F.setColorFilter(org.telegram.ui.ActionBar.n6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.n6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.n6.f29396d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        this.f52694f.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29636q6, false));
        this.f52695n.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false));
        gi.j jVar = this.f52695n;
        int L = org.telegram.messenger.g0.L(24.0f);
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false);
        jVar.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 0, x02, x02));
        this.f52698w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, i7, false), PorterDuff.Mode.SRC_IN));
        this.f52693e.invalidate();
        this.P = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        if (z10) {
            u50 u50Var = this.J;
            if (u50Var != null) {
                u50Var.postRunnable(new lz(this, 11));
            }
            for (int i11 = 0; i11 < this.d.getChildCount(); i11++) {
                View childAt = this.d.getChildAt(i11);
                int i12 = org.telegram.ui.ActionBar.n6.G6;
                ((TextView) childAt.findViewWithTag(this.f52690a)).setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
                ((TextView) childAt.findViewWithTag(this.f52691b)).setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
            }
            return;
        }
        Intro.a(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        Drawable g10 = i5.c.g(context, 2131232776);
        this.F = g10;
        g10.setBounds(0, org.telegram.messenger.g0.L(8.666f), org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.gd.M0(2131747555, null));
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 0, spannableStringBuilder.length(), 33);
        this.G[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        ?? imageView = new ImageView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView((View) imageView, c8.ma.e(28, 28, 17));
        ai.k0 k0Var = new ai.k0(this, context, frameLayout, 24);
        this.f52697s = k0Var;
        scrollView.addView(k0Var, c8.ma.x(-1, -2, 51));
        org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(2131624240, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f52698w = mh0Var;
        mh0Var.h = true;
        mh0Var.f37480a0 = true;
        mh0Var.o();
        org.telegram.ui.Components.mh0 mh0Var2 = this.f52698w;
        if (org.telegram.ui.ActionBar.n6.D0().q()) {
            i7 = this.f52698w.f37486e[0] - 1;
        } else {
            i7 = 0;
        }
        mh0Var2.P(i7);
        org.telegram.ui.Components.mh0 mh0Var3 = this.f52698w;
        if (org.telegram.ui.ActionBar.n6.D0().q()) {
            i10 = this.f52698w.f37486e[0] - 1;
        } else {
            i10 = 0;
        }
        mh0Var3.N(i10, false, false);
        if (org.telegram.ui.ActionBar.n6.D0().q()) {
            i11 = 2131754751;
        } else {
            i11 = 2131754750;
        }
        imageView.setContentDescription(org.telegram.messenger.gd.M0(i11, null));
        imageView.setAnimation(this.f52698w);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.c31(22, this, imageView));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f52696r = frameLayout2;
        this.f52697s.addView(frameLayout2, c8.ma.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.f52696r.addView(textureView, c8.ma.e(200, 150, 17));
        textureView.setSurfaceTextureListener(new t50(this, 0));
        c5.l lVar = new c5.l(context);
        this.d = lVar;
        lVar.setAdapter(new org.telegram.ui.Components.k20(this, 2));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.f52697s.addView(this.d, c8.ma.c(-1.0f, -1));
        this.d.b(new k2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        gi.j jVar = new gi.j(this, context);
        this.f52695n = jVar;
        c8.ra.b(jVar, 0.02f, 1.2f);
        this.f52695n.setText(org.telegram.messenger.gd.M0(2131744676, null));
        this.f52695n.setGravity(17);
        this.f52695n.setTypeface(org.telegram.messenger.g0.o());
        this.f52695n.setTextSize(1, 15.0f);
        this.f52695n.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        this.f52697s.addView(this.f52695n, c8.ma.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.f52695n.setOnClickListener(new View.OnClickListener(this) {
            public final v50 f51906b;

            {
                this.f51906b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        v50 v50Var = this.f51906b;
                        if (!v50Var.E) {
                            v50Var.E = true;
                            v50Var.presentFragment(new de0(), true);
                            v50Var.N = true;
                            return;
                        }
                        return;
                    default:
                        v50 v50Var2 = this.f51906b;
                        if (!v50Var2.E && v50Var2.M != null) {
                            v50Var2.E = true;
                            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, view.getContext(), null);
                            u1Var.f30049j0 = false;
                            u1Var.r(1000L);
                            org.telegram.messenger.ks.e().b(new org.telegram.messenger.js(v50Var2, u1Var, 1), 276);
                            org.telegram.messenger.gd.E0().d(v50Var2.M, true, false, v50Var2.f52692c);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.ia iaVar = new org.telegram.ui.Components.ia(context, this.d, 6);
        this.f52693e = iaVar;
        this.f52697s.addView(iaVar, c8.ma.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f52694f = textView;
        textView.setGravity(17);
        this.f52694f.setTextSize(1, 16.0f);
        this.f52697s.addView(this.f52694f, c8.ma.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f52694f.setOnClickListener(new View.OnClickListener(this) {
            public final v50 f51906b;

            {
                this.f51906b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        v50 v50Var = this.f51906b;
                        if (!v50Var.E) {
                            v50Var.E = true;
                            v50Var.presentFragment(new de0(), true);
                            v50Var.N = true;
                            return;
                        }
                        return;
                    default:
                        v50 v50Var2 = this.f51906b;
                        if (!v50Var2.E && v50Var2.M != null) {
                            v50Var2.E = true;
                            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, view.getContext(), null);
                            u1Var.f30049j0 = false;
                            u1Var.r(1000L);
                            org.telegram.messenger.ks.e().b(new org.telegram.messenger.js(v50Var2, u1Var, 1), 276);
                            org.telegram.messenger.gd.E0().d(v50Var2.M, true, false, v50Var2.f52692c);
                            return;
                        }
                        return;
                }
            }
        });
        float f10 = 4;
        this.f52697s.addView(frameLayout, c8.ma.d(64, 64.0f, 53, 0.0f, f10, f10, 0.0f));
        this.fragmentView = scrollView;
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.A4);
        int i12 = this.f52692c;
        org.telegram.messenger.ks.f(i12).c(this, org.telegram.messenger.ks.J2);
        ConnectionsManager.getInstance(i12).updateDcSettings();
        org.telegram.messenger.gd.E0().V0(i12, true);
        Z();
        this.f52700y = true;
        a0(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ks.A4 && i7 != org.telegram.messenger.ks.J2) {
            return;
        }
        Z();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.sa.a(new f6(10, this), org.telegram.ui.ActionBar.n6.f29396d6, org.telegram.ui.ActionBar.n6.f29636q6, org.telegram.ui.ActionBar.n6.P9, org.telegram.ui.ActionBar.n6.Q9, org.telegram.ui.ActionBar.n6.Ji, org.telegram.ui.ActionBar.n6.G6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, true)) > 0.699999988079071d) {
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
        org.telegram.messenger.mp.g1().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.G = new CharSequence[]{null, org.telegram.messenger.gd.M0(2131747553, null), org.telegram.messenger.gd.M0(2131747551, null), org.telegram.messenger.gd.M0(2131747547, null), org.telegram.messenger.gd.M0(2131747549, null), org.telegram.messenger.gd.M0(2131747545, null)};
        this.H = new String[]{org.telegram.messenger.gd.M0(2131747556, null), org.telegram.messenger.gd.M0(2131747554, null), org.telegram.messenger.gd.M0(2131747552, null), org.telegram.messenger.gd.M0(2131747548, null), org.telegram.messenger.gd.M0(2131747550, null), org.telegram.messenger.gd.M0(2131747546, null)};
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = true;
        org.telegram.messenger.g0.r(this.Q);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.A4);
        org.telegram.messenger.ks.f(this.f52692c).n(this, org.telegram.messenger.ks.J2);
        org.telegram.messenger.mp.g1().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.g0.O3(getParentActivity());
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f52700y) {
            if (org.telegram.messenger.gd.f24216a0) {
                this.d.setCurrentItem(6);
                this.f52699x = 6;
            } else {
                this.d.setCurrentItem(0);
                this.f52699x = 0;
            }
            this.f52700y = false;
        }
        org.telegram.messenger.g0.g2(getParentActivity());
    }

    @Override
    public final void onThemeColorsChanged() {
        m4 m4Var = this.Q;
        try {
            if (this.fragmentView != null) {
                int i7 = org.telegram.ui.ActionBar.n6.Fi;
                int themedColor = getThemedColor(i7);
                int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.n6.Gi);
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
                int r12 = org.telegram.ui.ActionBar.n6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.n6.A8));
                Drawable drawable = this.F;
                if (drawable != null && r12 != this.T) {
                    this.T = r12;
                    drawable.setColorFilter(r12, PorterDuff.Mode.MULTIPLY);
                }
                this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, false));
                TextView textView = this.f52694f;
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29636q6, false));
                }
                gi.j jVar = this.f52695n;
                if (jVar != null) {
                    jVar.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false));
                    org.telegram.ui.ActionBar.n6.H1(this.f52695n.getBackground(), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false), true);
                }
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
                org.telegram.ui.Components.mh0 mh0Var = this.f52698w;
                if (mh0Var != null && x02 != this.U) {
                    this.U = x02;
                    mh0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.ia iaVar = this.f52693e;
                if (iaVar != null) {
                    iaVar.invalidate();
                }
                if (this.d != null) {
                    for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
                        View childAt = this.d.getChildAt(i10);
                        TextView textView2 = (TextView) childAt.findViewWithTag(this.f52690a);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
                        }
                        TextView textView3 = (TextView) childAt.findViewWithTag(this.f52691b);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
                        }
                    }
                }
                if (this.J != null && this.P != org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, false)) {
                    org.telegram.messenger.g0.r(m4Var);
                    org.telegram.messenger.g0.h3(m4Var, 100L);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
