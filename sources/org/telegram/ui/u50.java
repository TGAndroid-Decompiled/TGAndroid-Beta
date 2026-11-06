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
public final class u50 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public boolean D;
    public Drawable E;
    public CharSequence[] F;
    public String[] G;
    public int H;
    public t50 I;
    public long J;
    public boolean K;
    public org.telegram.messenger.ed L;
    public boolean M;
    public boolean N;
    public int O;
    public final m4 P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final Object f50206a;
    public final Object f50207b;
    public final int f50208c;
    public c5.k d;
    public org.telegram.ui.Components.ea f50209e;
    public TextView f50210f;
    public GradientDrawable h;
    public ei.k f50211n;
    public FrameLayout f50212r;
    public bi.x5 f50213s;
    public org.telegram.ui.Components.zg0 f50214w;
    public int f50215x;
    public boolean f50216y;

    public u50() {
        super(null);
        this.f50206a = new Object();
        this.f50207b = new Object();
        this.f50208c = org.telegram.messenger.p10.f24459s0;
        this.f50215x = 0;
        this.f50216y = false;
        this.D = false;
        this.P = new m4(this, 8);
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u50.Z():void");
    }

    public final void a0(boolean z9) {
        GradientDrawable gradientDrawable = this.h;
        int i7 = org.telegram.ui.ActionBar.k6.Ci;
        gradientDrawable.setColors(new int[]{getThemedColor(i7), getThemedColor(org.telegram.ui.ActionBar.k6.Di)});
        this.E.setColorFilter(org.telegram.ui.ActionBar.k6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.k6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.k6.f27848d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f50210f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28088q6, false));
        this.f50211n.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false));
        ei.k kVar = this.f50211n;
        int L = org.telegram.messenger.g0.L(24.0f);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
        kVar.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, x02, x02));
        this.f50214w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, i7, false), PorterDuff.Mode.SRC_IN));
        this.f50209e.invalidate();
        this.O = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        if (z9) {
            t50 t50Var = this.I;
            if (t50Var != null) {
                t50Var.postRunnable(new hz(this, 11));
            }
            for (int i11 = 0; i11 < this.d.getChildCount(); i11++) {
                View childAt = this.d.getChildAt(i11);
                int i12 = org.telegram.ui.ActionBar.k6.G6;
                ((TextView) childAt.findViewWithTag(this.f50206a)).setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
                ((TextView) childAt.findViewWithTag(this.f50207b)).setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
            }
            return;
        }
        Intro.a(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        Drawable h = jg.g.h(context, 2131232774);
        this.E = h;
        h.setBounds(0, org.telegram.messenger.g0.L(8.666f), org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131747747, null));
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 0, spannableStringBuilder.length(), 33);
        this.F[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        ?? imageView = new ImageView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView((View) imageView, c8.ha.e(28, 28, 17));
        bi.x5 x5Var = new bi.x5(this, context, frameLayout, 21);
        this.f50213s = x5Var;
        scrollView.addView(x5Var, c8.ha.x(-1, -2, 51));
        org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(2131624239, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f50214w = zg0Var;
        zg0Var.h = true;
        zg0Var.Z = true;
        zg0Var.o();
        org.telegram.ui.Components.zg0 zg0Var2 = this.f50214w;
        if (org.telegram.ui.ActionBar.k6.D0().q()) {
            i7 = this.f50214w.f40931e[0] - 1;
        } else {
            i7 = 0;
        }
        zg0Var2.P(i7);
        org.telegram.ui.Components.zg0 zg0Var3 = this.f50214w;
        if (org.telegram.ui.ActionBar.k6.D0().q()) {
            i10 = this.f50214w.f40931e[0] - 1;
        } else {
            i10 = 0;
        }
        zg0Var3.N(i10, false, false);
        if (org.telegram.ui.ActionBar.k6.D0().q()) {
            i11 = 2131754751;
        } else {
            i11 = 2131754750;
        }
        imageView.setContentDescription(org.telegram.messenger.hd.M0(i11, null));
        imageView.setAnimation(this.f50214w);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.n41(18, this, imageView));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f50212r = frameLayout2;
        this.f50213s.addView(frameLayout2, c8.ha.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.f50212r.addView(textureView, c8.ha.e(200, 150, 17));
        textureView.setSurfaceTextureListener(new s50(this, 0));
        c5.k kVar = new c5.k(context);
        this.d = kVar;
        kVar.setAdapter(new org.telegram.ui.Components.a20(this, 2));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.f50213s.addView(this.d, c8.ha.c(-1.0f, -1));
        this.d.b(new k2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        ei.k kVar2 = new ei.k(this, context);
        this.f50211n = kVar2;
        c8.ka.b(kVar2, 0.02f, 1.2f);
        this.f50211n.setText(org.telegram.messenger.hd.M0(2131744912, null));
        this.f50211n.setGravity(17);
        this.f50211n.setTypeface(org.telegram.messenger.g0.o());
        this.f50211n.setTextSize(1, 15.0f);
        this.f50211n.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        this.f50213s.addView(this.f50211n, c8.ha.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.f50211n.setOnClickListener(new View.OnClickListener(this) {
            public final u50 f49361b;

            {
                this.f49361b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u50 u50Var = this.f49361b;
                        if (!u50Var.D) {
                            u50Var.D = true;
                            u50Var.presentFragment(new ce0(), true);
                            u50Var.M = true;
                            return;
                        }
                        return;
                    default:
                        u50 u50Var2 = this.f49361b;
                        if (!u50Var2.D && u50Var2.L != null) {
                            u50Var2.D = true;
                            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, view.getContext(), null);
                            u1Var.f28568i0 = false;
                            u1Var.r(1000L);
                            org.telegram.messenger.qs.e().b(new org.telegram.messenger.ps(u50Var2, u1Var, 1), 274);
                            org.telegram.messenger.hd.E0().d(u50Var2.L, true, false, u50Var2.f50208c);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.ea eaVar = new org.telegram.ui.Components.ea(context, this.d, 6);
        this.f50209e = eaVar;
        this.f50213s.addView(eaVar, c8.ha.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f50210f = textView;
        textView.setGravity(17);
        this.f50210f.setTextSize(1, 16.0f);
        this.f50213s.addView(this.f50210f, c8.ha.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f50210f.setOnClickListener(new View.OnClickListener(this) {
            public final u50 f49361b;

            {
                this.f49361b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u50 u50Var = this.f49361b;
                        if (!u50Var.D) {
                            u50Var.D = true;
                            u50Var.presentFragment(new ce0(), true);
                            u50Var.M = true;
                            return;
                        }
                        return;
                    default:
                        u50 u50Var2 = this.f49361b;
                        if (!u50Var2.D && u50Var2.L != null) {
                            u50Var2.D = true;
                            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, view.getContext(), null);
                            u1Var.f28568i0 = false;
                            u1Var.r(1000L);
                            org.telegram.messenger.qs.e().b(new org.telegram.messenger.ps(u50Var2, u1Var, 1), 274);
                            org.telegram.messenger.hd.E0().d(u50Var2.L, true, false, u50Var2.f50208c);
                            return;
                        }
                        return;
                }
            }
        });
        float f10 = 4;
        this.f50213s.addView(frameLayout, c8.ha.d(64, 64.0f, 53, 0.0f, f10, f10, 0.0f));
        this.fragmentView = scrollView;
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25098y4);
        int i12 = this.f50208c;
        org.telegram.messenger.qs.f(i12).c(this, org.telegram.messenger.qs.J2);
        ConnectionsManager.getInstance(i12).updateDcSettings();
        org.telegram.messenger.hd.E0().V0(i12, true);
        Z();
        this.f50216y = true;
        a0(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.qs.f25098y4 && i7 != org.telegram.messenger.qs.J2) {
            return;
        }
        Z();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(10, this), org.telegram.ui.ActionBar.k6.f27848d6, org.telegram.ui.ActionBar.k6.f28088q6, org.telegram.ui.ActionBar.k6.P9, org.telegram.ui.ActionBar.k6.Q9, org.telegram.ui.ActionBar.k6.Gi, org.telegram.ui.ActionBar.k6.G6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27848d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z9, Runnable runnable) {
        if (this.N) {
            AnimatorSet duration = new AnimatorSet().setDuration(50L);
            duration.playTogether(ValueAnimator.ofFloat(new float[0]));
            return duration;
        }
        return null;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qp.e1().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.F = new CharSequence[]{null, org.telegram.messenger.hd.M0(2131747745, null), org.telegram.messenger.hd.M0(2131747743, null), org.telegram.messenger.hd.M0(2131747739, null), org.telegram.messenger.hd.M0(2131747741, null), org.telegram.messenger.hd.M0(2131747737, null)};
        this.G = new String[]{org.telegram.messenger.hd.M0(2131747748, null), org.telegram.messenger.hd.M0(2131747746, null), org.telegram.messenger.hd.M0(2131747744, null), org.telegram.messenger.hd.M0(2131747740, null), org.telegram.messenger.hd.M0(2131747742, null), org.telegram.messenger.hd.M0(2131747738, null)};
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.M = true;
        org.telegram.messenger.g0.r(this.P);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25098y4);
        org.telegram.messenger.qs.f(this.f50208c).n(this, org.telegram.messenger.qs.J2);
        org.telegram.messenger.qp.e1().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.g0.Q3(getParentActivity());
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f50216y) {
            if (org.telegram.messenger.hd.f22871a0) {
                this.d.setCurrentItem(6);
                this.f50215x = 6;
            } else {
                this.d.setCurrentItem(0);
                this.f50215x = 0;
            }
            this.f50216y = false;
        }
        org.telegram.messenger.g0.g2(getParentActivity());
    }

    @Override
    public final void onThemeColorsChanged() {
        m4 m4Var = this.P;
        try {
            if (this.fragmentView != null) {
                int i7 = org.telegram.ui.ActionBar.k6.Ci;
                int themedColor = getThemedColor(i7);
                int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Di);
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
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.k6.A8));
                Drawable drawable = this.E;
                if (drawable != null && r12 != this.S) {
                    this.S = r12;
                    drawable.setColorFilter(r12, PorterDuff.Mode.MULTIPLY);
                }
                this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27848d6, false));
                TextView textView = this.f50210f;
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28088q6, false));
                }
                ei.k kVar = this.f50211n;
                if (kVar != null) {
                    kVar.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false));
                    org.telegram.ui.ActionBar.k6.H1(this.f50211n.getBackground(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false), true);
                }
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
                org.telegram.ui.Components.zg0 zg0Var = this.f50214w;
                if (zg0Var != null && x02 != this.T) {
                    this.T = x02;
                    zg0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.ea eaVar = this.f50209e;
                if (eaVar != null) {
                    eaVar.invalidate();
                }
                if (this.d != null) {
                    for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
                        View childAt = this.d.getChildAt(i10);
                        TextView textView2 = (TextView) childAt.findViewWithTag(this.f50206a);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                        }
                        TextView textView3 = (TextView) childAt.findViewWithTag(this.f50207b);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                        }
                    }
                }
                if (this.I != null && this.O != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27848d6, false)) {
                    org.telegram.messenger.g0.r(m4Var);
                    org.telegram.messenger.g0.i3(m4Var, 100L);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
