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
public final class v3 implements org.telegram.ui.ActionBar.j2, org.telegram.ui.ActionBar.u3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final i4 K;
    public final AnimationNotificationsLocker f41420a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.n2 f41421b;
    public final u3 f41422c;
    public View d;
    public org.telegram.ui.ActionBar.i3 f41423e;
    public boolean f41424f;
    public boolean h;
    public boolean f41425n;
    public boolean f41426r;
    public boolean f41427s;
    public bi.p4 v;
    public float f41428w;
    public float f41429x;
    public ValueAnimator f41430y;

    public v3(i4 i4Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.K = i4Var;
        this.f41421b = n2Var;
        n2Var.getResourceProvider();
        u3 u3Var = new u3(this, n2Var.getContext());
        this.f41422c = u3Var;
        new di.j4(u3Var, true, new t3(this, 0));
    }

    @Override
    public final org.telegram.ui.ActionBar.n3 a() {
        int w02;
        int w03;
        float progress;
        org.telegram.ui.ActionBar.n3 n3Var = new org.telegram.ui.ActionBar.n3();
        i4 i4Var = this.K;
        n3Var.E = i4Var.f37247h0.getTitle();
        n3Var.J = i4Var;
        m3 m3Var = i4Var.f37259u0[0];
        Bitmap bitmap = null;
        if (m3Var != null && SharedConfig.adaptableColorInBrowser) {
            w02 = m3Var.getActionBarColor();
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        n3Var.f21257q = w02;
        m3 m3Var2 = i4Var.f37259u0[0];
        if (m3Var2 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = m3Var2.getBackgroundColor();
        } else {
            w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        n3Var.f21258r = w03;
        n3Var.f21254n = true;
        if (!this.F) {
            progress = 0.0f;
        } else {
            progress = i4Var.f37259u0[0].getProgress();
        }
        n3Var.I = progress;
        m3 m3Var3 = i4Var.f37259u0[0];
        n3Var.f21245c = m3Var3;
        if (m3Var3 != null && m3Var3.getWebView() != null) {
            bitmap = i4Var.f37259u0[0].getWebView().getFavicon();
        }
        n3Var.F = bitmap;
        m3 m3Var4 = n3Var.f21245c;
        if (m3Var4 != null) {
            n3Var.f21248g = m3Var4.getWidth();
            n3Var.h = n3Var.f21245c.getHeight();
        }
        n3Var.f21249i = l();
        n3Var.D = org.telegram.ui.ActionBar.j6.I.q();
        return n3Var;
    }

    @Override
    public final boolean attachedToParent() {
        return this.f41422c.isAttachedToWindow();
    }

    @Override
    public final boolean b() {
        return this.f41424f;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.i3 i3Var) {
        this.f41423e = i3Var;
        if (i3Var != null) {
            this.f41424f = true;
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

    public final void e(boolean z10, lu0 lu0Var) {
        float f7;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f41429x;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new s3(this, 2));
        this.E.addListener(new ah.r0(this, z10, lu0Var, 3));
        this.E.setInterpolator(org.telegram.ui.Components.pr.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f41430y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41428w, 1.0f);
        this.f41430y = ofFloat;
        ofFloat.addUpdateListener(new s3(this, 1));
        this.f41430y.addListener(new s0(this, 1));
        this.f41430y.setInterpolator(org.telegram.ui.Components.pr.h);
        this.f41430y.setDuration(320L);
        this.f41430y.start();
    }

    public final void g(org.telegram.ui.ActionBar.n2 n2Var) {
        co coVar;
        mk mkVar;
        this.f41426r = false;
        this.f41421b = n2Var;
        n2Var.getResourceProvider();
        if ((n2Var instanceof co) && (mkVar = (coVar = (co) n2Var).Y) != null) {
            mkVar.P();
            coVar.Y.n0(true, false, true);
        }
        org.telegram.ui.ActionBar.i3 i3Var = this.f41423e;
        if (i3Var != null) {
            if (!i3Var.f20549e) {
                i3Var.f20549e = true;
                try {
                    i3Var.show();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        } else {
            u3 u3Var = this.f41422c;
            AndroidUtilities.removeFromParent(u3Var);
            if (n2Var.getLayoutContainer() != null) {
                n2Var.getLayoutContainer().addView(u3Var);
            }
        }
        i4 i4Var = this.K;
        m3 m3Var = i4Var.f37259u0[0];
        if (m3Var != null && m3Var.E) {
            if (m3Var.getWebView() != null) {
                m3Var.getWebView().onResume();
            }
            m3Var.E = false;
        }
        m3 m3Var2 = i4Var.f37259u0[1];
        if (m3Var2 != null && m3Var2.E) {
            if (m3Var2.getWebView() != null) {
                m3Var2.getWebView().onResume();
            }
            m3Var2.E = false;
        }
        i4.f37215b1.add(i4Var);
    }

    @Override
    public final org.telegram.ui.Components.yc getBulletinFactory() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v3.getBulletinFactory():org.telegram.ui.Components.yc");
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        float min;
        if (this.f41425n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f41428w, 1.0f - this.f41429x) * (1.0f - this.I);
        }
        int j3 = j();
        k0 k0Var = this.K.f37247h0;
        if (k0Var != null) {
            j3 = i0.a.d(k0Var.f42302a0, j3, k0Var.f42332x);
        }
        return i0.a.d(min, i10, j3);
    }

    @Override
    public final View getWindowView() {
        return this.f41422c;
    }

    public final void h() {
        if (this.f41427s != isFullyVisible()) {
            this.f41427s = isFullyVisible();
            org.telegram.ui.ActionBar.n2 n2Var = this.f41421b;
            if (n2Var != null && (n2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f41421b.getParentLayout();
                org.telegram.ui.ActionBar.w wVar = actionBarLayout.f20202s;
                if (wVar != null) {
                    wVar.invalidate();
                }
                org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.f20207w;
                if (wVar2 != null) {
                    wVar2.invalidate();
                    return;
                }
                return;
            }
            u3 u3Var = this.f41422c;
            if (u3Var.getParent() instanceof View) {
                ((View) u3Var.getParent()).invalidate();
            }
        }
    }

    public final void i() {
        View view;
        org.telegram.ui.ActionBar.i3 i3Var = this.f41423e;
        u3 u3Var = this.f41422c;
        if (i3Var != null) {
            view = i3Var.f20547b;
        } else {
            view = u3Var;
        }
        AndroidUtilities.setLightStatusBar(view, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.i3 i3Var2 = this.f41423e;
        boolean z10 = false;
        if (i3Var2 != null) {
            int navigationBarColor = i3Var2.f20546a.getNavigationBarColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20634a7, false));
            i3Var2.d.setColor(navigationBarColor);
            i3Var2.f20548c.invalidate();
            AndroidUtilities.setNavigationBarColor(i3Var2, navigationBarColor);
            if (AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(i3Var2, z10);
            LaunchActivity.G1.H(true, true, true);
            return;
        }
        LaunchActivity.G1.H(true, true, true);
        if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20634a7, false))) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(u3Var, z10);
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        float min;
        int d;
        float f7 = 0.0f;
        if (this.f41425n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.I) * Math.min(this.f41428w, 1.0f - this.f41429x);
        }
        if (this.F && min > 0.25f) {
            if (!SharedConfig.adaptableColorInBrowser) {
                d = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            } else {
                i4 i4Var = this.K;
                if (i4Var.f37259u0[0].getVisibility() == 0) {
                    f7 = 1.0f - (i4Var.f37259u0[0].getTranslationX() / i4Var.f37259u0[0].getWidth());
                }
                d = i0.a.d(1.0f - f7, i4Var.f37259u0[0].getActionBarColor(), i4Var.f37259u0[1].getActionBarColor());
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        if (this.G && this.f41429x <= 0.0f && this.f41428w >= 1.0f && this.I <= 0.0f && !this.f41425n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isShown() {
        u3 u3Var;
        if (this.h || this.f41426r || this.f41428w <= 0.5f || (u3Var = this.f41422c) == null || !u3Var.isAttachedToWindow() || AndroidUtilities.lerp(u3Var.H0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(u3Var.A0.f25592c)) >= u3Var.getHeight() || this.I >= 1.0f) {
            return false;
        }
        return true;
    }

    public final int j() {
        float translationX;
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sk, false);
        }
        i4 i4Var = this.K;
        if (i4Var.f37259u0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (i4Var.f37259u0[0].getTranslationX() / i4Var.f37259u0[0].getWidth());
        }
        return i0.a.d(1.0f - translationX, i4Var.f37259u0[0].getBackgroundColor(), i4Var.f37259u0[1].getBackgroundColor());
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
        return org.telegram.messenger.w1.z(20.0f, l(), dp + height);
    }

    public final int l() {
        float f7;
        i4 i4Var = this.K;
        int i10 = 0;
        m3 m3Var = i4Var.f37259u0[0];
        if (m3Var != null && m3Var.getVisibility() == 0) {
            f7 = 1.0f - (i4Var.f37259u0[0].getTranslationX() / i4Var.f37259u0[0].getWidth());
        } else {
            f7 = 0.0f;
        }
        float f10 = 1.0f - f7;
        m3 m3Var2 = i4Var.f37259u0[0];
        if (m3Var2 != null && m3Var2.getVisibility() == 0) {
            i10 = (int) (i4Var.f37259u0[0].getAlpha() * i4Var.f37259u0[0].getListTop() * f7);
        }
        m3 m3Var3 = i4Var.f37259u0[1];
        if (m3Var3 != null && m3Var3.getVisibility() == 0) {
            return i10 + ((int) (i4Var.f37259u0[1].getAlpha() * i4Var.f37259u0[1].getListTop() * f10));
        }
        return i10;
    }

    public final void m() {
        i4 i4Var = this.K;
        i4Var.f37259u0[0].setLastVisible(this.J);
        i4Var.f37259u0[1].setLastVisible(false);
    }

    public final void n() {
        float f7;
        View view = this.d;
        if (view == null) {
            return;
        }
        float k10 = k();
        float f10 = 1.0f - this.f41428w;
        if (this.f41425n) {
            f7 = 0.0f;
        } else {
            f7 = this.f41429x;
        }
        view.setTranslationY(Math.max(f10, f7) * k10);
        this.f41422c.invalidate();
    }

    @Override
    public final boolean onAttachedBackPressed() {
        i4 i4Var = this.K;
        if (i4Var.f37253o0) {
            AndroidUtilities.hideKeyboard(this.f41422c);
            return true;
        }
        k0 k0Var = i4Var.f37247h0;
        if (k0Var.T) {
            k0Var.h(false);
            return true;
        } else if (k0Var.W) {
            k0Var.k(false);
            return true;
        } else {
            if (i4Var.J()) {
                m3 m3Var = i4Var.f37259u0[0];
                if (m3Var.f38584s) {
                    if (m3Var.f() && m3Var.getWebView() != null) {
                        m3Var.getWebView().goBack();
                    }
                    return true;
                }
            }
            if (i4Var.f37243d0.size() > 1) {
                i4Var.G();
                return true;
            }
            dismiss(false);
            return true;
        }
    }

    @Override
    public final void release() {
        this.f41426r = true;
        i4 i4Var = this.K;
        m3 m3Var = i4Var.f37259u0[0];
        if (m3Var != null && m3Var.h) {
            j3 j3Var = m3Var.f38580e;
            j3Var.setSwipeOffsetY((-j3Var.f9936f) + j3Var.f9935e);
            i4Var.f37259u0[0].h = false;
        }
        m3 m3Var2 = i4Var.f37259u0[0];
        if (m3Var2 != null && !m3Var2.E) {
            if (m3Var2.getWebView() != null) {
                m3Var2.getWebView().onPause();
            }
            m3Var2.E = true;
        }
        m3 m3Var3 = i4Var.f37259u0[1];
        if (m3Var3 != null && !m3Var3.E) {
            if (m3Var3.getWebView() != null) {
                m3Var3.getWebView().onPause();
            }
            m3Var3.E = true;
        }
        org.telegram.ui.ActionBar.i3 i3Var = this.f41423e;
        if (i3Var != null) {
            i3Var.c();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f41421b;
        if (n2Var != null) {
            n2Var.removeSheet(this);
            if (this.f41423e == null) {
                AndroidUtilities.removeFromParent(this.f41422c);
            }
        }
        bi.p4 p4Var = this.v;
        if (p4Var != null) {
            p4Var.run();
            this.v = null;
        }
        i4.f37215b1.remove(i4Var);
    }

    @Override
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        i4 i4Var = this.K;
        i4Var.f37259u0[0].setLastVisible(z10);
        i4Var.f37259u0[1].setLastVisible(false);
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (bi.p4) runnable;
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
        this.f41425n = z10;
        if (z10) {
            LaunchActivity.G1.f33496y0.b(this);
        } else {
            e(true, new lu0(this, 10));
        }
        i();
        h();
    }

    @Override
    public final org.telegram.ui.ActionBar.v3 mo37getWindowView() {
        return this.f41422c;
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
