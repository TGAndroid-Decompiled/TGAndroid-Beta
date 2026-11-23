package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class t3 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.j3 {
    public ValueAnimator E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public boolean K;
    public final g4 L;
    public final h2.f f52220a = new h2.f((int[]) null);
    public org.telegram.ui.ActionBar.g2 f52221b;
    public final s3 f52222c;
    public View d;
    public org.telegram.ui.ActionBar.a3 f52223e;
    public boolean f52224f;
    public boolean h;
    public boolean f52225n;
    public boolean f52226r;
    public boolean f52227s;
    public fi.e3 f52228w;
    public float f52229x;
    public float f52230y;

    public t3(g4 g4Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.L = g4Var;
        this.f52221b = g2Var;
        g2Var.getResourceProvider();
        s3 s3Var = new s3(this, g2Var.getContext());
        this.f52222c = s3Var;
        new hi.x3(s3Var, true, new r3(this, 0));
    }

    public final void A() {
        float f10;
        View view = this.d;
        if (view == null) {
            return;
        }
        float w10 = w();
        float f11 = 1.0f - this.f52229x;
        if (this.f52225n) {
            f10 = 0.0f;
        } else {
            f10 = this.f52230y;
        }
        view.setTranslationY(Math.max(f11, f10) * w10);
        this.f52222c.invalidate();
    }

    @Override
    public final void a(boolean z10) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f52225n = z10;
        if (z10) {
            LaunchActivity.H1.f43230x0.b(this);
        } else {
            m(true, new hq0(this, 10));
        }
        u();
        r();
    }

    @Override
    public final void b(boolean z10) {
        this.K = z10;
        g4 g4Var = this.L;
        g4Var.f48084v0[0].setLastVisible(z10);
        g4Var.f48084v0[1].setLastVisible(false);
    }

    @Override
    public final org.telegram.ui.ActionBar.e3 c() {
        int x02;
        int x03;
        float progress;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3();
        g4 g4Var = this.L;
        e3Var.E = g4Var.f48072i0.getTitle();
        e3Var.J = g4Var;
        k3 k3Var = g4Var.f48084v0[0];
        Bitmap bitmap = null;
        if (k3Var != null && org.telegram.messenger.bz.f23328v0) {
            x02 = k3Var.getActionBarColor();
        } else {
            x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false);
        }
        e3Var.f28966q = x02;
        k3 k3Var2 = g4Var.f48084v0[0];
        if (k3Var2 != null && org.telegram.messenger.bz.f23328v0) {
            x03 = k3Var2.getBackgroundColor();
        } else {
            x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false);
        }
        e3Var.f28967r = x03;
        e3Var.f28963n = true;
        if (!this.G) {
            progress = 0.0f;
        } else {
            progress = g4Var.f48084v0[0].getProgress();
        }
        e3Var.I = progress;
        k3 k3Var3 = g4Var.f48084v0[0];
        e3Var.f28954c = k3Var3;
        if (k3Var3 != null && k3Var3.getWebView() != null) {
            bitmap = g4Var.f48084v0[0].getWebView().getFavicon();
        }
        e3Var.F = bitmap;
        k3 k3Var4 = e3Var.f28954c;
        if (k3Var4 != null) {
            e3Var.f28957g = k3Var4.getWidth();
            e3Var.h = e3Var.f28954c.getHeight();
        }
        e3Var.f28958i = x();
        e3Var.D = org.telegram.ui.ActionBar.n6.I.q();
        return e3Var;
    }

    @Override
    public final View d() {
        return this.f52222c;
    }

    @Override
    public final void dismiss() {
        a(true);
    }

    @Override
    public final int e(int i7) {
        float min;
        if (this.f52225n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f52229x, 1.0f - this.f52230y) * (1.0f - this.J);
        }
        int v = v();
        l0 l0Var = this.L.f48072i0;
        if (l0Var != null) {
            v = i0.a.f(l0Var.f53412b0, v, l0Var.f53442y);
        }
        return i0.a.f(min, i7, v);
    }

    @Override
    public final boolean f() {
        float min;
        int f10;
        float f11 = 0.0f;
        if (this.f52225n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.J) * Math.min(this.f52229x, 1.0f - this.f52230y);
        }
        if (this.G && min > 0.25f) {
            if (!org.telegram.messenger.bz.f23328v0) {
                f10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false);
            } else {
                g4 g4Var = this.L;
                if (g4Var.f48084v0[0].getVisibility() == 0) {
                    f11 = 1.0f - (g4Var.f48084v0[0].getTranslationX() / g4Var.f48084v0[0].getWidth());
                }
                f10 = i0.a.f(1.0f - f11, g4Var.f48084v0[0].getActionBarColor(), g4Var.f48084v0[1].getActionBarColor());
            }
            if (org.telegram.messenger.g0.B(f10) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean g() {
        return this.f52224f;
    }

    @Override
    public final boolean i(org.telegram.ui.ActionBar.a3 a3Var) {
        this.f52223e = a3Var;
        if (a3Var != null) {
            this.f52224f = true;
        }
        return true;
    }

    @Override
    public final boolean j() {
        if (this.H && this.f52230y <= 0.0f && this.f52229x >= 1.0f && this.J <= 0.0f && !this.f52225n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Components.kc k() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t3.k():org.telegram.ui.Components.kc");
    }

    public final ValueAnimator l(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
        ofFloat.addUpdateListener(new q3(this, 0));
        return ofFloat;
    }

    public final void m(boolean z10, hq0 hq0Var) {
        float f10;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f52230y;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new q3(this, 2));
        this.F.addListener(new androidx.fragment.app.g(this, z10, hq0Var, 5));
        this.F.setInterpolator(org.telegram.ui.Components.kr.h);
        this.F.setDuration(250L);
        this.F.start();
    }

    @Override
    public final void n(Runnable runnable) {
        this.f52228w = (fi.e3) runnable;
    }

    public final void o() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52229x, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new q3(this, 1));
        this.E.addListener(new ki.n3(this, 15));
        this.E.setInterpolator(org.telegram.ui.Components.kr.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    @Override
    public final void p() {
        g4 g4Var = this.L;
        if (g4Var.f48078p0) {
            org.telegram.messenger.g0.v1(this.f52222c);
            return;
        }
        l0 l0Var = g4Var.f48072i0;
        if (l0Var.U) {
            l0Var.h(false);
        } else if (l0Var.f53410a0) {
            l0Var.k(false);
        } else {
            if (g4Var.H()) {
                k3 k3Var = g4Var.f48084v0[0];
                if (k3Var.f49294s) {
                    if (k3Var.f() && k3Var.getWebView() != null) {
                        k3Var.getWebView().goBack();
                        return;
                    }
                    return;
                }
            }
            if (g4Var.f48068e0.size() > 1) {
                g4Var.E();
            } else {
                a(false);
            }
        }
    }

    public final void q(org.telegram.ui.ActionBar.g2 g2Var) {
        bn bnVar;
        rj rjVar;
        this.f52226r = false;
        this.f52221b = g2Var;
        g2Var.getResourceProvider();
        if ((g2Var instanceof bn) && (rjVar = (bnVar = (bn) g2Var).f46118a0) != null) {
            rjVar.U();
            bnVar.f46118a0.K0();
        }
        org.telegram.ui.ActionBar.a3 a3Var = this.f52223e;
        if (a3Var != null) {
            if (!a3Var.f28848e) {
                a3Var.f28848e = true;
                try {
                    a3Var.show();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else {
            s3 s3Var = this.f52222c;
            org.telegram.messenger.g0.E2(s3Var);
            if (g2Var.getLayoutContainer() != null) {
                g2Var.getLayoutContainer().addView(s3Var);
            }
        }
        g4 g4Var = this.L;
        k3 k3Var = g4Var.f48084v0[0];
        if (k3Var != null && k3Var.G) {
            if (k3Var.getWebView() != null) {
                k3Var.getWebView().onResume();
            }
            k3Var.G = false;
        }
        k3 k3Var2 = g4Var.f48084v0[1];
        if (k3Var2 != null && k3Var2.G) {
            if (k3Var2.getWebView() != null) {
                k3Var2.getWebView().onResume();
            }
            k3Var2.G = false;
        }
        g4.f48040d1.add(g4Var);
    }

    public final void r() {
        if (this.f52227s != j()) {
            this.f52227s = j();
            org.telegram.ui.ActionBar.g2 g2Var = this.f52221b;
            if (g2Var != null && (g2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f52221b.getParentLayout();
                org.telegram.ui.ActionBar.w wVar = actionBarLayout.f28808s;
                if (wVar != null) {
                    wVar.invalidate();
                }
                org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.f28819x;
                if (wVar2 != null) {
                    wVar2.invalidate();
                    return;
                }
                return;
            }
            s3 s3Var = this.f52222c;
            if (s3Var.getParent() instanceof View) {
                ((View) s3Var.getParent()).invalidate();
            }
        }
    }

    @Override
    public final void release() {
        this.f52226r = true;
        g4 g4Var = this.L;
        k3 k3Var = g4Var.f48084v0[0];
        if (k3Var != null && k3Var.h) {
            h3 h3Var = k3Var.f49290e;
            h3Var.setSwipeOffsetY((-h3Var.f18994f) + h3Var.f18993e);
            g4Var.f48084v0[0].h = false;
        }
        k3 k3Var2 = g4Var.f48084v0[0];
        if (k3Var2 != null && !k3Var2.G) {
            if (k3Var2.getWebView() != null) {
                k3Var2.getWebView().onPause();
            }
            k3Var2.G = true;
        }
        k3 k3Var3 = g4Var.f48084v0[1];
        if (k3Var3 != null && !k3Var3.G) {
            if (k3Var3.getWebView() != null) {
                k3Var3.getWebView().onPause();
            }
            k3Var3.G = true;
        }
        org.telegram.ui.ActionBar.a3 a3Var = this.f52223e;
        if (a3Var != null) {
            a3Var.c();
        }
        this.f52221b.removeSheet(this);
        if (this.f52223e == null) {
            org.telegram.messenger.g0.E2(this.f52222c);
        }
        fi.e3 e3Var = this.f52228w;
        if (e3Var != null) {
            e3Var.run();
            this.f52228w = null;
        }
        g4.f48040d1.remove(g4Var);
    }

    @Override
    public final boolean s() {
        s3 s3Var;
        if (!this.h && !this.f52226r && this.f52229x > 0.5f && (s3Var = this.f52222c) != null && s3Var.isAttachedToWindow()) {
            if (org.telegram.messenger.g0.W1(Utilities.l(s3Var.f51954k0.f33931c), s3Var.f51960r0.x() - org.telegram.messenger.g0.L(20.0f), 0) < s3Var.getHeight() && this.J < 1.0f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean t(Dialog dialog) {
        return false;
    }

    public final void u() {
        View view;
        org.telegram.ui.ActionBar.a3 a3Var = this.f52223e;
        s3 s3Var = this.f52222c;
        if (a3Var != null) {
            view = a3Var.f28846b;
        } else {
            view = s3Var;
        }
        org.telegram.messenger.g0.q3(view, f());
        org.telegram.ui.ActionBar.a3 a3Var2 = this.f52223e;
        boolean z10 = false;
        if (a3Var2 != null) {
            int e10 = a3Var2.f28845a.e(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394a7, false));
            a3Var2.d.setColor(e10);
            a3Var2.f28847c.invalidate();
            org.telegram.messenger.g0.s3(a3Var2, e10, true, null);
            if (org.telegram.messenger.g0.B(e10) >= 0.721f) {
                z10 = true;
            }
            org.telegram.messenger.g0.m3(a3Var2, z10);
            LaunchActivity.H1.G(true, true, true);
            return;
        }
        LaunchActivity.H1.G(true, true, true);
        if (org.telegram.messenger.g0.B(e(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394a7, false))) >= 0.721f) {
            z10 = true;
        }
        org.telegram.messenger.g0.n3(s3Var, z10);
    }

    public final int v() {
        float translationX;
        if (!org.telegram.messenger.bz.f23328v0) {
            return org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Jl, false);
        }
        g4 g4Var = this.L;
        if (g4Var.f48084v0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (g4Var.f48084v0[0].getTranslationX() / g4Var.f48084v0[0].getWidth());
        }
        return i0.a.f(1.0f - translationX, g4Var.f48084v0[0].getBackgroundColor(), g4Var.f48084v0[1].getBackgroundColor());
    }

    public final int w() {
        int height;
        int L = org.telegram.messenger.g0.L(16.0f);
        View view = this.d;
        if (view == null) {
            height = org.telegram.messenger.g0.f24226q.y;
        } else {
            height = view.getHeight();
        }
        return org.telegram.messenger.f3.B(20.0f, x(), L + height);
    }

    public final int x() {
        float f10;
        g4 g4Var = this.L;
        int i7 = 0;
        k3 k3Var = g4Var.f48084v0[0];
        if (k3Var != null && k3Var.getVisibility() == 0) {
            f10 = 1.0f - (g4Var.f48084v0[0].getTranslationX() / g4Var.f48084v0[0].getWidth());
        } else {
            f10 = 0.0f;
        }
        float f11 = 1.0f - f10;
        k3 k3Var2 = g4Var.f48084v0[0];
        if (k3Var2 != null && k3Var2.getVisibility() == 0) {
            i7 = (int) (g4Var.f48084v0[0].getAlpha() * g4Var.f48084v0[0].getListTop() * f10);
        }
        k3 k3Var3 = g4Var.f48084v0[1];
        if (k3Var3 != null && k3Var3.getVisibility() == 0) {
            return i7 + ((int) (g4Var.f48084v0[1].getAlpha() * g4Var.f48084v0[1].getListTop() * f11));
        }
        return i7;
    }

    @Override
    public final boolean y() {
        return this.f52222c.isAttachedToWindow();
    }

    public final void z() {
        g4 g4Var = this.L;
        g4Var.f48084v0[0].setLastVisible(this.K);
        g4Var.f48084v0[1].setLastVisible(false);
    }

    @Override
    public final org.telegram.ui.ActionBar.k3 mo25d() {
        return this.f52222c;
    }

    @Override
    public final void h(int i7) {
    }
}
