package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class t3 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.g3 {
    public ValueAnimator E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public boolean K;
    public final g4 L;
    public final h2.f f51333a = new h2.f((int[]) null);
    public org.telegram.ui.ActionBar.e2 f51334b;
    public final s3 f51335c;
    public View d;
    public org.telegram.ui.ActionBar.y2 f51336e;
    public boolean f51337f;
    public boolean h;
    public boolean f51338n;
    public boolean f51339r;
    public boolean f51340s;
    public fi.g3 f51341w;
    public float f51342x;
    public float f51343y;

    public t3(g4 g4Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.L = g4Var;
        this.f51334b = e2Var;
        e2Var.getResourceProvider();
        s3 s3Var = new s3(this, e2Var.getContext());
        this.f51335c = s3Var;
        new hi.p3(s3Var, true, new r3(this, 0));
    }

    public final void A() {
        float f10;
        View view = this.d;
        if (view == null) {
            return;
        }
        float w10 = w();
        float f11 = 1.0f - this.f51342x;
        if (this.f51338n) {
            f10 = 0.0f;
        } else {
            f10 = this.f51343y;
        }
        view.setTranslationY(Math.max(f11, f10) * w10);
        this.f51335c.invalidate();
    }

    @Override
    public final void a(boolean z10) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f51338n = z10;
        if (z10) {
            LaunchActivity.H1.f42665x0.b(this);
        } else {
            m(true, new fq0(this, 10));
        }
        u();
        r();
    }

    @Override
    public final void b(boolean z10) {
        this.K = z10;
        g4 g4Var = this.L;
        g4Var.f47326v0[0].setLastVisible(z10);
        g4Var.f47326v0[1].setLastVisible(false);
    }

    @Override
    public final org.telegram.ui.ActionBar.b3 c() {
        int x02;
        int x03;
        float progress;
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3();
        g4 g4Var = this.L;
        b3Var.E = g4Var.f47314i0.getTitle();
        b3Var.J = g4Var;
        k3 k3Var = g4Var.f47326v0[0];
        Bitmap bitmap = null;
        if (k3Var != null && org.telegram.messenger.gz.f23990v0) {
            x02 = k3Var.getActionBarColor();
        } else {
            x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Gl, false);
        }
        b3Var.f28438q = x02;
        k3 k3Var2 = g4Var.f47326v0[0];
        if (k3Var2 != null && org.telegram.messenger.gz.f23990v0) {
            x03 = k3Var2.getBackgroundColor();
        } else {
            x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Gl, false);
        }
        b3Var.f28439r = x03;
        b3Var.f28435n = true;
        if (!this.G) {
            progress = 0.0f;
        } else {
            progress = g4Var.f47326v0[0].getProgress();
        }
        b3Var.I = progress;
        k3 k3Var3 = g4Var.f47326v0[0];
        b3Var.f28426c = k3Var3;
        if (k3Var3 != null && k3Var3.getWebView() != null) {
            bitmap = g4Var.f47326v0[0].getWebView().getFavicon();
        }
        b3Var.F = bitmap;
        k3 k3Var4 = b3Var.f28426c;
        if (k3Var4 != null) {
            b3Var.f28429g = k3Var4.getWidth();
            b3Var.h = b3Var.f28426c.getHeight();
        }
        b3Var.f28430i = x();
        b3Var.D = org.telegram.ui.ActionBar.j6.I.q();
        return b3Var;
    }

    @Override
    public final View d() {
        return this.f51335c;
    }

    @Override
    public final void dismiss() {
        a(true);
    }

    @Override
    public final int e(int i7) {
        float min;
        if (this.f51338n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f51342x, 1.0f - this.f51343y) * (1.0f - this.J);
        }
        int v = v();
        l0 l0Var = this.L.f47314i0;
        if (l0Var != null) {
            v = i0.a.f(l0Var.f52650b0, v, l0Var.f52680y);
        }
        return i0.a.f(min, i7, v);
    }

    @Override
    public final boolean f() {
        float min;
        int f10;
        float f11 = 0.0f;
        if (this.f51338n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.J) * Math.min(this.f51342x, 1.0f - this.f51343y);
        }
        if (this.G && min > 0.25f) {
            if (!org.telegram.messenger.gz.f23990v0) {
                f10 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Gl, false);
            } else {
                g4 g4Var = this.L;
                if (g4Var.f47326v0[0].getVisibility() == 0) {
                    f11 = 1.0f - (g4Var.f47326v0[0].getTranslationX() / g4Var.f47326v0[0].getWidth());
                }
                f10 = i0.a.f(1.0f - f11, g4Var.f47326v0[0].getActionBarColor(), g4Var.f47326v0[1].getActionBarColor());
            }
            if (org.telegram.messenger.g0.B(f10) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean g() {
        return this.f51337f;
    }

    @Override
    public final boolean i(org.telegram.ui.ActionBar.y2 y2Var) {
        this.f51336e = y2Var;
        if (y2Var != null) {
            this.f51337f = true;
        }
        return true;
    }

    @Override
    public final boolean j() {
        if (this.H && this.f51343y <= 0.0f && this.f51342x >= 1.0f && this.J <= 0.0f && !this.f51338n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Components.cc k() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t3.k():org.telegram.ui.Components.cc");
    }

    public final ValueAnimator l(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
        ofFloat.addUpdateListener(new q3(this, 0));
        return ofFloat;
    }

    public final void m(boolean z10, fq0 fq0Var) {
        float f10;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f51343y;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new q3(this, 2));
        this.F.addListener(new androidx.fragment.app.g(this, z10, fq0Var, 5));
        this.F.setInterpolator(org.telegram.ui.Components.er.h);
        this.F.setDuration(250L);
        this.F.start();
    }

    @Override
    public final void n(Runnable runnable) {
        this.f51341w = (fi.g3) runnable;
    }

    public final void o() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f51342x, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new q3(this, 1));
        this.E.addListener(new ki.s3(this, 15));
        this.E.setInterpolator(org.telegram.ui.Components.er.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    @Override
    public final void p() {
        g4 g4Var = this.L;
        if (g4Var.f47320p0) {
            org.telegram.messenger.g0.v1(this.f51335c);
            return;
        }
        l0 l0Var = g4Var.f47314i0;
        if (l0Var.U) {
            l0Var.h(false);
        } else if (l0Var.f52648a0) {
            l0Var.k(false);
        } else {
            if (g4Var.H()) {
                k3 k3Var = g4Var.f47326v0[0];
                if (k3Var.f48509s) {
                    if (k3Var.f() && k3Var.getWebView() != null) {
                        k3Var.getWebView().goBack();
                        return;
                    }
                    return;
                }
            }
            if (g4Var.f47310e0.size() > 1) {
                g4Var.E();
            } else {
                a(false);
            }
        }
    }

    public final void q(org.telegram.ui.ActionBar.e2 e2Var) {
        an anVar;
        qj qjVar;
        this.f51339r = false;
        this.f51334b = e2Var;
        e2Var.getResourceProvider();
        if ((e2Var instanceof an) && (qjVar = (anVar = (an) e2Var).f45117a0) != null) {
            qjVar.S();
            anVar.f45117a0.z0(true, false, true);
        }
        org.telegram.ui.ActionBar.y2 y2Var = this.f51336e;
        if (y2Var != null) {
            if (!y2Var.f29889e) {
                y2Var.f29889e = true;
                try {
                    y2Var.show();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else {
            s3 s3Var = this.f51335c;
            org.telegram.messenger.g0.E2(s3Var);
            if (e2Var.getLayoutContainer() != null) {
                e2Var.getLayoutContainer().addView(s3Var);
            }
        }
        g4 g4Var = this.L;
        k3 k3Var = g4Var.f47326v0[0];
        if (k3Var != null && k3Var.G) {
            if (k3Var.getWebView() != null) {
                k3Var.getWebView().onResume();
            }
            k3Var.G = false;
        }
        k3 k3Var2 = g4Var.f47326v0[1];
        if (k3Var2 != null && k3Var2.G) {
            if (k3Var2.getWebView() != null) {
                k3Var2.getWebView().onResume();
            }
            k3Var2.G = false;
        }
        g4.f47282d1.add(g4Var);
    }

    public final void r() {
        if (this.f51340s != j()) {
            this.f51340s = j();
            org.telegram.ui.ActionBar.e2 e2Var = this.f51334b;
            if (e2Var != null && (e2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f51334b.getParentLayout();
                org.telegram.ui.ActionBar.w wVar = actionBarLayout.f28365s;
                if (wVar != null) {
                    wVar.invalidate();
                }
                org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.f28376x;
                if (wVar2 != null) {
                    wVar2.invalidate();
                    return;
                }
                return;
            }
            s3 s3Var = this.f51335c;
            if (s3Var.getParent() instanceof View) {
                ((View) s3Var.getParent()).invalidate();
            }
        }
    }

    @Override
    public final void release() {
        this.f51339r = true;
        g4 g4Var = this.L;
        k3 k3Var = g4Var.f47326v0[0];
        if (k3Var != null && k3Var.h) {
            h3 h3Var = k3Var.f48505e;
            h3Var.setSwipeOffsetY((-h3Var.f18695f) + h3Var.f18694e);
            g4Var.f47326v0[0].h = false;
        }
        k3 k3Var2 = g4Var.f47326v0[0];
        if (k3Var2 != null && !k3Var2.G) {
            if (k3Var2.getWebView() != null) {
                k3Var2.getWebView().onPause();
            }
            k3Var2.G = true;
        }
        k3 k3Var3 = g4Var.f47326v0[1];
        if (k3Var3 != null && !k3Var3.G) {
            if (k3Var3.getWebView() != null) {
                k3Var3.getWebView().onPause();
            }
            k3Var3.G = true;
        }
        org.telegram.ui.ActionBar.y2 y2Var = this.f51336e;
        if (y2Var != null) {
            y2Var.c();
        }
        this.f51334b.removeSheet(this);
        if (this.f51336e == null) {
            org.telegram.messenger.g0.E2(this.f51335c);
        }
        fi.g3 g3Var = this.f51341w;
        if (g3Var != null) {
            g3Var.run();
            this.f51341w = null;
        }
        g4.f47282d1.remove(g4Var);
    }

    @Override
    public final boolean s() {
        s3 s3Var;
        if (!this.h && !this.f51339r && this.f51342x > 0.5f && (s3Var = this.f51335c) != null && s3Var.isAttachedToWindow()) {
            if (org.telegram.messenger.g0.W1(Utilities.l(s3Var.f51083k0.f39900c), s3Var.f51089r0.x() - org.telegram.messenger.g0.L(20.0f), 0) < s3Var.getHeight() && this.J < 1.0f) {
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
        org.telegram.ui.ActionBar.y2 y2Var = this.f51336e;
        s3 s3Var = this.f51335c;
        if (y2Var != null) {
            view = y2Var.f29887b;
        } else {
            view = s3Var;
        }
        org.telegram.messenger.g0.r3(view, f());
        org.telegram.ui.ActionBar.y2 y2Var2 = this.f51336e;
        boolean z10 = false;
        if (y2Var2 != null) {
            int e10 = y2Var2.f29886a.e(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28792a7, false));
            y2Var2.d.setColor(e10);
            y2Var2.f29888c.invalidate();
            org.telegram.messenger.g0.t3(y2Var2, e10, true, null);
            if (org.telegram.messenger.g0.B(e10) >= 0.721f) {
                z10 = true;
            }
            org.telegram.messenger.g0.n3(y2Var2, z10);
            LaunchActivity.H1.F(true, true, true);
            return;
        }
        LaunchActivity.H1.F(true, true, true);
        if (org.telegram.messenger.g0.B(e(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28792a7, false))) >= 0.721f) {
            z10 = true;
        }
        org.telegram.messenger.g0.o3(s3Var, z10);
    }

    public final int v() {
        float translationX;
        if (!org.telegram.messenger.gz.f23990v0) {
            return org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Jl, false);
        }
        g4 g4Var = this.L;
        if (g4Var.f47326v0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (g4Var.f47326v0[0].getTranslationX() / g4Var.f47326v0[0].getWidth());
        }
        return i0.a.f(1.0f - translationX, g4Var.f47326v0[0].getBackgroundColor(), g4Var.f47326v0[1].getBackgroundColor());
    }

    public final int w() {
        int height;
        int L = org.telegram.messenger.g0.L(16.0f);
        View view = this.d;
        if (view == null) {
            height = org.telegram.messenger.g0.f23611q.y;
        } else {
            height = view.getHeight();
        }
        return org.telegram.messenger.k5.B(20.0f, x(), L + height);
    }

    public final int x() {
        float f10;
        g4 g4Var = this.L;
        int i7 = 0;
        k3 k3Var = g4Var.f47326v0[0];
        if (k3Var != null && k3Var.getVisibility() == 0) {
            f10 = 1.0f - (g4Var.f47326v0[0].getTranslationX() / g4Var.f47326v0[0].getWidth());
        } else {
            f10 = 0.0f;
        }
        float f11 = 1.0f - f10;
        k3 k3Var2 = g4Var.f47326v0[0];
        if (k3Var2 != null && k3Var2.getVisibility() == 0) {
            i7 = (int) (g4Var.f47326v0[0].getAlpha() * g4Var.f47326v0[0].getListTop() * f10);
        }
        k3 k3Var3 = g4Var.f47326v0[1];
        if (k3Var3 != null && k3Var3.getVisibility() == 0) {
            return i7 + ((int) (g4Var.f47326v0[1].getAlpha() * g4Var.f47326v0[1].getListTop() * f11));
        }
        return i7;
    }

    @Override
    public final boolean y() {
        return this.f51335c.isAttachedToWindow();
    }

    public final void z() {
        g4 g4Var = this.L;
        g4Var.f47326v0[0].setLastVisible(this.K);
        g4Var.f47326v0[1].setLastVisible(false);
    }

    @Override
    public final org.telegram.ui.ActionBar.h3 mo25d() {
        return this.f51335c;
    }

    @Override
    public final void h(int i7) {
    }
}
