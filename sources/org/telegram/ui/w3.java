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
public final class w3 implements org.telegram.ui.ActionBar.k2, org.telegram.ui.ActionBar.w3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final k4 K;
    public final AnimationNotificationsLocker f42884a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.o2 f42885b;
    public final v3 f42886c;
    public View d;
    public org.telegram.ui.ActionBar.l3 e;
    public boolean f42887f;
    public boolean h;
    public boolean f42888n;
    public boolean f42889r;
    public boolean f42890s;
    public ci.s3 v;
    public float f42891w;
    public float f42892x;
    public ValueAnimator f42893y;

    public w3(k4 k4Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.K = k4Var;
        this.f42885b = o2Var;
        o2Var.getResourceProvider();
        v3 v3Var = new v3(this, o2Var.getContext());
        this.f42886c = v3Var;
        new ei.b4(v3Var, true, new u3(this, 0));
    }

    @Override
    public final org.telegram.ui.ActionBar.p3 a() {
        int x02;
        int x03;
        float progress;
        org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3();
        k4 k4Var = this.K;
        p3Var.E = k4Var.f38762h0.getTitle();
        p3Var.J = k4Var;
        n3 n3Var = k4Var.f38774u0[0];
        Bitmap bitmap = null;
        if (n3Var != null && SharedConfig.adaptableColorInBrowser) {
            x02 = n3Var.getActionBarColor();
        } else {
            x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Pk, false);
        }
        p3Var.f21768q = x02;
        n3 n3Var2 = k4Var.f38774u0[0];
        if (n3Var2 != null && SharedConfig.adaptableColorInBrowser) {
            x03 = n3Var2.getBackgroundColor();
        } else {
            x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Pk, false);
        }
        p3Var.f21769r = x03;
        p3Var.f21765n = true;
        if (!this.F) {
            progress = 0.0f;
        } else {
            progress = k4Var.f38774u0[0].getProgress();
        }
        p3Var.I = progress;
        n3 n3Var3 = k4Var.f38774u0[0];
        p3Var.f21757c = n3Var3;
        if (n3Var3 != null && n3Var3.getWebView() != null) {
            bitmap = k4Var.f38774u0[0].getWebView().getFavicon();
        }
        p3Var.F = bitmap;
        n3 n3Var4 = p3Var.f21757c;
        if (n3Var4 != null) {
            p3Var.f21759g = n3Var4.getWidth();
            p3Var.h = p3Var.f21757c.getHeight();
        }
        p3Var.f21760i = l();
        p3Var.D = org.telegram.ui.ActionBar.k6.I.q();
        return p3Var;
    }

    @Override
    public final boolean attachedToParent() {
        return this.f42886c.isAttachedToWindow();
    }

    @Override
    public final boolean b() {
        return this.f42887f;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.l3 l3Var) {
        this.e = l3Var;
        if (l3Var != null) {
            this.f42887f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        ofFloat.addUpdateListener(new t3(this, 0));
        return ofFloat;
    }

    @Override
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z10, ut0 ut0Var) {
        float f7;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f42892x;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new t3(this, 2));
        this.E.addListener(new ah.q0(this, z10, ut0Var, 3));
        this.E.setInterpolator(org.telegram.ui.Components.zr.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f42893y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42891w, 1.0f);
        this.f42893y = ofFloat;
        ofFloat.addUpdateListener(new t3(this, 1));
        this.f42893y.addListener(new m.a(this, 3));
        this.f42893y.setInterpolator(org.telegram.ui.Components.zr.h);
        this.f42893y.setDuration(320L);
        this.f42893y.start();
    }

    public final void g(org.telegram.ui.ActionBar.o2 o2Var) {
        sn snVar;
        gk gkVar;
        this.f42889r = false;
        this.f42885b = o2Var;
        o2Var.getResourceProvider();
        if ((o2Var instanceof sn) && (gkVar = (snVar = (sn) o2Var).Y) != null) {
            gkVar.M();
            snVar.Y.k0(true, false, true);
        }
        org.telegram.ui.ActionBar.l3 l3Var = this.e;
        if (l3Var != null) {
            if (!l3Var.e) {
                l3Var.e = true;
                try {
                    l3Var.show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else {
            v3 v3Var = this.f42886c;
            AndroidUtilities.removeFromParent(v3Var);
            if (o2Var.getLayoutContainer() != null) {
                o2Var.getLayoutContainer().addView(v3Var);
            }
        }
        k4 k4Var = this.K;
        n3 n3Var = k4Var.f38774u0[0];
        if (n3Var != null && n3Var.F) {
            if (n3Var.getWebView() != null) {
                n3Var.getWebView().onResume();
            }
            n3Var.F = false;
        }
        n3 n3Var2 = k4Var.f38774u0[1];
        if (n3Var2 != null && n3Var2.F) {
            if (n3Var2.getWebView() != null) {
                n3Var2.getWebView().onResume();
            }
            n3Var2.F = false;
        }
        k4.f38730c1.add(k4Var);
    }

    @Override
    public final org.telegram.ui.Components.vc getBulletinFactory() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w3.getBulletinFactory():org.telegram.ui.Components.vc");
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        float min;
        if (this.f42888n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f42891w, 1.0f - this.f42892x) * (1.0f - this.I);
        }
        int j10 = j();
        m0 m0Var = this.K.f38762h0;
        if (m0Var != null) {
            j10 = i0.a.f(m0Var.f43258a0, j10, m0Var.f43287x);
        }
        return i0.a.f(min, i10, j10);
    }

    @Override
    public final View getWindowView() {
        return this.f42886c;
    }

    public final void h() {
        if (this.f42890s != isFullyVisible()) {
            this.f42890s = isFullyVisible();
            org.telegram.ui.ActionBar.o2 o2Var = this.f42885b;
            if (o2Var != null && (o2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f42885b.getParentLayout();
                org.telegram.ui.ActionBar.v vVar = actionBarLayout.f20654s;
                if (vVar != null) {
                    vVar.invalidate();
                }
                org.telegram.ui.ActionBar.v vVar2 = actionBarLayout.f20662w;
                if (vVar2 != null) {
                    vVar2.invalidate();
                    return;
                }
                return;
            }
            v3 v3Var = this.f42886c;
            if (v3Var.getParent() instanceof View) {
                ((View) v3Var.getParent()).invalidate();
            }
        }
    }

    public final void i() {
        View view;
        org.telegram.ui.ActionBar.l3 l3Var = this.e;
        v3 v3Var = this.f42886c;
        if (l3Var != null) {
            view = l3Var.f21605b;
        } else {
            view = v3Var;
        }
        AndroidUtilities.setLightStatusBar(view, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.l3 l3Var2 = this.e;
        boolean z10 = false;
        if (l3Var2 != null) {
            int navigationBarColor = l3Var2.f21604a.getNavigationBarColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21126a7, false));
            l3Var2.d.setColor(navigationBarColor);
            l3Var2.f21606c.invalidate();
            AndroidUtilities.setNavigationBarColor(l3Var2, navigationBarColor);
            if (AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(l3Var2, z10);
            LaunchActivity.I1.H(true, true, true);
            return;
        }
        LaunchActivity.I1.H(true, true, true);
        if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21126a7, false))) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(v3Var, z10);
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        float min;
        int f7;
        float f10 = 0.0f;
        if (this.f42888n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.I) * Math.min(this.f42891w, 1.0f - this.f42892x);
        }
        if (this.F && min > 0.25f) {
            if (!SharedConfig.adaptableColorInBrowser) {
                f7 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Pk, false);
            } else {
                k4 k4Var = this.K;
                if (k4Var.f38774u0[0].getVisibility() == 0) {
                    f10 = 1.0f - (k4Var.f38774u0[0].getTranslationX() / k4Var.f38774u0[0].getWidth());
                }
                f7 = i0.a.f(1.0f - f10, k4Var.f38774u0[0].getActionBarColor(), k4Var.f38774u0[1].getActionBarColor());
            }
            if (AndroidUtilities.computePerceivedBrightness(f7) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        if (this.G && this.f42892x <= 0.0f && this.f42891w >= 1.0f && this.I <= 0.0f && !this.f42888n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isShown() {
        v3 v3Var;
        if (this.h || this.f42889r || this.f42891w <= 0.5f || (v3Var = this.f42886c) == null || !v3Var.isAttachedToWindow() || AndroidUtilities.lerp(v3Var.H0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(v3Var.A0.f25568c)) >= v3Var.getHeight() || this.I >= 1.0f) {
            return false;
        }
        return true;
    }

    public final int j() {
        float translationX;
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sk, false);
        }
        k4 k4Var = this.K;
        if (k4Var.f38774u0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (k4Var.f38774u0[0].getTranslationX() / k4Var.f38774u0[0].getWidth());
        }
        return i0.a.f(1.0f - translationX, k4Var.f38774u0[0].getBackgroundColor(), k4Var.f38774u0[1].getBackgroundColor());
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
        return org.telegram.messenger.v0.z(20.0f, l(), dp + height);
    }

    public final int l() {
        float f7;
        k4 k4Var = this.K;
        int i10 = 0;
        n3 n3Var = k4Var.f38774u0[0];
        if (n3Var != null && n3Var.getVisibility() == 0) {
            f7 = 1.0f - (k4Var.f38774u0[0].getTranslationX() / k4Var.f38774u0[0].getWidth());
        } else {
            f7 = 0.0f;
        }
        float f10 = 1.0f - f7;
        n3 n3Var2 = k4Var.f38774u0[0];
        if (n3Var2 != null && n3Var2.getVisibility() == 0) {
            i10 = (int) (k4Var.f38774u0[0].getAlpha() * k4Var.f38774u0[0].getListTop() * f7);
        }
        n3 n3Var3 = k4Var.f38774u0[1];
        if (n3Var3 != null && n3Var3.getVisibility() == 0) {
            return i10 + ((int) (k4Var.f38774u0[1].getAlpha() * k4Var.f38774u0[1].getListTop() * f10));
        }
        return i10;
    }

    public final void m() {
        k4 k4Var = this.K;
        k4Var.f38774u0[0].setLastVisible(this.J);
        k4Var.f38774u0[1].setLastVisible(false);
    }

    public final void n() {
        float f7;
        View view = this.d;
        if (view == null) {
            return;
        }
        float k10 = k();
        float f10 = 1.0f - this.f42891w;
        if (this.f42888n) {
            f7 = 0.0f;
        } else {
            f7 = this.f42892x;
        }
        view.setTranslationY(Math.max(f10, f7) * k10);
        this.f42886c.invalidate();
    }

    @Override
    public final boolean onAttachedBackPressed() {
        k4 k4Var = this.K;
        if (k4Var.f38768o0) {
            AndroidUtilities.hideKeyboard(this.f42886c);
            return true;
        }
        m0 m0Var = k4Var.f38762h0;
        if (m0Var.T) {
            m0Var.h(false);
            return true;
        } else if (m0Var.W) {
            m0Var.k(false);
            return true;
        } else {
            if (k4Var.J()) {
                n3 n3Var = k4Var.f38774u0[0];
                if (n3Var.f39707s) {
                    if (n3Var.f() && n3Var.getWebView() != null) {
                        n3Var.getWebView().goBack();
                    }
                    return true;
                }
            }
            if (k4Var.f38758d0.size() > 1) {
                k4Var.G();
                return true;
            }
            dismiss(false);
            return true;
        }
    }

    @Override
    public final void release() {
        this.f42889r = true;
        k4 k4Var = this.K;
        n3 n3Var = k4Var.f38774u0[0];
        if (n3Var != null && n3Var.h) {
            k3 k3Var = n3Var.e;
            k3Var.setSwipeOffsetY((-k3Var.f11207f) + k3Var.e);
            k4Var.f38774u0[0].h = false;
        }
        n3 n3Var2 = k4Var.f38774u0[0];
        if (n3Var2 != null && !n3Var2.F) {
            if (n3Var2.getWebView() != null) {
                n3Var2.getWebView().onPause();
            }
            n3Var2.F = true;
        }
        n3 n3Var3 = k4Var.f38774u0[1];
        if (n3Var3 != null && !n3Var3.F) {
            if (n3Var3.getWebView() != null) {
                n3Var3.getWebView().onPause();
            }
            n3Var3.F = true;
        }
        org.telegram.ui.ActionBar.l3 l3Var = this.e;
        if (l3Var != null) {
            l3Var.c();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f42885b;
        if (o2Var != null) {
            o2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.f42886c);
            }
        }
        ci.s3 s3Var = this.v;
        if (s3Var != null) {
            s3Var.run();
            this.v = null;
        }
        k4.f38730c1.remove(k4Var);
    }

    @Override
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        k4 k4Var = this.K;
        k4Var.f38774u0[0].setLastVisible(z10);
        k4Var.f38774u0[1].setLastVisible(false);
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (ci.s3) runnable;
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
        this.f42888n = z10;
        if (z10) {
            LaunchActivity.I1.f33505y0.b(this);
        } else {
            e(true, new ut0(this, 10));
        }
        i();
        h();
    }

    @Override
    public final org.telegram.ui.ActionBar.x3 mo36getWindowView() {
        return this.f42886c;
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
