package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class t3 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.i3 {
    public ValueAnimator D;
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final g4 K;
    public final h2.f f50088a = new h2.f((int[]) null);
    public org.telegram.ui.ActionBar.f2 f50089b;
    public final s3 f50090c;
    public View d;
    public org.telegram.ui.ActionBar.a3 f50091e;
    public boolean f50092f;
    public boolean h;
    public boolean f50093n;
    public boolean f50094r;
    public boolean f50095s;
    public di.l3 f50096w;
    public float f50097x;
    public float f50098y;

    public t3(g4 g4Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.K = g4Var;
        this.f50089b = f2Var;
        f2Var.getResourceProvider();
        s3 s3Var = new s3(this, f2Var.getContext());
        this.f50090c = s3Var;
        new fi.q3(s3Var, true, new r3(this, 0));
    }

    public final void A() {
        float f10;
        View view = this.d;
        if (view == null) {
            return;
        }
        float w10 = w();
        float f11 = 1.0f - this.f50097x;
        if (this.f50093n) {
            f10 = 0.0f;
        } else {
            f10 = this.f50098y;
        }
        view.setTranslationY(Math.max(f11, f10) * w10);
        this.f50090c.invalidate();
    }

    @Override
    public final void a(boolean z9) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f50093n = z9;
        if (z9) {
            LaunchActivity.G1.f41293w0.b(this);
        } else {
            m(true, new jq0(this, 10));
        }
        u();
        r();
    }

    @Override
    public final void b(boolean z9) {
        this.J = z9;
        g4 g4Var = this.K;
        g4Var.f45971u0[0].setLastVisible(z9);
        g4Var.f45971u0[1].setLastVisible(false);
    }

    @Override
    public final org.telegram.ui.ActionBar.d3 c() {
        int x02;
        int x03;
        float progress;
        org.telegram.ui.ActionBar.d3 d3Var = new org.telegram.ui.ActionBar.d3();
        g4 g4Var = this.K;
        d3Var.E = g4Var.f45959h0.getTitle();
        d3Var.J = g4Var;
        k3 k3Var = g4Var.f45971u0[0];
        Bitmap bitmap = null;
        if (k3Var != null && org.telegram.messenger.iz.f23447v0) {
            x02 = k3Var.getActionBarColor();
        } else {
            x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Dl, false);
        }
        d3Var.f27406q = x02;
        k3 k3Var2 = g4Var.f45971u0[0];
        if (k3Var2 != null && org.telegram.messenger.iz.f23447v0) {
            x03 = k3Var2.getBackgroundColor();
        } else {
            x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Dl, false);
        }
        d3Var.f27407r = x03;
        d3Var.f27403n = true;
        if (!this.F) {
            progress = 0.0f;
        } else {
            progress = g4Var.f45971u0[0].getProgress();
        }
        d3Var.I = progress;
        k3 k3Var3 = g4Var.f45971u0[0];
        d3Var.f27394c = k3Var3;
        if (k3Var3 != null && k3Var3.getWebView() != null) {
            bitmap = g4Var.f45971u0[0].getWebView().getFavicon();
        }
        d3Var.F = bitmap;
        k3 k3Var4 = d3Var.f27394c;
        if (k3Var4 != null) {
            d3Var.f27397g = k3Var4.getWidth();
            d3Var.h = d3Var.f27394c.getHeight();
        }
        d3Var.f27398i = x();
        d3Var.D = org.telegram.ui.ActionBar.m6.I.q();
        return d3Var;
    }

    @Override
    public final View d() {
        return this.f50090c;
    }

    @Override
    public final void dismiss() {
        a(true);
    }

    @Override
    public final int e(int i7) {
        float min;
        if (this.f50093n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f50097x, 1.0f - this.f50098y) * (1.0f - this.I);
        }
        int v = v();
        l0 l0Var = this.K.f45959h0;
        if (l0Var != null) {
            v = i0.a.f(l0Var.f51122a0, v, l0Var.f51154y);
        }
        return i0.a.f(min, i7, v);
    }

    @Override
    public final boolean f() {
        float min;
        int f10;
        float f11 = 0.0f;
        if (this.f50093n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.I) * Math.min(this.f50097x, 1.0f - this.f50098y);
        }
        if (this.F && min > 0.25f) {
            if (!org.telegram.messenger.iz.f23447v0) {
                f10 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Dl, false);
            } else {
                g4 g4Var = this.K;
                if (g4Var.f45971u0[0].getVisibility() == 0) {
                    f11 = 1.0f - (g4Var.f45971u0[0].getTranslationX() / g4Var.f45971u0[0].getWidth());
                }
                f10 = i0.a.f(1.0f - f11, g4Var.f45971u0[0].getActionBarColor(), g4Var.f45971u0[1].getActionBarColor());
            }
            if (org.telegram.messenger.g0.B(f10) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean g() {
        return this.f50092f;
    }

    @Override
    public final boolean i(org.telegram.ui.ActionBar.a3 a3Var) {
        this.f50091e = a3Var;
        if (a3Var != null) {
            this.f50092f = true;
        }
        return true;
    }

    @Override
    public final boolean j() {
        if (this.G && this.f50098y <= 0.0f && this.f50097x >= 1.0f && this.I <= 0.0f && !this.f50093n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Components.gc k() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t3.k():org.telegram.ui.Components.gc");
    }

    public final ValueAnimator l(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f10);
        ofFloat.addUpdateListener(new q3(this, 0));
        return ofFloat;
    }

    public final void m(boolean z9, jq0 jq0Var) {
        float f10;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f50098y;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new q3(this, 2));
        this.E.addListener(new ai.g0(this, z9, jq0Var, 5));
        this.E.setInterpolator(org.telegram.ui.Components.wq.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    @Override
    public final void n(Runnable runnable) {
        this.f50096w = (di.l3) runnable;
    }

    public final void o() {
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f50097x, 1.0f);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new q3(this, 1));
        this.D.addListener(new m.a(this, 14));
        this.D.setInterpolator(org.telegram.ui.Components.wq.h);
        this.D.setDuration(320L);
        this.D.start();
    }

    @Override
    public final void p() {
        g4 g4Var = this.K;
        if (g4Var.f45965o0) {
            org.telegram.messenger.g0.v1(this.f50090c);
            return;
        }
        l0 l0Var = g4Var.f45959h0;
        if (l0Var.T) {
            l0Var.h(false);
        } else if (l0Var.W) {
            l0Var.k(false);
        } else {
            if (g4Var.H()) {
                k3 k3Var = g4Var.f45971u0[0];
                if (k3Var.f47148s) {
                    if (k3Var.f() && k3Var.getWebView() != null) {
                        k3Var.getWebView().goBack();
                        return;
                    }
                    return;
                }
            }
            if (g4Var.f45955d0.size() > 1) {
                g4Var.E();
            } else {
                a(false);
            }
        }
    }

    public final void q(org.telegram.ui.ActionBar.f2 f2Var) {
        cn cnVar;
        sj sjVar;
        this.f50094r = false;
        this.f50089b = f2Var;
        f2Var.getResourceProvider();
        if ((f2Var instanceof cn) && (sjVar = (cnVar = (cn) f2Var).Z) != null) {
            sjVar.L();
            cnVar.Z.j0();
        }
        org.telegram.ui.ActionBar.a3 a3Var = this.f50091e;
        if (a3Var != null) {
            if (!a3Var.f27312e) {
                a3Var.f27312e = true;
                try {
                    a3Var.show();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else {
            s3 s3Var = this.f50090c;
            org.telegram.messenger.g0.E2(s3Var);
            if (f2Var.getLayoutContainer() != null) {
                f2Var.getLayoutContainer().addView(s3Var);
            }
        }
        g4 g4Var = this.K;
        k3 k3Var = g4Var.f45971u0[0];
        if (k3Var != null && k3Var.F) {
            if (k3Var.getWebView() != null) {
                k3Var.getWebView().onResume();
            }
            k3Var.F = false;
        }
        k3 k3Var2 = g4Var.f45971u0[1];
        if (k3Var2 != null && k3Var2.F) {
            if (k3Var2.getWebView() != null) {
                k3Var2.getWebView().onResume();
            }
            k3Var2.F = false;
        }
        g4.f45928c1.add(g4Var);
    }

    public final void r() {
        if (this.f50095s != j()) {
            this.f50095s = j();
            org.telegram.ui.ActionBar.f2 f2Var = this.f50089b;
            if (f2Var != null && (f2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f50089b.getParentLayout();
                org.telegram.ui.ActionBar.w wVar = actionBarLayout.f27274s;
                if (wVar != null) {
                    wVar.invalidate();
                }
                org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.f27284x;
                if (wVar2 != null) {
                    wVar2.invalidate();
                    return;
                }
                return;
            }
            s3 s3Var = this.f50090c;
            if (s3Var.getParent() instanceof View) {
                ((View) s3Var.getParent()).invalidate();
            }
        }
    }

    @Override
    public final void release() {
        this.f50094r = true;
        g4 g4Var = this.K;
        k3 k3Var = g4Var.f45971u0[0];
        if (k3Var != null && k3Var.h) {
            h3 h3Var = k3Var.f47144e;
            h3Var.setSwipeOffsetY((-h3Var.f14567f) + h3Var.f14566e);
            g4Var.f45971u0[0].h = false;
        }
        k3 k3Var2 = g4Var.f45971u0[0];
        if (k3Var2 != null && !k3Var2.F) {
            if (k3Var2.getWebView() != null) {
                k3Var2.getWebView().onPause();
            }
            k3Var2.F = true;
        }
        k3 k3Var3 = g4Var.f45971u0[1];
        if (k3Var3 != null && !k3Var3.F) {
            if (k3Var3.getWebView() != null) {
                k3Var3.getWebView().onPause();
            }
            k3Var3.F = true;
        }
        org.telegram.ui.ActionBar.a3 a3Var = this.f50091e;
        if (a3Var != null) {
            a3Var.c();
        }
        this.f50089b.removeSheet(this);
        if (this.f50091e == null) {
            org.telegram.messenger.g0.E2(this.f50090c);
        }
        di.l3 l3Var = this.f50096w;
        if (l3Var != null) {
            l3Var.run();
            this.f50096w = null;
        }
        g4.f45928c1.remove(g4Var);
    }

    @Override
    public final boolean s() {
        s3 s3Var;
        if (!this.h && !this.f50094r && this.f50097x > 0.5f && (s3Var = this.f50090c) != null && s3Var.isAttachedToWindow()) {
            if (org.telegram.messenger.g0.W1(Utilities.l(s3Var.f49636j0.f38854c), s3Var.f49642q0.x() - org.telegram.messenger.g0.L(20.0f), 0) < s3Var.getHeight() && this.I < 1.0f) {
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
        org.telegram.ui.ActionBar.a3 a3Var = this.f50091e;
        s3 s3Var = this.f50090c;
        if (a3Var != null) {
            view = a3Var.f27310b;
        } else {
            view = s3Var;
        }
        org.telegram.messenger.g0.r3(view, f());
        org.telegram.ui.ActionBar.a3 a3Var2 = this.f50091e;
        boolean z9 = false;
        if (a3Var2 != null) {
            int e10 = a3Var2.f27309a.e(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27834a7, false));
            a3Var2.d.setColor(e10);
            a3Var2.f27311c.invalidate();
            org.telegram.messenger.g0.u3(a3Var2, e10, true, null);
            if (org.telegram.messenger.g0.B(e10) >= 0.721f) {
                z9 = true;
            }
            org.telegram.messenger.g0.n3(a3Var2, z9);
            LaunchActivity.G1.F(true, true, true);
            return;
        }
        LaunchActivity.G1.F(true, true, true);
        if (org.telegram.messenger.g0.B(e(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27834a7, false))) >= 0.721f) {
            z9 = true;
        }
        org.telegram.messenger.g0.o3(s3Var, z9);
    }

    public final int v() {
        float translationX;
        if (!org.telegram.messenger.iz.f23447v0) {
            return org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Gl, false);
        }
        g4 g4Var = this.K;
        if (g4Var.f45971u0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (g4Var.f45971u0[0].getTranslationX() / g4Var.f45971u0[0].getWidth());
        }
        return i0.a.f(1.0f - translationX, g4Var.f45971u0[0].getBackgroundColor(), g4Var.f45971u0[1].getBackgroundColor());
    }

    public final int w() {
        int height;
        int L = org.telegram.messenger.g0.L(16.0f);
        View view = this.d;
        if (view == null) {
            height = org.telegram.messenger.g0.f22567q.y;
        } else {
            height = view.getHeight();
        }
        return org.telegram.messenger.k5.B(20.0f, x(), L + height);
    }

    public final int x() {
        float f10;
        g4 g4Var = this.K;
        int i7 = 0;
        k3 k3Var = g4Var.f45971u0[0];
        if (k3Var != null && k3Var.getVisibility() == 0) {
            f10 = 1.0f - (g4Var.f45971u0[0].getTranslationX() / g4Var.f45971u0[0].getWidth());
        } else {
            f10 = 0.0f;
        }
        float f11 = 1.0f - f10;
        k3 k3Var2 = g4Var.f45971u0[0];
        if (k3Var2 != null && k3Var2.getVisibility() == 0) {
            i7 = (int) (g4Var.f45971u0[0].getAlpha() * g4Var.f45971u0[0].getListTop() * f10);
        }
        k3 k3Var3 = g4Var.f45971u0[1];
        if (k3Var3 != null && k3Var3.getVisibility() == 0) {
            return i7 + ((int) (g4Var.f45971u0[1].getAlpha() * g4Var.f45971u0[1].getListTop() * f11));
        }
        return i7;
    }

    @Override
    public final boolean y() {
        return this.f50090c.isAttachedToWindow();
    }

    public final void z() {
        g4 g4Var = this.K;
        g4Var.f45971u0[0].setLastVisible(this.J);
        g4Var.f45971u0[1].setLastVisible(false);
    }

    @Override
    public final org.telegram.ui.ActionBar.j3 mo25d() {
        return this.f50090c;
    }

    @Override
    public final void h(int i7) {
    }
}
