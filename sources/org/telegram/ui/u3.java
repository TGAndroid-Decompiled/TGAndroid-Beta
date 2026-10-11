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
public final class u3 implements org.telegram.ui.ActionBar.i2, org.telegram.ui.ActionBar.s3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final h4 K;
    public final AnimationNotificationsLocker f42334a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.m2 f42335b;
    public final t3 f42336c;
    public View d;
    public org.telegram.ui.ActionBar.h3 f42337e;
    public boolean f42338f;
    public boolean h;
    public boolean f42339n;
    public boolean f42340r;
    public boolean f42341s;
    public ai.e5 v;
    public float f42342w;
    public float f42343x;
    public ValueAnimator f42344y;

    public u3(h4 h4Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.K = h4Var;
        this.f42335b = m2Var;
        m2Var.getResourceProvider();
        t3 t3Var = new t3(this, m2Var.getContext());
        this.f42336c = t3Var;
        new ci.h4(t3Var, true, new s3(this, 0));
    }

    @Override
    public final org.telegram.ui.ActionBar.l3 a() {
        int x02;
        int x03;
        float progress;
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3();
        h4 h4Var = this.K;
        l3Var.E = h4Var.f38273h0.getTitle();
        l3Var.J = h4Var;
        l3 l3Var2 = h4Var.f38285u0[0];
        Bitmap bitmap = null;
        if (l3Var2 != null && SharedConfig.adaptableColorInBrowser) {
            x02 = l3Var2.getActionBarColor();
        } else {
            x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pk, false);
        }
        l3Var.f21344q = x02;
        l3 l3Var3 = h4Var.f38285u0[0];
        if (l3Var3 != null && SharedConfig.adaptableColorInBrowser) {
            x03 = l3Var3.getBackgroundColor();
        } else {
            x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pk, false);
        }
        l3Var.f21345r = x03;
        l3Var.f21341n = true;
        if (!this.F) {
            progress = 0.0f;
        } else {
            progress = h4Var.f38285u0[0].getProgress();
        }
        l3Var.I = progress;
        l3 l3Var4 = h4Var.f38285u0[0];
        l3Var.f21332c = l3Var4;
        if (l3Var4 != null && l3Var4.getWebView() != null) {
            bitmap = h4Var.f38285u0[0].getWebView().getFavicon();
        }
        l3Var.F = bitmap;
        l3 l3Var5 = l3Var.f21332c;
        if (l3Var5 != null) {
            l3Var.f21335g = l3Var5.getWidth();
            l3Var.h = l3Var.f21332c.getHeight();
        }
        l3Var.f21336i = l();
        l3Var.D = org.telegram.ui.ActionBar.h6.I.q();
        return l3Var;
    }

    @Override
    public final boolean attachedToParent() {
        return this.f42336c.isAttachedToWindow();
    }

    @Override
    public final boolean b() {
        return this.f42338f;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.h3 h3Var) {
        this.f42337e = h3Var;
        if (h3Var != null) {
            this.f42338f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        ofFloat.addUpdateListener(new r3(this, 0));
        return ofFloat;
    }

    @Override
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z10, mu0 mu0Var) {
        float f7;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f42343x;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new r3(this, 2));
        this.E.addListener(new androidx.fragment.app.g(this, z10, mu0Var, 2));
        this.E.setInterpolator(org.telegram.ui.Components.is.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f42344y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42342w, 1.0f);
        this.f42344y = ofFloat;
        ofFloat.addUpdateListener(new r3(this, 1));
        this.f42344y.addListener(new ai.b(this, 28));
        this.f42344y.setInterpolator(org.telegram.ui.Components.is.h);
        this.f42344y.setDuration(320L);
        this.f42344y.start();
    }

    public final void g(org.telegram.ui.ActionBar.m2 m2Var) {
        zn znVar;
        ok okVar;
        this.f42340r = false;
        this.f42335b = m2Var;
        m2Var.getResourceProvider();
        if ((m2Var instanceof zn) && (okVar = (znVar = (zn) m2Var).Y) != null) {
            okVar.N();
            znVar.Y.l0(true, false, true);
        }
        org.telegram.ui.ActionBar.h3 h3Var = this.f42337e;
        if (h3Var != null) {
            if (!h3Var.f20686e) {
                h3Var.f20686e = true;
                try {
                    h3Var.show();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        } else {
            t3 t3Var = this.f42336c;
            AndroidUtilities.removeFromParent(t3Var);
            if (m2Var.getLayoutContainer() != null) {
                m2Var.getLayoutContainer().addView(t3Var);
            }
        }
        h4 h4Var = this.K;
        l3 l3Var = h4Var.f38285u0[0];
        if (l3Var != null && l3Var.E) {
            if (l3Var.getWebView() != null) {
                l3Var.getWebView().onResume();
            }
            l3Var.E = false;
        }
        l3 l3Var2 = h4Var.f38285u0[1];
        if (l3Var2 != null && l3Var2.E) {
            if (l3Var2.getWebView() != null) {
                l3Var2.getWebView().onResume();
            }
            l3Var2.E = false;
        }
        h4.f38241b1.add(h4Var);
    }

    @Override
    public final org.telegram.ui.Components.ad getBulletinFactory() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u3.getBulletinFactory():org.telegram.ui.Components.ad");
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        float min;
        if (this.f42339n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f42342w, 1.0f - this.f42343x) * (1.0f - this.I);
        }
        int j3 = j();
        k0 k0Var = this.K.f38273h0;
        if (k0Var != null) {
            j3 = i0.a.d(k0Var.f43665a0, j3, k0Var.f43695x);
        }
        return i0.a.d(min, i10, j3);
    }

    @Override
    public final View getWindowView() {
        return this.f42336c;
    }

    public final void h() {
        if (this.f42341s != isFullyVisible()) {
            this.f42341s = isFullyVisible();
            org.telegram.ui.ActionBar.m2 m2Var = this.f42335b;
            if (m2Var != null && (m2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f42335b.getParentLayout();
                org.telegram.ui.ActionBar.v vVar = actionBarLayout.f20345s;
                if (vVar != null) {
                    vVar.invalidate();
                }
                org.telegram.ui.ActionBar.v vVar2 = actionBarLayout.f20350w;
                if (vVar2 != null) {
                    vVar2.invalidate();
                    return;
                }
                return;
            }
            t3 t3Var = this.f42336c;
            if (t3Var.getParent() instanceof View) {
                ((View) t3Var.getParent()).invalidate();
            }
        }
    }

    public final void i() {
        View view;
        org.telegram.ui.ActionBar.h3 h3Var = this.f42337e;
        t3 t3Var = this.f42336c;
        if (h3Var != null) {
            view = h3Var.f20684b;
        } else {
            view = t3Var;
        }
        AndroidUtilities.setLightStatusBar(view, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.h3 h3Var2 = this.f42337e;
        boolean z10 = false;
        if (h3Var2 != null) {
            int navigationBarColor = h3Var2.f20683a.getNavigationBarColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20730a7, false));
            h3Var2.d.setColor(navigationBarColor);
            h3Var2.f20685c.invalidate();
            AndroidUtilities.setNavigationBarColor(h3Var2, navigationBarColor);
            if (AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(h3Var2, z10);
            LaunchActivity.G1.H(true, true, true);
            return;
        }
        LaunchActivity.G1.H(true, true, true);
        if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20730a7, false))) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(t3Var, z10);
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        float min;
        int d;
        float f7 = 0.0f;
        if (this.f42339n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.I) * Math.min(this.f42342w, 1.0f - this.f42343x);
        }
        if (this.F && min > 0.25f) {
            if (!SharedConfig.adaptableColorInBrowser) {
                d = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pk, false);
            } else {
                h4 h4Var = this.K;
                if (h4Var.f38285u0[0].getVisibility() == 0) {
                    f7 = 1.0f - (h4Var.f38285u0[0].getTranslationX() / h4Var.f38285u0[0].getWidth());
                }
                d = i0.a.d(1.0f - f7, h4Var.f38285u0[0].getActionBarColor(), h4Var.f38285u0[1].getActionBarColor());
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        if (this.G && this.f42343x <= 0.0f && this.f42342w >= 1.0f && this.I <= 0.0f && !this.f42339n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isShown() {
        t3 t3Var;
        if (this.h || this.f42340r || this.f42342w <= 0.5f || (t3Var = this.f42336c) == null || !t3Var.isAttachedToWindow() || AndroidUtilities.lerp(t3Var.H0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(t3Var.A0.f26613c)) >= t3Var.getHeight() || this.I >= 1.0f) {
            return false;
        }
        return true;
    }

    public final int j() {
        float translationX;
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sk, false);
        }
        h4 h4Var = this.K;
        if (h4Var.f38285u0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (h4Var.f38285u0[0].getTranslationX() / h4Var.f38285u0[0].getWidth());
        }
        return i0.a.d(1.0f - translationX, h4Var.f38285u0[0].getBackgroundColor(), h4Var.f38285u0[1].getBackgroundColor());
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
        return org.telegram.messenger.q.A(20.0f, l(), dp + height);
    }

    public final int l() {
        float f7;
        h4 h4Var = this.K;
        int i10 = 0;
        l3 l3Var = h4Var.f38285u0[0];
        if (l3Var != null && l3Var.getVisibility() == 0) {
            f7 = 1.0f - (h4Var.f38285u0[0].getTranslationX() / h4Var.f38285u0[0].getWidth());
        } else {
            f7 = 0.0f;
        }
        float f10 = 1.0f - f7;
        l3 l3Var2 = h4Var.f38285u0[0];
        if (l3Var2 != null && l3Var2.getVisibility() == 0) {
            i10 = (int) (h4Var.f38285u0[0].getAlpha() * h4Var.f38285u0[0].getListTop() * f7);
        }
        l3 l3Var3 = h4Var.f38285u0[1];
        if (l3Var3 != null && l3Var3.getVisibility() == 0) {
            return i10 + ((int) (h4Var.f38285u0[1].getAlpha() * h4Var.f38285u0[1].getListTop() * f10));
        }
        return i10;
    }

    public final void m() {
        h4 h4Var = this.K;
        h4Var.f38285u0[0].setLastVisible(this.J);
        h4Var.f38285u0[1].setLastVisible(false);
    }

    public final void n() {
        float f7;
        View view = this.d;
        if (view == null) {
            return;
        }
        float k10 = k();
        float f10 = 1.0f - this.f42342w;
        if (this.f42339n) {
            f7 = 0.0f;
        } else {
            f7 = this.f42343x;
        }
        view.setTranslationY(Math.max(f10, f7) * k10);
        this.f42336c.invalidate();
    }

    @Override
    public final boolean onAttachedBackPressed() {
        h4 h4Var = this.K;
        if (h4Var.f38279o0) {
            AndroidUtilities.hideKeyboard(this.f42336c);
            return true;
        }
        k0 k0Var = h4Var.f38273h0;
        if (k0Var.T) {
            k0Var.h(false);
            return true;
        } else if (k0Var.W) {
            k0Var.k(false);
            return true;
        } else {
            if (h4Var.J()) {
                l3 l3Var = h4Var.f38285u0[0];
                if (l3Var.f39502s) {
                    if (l3Var.f() && l3Var.getWebView() != null) {
                        l3Var.getWebView().goBack();
                    }
                    return true;
                }
            }
            if (h4Var.f38269d0.size() > 1) {
                h4Var.G();
                return true;
            }
            dismiss(false);
            return true;
        }
    }

    @Override
    public final void release() {
        this.f42340r = true;
        h4 h4Var = this.K;
        l3 l3Var = h4Var.f38285u0[0];
        if (l3Var != null && l3Var.h) {
            i3 i3Var = l3Var.f39498e;
            i3Var.setSwipeOffsetY((-i3Var.f9262f) + i3Var.f9261e);
            h4Var.f38285u0[0].h = false;
        }
        l3 l3Var2 = h4Var.f38285u0[0];
        if (l3Var2 != null && !l3Var2.E) {
            if (l3Var2.getWebView() != null) {
                l3Var2.getWebView().onPause();
            }
            l3Var2.E = true;
        }
        l3 l3Var3 = h4Var.f38285u0[1];
        if (l3Var3 != null && !l3Var3.E) {
            if (l3Var3.getWebView() != null) {
                l3Var3.getWebView().onPause();
            }
            l3Var3.E = true;
        }
        org.telegram.ui.ActionBar.h3 h3Var = this.f42337e;
        if (h3Var != null) {
            h3Var.c();
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f42335b;
        if (m2Var != null) {
            m2Var.removeSheet(this);
            if (this.f42337e == null) {
                AndroidUtilities.removeFromParent(this.f42336c);
            }
        }
        ai.e5 e5Var = this.v;
        if (e5Var != null) {
            e5Var.run();
            this.v = null;
        }
        h4.f38241b1.remove(h4Var);
    }

    @Override
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        h4 h4Var = this.K;
        h4Var.f38285u0[0].setLastVisible(z10);
        h4Var.f38285u0[1].setLastVisible(false);
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (ai.e5) runnable;
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
        this.f42339n = z10;
        if (z10) {
            LaunchActivity.G1.f33851y0.b(this);
        } else {
            e(true, new mu0(this, 10));
        }
        i();
        h();
    }

    @Override
    public final org.telegram.ui.ActionBar.t3 mo36getWindowView() {
        return this.f42336c;
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
