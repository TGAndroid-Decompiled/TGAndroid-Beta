package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class u3 implements org.telegram.ui.ActionBar.g2, org.telegram.ui.ActionBar.n3 {
    public ValueAnimator D;
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final h4 K;
    public final e2.f f41995a = new e2.f(null);
    public org.telegram.ui.ActionBar.k2 f41996b;
    public final t3 f41997c;
    public View d;
    public org.telegram.ui.ActionBar.d3 e;
    public boolean f41998f;
    public boolean h;
    public boolean f41999n;
    public boolean f42000r;
    public boolean f42001s;
    public th.i2 f42002w;
    public float f42003x;
    public float f42004y;

    public u3(h4 h4Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.K = h4Var;
        this.f41996b = k2Var;
        k2Var.getResourceProvider();
        t3 t3Var = new t3(this, k2Var.getContext());
        this.f41997c = t3Var;
        new vh.r2(t3Var, true, new s3(this, 0));
    }

    public final void A() {
        float f7;
        View view = this.d;
        if (view == null) {
            return;
        }
        float w9 = w();
        float f10 = 1.0f - this.f42003x;
        if (this.f41999n) {
            f7 = 0.0f;
        } else {
            f7 = this.f42004y;
        }
        view.setTranslationY(Math.max(f10, f7) * w9);
        this.f41997c.invalidate();
    }

    @Override
    public final void a(boolean z10) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f41999n = z10;
        if (z10) {
            LaunchActivity.I1.f33393y0.b(this);
        } else {
            m(true, new rr0(this, 10));
        }
        u();
        r();
    }

    @Override
    public final void b(boolean z10) {
        this.J = z10;
        h4 h4Var = this.K;
        h4Var.f37746u0[0].setLastVisible(z10);
        h4Var.f37746u0[1].setLastVisible(false);
    }

    @Override
    public final org.telegram.ui.ActionBar.h3 c() {
        int x02;
        int x03;
        float progress;
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3();
        h4 h4Var = this.K;
        h3Var.E = h4Var.f37734h0.getTitle();
        h3Var.J = h4Var;
        l3 l3Var = h4Var.f37746u0[0];
        Bitmap bitmap = null;
        if (l3Var != null && org.telegram.messenger.tz.f18189v0) {
            x02 = l3Var.getActionBarColor();
        } else {
            x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
        }
        h3Var.f20367q = x02;
        l3 l3Var2 = h4Var.f37746u0[0];
        if (l3Var2 != null && org.telegram.messenger.tz.f18189v0) {
            x03 = l3Var2.getBackgroundColor();
        } else {
            x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
        }
        h3Var.f20368r = x03;
        h3Var.f20364n = true;
        if (!this.F) {
            progress = 0.0f;
        } else {
            progress = h4Var.f37746u0[0].getProgress();
        }
        h3Var.I = progress;
        l3 l3Var3 = h4Var.f37746u0[0];
        h3Var.f20356c = l3Var3;
        if (l3Var3 != null && l3Var3.getWebView() != null) {
            bitmap = h4Var.f37746u0[0].getWebView().getFavicon();
        }
        h3Var.F = bitmap;
        l3 l3Var4 = h3Var.f20356c;
        if (l3Var4 != null) {
            h3Var.f20358g = l3Var4.getWidth();
            h3Var.h = h3Var.f20356c.getHeight();
        }
        h3Var.f20359i = x();
        h3Var.D = org.telegram.ui.ActionBar.t6.I.q();
        return h3Var;
    }

    @Override
    public final View d() {
        return this.f41997c;
    }

    @Override
    public final void dismiss() {
        a(true);
    }

    @Override
    public final int e(int i10) {
        float min;
        if (this.f41999n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f42003x, 1.0f - this.f42004y) * (1.0f - this.I);
        }
        int v = v();
        m0 m0Var = this.K.f37734h0;
        if (m0Var != null) {
            v = i0.b.f(m0Var.f43093a0, v, m0Var.f43124y);
        }
        return i0.b.f(min, i10, v);
    }

    @Override
    public final boolean f() {
        float min;
        int f7;
        float f10 = 0.0f;
        if (this.f41999n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.I) * Math.min(this.f42003x, 1.0f - this.f42004y);
        }
        if (this.F && min > 0.25f) {
            if (!org.telegram.messenger.tz.f18189v0) {
                f7 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
            } else {
                h4 h4Var = this.K;
                if (h4Var.f37746u0[0].getVisibility() == 0) {
                    f10 = 1.0f - (h4Var.f37746u0[0].getTranslationX() / h4Var.f37746u0[0].getWidth());
                }
                f7 = i0.b.f(1.0f - f10, h4Var.f37746u0[0].getActionBarColor(), h4Var.f37746u0[1].getActionBarColor());
            }
            if (org.telegram.messenger.i0.B(f7) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean g() {
        return this.f41998f;
    }

    @Override
    public final boolean i(org.telegram.ui.ActionBar.d3 d3Var) {
        this.e = d3Var;
        if (d3Var != null) {
            this.f41998f = true;
        }
        return true;
    }

    @Override
    public final boolean j() {
        if (this.G && this.f42004y <= 0.0f && this.f42003x >= 1.0f && this.I <= 0.0f && !this.f41999n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Components.cc k() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u3.k():org.telegram.ui.Components.cc");
    }

    public final ValueAnimator l(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        ofFloat.addUpdateListener(new r3(this, 0));
        return ofFloat;
    }

    public final void m(boolean z10, rr0 rr0Var) {
        float f7;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f42004y;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new r3(this, 2));
        this.E.addListener(new androidx.fragment.app.g(this, z10, rr0Var, 2));
        this.E.setInterpolator(org.telegram.ui.Components.gr.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    public final void n() {
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42003x, 1.0f);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new r3(this, 1));
        this.D.addListener(new bg.e(this, 25));
        this.D.setInterpolator(org.telegram.ui.Components.gr.h);
        this.D.setDuration(320L);
        this.D.start();
    }

    @Override
    public final void o(Runnable runnable) {
        this.f42002w = (th.i2) runnable;
    }

    @Override
    public final void p() {
        h4 h4Var = this.K;
        if (h4Var.f37740o0) {
            org.telegram.messenger.i0.v1(this.f41997c);
            return;
        }
        m0 m0Var = h4Var.f37734h0;
        if (m0Var.T) {
            m0Var.h(false);
        } else if (m0Var.W) {
            m0Var.k(false);
        } else {
            if (h4Var.H()) {
                l3 l3Var = h4Var.f37746u0[0];
                if (l3Var.f39043s) {
                    if (l3Var.f() && l3Var.getWebView() != null) {
                        l3Var.getWebView().goBack();
                        return;
                    }
                    return;
                }
            }
            if (h4Var.f37730d0.size() > 1) {
                h4Var.E();
            } else {
                a(false);
            }
        }
    }

    public final void q(org.telegram.ui.ActionBar.k2 k2Var) {
        un unVar;
        mk mkVar;
        this.f42000r = false;
        this.f41996b = k2Var;
        k2Var.getResourceProvider();
        if ((k2Var instanceof un) && (mkVar = (unVar = (un) k2Var).Z) != null) {
            mkVar.L();
            unVar.Z.j0(true, false, true);
        }
        org.telegram.ui.ActionBar.d3 d3Var = this.e;
        if (d3Var != null) {
            if (!d3Var.e) {
                d3Var.e = true;
                try {
                    d3Var.show();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        } else {
            t3 t3Var = this.f41997c;
            org.telegram.messenger.i0.E2(t3Var);
            if (k2Var.getLayoutContainer() != null) {
                k2Var.getLayoutContainer().addView(t3Var);
            }
        }
        h4 h4Var = this.K;
        l3 l3Var = h4Var.f37746u0[0];
        if (l3Var != null && l3Var.F) {
            if (l3Var.getWebView() != null) {
                l3Var.getWebView().onResume();
            }
            l3Var.F = false;
        }
        l3 l3Var2 = h4Var.f37746u0[1];
        if (l3Var2 != null && l3Var2.F) {
            if (l3Var2.getWebView() != null) {
                l3Var2.getWebView().onResume();
            }
            l3Var2.F = false;
        }
        h4.f37702c1.add(h4Var);
    }

    public final void r() {
        if (this.f42001s != j()) {
            this.f42001s = j();
            org.telegram.ui.ActionBar.k2 k2Var = this.f41996b;
            if (k2Var != null && (k2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f41996b.getParentLayout();
                org.telegram.ui.ActionBar.w wVar = actionBarLayout.f20109s;
                if (wVar != null) {
                    wVar.invalidate();
                }
                org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.f20119x;
                if (wVar2 != null) {
                    wVar2.invalidate();
                    return;
                }
                return;
            }
            t3 t3Var = this.f41997c;
            if (t3Var.getParent() instanceof View) {
                ((View) t3Var.getParent()).invalidate();
            }
        }
    }

    @Override
    public final void release() {
        this.f42000r = true;
        h4 h4Var = this.K;
        l3 l3Var = h4Var.f37746u0[0];
        if (l3Var != null && l3Var.h) {
            i3 i3Var = l3Var.e;
            i3Var.setSwipeOffsetY((-i3Var.f53789f) + i3Var.e);
            h4Var.f37746u0[0].h = false;
        }
        l3 l3Var2 = h4Var.f37746u0[0];
        if (l3Var2 != null && !l3Var2.F) {
            if (l3Var2.getWebView() != null) {
                l3Var2.getWebView().onPause();
            }
            l3Var2.F = true;
        }
        l3 l3Var3 = h4Var.f37746u0[1];
        if (l3Var3 != null && !l3Var3.F) {
            if (l3Var3.getWebView() != null) {
                l3Var3.getWebView().onPause();
            }
            l3Var3.F = true;
        }
        org.telegram.ui.ActionBar.d3 d3Var = this.e;
        if (d3Var != null) {
            d3Var.c();
        }
        this.f41996b.removeSheet(this);
        if (this.e == null) {
            org.telegram.messenger.i0.E2(this.f41997c);
        }
        th.i2 i2Var = this.f42002w;
        if (i2Var != null) {
            i2Var.run();
            this.f42002w = null;
        }
        h4.f37702c1.remove(h4Var);
    }

    @Override
    public final boolean s() {
        t3 t3Var;
        if (!this.h && !this.f42000r && this.f42003x > 0.5f && (t3Var = this.f41997c) != null && t3Var.isAttachedToWindow()) {
            if (org.telegram.messenger.i0.W1(Utilities.l(t3Var.f41705j0.f30445c), t3Var.f41711q0.x() - org.telegram.messenger.i0.L(20.0f), 0) < t3Var.getHeight() && this.I < 1.0f) {
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
        org.telegram.ui.ActionBar.d3 d3Var = this.e;
        t3 t3Var = this.f41997c;
        if (d3Var != null) {
            view = d3Var.f20250b;
        } else {
            view = t3Var;
        }
        org.telegram.messenger.i0.q3(view, f());
        org.telegram.ui.ActionBar.d3 d3Var2 = this.e;
        boolean z10 = false;
        if (d3Var2 != null) {
            int e = d3Var2.f20249a.e(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20872a7, false));
            d3Var2.d.setColor(e);
            d3Var2.f20251c.invalidate();
            org.telegram.messenger.i0.t3(d3Var2, e, true, null);
            if (org.telegram.messenger.i0.B(e) >= 0.721f) {
                z10 = true;
            }
            org.telegram.messenger.i0.m3(d3Var2, z10);
            LaunchActivity.I1.F(true, true, true);
            return;
        }
        LaunchActivity.I1.F(true, true, true);
        if (org.telegram.messenger.i0.B(e(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20872a7, false))) >= 0.721f) {
            z10 = true;
        }
        org.telegram.messenger.i0.n3(t3Var, z10);
    }

    public final int v() {
        float translationX;
        if (!org.telegram.messenger.tz.f18189v0) {
            return org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gl, false);
        }
        h4 h4Var = this.K;
        if (h4Var.f37746u0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (h4Var.f37746u0[0].getTranslationX() / h4Var.f37746u0[0].getWidth());
        }
        return i0.b.f(1.0f - translationX, h4Var.f37746u0[0].getBackgroundColor(), h4Var.f37746u0[1].getBackgroundColor());
    }

    public final int w() {
        int height;
        int L = org.telegram.messenger.i0.L(16.0f);
        View view = this.d;
        if (view == null) {
            height = org.telegram.messenger.i0.f16026q.y;
        } else {
            height = view.getHeight();
        }
        return org.telegram.messenger.m5.B(20.0f, x(), L + height);
    }

    public final int x() {
        float f7;
        h4 h4Var = this.K;
        int i10 = 0;
        l3 l3Var = h4Var.f37746u0[0];
        if (l3Var != null && l3Var.getVisibility() == 0) {
            f7 = 1.0f - (h4Var.f37746u0[0].getTranslationX() / h4Var.f37746u0[0].getWidth());
        } else {
            f7 = 0.0f;
        }
        float f10 = 1.0f - f7;
        l3 l3Var2 = h4Var.f37746u0[0];
        if (l3Var2 != null && l3Var2.getVisibility() == 0) {
            i10 = (int) (h4Var.f37746u0[0].getAlpha() * h4Var.f37746u0[0].getListTop() * f7);
        }
        l3 l3Var3 = h4Var.f37746u0[1];
        if (l3Var3 != null && l3Var3.getVisibility() == 0) {
            return i10 + ((int) (h4Var.f37746u0[1].getAlpha() * h4Var.f37746u0[1].getListTop() * f10));
        }
        return i10;
    }

    public final void y() {
        h4 h4Var = this.K;
        h4Var.f37746u0[0].setLastVisible(this.J);
        h4Var.f37746u0[1].setLastVisible(false);
    }

    @Override
    public final boolean z() {
        return this.f41997c.isAttachedToWindow();
    }

    @Override
    public final org.telegram.ui.ActionBar.o3 mo30d() {
        return this.f41997c;
    }

    @Override
    public final void h(int i10) {
    }
}
