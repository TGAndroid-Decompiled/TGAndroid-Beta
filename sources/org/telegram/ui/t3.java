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
    public final h2.f f52138a = new h2.f((int[]) null);
    public org.telegram.ui.ActionBar.g2 f52139b;
    public final s3 f52140c;
    public View d;
    public org.telegram.ui.ActionBar.a3 f52141e;
    public boolean f52142f;
    public boolean h;
    public boolean f52143n;
    public boolean f52144r;
    public boolean f52145s;
    public fi.e3 f52146w;
    public float f52147x;
    public float f52148y;

    public t3(g4 g4Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.L = g4Var;
        this.f52139b = g2Var;
        g2Var.getResourceProvider();
        s3 s3Var = new s3(this, g2Var.getContext());
        this.f52140c = s3Var;
        new hi.o3(s3Var, true, new r3(this, 0));
    }

    public final void A() {
        float f10;
        View view = this.d;
        if (view == null) {
            return;
        }
        float w10 = w();
        float f11 = 1.0f - this.f52147x;
        if (this.f52143n) {
            f10 = 0.0f;
        } else {
            f10 = this.f52148y;
        }
        view.setTranslationY(Math.max(f11, f10) * w10);
        this.f52140c.invalidate();
    }

    @Override
    public final void a(boolean z10) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f52143n = z10;
        if (z10) {
            LaunchActivity.H1.f43120x0.b(this);
        } else {
            m(true, new iq0(this, 10));
        }
        u();
        r();
    }

    @Override
    public final void b(boolean z10) {
        this.K = z10;
        g4 g4Var = this.L;
        g4Var.f47920v0[0].setLastVisible(z10);
        g4Var.f47920v0[1].setLastVisible(false);
    }

    @Override
    public final org.telegram.ui.ActionBar.e3 c() {
        int x02;
        int x03;
        float progress;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3();
        g4 g4Var = this.L;
        e3Var.E = g4Var.f47908i0.getTitle();
        e3Var.J = g4Var;
        k3 k3Var = g4Var.f47920v0[0];
        Bitmap bitmap = null;
        if (k3Var != null && org.telegram.messenger.cz.f23412v0) {
            x02 = k3Var.getActionBarColor();
        } else {
            x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Gl, false);
        }
        e3Var.f28889q = x02;
        k3 k3Var2 = g4Var.f47920v0[0];
        if (k3Var2 != null && org.telegram.messenger.cz.f23412v0) {
            x03 = k3Var2.getBackgroundColor();
        } else {
            x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Gl, false);
        }
        e3Var.f28890r = x03;
        e3Var.f28886n = true;
        if (!this.G) {
            progress = 0.0f;
        } else {
            progress = g4Var.f47920v0[0].getProgress();
        }
        e3Var.I = progress;
        k3 k3Var3 = g4Var.f47920v0[0];
        e3Var.f28877c = k3Var3;
        if (k3Var3 != null && k3Var3.getWebView() != null) {
            bitmap = g4Var.f47920v0[0].getWebView().getFavicon();
        }
        e3Var.F = bitmap;
        k3 k3Var4 = e3Var.f28877c;
        if (k3Var4 != null) {
            e3Var.f28880g = k3Var4.getWidth();
            e3Var.h = e3Var.f28877c.getHeight();
        }
        e3Var.f28881i = x();
        e3Var.D = org.telegram.ui.ActionBar.m6.I.q();
        return e3Var;
    }

    @Override
    public final View d() {
        return this.f52140c;
    }

    @Override
    public final void dismiss() {
        a(true);
    }

    @Override
    public final int e(int i7) {
        float min;
        if (this.f52143n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f52147x, 1.0f - this.f52148y) * (1.0f - this.J);
        }
        int v = v();
        l0 l0Var = this.L.f47908i0;
        if (l0Var != null) {
            v = i0.a.f(l0Var.f53141b0, v, l0Var.f53171y);
        }
        return i0.a.f(min, i7, v);
    }

    @Override
    public final boolean f() {
        float min;
        int f10;
        float f11 = 0.0f;
        if (this.f52143n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.J) * Math.min(this.f52147x, 1.0f - this.f52148y);
        }
        if (this.G && min > 0.25f) {
            if (!org.telegram.messenger.cz.f23412v0) {
                f10 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Gl, false);
            } else {
                g4 g4Var = this.L;
                if (g4Var.f47920v0[0].getVisibility() == 0) {
                    f11 = 1.0f - (g4Var.f47920v0[0].getTranslationX() / g4Var.f47920v0[0].getWidth());
                }
                f10 = i0.a.f(1.0f - f11, g4Var.f47920v0[0].getActionBarColor(), g4Var.f47920v0[1].getActionBarColor());
            }
            if (org.telegram.messenger.g0.B(f10) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean g() {
        return this.f52142f;
    }

    @Override
    public final boolean i(org.telegram.ui.ActionBar.a3 a3Var) {
        this.f52141e = a3Var;
        if (a3Var != null) {
            this.f52142f = true;
        }
        return true;
    }

    @Override
    public final boolean j() {
        if (this.H && this.f52148y <= 0.0f && this.f52147x >= 1.0f && this.J <= 0.0f && !this.f52143n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Components.lc k() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t3.k():org.telegram.ui.Components.lc");
    }

    public final ValueAnimator l(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
        ofFloat.addUpdateListener(new q3(this, 0));
        return ofFloat;
    }

    public final void m(boolean z10, iq0 iq0Var) {
        float f10;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f52148y;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new q3(this, 2));
        this.F.addListener(new androidx.fragment.app.g(this, z10, iq0Var, 5));
        this.F.setInterpolator(org.telegram.ui.Components.nr.h);
        this.F.setDuration(250L);
        this.F.start();
    }

    @Override
    public final void n(Runnable runnable) {
        this.f52146w = (fi.e3) runnable;
    }

    public final void o() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52147x, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new q3(this, 1));
        this.E.addListener(new ki.m3(this, 15));
        this.E.setInterpolator(org.telegram.ui.Components.nr.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    @Override
    public final void p() {
        g4 g4Var = this.L;
        if (g4Var.f47914p0) {
            org.telegram.messenger.g0.v1(this.f52140c);
            return;
        }
        l0 l0Var = g4Var.f47908i0;
        if (l0Var.U) {
            l0Var.h(false);
        } else if (l0Var.f53139a0) {
            l0Var.k(false);
        } else {
            if (g4Var.H()) {
                k3 k3Var = g4Var.f47920v0[0];
                if (k3Var.f49142s) {
                    if (k3Var.f() && k3Var.getWebView() != null) {
                        k3Var.getWebView().goBack();
                        return;
                    }
                    return;
                }
            }
            if (g4Var.f47904e0.size() > 1) {
                g4Var.E();
            } else {
                a(false);
            }
        }
    }

    public final void q(org.telegram.ui.ActionBar.g2 g2Var) {
        bn bnVar;
        rj rjVar;
        this.f52144r = false;
        this.f52139b = g2Var;
        g2Var.getResourceProvider();
        if ((g2Var instanceof bn) && (rjVar = (bnVar = (bn) g2Var).f45903a0) != null) {
            rjVar.U();
            bnVar.f45903a0.L0(true, false, true);
        }
        org.telegram.ui.ActionBar.a3 a3Var = this.f52141e;
        if (a3Var != null) {
            if (!a3Var.f28756e) {
                a3Var.f28756e = true;
                try {
                    a3Var.show();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else {
            s3 s3Var = this.f52140c;
            org.telegram.messenger.g0.E2(s3Var);
            if (g2Var.getLayoutContainer() != null) {
                g2Var.getLayoutContainer().addView(s3Var);
            }
        }
        g4 g4Var = this.L;
        k3 k3Var = g4Var.f47920v0[0];
        if (k3Var != null && k3Var.G) {
            if (k3Var.getWebView() != null) {
                k3Var.getWebView().onResume();
            }
            k3Var.G = false;
        }
        k3 k3Var2 = g4Var.f47920v0[1];
        if (k3Var2 != null && k3Var2.G) {
            if (k3Var2.getWebView() != null) {
                k3Var2.getWebView().onResume();
            }
            k3Var2.G = false;
        }
        g4.f47876d1.add(g4Var);
    }

    public final void r() {
        if (this.f52145s != j()) {
            this.f52145s = j();
            org.telegram.ui.ActionBar.g2 g2Var = this.f52139b;
            if (g2Var != null && (g2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f52139b.getParentLayout();
                org.telegram.ui.ActionBar.w wVar = actionBarLayout.f28716s;
                if (wVar != null) {
                    wVar.invalidate();
                }
                org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.f28727x;
                if (wVar2 != null) {
                    wVar2.invalidate();
                    return;
                }
                return;
            }
            s3 s3Var = this.f52140c;
            if (s3Var.getParent() instanceof View) {
                ((View) s3Var.getParent()).invalidate();
            }
        }
    }

    @Override
    public final void release() {
        this.f52144r = true;
        g4 g4Var = this.L;
        k3 k3Var = g4Var.f47920v0[0];
        if (k3Var != null && k3Var.h) {
            h3 h3Var = k3Var.f49138e;
            h3Var.setSwipeOffsetY((-h3Var.f18874f) + h3Var.f18873e);
            g4Var.f47920v0[0].h = false;
        }
        k3 k3Var2 = g4Var.f47920v0[0];
        if (k3Var2 != null && !k3Var2.G) {
            if (k3Var2.getWebView() != null) {
                k3Var2.getWebView().onPause();
            }
            k3Var2.G = true;
        }
        k3 k3Var3 = g4Var.f47920v0[1];
        if (k3Var3 != null && !k3Var3.G) {
            if (k3Var3.getWebView() != null) {
                k3Var3.getWebView().onPause();
            }
            k3Var3.G = true;
        }
        org.telegram.ui.ActionBar.a3 a3Var = this.f52141e;
        if (a3Var != null) {
            a3Var.c();
        }
        this.f52139b.removeSheet(this);
        if (this.f52141e == null) {
            org.telegram.messenger.g0.E2(this.f52140c);
        }
        fi.e3 e3Var = this.f52146w;
        if (e3Var != null) {
            e3Var.run();
            this.f52146w = null;
        }
        g4.f47876d1.remove(g4Var);
    }

    @Override
    public final boolean s() {
        s3 s3Var;
        if (!this.h && !this.f52144r && this.f52147x > 0.5f && (s3Var = this.f52140c) != null && s3Var.isAttachedToWindow()) {
            if (org.telegram.messenger.g0.W1(Utilities.l(s3Var.f51869k0.f34349c), s3Var.f51875r0.x() - org.telegram.messenger.g0.L(20.0f), 0) < s3Var.getHeight() && this.J < 1.0f) {
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
        org.telegram.ui.ActionBar.a3 a3Var = this.f52141e;
        s3 s3Var = this.f52140c;
        if (a3Var != null) {
            view = a3Var.f28754b;
        } else {
            view = s3Var;
        }
        org.telegram.messenger.g0.q3(view, f());
        org.telegram.ui.ActionBar.a3 a3Var2 = this.f52141e;
        boolean z10 = false;
        if (a3Var2 != null) {
            int e10 = a3Var2.f28753a.e(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29290a7, false));
            a3Var2.d.setColor(e10);
            a3Var2.f28755c.invalidate();
            org.telegram.messenger.g0.s3(a3Var2, e10, true, null);
            if (org.telegram.messenger.g0.B(e10) >= 0.721f) {
                z10 = true;
            }
            org.telegram.messenger.g0.m3(a3Var2, z10);
            LaunchActivity.H1.F(true, true, true);
            return;
        }
        LaunchActivity.H1.F(true, true, true);
        if (org.telegram.messenger.g0.B(e(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29290a7, false))) >= 0.721f) {
            z10 = true;
        }
        org.telegram.messenger.g0.n3(s3Var, z10);
    }

    public final int v() {
        float translationX;
        if (!org.telegram.messenger.cz.f23412v0) {
            return org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Jl, false);
        }
        g4 g4Var = this.L;
        if (g4Var.f47920v0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (g4Var.f47920v0[0].getTranslationX() / g4Var.f47920v0[0].getWidth());
        }
        return i0.a.f(1.0f - translationX, g4Var.f47920v0[0].getBackgroundColor(), g4Var.f47920v0[1].getBackgroundColor());
    }

    public final int w() {
        int height;
        int L = org.telegram.messenger.g0.L(16.0f);
        View view = this.d;
        if (view == null) {
            height = org.telegram.messenger.g0.f24010q.y;
        } else {
            height = view.getHeight();
        }
        return org.telegram.messenger.f3.B(20.0f, x(), L + height);
    }

    public final int x() {
        float f10;
        g4 g4Var = this.L;
        int i7 = 0;
        k3 k3Var = g4Var.f47920v0[0];
        if (k3Var != null && k3Var.getVisibility() == 0) {
            f10 = 1.0f - (g4Var.f47920v0[0].getTranslationX() / g4Var.f47920v0[0].getWidth());
        } else {
            f10 = 0.0f;
        }
        float f11 = 1.0f - f10;
        k3 k3Var2 = g4Var.f47920v0[0];
        if (k3Var2 != null && k3Var2.getVisibility() == 0) {
            i7 = (int) (g4Var.f47920v0[0].getAlpha() * g4Var.f47920v0[0].getListTop() * f10);
        }
        k3 k3Var3 = g4Var.f47920v0[1];
        if (k3Var3 != null && k3Var3.getVisibility() == 0) {
            return i7 + ((int) (g4Var.f47920v0[1].getAlpha() * g4Var.f47920v0[1].getListTop() * f11));
        }
        return i7;
    }

    @Override
    public final boolean y() {
        return this.f52140c.isAttachedToWindow();
    }

    public final void z() {
        g4 g4Var = this.L;
        g4Var.f47920v0[0].setLastVisible(this.K);
        g4Var.f47920v0[1].setLastVisible(false);
    }

    @Override
    public final org.telegram.ui.ActionBar.k3 mo25d() {
        return this.f52140c;
    }

    @Override
    public final void h(int i7) {
    }
}
