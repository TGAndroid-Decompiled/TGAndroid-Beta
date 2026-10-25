package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class v3 implements org.telegram.ui.ActionBar.n2, org.telegram.ui.ActionBar.y3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final j4 K;
    public final AnimationNotificationsLocker f44581a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.r2 f44582b;
    public final u3 f44583c;
    public View d;
    public org.telegram.ui.ActionBar.o3 e;
    public boolean f44584f;
    public boolean h;
    public boolean f44585n;
    public boolean f44586r;
    public boolean f44587s;
    public di.s3 v;
    public float f44588w;
    public float f44589x;
    public ValueAnimator f44590y;

    public v3(j4 j4Var, org.telegram.ui.ActionBar.r2 r2Var) {
        this.K = j4Var;
        this.f44582b = r2Var;
        r2Var.getResourceProvider();
        u3 u3Var = new u3(this, r2Var.getContext());
        this.f44583c = u3Var;
        new fi.z3(u3Var, true, new t3(this, 0));
    }

    @Override
    public final org.telegram.ui.ActionBar.r3 a() {
        int x02;
        int x03;
        float progress;
        org.telegram.ui.ActionBar.r3 r3Var = new org.telegram.ui.ActionBar.r3();
        j4 j4Var = this.K;
        r3Var.E = j4Var.f40434h0.getTitle();
        r3Var.J = j4Var;
        m3 m3Var = j4Var.f40446u0[0];
        Bitmap bitmap = null;
        if (m3Var != null && SharedConfig.adaptableColorInBrowser) {
            x02 = m3Var.getActionBarColor();
        } else {
            x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false);
        }
        r3Var.f23015q = x02;
        m3 m3Var2 = j4Var.f40446u0[0];
        if (m3Var2 != null && SharedConfig.adaptableColorInBrowser) {
            x03 = m3Var2.getBackgroundColor();
        } else {
            x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false);
        }
        r3Var.f23016r = x03;
        r3Var.f23012n = true;
        if (!this.F) {
            progress = 0.0f;
        } else {
            progress = j4Var.f40446u0[0].getProgress();
        }
        r3Var.I = progress;
        m3 m3Var3 = j4Var.f40446u0[0];
        r3Var.f23004c = m3Var3;
        if (m3Var3 != null && m3Var3.getWebView() != null) {
            bitmap = j4Var.f40446u0[0].getWebView().getFavicon();
        }
        r3Var.F = bitmap;
        m3 m3Var4 = r3Var.f23004c;
        if (m3Var4 != null) {
            r3Var.f23006g = m3Var4.getWidth();
            r3Var.h = r3Var.f23004c.getHeight();
        }
        r3Var.f23007i = l();
        r3Var.D = org.telegram.ui.ActionBar.y6.I.q();
        return r3Var;
    }

    @Override
    public final boolean attachedToParent() {
        return this.f44583c.isAttachedToWindow();
    }

    @Override
    public final boolean b() {
        return this.f44584f;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.o3 o3Var) {
        this.e = o3Var;
        if (o3Var != null) {
            this.f44584f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        ofFloat.addUpdateListener(new s3(this, 0));
        return ofFloat;
    }

    @Override
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z10, zt0 zt0Var) {
        float f7;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f44589x;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new s3(this, 2));
        this.E.addListener(new ai.l0(this, z10, zt0Var, 5));
        this.E.setInterpolator(org.telegram.ui.Components.ds.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f44590y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f44588w, 1.0f);
        this.f44590y = ofFloat;
        ofFloat.addUpdateListener(new s3(this, 1));
        this.f44590y.addListener(new kg.e(this, 5));
        this.f44590y.setInterpolator(org.telegram.ui.Components.ds.h);
        this.f44590y.setDuration(320L);
        this.f44590y.start();
    }

    public final void g(org.telegram.ui.ActionBar.r2 r2Var) {
        un unVar;
        hk hkVar;
        this.f44586r = false;
        this.f44582b = r2Var;
        r2Var.getResourceProvider();
        if ((r2Var instanceof un) && (hkVar = (unVar = (un) r2Var).Y) != null) {
            hkVar.M();
            unVar.Y.k0(true, false, true);
        }
        org.telegram.ui.ActionBar.o3 o3Var = this.e;
        if (o3Var != null) {
            if (!o3Var.e) {
                o3Var.e = true;
                try {
                    o3Var.show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else {
            u3 u3Var = this.f44583c;
            AndroidUtilities.removeFromParent(u3Var);
            if (r2Var.getLayoutContainer() != null) {
                r2Var.getLayoutContainer().addView(u3Var);
            }
        }
        j4 j4Var = this.K;
        m3 m3Var = j4Var.f40446u0[0];
        if (m3Var != null && m3Var.F) {
            if (m3Var.getWebView() != null) {
                m3Var.getWebView().onResume();
            }
            m3Var.F = false;
        }
        m3 m3Var2 = j4Var.f40446u0[1];
        if (m3Var2 != null && m3Var2.F) {
            if (m3Var2.getWebView() != null) {
                m3Var2.getWebView().onResume();
            }
            m3Var2.F = false;
        }
        j4.f40402c1.add(j4Var);
    }

    @Override
    public final org.telegram.ui.Components.wc getBulletinFactory() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v3.getBulletinFactory():org.telegram.ui.Components.wc");
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        float min;
        if (this.f44585n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f44588w, 1.0f - this.f44589x) * (1.0f - this.I);
        }
        int j10 = j();
        l0 l0Var = this.K.f40434h0;
        if (l0Var != null) {
            j10 = i0.a.f(l0Var.f45390a0, j10, l0Var.f45419x);
        }
        return i0.a.f(min, i10, j10);
    }

    @Override
    public final View getWindowView() {
        return this.f44583c;
    }

    public final void h() {
        if (this.f44587s != isFullyVisible()) {
            this.f44587s = isFullyVisible();
            org.telegram.ui.ActionBar.r2 r2Var = this.f44582b;
            if (r2Var != null && (r2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f44582b.getParentLayout();
                org.telegram.ui.ActionBar.w wVar = actionBarLayout.f22341s;
                if (wVar != null) {
                    wVar.invalidate();
                }
                org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.f22349w;
                if (wVar2 != null) {
                    wVar2.invalidate();
                    return;
                }
                return;
            }
            u3 u3Var = this.f44583c;
            if (u3Var.getParent() instanceof View) {
                ((View) u3Var.getParent()).invalidate();
            }
        }
    }

    public final void i() {
        View view;
        org.telegram.ui.ActionBar.o3 o3Var = this.e;
        u3 u3Var = this.f44583c;
        if (o3Var != null) {
            view = o3Var.f22913b;
        } else {
            view = u3Var;
        }
        AndroidUtilities.setLightStatusBar(view, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.o3 o3Var2 = this.e;
        boolean z10 = false;
        if (o3Var2 != null) {
            int navigationBarColor = o3Var2.f22912a.getNavigationBarColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23297a7, false));
            o3Var2.d.setColor(navigationBarColor);
            o3Var2.f22914c.invalidate();
            AndroidUtilities.setNavigationBarColor(o3Var2, navigationBarColor);
            if (AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(o3Var2, z10);
            LaunchActivity.I1.H(true, true, true);
            return;
        }
        LaunchActivity.I1.H(true, true, true);
        if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23297a7, false))) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(u3Var, z10);
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        float min;
        int f7;
        float f10 = 0.0f;
        if (this.f44585n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.I) * Math.min(this.f44588w, 1.0f - this.f44589x);
        }
        if (this.F && min > 0.25f) {
            if (!SharedConfig.adaptableColorInBrowser) {
                f7 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false);
            } else {
                j4 j4Var = this.K;
                if (j4Var.f40446u0[0].getVisibility() == 0) {
                    f10 = 1.0f - (j4Var.f40446u0[0].getTranslationX() / j4Var.f40446u0[0].getWidth());
                }
                f7 = i0.a.f(1.0f - f10, j4Var.f40446u0[0].getActionBarColor(), j4Var.f40446u0[1].getActionBarColor());
            }
            if (AndroidUtilities.computePerceivedBrightness(f7) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        if (this.G && this.f44589x <= 0.0f && this.f44588w >= 1.0f && this.I <= 0.0f && !this.f44585n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isShown() {
        u3 u3Var;
        if (this.h || this.f44586r || this.f44588w <= 0.5f || (u3Var = this.f44583c) == null || !u3Var.isAttachedToWindow() || AndroidUtilities.lerp(u3Var.f43998w0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(u3Var.f43991p0.f28809c)) >= u3Var.getHeight() || this.I >= 1.0f) {
            return false;
        }
        return true;
    }

    public final int j() {
        float translationX;
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sk, false);
        }
        j4 j4Var = this.K;
        if (j4Var.f40446u0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (j4Var.f40446u0[0].getTranslationX() / j4Var.f40446u0[0].getWidth());
        }
        return i0.a.f(1.0f - translationX, j4Var.f40446u0[0].getBackgroundColor(), j4Var.f40446u0[1].getBackgroundColor());
    }

    public final int k() {
        int height;
        int dp = AndroidUtilities.dp(16.0f);
        View view = this.d;
        if (view == null) {
            height = AndroidUtilities.displaySize.y;
        } else {
            height = view.getHeight();
        }
        return org.telegram.messenger.t.B(20.0f, l(), dp + height);
    }

    public final int l() {
        float f7;
        j4 j4Var = this.K;
        int i10 = 0;
        m3 m3Var = j4Var.f40446u0[0];
        if (m3Var != null && m3Var.getVisibility() == 0) {
            f7 = 1.0f - (j4Var.f40446u0[0].getTranslationX() / j4Var.f40446u0[0].getWidth());
        } else {
            f7 = 0.0f;
        }
        float f10 = 1.0f - f7;
        m3 m3Var2 = j4Var.f40446u0[0];
        if (m3Var2 != null && m3Var2.getVisibility() == 0) {
            i10 = (int) (j4Var.f40446u0[0].getAlpha() * j4Var.f40446u0[0].getListTop() * f7);
        }
        m3 m3Var3 = j4Var.f40446u0[1];
        if (m3Var3 != null && m3Var3.getVisibility() == 0) {
            return i10 + ((int) (j4Var.f40446u0[1].getAlpha() * j4Var.f40446u0[1].getListTop() * f10));
        }
        return i10;
    }

    public final void m() {
        j4 j4Var = this.K;
        j4Var.f40446u0[0].setLastVisible(this.J);
        j4Var.f40446u0[1].setLastVisible(false);
    }

    public final void n() {
        float f7;
        View view = this.d;
        if (view == null) {
            return;
        }
        float k10 = k();
        float f10 = 1.0f - this.f44588w;
        if (this.f44585n) {
            f7 = 0.0f;
        } else {
            f7 = this.f44589x;
        }
        view.setTranslationY(Math.max(f10, f7) * k10);
        this.f44583c.invalidate();
    }

    @Override
    public final boolean onAttachedBackPressed() {
        j4 j4Var = this.K;
        if (j4Var.f40440o0) {
            AndroidUtilities.hideKeyboard(this.f44583c);
            return true;
        }
        l0 l0Var = j4Var.f40434h0;
        if (l0Var.T) {
            l0Var.h(false);
            return true;
        } else if (l0Var.W) {
            l0Var.k(false);
            return true;
        } else {
            if (j4Var.J()) {
                m3 m3Var = j4Var.f40446u0[0];
                if (m3Var.f41445s) {
                    if (m3Var.f() && m3Var.getWebView() != null) {
                        m3Var.getWebView().goBack();
                    }
                    return true;
                }
            }
            if (j4Var.f40430d0.size() > 1) {
                j4Var.G();
                return true;
            }
            dismiss(false);
            return true;
        }
    }

    @Override
    public final void release() {
        this.f44586r = true;
        j4 j4Var = this.K;
        m3 m3Var = j4Var.f40446u0[0];
        if (m3Var != null && m3Var.h) {
            j3 j3Var = m3Var.e;
            j3Var.setSwipeOffsetY((-j3Var.f13158f) + j3Var.e);
            j4Var.f40446u0[0].h = false;
        }
        m3 m3Var2 = j4Var.f40446u0[0];
        if (m3Var2 != null && !m3Var2.F) {
            if (m3Var2.getWebView() != null) {
                m3Var2.getWebView().onPause();
            }
            m3Var2.F = true;
        }
        m3 m3Var3 = j4Var.f40446u0[1];
        if (m3Var3 != null && !m3Var3.F) {
            if (m3Var3.getWebView() != null) {
                m3Var3.getWebView().onPause();
            }
            m3Var3.F = true;
        }
        org.telegram.ui.ActionBar.o3 o3Var = this.e;
        if (o3Var != null) {
            o3Var.c();
        }
        org.telegram.ui.ActionBar.r2 r2Var = this.f44582b;
        if (r2Var != null) {
            r2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.f44583c);
            }
        }
        di.s3 s3Var = this.v;
        if (s3Var != null) {
            s3Var.run();
            this.v = null;
        }
        j4.f40402c1.remove(j4Var);
    }

    @Override
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        j4 j4Var = this.K;
        j4Var.f40446u0[0].setLastVisible(z10);
        j4Var.f40446u0[1].setLastVisible(false);
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (di.s3) runnable;
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        return false;
    }

    @Override
    public final void dismiss(boolean z10) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f44585n = z10;
        if (z10) {
            LaunchActivity.I1.f35566y0.b(this);
        } else {
            e(true, new zt0(this, 10));
        }
        i();
        h();
    }

    @Override
    public final org.telegram.ui.ActionBar.z3 mo36getWindowView() {
        return this.f44583c;
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
