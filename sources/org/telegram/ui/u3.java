package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class u3 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.g3 {
    public ValueAnimator E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public boolean K;
    public final i4 L;
    public final g2.g f49949a = new g2.g((int[]) null);
    public org.telegram.ui.ActionBar.d2 f49950b;
    public final t3 f49951c;
    public View d;
    public org.telegram.ui.ActionBar.x2 f49952e;
    public boolean f49953f;
    public boolean h;
    public boolean f49954n;
    public boolean f49955r;
    public boolean f49956s;
    public ei.o3 f49957w;
    public float f49958x;
    public float f49959y;

    public u3(i4 i4Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.L = i4Var;
        this.f49950b = d2Var;
        d2Var.getResourceProvider();
        t3 t3Var = new t3(this, d2Var.getContext());
        this.f49951c = t3Var;
        new gi.p3(t3Var, true, new s3(this, 0));
    }

    public final void A() {
        float f10;
        View view = this.d;
        if (view == null) {
            return;
        }
        float w10 = w();
        float f11 = 1.0f - this.f49958x;
        if (this.f49954n) {
            f10 = 0.0f;
        } else {
            f10 = this.f49959y;
        }
        view.setTranslationY(Math.max(f11, f10) * w10);
        this.f49951c.invalidate();
    }

    @Override
    public final void a(boolean z10) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f49954n = z10;
        if (z10) {
            LaunchActivity.K1.f41330z0.b(this);
        } else {
            m(true, new xp0(this, 10));
        }
        u();
        r();
    }

    @Override
    public final void b(boolean z10) {
        this.K = z10;
        i4 i4Var = this.L;
        i4Var.f46100v0[0].setLastVisible(z10);
        i4Var.f46100v0[1].setLastVisible(false);
    }

    @Override
    public final org.telegram.ui.ActionBar.a3 c() {
        int x02;
        int x03;
        float progress;
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3();
        i4 i4Var = this.L;
        a3Var.E = i4Var.f46088i0.getTitle();
        a3Var.J = i4Var;
        l3 l3Var = i4Var.f46100v0[0];
        Bitmap bitmap = null;
        if (l3Var != null && org.telegram.messenger.az.f21670v0) {
            x02 = l3Var.getActionBarColor();
        } else {
            x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
        }
        a3Var.f27365q = x02;
        l3 l3Var2 = i4Var.f46100v0[0];
        if (l3Var2 != null && org.telegram.messenger.az.f21670v0) {
            x03 = l3Var2.getBackgroundColor();
        } else {
            x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
        }
        a3Var.f27366r = x03;
        a3Var.f27362n = true;
        if (!this.G) {
            progress = 0.0f;
        } else {
            progress = i4Var.f46100v0[0].getProgress();
        }
        a3Var.I = progress;
        l3 l3Var3 = i4Var.f46100v0[0];
        a3Var.f27353c = l3Var3;
        if (l3Var3 != null && l3Var3.getWebView() != null) {
            bitmap = i4Var.f46100v0[0].getWebView().getFavicon();
        }
        a3Var.F = bitmap;
        l3 l3Var4 = a3Var.f27353c;
        if (l3Var4 != null) {
            a3Var.f27356g = l3Var4.getWidth();
            a3Var.h = a3Var.f27353c.getHeight();
        }
        a3Var.f27357i = x();
        a3Var.D = org.telegram.ui.ActionBar.k6.I.q();
        return a3Var;
    }

    @Override
    public final View d() {
        return this.f49951c;
    }

    @Override
    public final void dismiss() {
        a(true);
    }

    @Override
    public final int e(int i3) {
        float min;
        if (this.f49954n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f49958x, 1.0f - this.f49959y) * (1.0f - this.J);
        }
        int v = v();
        m0 m0Var = this.L.f46088i0;
        if (m0Var != null) {
            v = i0.a.f(m0Var.f50873b0, v, m0Var.f50903y);
        }
        return i0.a.f(min, i3, v);
    }

    @Override
    public final boolean f() {
        float min;
        int f10;
        float f11 = 0.0f;
        if (this.f49954n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.J) * Math.min(this.f49958x, 1.0f - this.f49959y);
        }
        if (this.G && min > 0.25f) {
            if (!org.telegram.messenger.az.f21670v0) {
                f10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
            } else {
                i4 i4Var = this.L;
                if (i4Var.f46100v0[0].getVisibility() == 0) {
                    f11 = 1.0f - (i4Var.f46100v0[0].getTranslationX() / i4Var.f46100v0[0].getWidth());
                }
                f10 = i0.a.f(1.0f - f11, i4Var.f46100v0[0].getActionBarColor(), i4Var.f46100v0[1].getActionBarColor());
            }
            if (org.telegram.messenger.g0.B(f10) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean g() {
        return this.f49953f;
    }

    @Override
    public final boolean i(org.telegram.ui.ActionBar.x2 x2Var) {
        this.f49952e = x2Var;
        if (x2Var != null) {
            this.f49953f = true;
        }
        return true;
    }

    @Override
    public final boolean j() {
        if (this.H && this.f49959y <= 0.0f && this.f49958x >= 1.0f && this.J <= 0.0f && !this.f49954n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Components.fc k() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u3.k():org.telegram.ui.Components.fc");
    }

    public final ValueAnimator l(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
        ofFloat.addUpdateListener(new r3(this, 0));
        return ofFloat;
    }

    public final void m(boolean z10, xp0 xp0Var) {
        float f10;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f49959y;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new r3(this, 2));
        this.F.addListener(new androidx.fragment.app.g(this, z10, xp0Var, 5));
        this.F.setInterpolator(org.telegram.ui.Components.xq.h);
        this.F.setDuration(250L);
        this.F.start();
    }

    @Override
    public final void n(Runnable runnable) {
        this.f49957w = (ei.o3) runnable;
    }

    public final void o() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f49958x, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new r3(this, 1));
        this.E.addListener(new ii.v3(this, 15));
        this.E.setInterpolator(org.telegram.ui.Components.xq.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    @Override
    public final void p() {
        i4 i4Var = this.L;
        if (i4Var.f46094p0) {
            org.telegram.messenger.g0.v1(this.f49951c);
            return;
        }
        m0 m0Var = i4Var.f46088i0;
        if (m0Var.U) {
            m0Var.h(false);
        } else if (m0Var.f50871a0) {
            m0Var.k(false);
        } else {
            if (i4Var.H()) {
                l3 l3Var = i4Var.f46100v0[0];
                if (l3Var.f47089s) {
                    if (l3Var.f() && l3Var.getWebView() != null) {
                        l3Var.getWebView().goBack();
                        return;
                    }
                    return;
                }
            }
            if (i4Var.f46084e0.size() > 1) {
                i4Var.E();
            } else {
                a(false);
            }
        }
    }

    public final void q(org.telegram.ui.ActionBar.d2 d2Var) {
        wm wmVar;
        mj mjVar;
        this.f49955r = false;
        this.f49950b = d2Var;
        d2Var.getResourceProvider();
        if ((d2Var instanceof wm) && (mjVar = (wmVar = (wm) d2Var).f51237a0) != null) {
            mjVar.L();
            wmVar.f51237a0.k0(true, false, true);
        }
        org.telegram.ui.ActionBar.x2 x2Var = this.f49952e;
        if (x2Var != null) {
            if (!x2Var.f28799e) {
                x2Var.f28799e = true;
                try {
                    x2Var.show();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else {
            t3 t3Var = this.f49951c;
            org.telegram.messenger.g0.E2(t3Var);
            if (d2Var.getLayoutContainer() != null) {
                d2Var.getLayoutContainer().addView(t3Var);
            }
        }
        i4 i4Var = this.L;
        l3 l3Var = i4Var.f46100v0[0];
        if (l3Var != null && l3Var.G) {
            if (l3Var.getWebView() != null) {
                l3Var.getWebView().onResume();
            }
            l3Var.G = false;
        }
        l3 l3Var2 = i4Var.f46100v0[1];
        if (l3Var2 != null && l3Var2.G) {
            if (l3Var2.getWebView() != null) {
                l3Var2.getWebView().onResume();
            }
            l3Var2.G = false;
        }
        i4.f46056d1.add(i4Var);
    }

    public final void r() {
        if (this.f49956s != j()) {
            this.f49956s = j();
            org.telegram.ui.ActionBar.d2 d2Var = this.f49950b;
            if (d2Var != null && (d2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f49950b.getParentLayout();
                org.telegram.ui.ActionBar.v vVar = actionBarLayout.f27316s;
                if (vVar != null) {
                    vVar.invalidate();
                }
                org.telegram.ui.ActionBar.v vVar2 = actionBarLayout.f27327x;
                if (vVar2 != null) {
                    vVar2.invalidate();
                    return;
                }
                return;
            }
            t3 t3Var = this.f49951c;
            if (t3Var.getParent() instanceof View) {
                ((View) t3Var.getParent()).invalidate();
            }
        }
    }

    @Override
    public final void release() {
        this.f49955r = true;
        i4 i4Var = this.L;
        l3 l3Var = i4Var.f46100v0[0];
        if (l3Var != null && l3Var.h) {
            i3 i3Var = l3Var.f47085e;
            i3Var.setSwipeOffsetY((-i3Var.f14878f) + i3Var.f14877e);
            i4Var.f46100v0[0].h = false;
        }
        l3 l3Var2 = i4Var.f46100v0[0];
        if (l3Var2 != null && !l3Var2.G) {
            if (l3Var2.getWebView() != null) {
                l3Var2.getWebView().onPause();
            }
            l3Var2.G = true;
        }
        l3 l3Var3 = i4Var.f46100v0[1];
        if (l3Var3 != null && !l3Var3.G) {
            if (l3Var3.getWebView() != null) {
                l3Var3.getWebView().onPause();
            }
            l3Var3.G = true;
        }
        org.telegram.ui.ActionBar.x2 x2Var = this.f49952e;
        if (x2Var != null) {
            x2Var.c();
        }
        this.f49950b.removeSheet(this);
        if (this.f49952e == null) {
            org.telegram.messenger.g0.E2(this.f49951c);
        }
        ei.o3 o3Var = this.f49957w;
        if (o3Var != null) {
            o3Var.run();
            this.f49957w = null;
        }
        i4.f46056d1.remove(i4Var);
    }

    @Override
    public final boolean s() {
        t3 t3Var;
        if (!this.h && !this.f49955r && this.f49958x > 0.5f && (t3Var = this.f49951c) != null && t3Var.isAttachedToWindow()) {
            if (org.telegram.messenger.g0.W1(Utilities.l(t3Var.f49685k0.f38645c), t3Var.f49691r0.x() - org.telegram.messenger.g0.L(20.0f), 0) < t3Var.getHeight() && this.J < 1.0f) {
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
        org.telegram.ui.ActionBar.x2 x2Var = this.f49952e;
        t3 t3Var = this.f49951c;
        if (x2Var != null) {
            view = x2Var.f28797b;
        } else {
            view = t3Var;
        }
        org.telegram.messenger.g0.r3(view, f());
        org.telegram.ui.ActionBar.x2 x2Var2 = this.f49952e;
        boolean z10 = false;
        if (x2Var2 != null) {
            int e10 = x2Var2.f28796a.e(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27824a7, false));
            x2Var2.d.setColor(e10);
            x2Var2.f28798c.invalidate();
            org.telegram.messenger.g0.u3(x2Var2, e10, true, null);
            if (org.telegram.messenger.g0.B(e10) >= 0.721f) {
                z10 = true;
            }
            org.telegram.messenger.g0.n3(x2Var2, z10);
            LaunchActivity.K1.F(true, true, true);
            return;
        }
        LaunchActivity.K1.F(true, true, true);
        if (org.telegram.messenger.g0.B(e(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27824a7, false))) >= 0.721f) {
            z10 = true;
        }
        org.telegram.messenger.g0.o3(t3Var, z10);
    }

    public final int v() {
        float translationX;
        if (!org.telegram.messenger.az.f21670v0) {
            return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gl, false);
        }
        i4 i4Var = this.L;
        if (i4Var.f46100v0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (i4Var.f46100v0[0].getTranslationX() / i4Var.f46100v0[0].getWidth());
        }
        return i0.a.f(1.0f - translationX, i4Var.f46100v0[0].getBackgroundColor(), i4Var.f46100v0[1].getBackgroundColor());
    }

    public final int w() {
        int height;
        int L = org.telegram.messenger.g0.L(16.0f);
        View view = this.d;
        if (view == null) {
            height = org.telegram.messenger.g0.f22608q.y;
        } else {
            height = view.getHeight();
        }
        return org.telegram.messenger.k5.B(20.0f, x(), L + height);
    }

    public final int x() {
        float f10;
        i4 i4Var = this.L;
        int i3 = 0;
        l3 l3Var = i4Var.f46100v0[0];
        if (l3Var != null && l3Var.getVisibility() == 0) {
            f10 = 1.0f - (i4Var.f46100v0[0].getTranslationX() / i4Var.f46100v0[0].getWidth());
        } else {
            f10 = 0.0f;
        }
        float f11 = 1.0f - f10;
        l3 l3Var2 = i4Var.f46100v0[0];
        if (l3Var2 != null && l3Var2.getVisibility() == 0) {
            i3 = (int) (i4Var.f46100v0[0].getAlpha() * i4Var.f46100v0[0].getListTop() * f10);
        }
        l3 l3Var3 = i4Var.f46100v0[1];
        if (l3Var3 != null && l3Var3.getVisibility() == 0) {
            return i3 + ((int) (i4Var.f46100v0[1].getAlpha() * i4Var.f46100v0[1].getListTop() * f11));
        }
        return i3;
    }

    @Override
    public final boolean y() {
        return this.f49951c.isAttachedToWindow();
    }

    public final void z() {
        i4 i4Var = this.L;
        i4Var.f46100v0[0].setLastVisible(this.K);
        i4Var.f46100v0[1].setLastVisible(false);
    }

    @Override
    public final org.telegram.ui.ActionBar.h3 mo25d() {
        return this.f49951c;
    }

    @Override
    public final void h(int i3) {
    }
}
