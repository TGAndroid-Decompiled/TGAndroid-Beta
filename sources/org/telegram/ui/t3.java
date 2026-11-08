package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class t3 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.h3 {
    public ValueAnimator D;
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final g4 K;
    public final h2.f f49892a = new h2.f((int[]) null);
    public org.telegram.ui.ActionBar.f2 f49893b;
    public final s3 f49894c;
    public View d;
    public org.telegram.ui.ActionBar.z2 f49895e;
    public boolean f49896f;
    public boolean h;
    public boolean f49897n;
    public boolean f49898r;
    public boolean f49899s;
    public di.l3 f49900w;
    public float f49901x;
    public float f49902y;

    public t3(g4 g4Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.K = g4Var;
        this.f49893b = f2Var;
        f2Var.getResourceProvider();
        s3 s3Var = new s3(this, f2Var.getContext());
        this.f49894c = s3Var;
        new fi.q3(s3Var, true, new r3(this, 0));
    }

    public final void A() {
        float f10;
        View view = this.d;
        if (view == null) {
            return;
        }
        float w10 = w();
        float f11 = 1.0f - this.f49901x;
        if (this.f49897n) {
            f10 = 0.0f;
        } else {
            f10 = this.f49902y;
        }
        view.setTranslationY(Math.max(f11, f10) * w10);
        this.f49894c.invalidate();
    }

    @Override
    public final void a(boolean z9) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f49897n = z9;
        if (z9) {
            LaunchActivity.G1.f41295w0.b(this);
        } else {
            m(true, new gq0(this, 10));
        }
        u();
        r();
    }

    @Override
    public final void b(boolean z9) {
        this.J = z9;
        g4 g4Var = this.K;
        g4Var.f45819u0[0].setLastVisible(z9);
        g4Var.f45819u0[1].setLastVisible(false);
    }

    @Override
    public final org.telegram.ui.ActionBar.c3 c() {
        int x02;
        int x03;
        float progress;
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3();
        g4 g4Var = this.K;
        c3Var.E = g4Var.f45807h0.getTitle();
        c3Var.J = g4Var;
        k3 k3Var = g4Var.f45819u0[0];
        Bitmap bitmap = null;
        if (k3Var != null && org.telegram.messenger.iz.f23443v0) {
            x02 = k3Var.getActionBarColor();
        } else {
            x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
        }
        c3Var.f27388q = x02;
        k3 k3Var2 = g4Var.f45819u0[0];
        if (k3Var2 != null && org.telegram.messenger.iz.f23443v0) {
            x03 = k3Var2.getBackgroundColor();
        } else {
            x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
        }
        c3Var.f27389r = x03;
        c3Var.f27385n = true;
        if (!this.F) {
            progress = 0.0f;
        } else {
            progress = g4Var.f45819u0[0].getProgress();
        }
        c3Var.I = progress;
        k3 k3Var3 = g4Var.f45819u0[0];
        c3Var.f27376c = k3Var3;
        if (k3Var3 != null && k3Var3.getWebView() != null) {
            bitmap = g4Var.f45819u0[0].getWebView().getFavicon();
        }
        c3Var.F = bitmap;
        k3 k3Var4 = c3Var.f27376c;
        if (k3Var4 != null) {
            c3Var.f27379g = k3Var4.getWidth();
            c3Var.h = c3Var.f27376c.getHeight();
        }
        c3Var.f27380i = x();
        c3Var.D = org.telegram.ui.ActionBar.k6.I.q();
        return c3Var;
    }

    @Override
    public final View d() {
        return this.f49894c;
    }

    @Override
    public final void dismiss() {
        a(true);
    }

    @Override
    public final int e(int i7) {
        float min;
        if (this.f49897n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f49901x, 1.0f - this.f49902y) * (1.0f - this.I);
        }
        int v = v();
        l0 l0Var = this.K.f45807h0;
        if (l0Var != null) {
            v = i0.a.f(l0Var.f51187a0, v, l0Var.f51219y);
        }
        return i0.a.f(min, i7, v);
    }

    @Override
    public final boolean f() {
        float min;
        int f10;
        float f11 = 0.0f;
        if (this.f49897n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.I) * Math.min(this.f49901x, 1.0f - this.f49902y);
        }
        if (this.F && min > 0.25f) {
            if (!org.telegram.messenger.iz.f23443v0) {
                f10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
            } else {
                g4 g4Var = this.K;
                if (g4Var.f45819u0[0].getVisibility() == 0) {
                    f11 = 1.0f - (g4Var.f45819u0[0].getTranslationX() / g4Var.f45819u0[0].getWidth());
                }
                f10 = i0.a.f(1.0f - f11, g4Var.f45819u0[0].getActionBarColor(), g4Var.f45819u0[1].getActionBarColor());
            }
            if (org.telegram.messenger.g0.B(f10) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean g() {
        return this.f49896f;
    }

    @Override
    public final boolean i(org.telegram.ui.ActionBar.z2 z2Var) {
        this.f49895e = z2Var;
        if (z2Var != null) {
            this.f49896f = true;
        }
        return true;
    }

    @Override
    public final boolean j() {
        if (this.G && this.f49902y <= 0.0f && this.f49901x >= 1.0f && this.I <= 0.0f && !this.f49897n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Components.hc k() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t3.k():org.telegram.ui.Components.hc");
    }

    public final ValueAnimator l(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f10);
        ofFloat.addUpdateListener(new q3(this, 0));
        return ofFloat;
    }

    public final void m(boolean z9, gq0 gq0Var) {
        float f10;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f49902y;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new q3(this, 2));
        this.E.addListener(new ai.g0(this, z9, gq0Var, 5));
        this.E.setInterpolator(org.telegram.ui.Components.xq.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    @Override
    public final void n(Runnable runnable) {
        this.f49900w = (di.l3) runnable;
    }

    public final void o() {
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f49901x, 1.0f);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new q3(this, 1));
        this.D.addListener(new m.a(this, 14));
        this.D.setInterpolator(org.telegram.ui.Components.xq.h);
        this.D.setDuration(320L);
        this.D.start();
    }

    @Override
    public final void p() {
        g4 g4Var = this.K;
        if (g4Var.f45813o0) {
            org.telegram.messenger.g0.v1(this.f49894c);
            return;
        }
        l0 l0Var = g4Var.f45807h0;
        if (l0Var.T) {
            l0Var.h(false);
        } else if (l0Var.W) {
            l0Var.k(false);
        } else {
            if (g4Var.H()) {
                k3 k3Var = g4Var.f45819u0[0];
                if (k3Var.f47091s) {
                    if (k3Var.f() && k3Var.getWebView() != null) {
                        k3Var.getWebView().goBack();
                        return;
                    }
                    return;
                }
            }
            if (g4Var.f45803d0.size() > 1) {
                g4Var.E();
            } else {
                a(false);
            }
        }
    }

    public final void q(org.telegram.ui.ActionBar.f2 f2Var) {
        an anVar;
        qj qjVar;
        this.f49898r = false;
        this.f49893b = f2Var;
        f2Var.getResourceProvider();
        if ((f2Var instanceof an) && (qjVar = (anVar = (an) f2Var).Z) != null) {
            qjVar.L();
            anVar.Z.j0();
        }
        org.telegram.ui.ActionBar.z2 z2Var = this.f49895e;
        if (z2Var != null) {
            if (!z2Var.f28830e) {
                z2Var.f28830e = true;
                try {
                    z2Var.show();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else {
            s3 s3Var = this.f49894c;
            org.telegram.messenger.g0.E2(s3Var);
            if (f2Var.getLayoutContainer() != null) {
                f2Var.getLayoutContainer().addView(s3Var);
            }
        }
        g4 g4Var = this.K;
        k3 k3Var = g4Var.f45819u0[0];
        if (k3Var != null && k3Var.F) {
            if (k3Var.getWebView() != null) {
                k3Var.getWebView().onResume();
            }
            k3Var.F = false;
        }
        k3 k3Var2 = g4Var.f45819u0[1];
        if (k3Var2 != null && k3Var2.F) {
            if (k3Var2.getWebView() != null) {
                k3Var2.getWebView().onResume();
            }
            k3Var2.F = false;
        }
        g4.f45776c1.add(g4Var);
    }

    public final void r() {
        if (this.f49899s != j()) {
            this.f49899s = j();
            org.telegram.ui.ActionBar.f2 f2Var = this.f49893b;
            if (f2Var != null && (f2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f49893b.getParentLayout();
                org.telegram.ui.ActionBar.w wVar = actionBarLayout.f27270s;
                if (wVar != null) {
                    wVar.invalidate();
                }
                org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.f27280x;
                if (wVar2 != null) {
                    wVar2.invalidate();
                    return;
                }
                return;
            }
            s3 s3Var = this.f49894c;
            if (s3Var.getParent() instanceof View) {
                ((View) s3Var.getParent()).invalidate();
            }
        }
    }

    @Override
    public final void release() {
        this.f49898r = true;
        g4 g4Var = this.K;
        k3 k3Var = g4Var.f45819u0[0];
        if (k3Var != null && k3Var.h) {
            h3 h3Var = k3Var.f47087e;
            h3Var.setSwipeOffsetY((-h3Var.f14565f) + h3Var.f14564e);
            g4Var.f45819u0[0].h = false;
        }
        k3 k3Var2 = g4Var.f45819u0[0];
        if (k3Var2 != null && !k3Var2.F) {
            if (k3Var2.getWebView() != null) {
                k3Var2.getWebView().onPause();
            }
            k3Var2.F = true;
        }
        k3 k3Var3 = g4Var.f45819u0[1];
        if (k3Var3 != null && !k3Var3.F) {
            if (k3Var3.getWebView() != null) {
                k3Var3.getWebView().onPause();
            }
            k3Var3.F = true;
        }
        org.telegram.ui.ActionBar.z2 z2Var = this.f49895e;
        if (z2Var != null) {
            z2Var.c();
        }
        this.f49893b.removeSheet(this);
        if (this.f49895e == null) {
            org.telegram.messenger.g0.E2(this.f49894c);
        }
        di.l3 l3Var = this.f49900w;
        if (l3Var != null) {
            l3Var.run();
            this.f49900w = null;
        }
        g4.f45776c1.remove(g4Var);
    }

    @Override
    public final boolean s() {
        s3 s3Var;
        if (!this.h && !this.f49898r && this.f49901x > 0.5f && (s3Var = this.f49894c) != null && s3Var.isAttachedToWindow()) {
            if (org.telegram.messenger.g0.W1(Utilities.l(s3Var.f49611j0.f39805c), s3Var.f49617q0.x() - org.telegram.messenger.g0.L(20.0f), 0) < s3Var.getHeight() && this.I < 1.0f) {
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
        org.telegram.ui.ActionBar.z2 z2Var = this.f49895e;
        s3 s3Var = this.f49894c;
        if (z2Var != null) {
            view = z2Var.f28828b;
        } else {
            view = s3Var;
        }
        org.telegram.messenger.g0.r3(view, f());
        org.telegram.ui.ActionBar.z2 z2Var2 = this.f49895e;
        boolean z9 = false;
        if (z2Var2 != null) {
            int e10 = z2Var2.f28827a.e(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27796a7, false));
            z2Var2.d.setColor(e10);
            z2Var2.f28829c.invalidate();
            org.telegram.messenger.g0.u3(z2Var2, e10, true, null);
            if (org.telegram.messenger.g0.B(e10) >= 0.721f) {
                z9 = true;
            }
            org.telegram.messenger.g0.n3(z2Var2, z9);
            LaunchActivity.G1.F(true, true, true);
            return;
        }
        LaunchActivity.G1.F(true, true, true);
        if (org.telegram.messenger.g0.B(e(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27796a7, false))) >= 0.721f) {
            z9 = true;
        }
        org.telegram.messenger.g0.o3(s3Var, z9);
    }

    public final int v() {
        float translationX;
        if (!org.telegram.messenger.iz.f23443v0) {
            return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gl, false);
        }
        g4 g4Var = this.K;
        if (g4Var.f45819u0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (g4Var.f45819u0[0].getTranslationX() / g4Var.f45819u0[0].getWidth());
        }
        return i0.a.f(1.0f - translationX, g4Var.f45819u0[0].getBackgroundColor(), g4Var.f45819u0[1].getBackgroundColor());
    }

    public final int w() {
        int height;
        int L = org.telegram.messenger.g0.L(16.0f);
        View view = this.d;
        if (view == null) {
            height = org.telegram.messenger.g0.f22563q.y;
        } else {
            height = view.getHeight();
        }
        return org.telegram.messenger.k5.B(20.0f, x(), L + height);
    }

    public final int x() {
        float f10;
        g4 g4Var = this.K;
        int i7 = 0;
        k3 k3Var = g4Var.f45819u0[0];
        if (k3Var != null && k3Var.getVisibility() == 0) {
            f10 = 1.0f - (g4Var.f45819u0[0].getTranslationX() / g4Var.f45819u0[0].getWidth());
        } else {
            f10 = 0.0f;
        }
        float f11 = 1.0f - f10;
        k3 k3Var2 = g4Var.f45819u0[0];
        if (k3Var2 != null && k3Var2.getVisibility() == 0) {
            i7 = (int) (g4Var.f45819u0[0].getAlpha() * g4Var.f45819u0[0].getListTop() * f10);
        }
        k3 k3Var3 = g4Var.f45819u0[1];
        if (k3Var3 != null && k3Var3.getVisibility() == 0) {
            return i7 + ((int) (g4Var.f45819u0[1].getAlpha() * g4Var.f45819u0[1].getListTop() * f11));
        }
        return i7;
    }

    @Override
    public final boolean y() {
        return this.f49894c.isAttachedToWindow();
    }

    public final void z() {
        g4 g4Var = this.K;
        g4Var.f45819u0[0].setLastVisible(this.J);
        g4Var.f45819u0[1].setLastVisible(false);
    }

    @Override
    public final org.telegram.ui.ActionBar.i3 mo25d() {
        return this.f49894c;
    }

    @Override
    public final void h(int i7) {
    }
}
