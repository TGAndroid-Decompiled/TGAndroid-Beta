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
public final class x50 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public boolean D;
    public Drawable E;
    public CharSequence[] F;
    public String[] G;
    public int H;
    public w50 I;
    public long J;
    public boolean K;
    public org.telegram.messenger.fd L;
    public boolean M;
    public boolean N;
    public int O;
    public final m4 P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final Object f51526a;
    public final Object f51527b;
    public final int f51528c;
    public c5.k d;
    public org.telegram.ui.Components.da f51529e;
    public TextView f51530f;
    public GradientDrawable h;
    public ei.k f51531n;
    public FrameLayout f51532r;
    public bi.x5 f51533s;
    public org.telegram.ui.Components.zg0 f51534w;
    public int f51535x;
    public boolean f51536y;

    public x50() {
        super(null);
        this.f51526a = new Object();
        this.f51527b = new Object();
        this.f51528c = org.telegram.messenger.p10.f24474s0;
        this.f51535x = 0;
        this.f51536y = false;
        this.D = false;
        this.P = new m4(this, 8);
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x50.Z():void");
    }

    public final void a0(boolean z9) {
        GradientDrawable gradientDrawable = this.h;
        int i7 = org.telegram.ui.ActionBar.m6.Ci;
        gradientDrawable.setColors(new int[]{getThemedColor(i7), getThemedColor(org.telegram.ui.ActionBar.m6.Di)});
        this.E.setColorFilter(org.telegram.ui.ActionBar.m6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.m6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.m6.f27890d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        this.f51530f.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28130q6, false));
        this.f51531n.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Gi, false));
        ei.k kVar = this.f51531n;
        int L = org.telegram.messenger.g0.L(24.0f);
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ei, false);
        kVar.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, x02, x02));
        this.f51534w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, i7, false), PorterDuff.Mode.SRC_IN));
        this.f51529e.invalidate();
        this.O = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        if (z9) {
            w50 w50Var = this.I;
            if (w50Var != null) {
                w50Var.postRunnable(new kz(this, 11));
            }
            for (int i11 = 0; i11 < this.d.getChildCount(); i11++) {
                View childAt = this.d.getChildAt(i11);
                int i12 = org.telegram.ui.ActionBar.m6.G6;
                ((TextView) childAt.findViewWithTag(this.f51526a)).setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
                ((TextView) childAt.findViewWithTag(this.f51527b)).setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
            }
            return;
        }
        Intro.a(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        Drawable h = jg.g.h(context, 2131232774);
        this.E = h;
        h.setBounds(0, org.telegram.messenger.g0.L(8.666f), org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131747748, null));
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 0, spannableStringBuilder.length(), 33);
        this.F[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        ?? imageView = new ImageView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView((View) imageView, c8.ha.e(28, 28, 17));
        bi.x5 x5Var = new bi.x5(this, context, frameLayout, 21);
        this.f51533s = x5Var;
        scrollView.addView(x5Var, c8.ha.x(-1, -2, 51));
        org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(2131624239, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f51534w = zg0Var;
        zg0Var.h = true;
        zg0Var.Z = true;
        zg0Var.o();
        org.telegram.ui.Components.zg0 zg0Var2 = this.f51534w;
        if (org.telegram.ui.ActionBar.m6.D0().q()) {
            i7 = this.f51534w.f40968e[0] - 1;
        } else {
            i7 = 0;
        }
        zg0Var2.P(i7);
        org.telegram.ui.Components.zg0 zg0Var3 = this.f51534w;
        if (org.telegram.ui.ActionBar.m6.D0().q()) {
            i10 = this.f51534w.f40968e[0] - 1;
        } else {
            i10 = 0;
        }
        zg0Var3.N(i10, false, false);
        if (org.telegram.ui.ActionBar.m6.D0().q()) {
            i11 = 2131754751;
        } else {
            i11 = 2131754750;
        }
        imageView.setContentDescription(org.telegram.messenger.id.M0(i11, null));
        imageView.setAnimation(this.f51534w);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.u41(18, this, imageView));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f51532r = frameLayout2;
        this.f51533s.addView(frameLayout2, c8.ha.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.f51532r.addView(textureView, c8.ha.e(200, 150, 17));
        textureView.setSurfaceTextureListener(new v50(this, 0));
        c5.k kVar = new c5.k(context);
        this.d = kVar;
        kVar.setAdapter(new org.telegram.ui.Components.a20(this, 2));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.f51533s.addView(this.d, c8.ha.c(-1.0f, -1));
        this.d.b(new k2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        ei.k kVar2 = new ei.k(this, context);
        this.f51531n = kVar2;
        c8.ka.b(kVar2, 0.02f, 1.2f);
        this.f51531n.setText(org.telegram.messenger.id.M0(2131744911, null));
        this.f51531n.setGravity(17);
        this.f51531n.setTypeface(org.telegram.messenger.g0.o());
        this.f51531n.setTextSize(1, 15.0f);
        this.f51531n.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        this.f51533s.addView(this.f51531n, c8.ha.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.f51531n.setOnClickListener(new View.OnClickListener(this) {
            public final x50 f50409b;

            {
                this.f50409b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        x50 x50Var = this.f50409b;
                        if (!x50Var.D) {
                            x50Var.D = true;
                            x50Var.presentFragment(new fe0(), true);
                            x50Var.M = true;
                            return;
                        }
                        return;
                    default:
                        x50 x50Var2 = this.f50409b;
                        if (!x50Var2.D && x50Var2.L != null) {
                            x50Var2.D = true;
                            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, view.getContext(), null);
                            u1Var.f28558i0 = false;
                            u1Var.r(1000L);
                            org.telegram.messenger.qs.e().b(new org.telegram.messenger.ps(x50Var2, u1Var, 1), 274);
                            org.telegram.messenger.id.E0().d(x50Var2.L, true, false, x50Var2.f51528c);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.da daVar = new org.telegram.ui.Components.da(context, this.d, 6);
        this.f51529e = daVar;
        this.f51533s.addView(daVar, c8.ha.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f51530f = textView;
        textView.setGravity(17);
        this.f51530f.setTextSize(1, 16.0f);
        this.f51533s.addView(this.f51530f, c8.ha.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f51530f.setOnClickListener(new View.OnClickListener(this) {
            public final x50 f50409b;

            {
                this.f50409b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        x50 x50Var = this.f50409b;
                        if (!x50Var.D) {
                            x50Var.D = true;
                            x50Var.presentFragment(new fe0(), true);
                            x50Var.M = true;
                            return;
                        }
                        return;
                    default:
                        x50 x50Var2 = this.f50409b;
                        if (!x50Var2.D && x50Var2.L != null) {
                            x50Var2.D = true;
                            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, view.getContext(), null);
                            u1Var.f28558i0 = false;
                            u1Var.r(1000L);
                            org.telegram.messenger.qs.e().b(new org.telegram.messenger.ps(x50Var2, u1Var, 1), 274);
                            org.telegram.messenger.id.E0().d(x50Var2.L, true, false, x50Var2.f51528c);
                            return;
                        }
                        return;
                }
            }
        });
        float f10 = 4;
        this.f51533s.addView(frameLayout, c8.ha.d(64, 64.0f, 53, 0.0f, f10, f10, 0.0f));
        this.fragmentView = scrollView;
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25119y4);
        int i12 = this.f51528c;
        org.telegram.messenger.qs.f(i12).c(this, org.telegram.messenger.qs.J2);
        ConnectionsManager.getInstance(i12).updateDcSettings();
        org.telegram.messenger.id.E0().V0(i12, true);
        Z();
        this.f51536y = true;
        a0(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.qs.f25119y4 && i7 != org.telegram.messenger.qs.J2) {
            return;
        }
        Z();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(10, this), org.telegram.ui.ActionBar.m6.f27890d6, org.telegram.ui.ActionBar.m6.f28130q6, org.telegram.ui.ActionBar.m6.P9, org.telegram.ui.ActionBar.m6.Q9, org.telegram.ui.ActionBar.m6.Gi, org.telegram.ui.ActionBar.m6.G6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, true)) > 0.699999988079071d) {
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
        this.F = new CharSequence[]{null, org.telegram.messenger.id.M0(2131747746, null), org.telegram.messenger.id.M0(2131747744, null), org.telegram.messenger.id.M0(2131747740, null), org.telegram.messenger.id.M0(2131747742, null), org.telegram.messenger.id.M0(2131747738, null)};
        this.G = new String[]{org.telegram.messenger.id.M0(2131747749, null), org.telegram.messenger.id.M0(2131747747, null), org.telegram.messenger.id.M0(2131747745, null), org.telegram.messenger.id.M0(2131747741, null), org.telegram.messenger.id.M0(2131747743, null), org.telegram.messenger.id.M0(2131747739, null)};
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.M = true;
        org.telegram.messenger.g0.r(this.P);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25119y4);
        org.telegram.messenger.qs.f(this.f51528c).n(this, org.telegram.messenger.qs.J2);
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
        if (this.f51536y) {
            if (org.telegram.messenger.id.f23161a0) {
                this.d.setCurrentItem(6);
                this.f51535x = 6;
            } else {
                this.d.setCurrentItem(0);
                this.f51535x = 0;
            }
            this.f51536y = false;
        }
        org.telegram.messenger.g0.g2(getParentActivity());
    }

    @Override
    public final void onThemeColorsChanged() {
        m4 m4Var = this.P;
        try {
            if (this.fragmentView != null) {
                int i7 = org.telegram.ui.ActionBar.m6.Ci;
                int themedColor = getThemedColor(i7);
                int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.m6.Di);
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
                int r12 = org.telegram.ui.ActionBar.m6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.m6.A8));
                Drawable drawable = this.E;
                if (drawable != null && r12 != this.S) {
                    this.S = r12;
                    drawable.setColorFilter(r12, PorterDuff.Mode.MULTIPLY);
                }
                this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false));
                TextView textView = this.f51530f;
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28130q6, false));
                }
                ei.k kVar = this.f51531n;
                if (kVar != null) {
                    kVar.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Gi, false));
                    org.telegram.ui.ActionBar.m6.H1(this.f51531n.getBackground(), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ei, false), true);
                }
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
                org.telegram.ui.Components.zg0 zg0Var = this.f51534w;
                if (zg0Var != null && x02 != this.T) {
                    this.T = x02;
                    zg0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.da daVar = this.f51529e;
                if (daVar != null) {
                    daVar.invalidate();
                }
                if (this.d != null) {
                    for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
                        View childAt = this.d.getChildAt(i10);
                        TextView textView2 = (TextView) childAt.findViewWithTag(this.f51526a);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
                        }
                        TextView textView3 = (TextView) childAt.findViewWithTag(this.f51527b);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
                        }
                    }
                }
                if (this.I != null && this.O != org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false)) {
                    org.telegram.messenger.g0.r(m4Var);
                    org.telegram.messenger.g0.i3(m4Var, 100L);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
