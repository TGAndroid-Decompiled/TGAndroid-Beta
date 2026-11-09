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
public final class w50 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public boolean D;
    public Drawable E;
    public CharSequence[] F;
    public String[] G;
    public int H;
    public v50 I;
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
    public final Object f50869a;
    public final Object f50870b;
    public final int f50871c;
    public c5.k d;
    public org.telegram.ui.Components.ea f50872e;
    public TextView f50873f;
    public GradientDrawable h;
    public ei.k f50874n;
    public FrameLayout f50875r;
    public bi.x5 f50876s;
    public org.telegram.ui.Components.ah0 f50877w;
    public int f50878x;
    public boolean f50879y;

    public w50() {
        super(null);
        this.f50869a = new Object();
        this.f50870b = new Object();
        this.f50871c = org.telegram.messenger.p10.f24470s0;
        this.f50878x = 0;
        this.f50879y = false;
        this.D = false;
        this.P = new m4(this, 8);
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w50.Z():void");
    }

    public final void a0(boolean z9) {
        GradientDrawable gradientDrawable = this.h;
        int i7 = org.telegram.ui.ActionBar.l6.Ci;
        gradientDrawable.setColors(new int[]{getThemedColor(i7), getThemedColor(org.telegram.ui.ActionBar.l6.Di)});
        this.E.setColorFilter(org.telegram.ui.ActionBar.l6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.l6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.l6.f27865d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.l6.x0(null, i10, false));
        this.f50873f.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28105q6, false));
        this.f50874n.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Gi, false));
        ei.k kVar = this.f50874n;
        int L = org.telegram.messenger.g0.L(24.0f);
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ei, false);
        kVar.setBackground(org.telegram.ui.ActionBar.l6.k0(L, L, L, L, 0, x02, x02));
        this.f50877w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.x0(null, i7, false), PorterDuff.Mode.SRC_IN));
        this.f50872e.invalidate();
        this.O = org.telegram.ui.ActionBar.l6.x0(null, i10, false);
        if (z9) {
            v50 v50Var = this.I;
            if (v50Var != null) {
                v50Var.postRunnable(new jz(this, 11));
            }
            for (int i11 = 0; i11 < this.d.getChildCount(); i11++) {
                View childAt = this.d.getChildAt(i11);
                int i12 = org.telegram.ui.ActionBar.l6.G6;
                ((TextView) childAt.findViewWithTag(this.f50869a)).setTextColor(org.telegram.ui.ActionBar.l6.x0(null, i12, false));
                ((TextView) childAt.findViewWithTag(this.f50870b)).setTextColor(org.telegram.ui.ActionBar.l6.x0(null, i12, false));
            }
            return;
        }
        Intro.a(org.telegram.ui.ActionBar.l6.x0(null, i10, false));
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
        this.f50876s = x5Var;
        scrollView.addView(x5Var, c8.ha.x(-1, -2, 51));
        org.telegram.ui.Components.ah0 ah0Var = new org.telegram.ui.Components.ah0(2131624239, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f50877w = ah0Var;
        ah0Var.h = true;
        ah0Var.Z = true;
        ah0Var.o();
        org.telegram.ui.Components.ah0 ah0Var2 = this.f50877w;
        if (org.telegram.ui.ActionBar.l6.D0().q()) {
            i7 = this.f50877w.f31826e[0] - 1;
        } else {
            i7 = 0;
        }
        ah0Var2.P(i7);
        org.telegram.ui.Components.ah0 ah0Var3 = this.f50877w;
        if (org.telegram.ui.ActionBar.l6.D0().q()) {
            i10 = this.f50877w.f31826e[0] - 1;
        } else {
            i10 = 0;
        }
        ah0Var3.N(i10, false, false);
        if (org.telegram.ui.ActionBar.l6.D0().q()) {
            i11 = 2131754751;
        } else {
            i11 = 2131754750;
        }
        imageView.setContentDescription(org.telegram.messenger.id.M0(i11, null));
        imageView.setAnimation(this.f50877w);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.u41(18, this, imageView));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f50875r = frameLayout2;
        this.f50876s.addView(frameLayout2, c8.ha.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.f50875r.addView(textureView, c8.ha.e(200, 150, 17));
        textureView.setSurfaceTextureListener(new u50(this, 0));
        c5.k kVar = new c5.k(context);
        this.d = kVar;
        kVar.setAdapter(new org.telegram.ui.Components.b20(this, 2));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.f50876s.addView(this.d, c8.ha.c(-1.0f, -1));
        this.d.b(new k2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        ei.k kVar2 = new ei.k(this, context);
        this.f50874n = kVar2;
        c8.ka.b(kVar2, 0.02f, 1.2f);
        this.f50874n.setText(org.telegram.messenger.id.M0(2131744911, null));
        this.f50874n.setGravity(17);
        this.f50874n.setTypeface(org.telegram.messenger.g0.o());
        this.f50874n.setTextSize(1, 15.0f);
        this.f50874n.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        this.f50876s.addView(this.f50874n, c8.ha.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.f50874n.setOnClickListener(new View.OnClickListener(this) {
            public final w50 f50090b;

            {
                this.f50090b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w50 w50Var = this.f50090b;
                        if (!w50Var.D) {
                            w50Var.D = true;
                            w50Var.presentFragment(new ee0(), true);
                            w50Var.M = true;
                            return;
                        }
                        return;
                    default:
                        w50 w50Var2 = this.f50090b;
                        if (!w50Var2.D && w50Var2.L != null) {
                            w50Var2.D = true;
                            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, view.getContext(), null);
                            u1Var.f28563i0 = false;
                            u1Var.r(1000L);
                            org.telegram.messenger.qs.e().b(new org.telegram.messenger.ps(w50Var2, u1Var, 1), 274);
                            org.telegram.messenger.id.E0().d(w50Var2.L, true, false, w50Var2.f50871c);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.ea eaVar = new org.telegram.ui.Components.ea(context, this.d, 6);
        this.f50872e = eaVar;
        this.f50876s.addView(eaVar, c8.ha.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f50873f = textView;
        textView.setGravity(17);
        this.f50873f.setTextSize(1, 16.0f);
        this.f50876s.addView(this.f50873f, c8.ha.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f50873f.setOnClickListener(new View.OnClickListener(this) {
            public final w50 f50090b;

            {
                this.f50090b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w50 w50Var = this.f50090b;
                        if (!w50Var.D) {
                            w50Var.D = true;
                            w50Var.presentFragment(new ee0(), true);
                            w50Var.M = true;
                            return;
                        }
                        return;
                    default:
                        w50 w50Var2 = this.f50090b;
                        if (!w50Var2.D && w50Var2.L != null) {
                            w50Var2.D = true;
                            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, view.getContext(), null);
                            u1Var.f28563i0 = false;
                            u1Var.r(1000L);
                            org.telegram.messenger.qs.e().b(new org.telegram.messenger.ps(w50Var2, u1Var, 1), 274);
                            org.telegram.messenger.id.E0().d(w50Var2.L, true, false, w50Var2.f50871c);
                            return;
                        }
                        return;
                }
            }
        });
        float f10 = 4;
        this.f50876s.addView(frameLayout, c8.ha.d(64, 64.0f, 53, 0.0f, f10, f10, 0.0f));
        this.fragmentView = scrollView;
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25115y4);
        int i12 = this.f50871c;
        org.telegram.messenger.qs.f(i12).c(this, org.telegram.messenger.qs.J2);
        ConnectionsManager.getInstance(i12).updateDcSettings();
        org.telegram.messenger.id.E0().V0(i12, true);
        Z();
        this.f50879y = true;
        a0(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.qs.f25115y4 && i7 != org.telegram.messenger.qs.J2) {
            return;
        }
        Z();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(10, this), org.telegram.ui.ActionBar.l6.f27865d6, org.telegram.ui.ActionBar.l6.f28105q6, org.telegram.ui.ActionBar.l6.P9, org.telegram.ui.ActionBar.l6.Q9, org.telegram.ui.ActionBar.l6.Gi, org.telegram.ui.ActionBar.l6.G6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, true)) > 0.699999988079071d) {
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
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25115y4);
        org.telegram.messenger.qs.f(this.f50871c).n(this, org.telegram.messenger.qs.J2);
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
        if (this.f50879y) {
            if (org.telegram.messenger.id.f23157a0) {
                this.d.setCurrentItem(6);
                this.f50878x = 6;
            } else {
                this.d.setCurrentItem(0);
                this.f50878x = 0;
            }
            this.f50879y = false;
        }
        org.telegram.messenger.g0.g2(getParentActivity());
    }

    @Override
    public final void onThemeColorsChanged() {
        m4 m4Var = this.P;
        try {
            if (this.fragmentView != null) {
                int i7 = org.telegram.ui.ActionBar.l6.Ci;
                int themedColor = getThemedColor(i7);
                int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.l6.Di);
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
                int r12 = org.telegram.ui.ActionBar.l6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.l6.A8));
                Drawable drawable = this.E;
                if (drawable != null && r12 != this.S) {
                    this.S = r12;
                    drawable.setColorFilter(r12, PorterDuff.Mode.MULTIPLY);
                }
                this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false));
                TextView textView = this.f50873f;
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28105q6, false));
                }
                ei.k kVar = this.f50874n;
                if (kVar != null) {
                    kVar.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Gi, false));
                    org.telegram.ui.ActionBar.l6.H1(this.f50874n.getBackground(), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ei, false), true);
                }
                int x02 = org.telegram.ui.ActionBar.l6.x0(null, i7, false);
                org.telegram.ui.Components.ah0 ah0Var = this.f50877w;
                if (ah0Var != null && x02 != this.T) {
                    this.T = x02;
                    ah0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.ea eaVar = this.f50872e;
                if (eaVar != null) {
                    eaVar.invalidate();
                }
                if (this.d != null) {
                    for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
                        View childAt = this.d.getChildAt(i10);
                        TextView textView2 = (TextView) childAt.findViewWithTag(this.f50869a);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
                        }
                        TextView textView3 = (TextView) childAt.findViewWithTag(this.f50870b);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
                        }
                    }
                }
                if (this.I != null && this.O != org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false)) {
                    org.telegram.messenger.g0.r(m4Var);
                    org.telegram.messenger.g0.i3(m4Var, 100L);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
