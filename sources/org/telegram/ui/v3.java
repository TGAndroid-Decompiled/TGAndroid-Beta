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
public final class v3 implements org.telegram.ui.ActionBar.j2, org.telegram.ui.ActionBar.t3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final i4 K;
    public final AnimationNotificationsLocker f38276a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.n2 f38277b;
    public final u3 f38278c;
    public View d;
    public org.telegram.ui.ActionBar.i3 e;
    public boolean f38279f;
    public boolean h;
    public boolean f38280n;
    public boolean f38281r;
    public boolean f38282s;
    public ai.d5 v;
    public float f38283w;
    public float f38284x;
    public ValueAnimator f38285y;

    public v3(i4 i4Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.K = i4Var;
        this.f38277b = n2Var;
        n2Var.getResourceProvider();
        u3 u3Var = new u3(this, n2Var.getContext());
        this.f38278c = u3Var;
        new ci.i4(u3Var, true, new t3(this, 0));
    }

    @Override
    public final org.telegram.ui.ActionBar.m3 a() {
        int w02;
        int w03;
        float progress;
        org.telegram.ui.ActionBar.m3 m3Var = new org.telegram.ui.ActionBar.m3();
        i4 i4Var = this.K;
        m3Var.E = i4Var.f34009h0.getTitle();
        m3Var.J = i4Var;
        m3 m3Var2 = i4Var.f34021u0[0];
        Bitmap bitmap = null;
        if (m3Var2 != null && SharedConfig.adaptableColorInBrowser) {
            w02 = m3Var2.getActionBarColor();
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Pk, false);
        }
        m3Var.f19383q = w02;
        m3 m3Var3 = i4Var.f34021u0[0];
        if (m3Var3 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = m3Var3.getBackgroundColor();
        } else {
            w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Pk, false);
        }
        m3Var.f19384r = w03;
        m3Var.f19380n = true;
        if (!this.F) {
            progress = 0.0f;
        } else {
            progress = i4Var.f34021u0[0].getProgress();
        }
        m3Var.I = progress;
        m3 m3Var4 = i4Var.f34021u0[0];
        m3Var.f19372c = m3Var4;
        if (m3Var4 != null && m3Var4.getWebView() != null) {
            bitmap = i4Var.f34021u0[0].getWebView().getFavicon();
        }
        m3Var.F = bitmap;
        m3 m3Var5 = m3Var.f19372c;
        if (m3Var5 != null) {
            m3Var.f19374g = m3Var5.getWidth();
            m3Var.h = m3Var.f19372c.getHeight();
        }
        m3Var.f19375i = l();
        m3Var.D = org.telegram.ui.ActionBar.h6.I.q();
        return m3Var;
    }

    @Override
    public final boolean attachedToParent() {
        return this.f38278c.isAttachedToWindow();
    }

    @Override
    public final boolean b() {
        return this.f38279f;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.i3 i3Var) {
        this.e = i3Var;
        if (i3Var != null) {
            this.f38279f = true;
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

    public final void e(boolean z10, fu0 fu0Var) {
        float f7;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f38284x;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new s3(this, 2));
        this.E.addListener(new androidx.fragment.app.g(this, z10, fu0Var, 2));
        this.E.setInterpolator(org.telegram.ui.Components.rr.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f38285y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38283w, 1.0f);
        this.f38285y = ofFloat;
        ofFloat.addUpdateListener(new s3(this, 1));
        this.f38285y.addListener(new ai.b(this, 28));
        this.f38285y.setInterpolator(org.telegram.ui.Components.rr.h);
        this.f38285y.setDuration(320L);
        this.f38285y.start();
    }

    public final void g(org.telegram.ui.ActionBar.n2 n2Var) {
        xn xnVar;
        jk jkVar;
        this.f38281r = false;
        this.f38277b = n2Var;
        n2Var.getResourceProvider();
        if ((n2Var instanceof xn) && (jkVar = (xnVar = (xn) n2Var).Y) != null) {
            jkVar.Q();
            xnVar.Y.o0(true, false, true);
        }
        org.telegram.ui.ActionBar.i3 i3Var = this.e;
        if (i3Var != null) {
            if (!i3Var.e) {
                i3Var.e = true;
                try {
                    i3Var.show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else {
            u3 u3Var = this.f38278c;
            AndroidUtilities.removeFromParent(u3Var);
            if (n2Var.getLayoutContainer() != null) {
                n2Var.getLayoutContainer().addView(u3Var);
            }
        }
        i4 i4Var = this.K;
        m3 m3Var = i4Var.f34021u0[0];
        if (m3Var != null && m3Var.E) {
            if (m3Var.getWebView() != null) {
                m3Var.getWebView().onResume();
            }
            m3Var.E = false;
        }
        m3 m3Var2 = i4Var.f34021u0[1];
        if (m3Var2 != null && m3Var2.E) {
            if (m3Var2.getWebView() != null) {
                m3Var2.getWebView().onResume();
            }
            m3Var2.E = false;
        }
        i4.f33977b1.add(i4Var);
    }

    @Override
    public final org.telegram.ui.Components.xc getBulletinFactory() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v3.getBulletinFactory():org.telegram.ui.Components.xc");
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        float min;
        if (this.f38280n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f38283w, 1.0f - this.f38284x) * (1.0f - this.I);
        }
        int j3 = j();
        l0 l0Var = this.K.f34009h0;
        if (l0Var != null) {
            j3 = i0.a.d(l0Var.f38846a0, j3, l0Var.f38875x);
        }
        return i0.a.d(min, i10, j3);
    }

    @Override
    public final View getWindowView() {
        return this.f38278c;
    }

    public final void h() {
        if (this.f38282s != isFullyVisible()) {
            this.f38282s = isFullyVisible();
            org.telegram.ui.ActionBar.n2 n2Var = this.f38277b;
            if (n2Var != null && (n2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f38277b.getParentLayout();
                org.telegram.ui.ActionBar.w wVar = actionBarLayout.f18387s;
                if (wVar != null) {
                    wVar.invalidate();
                }
                org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.f18392w;
                if (wVar2 != null) {
                    wVar2.invalidate();
                    return;
                }
                return;
            }
            u3 u3Var = this.f38278c;
            if (u3Var.getParent() instanceof View) {
                ((View) u3Var.getParent()).invalidate();
            }
        }
    }

    public final void i() {
        View view;
        org.telegram.ui.ActionBar.i3 i3Var = this.e;
        u3 u3Var = this.f38278c;
        if (i3Var != null) {
            view = i3Var.f19207b;
        } else {
            view = u3Var;
        }
        AndroidUtilities.setLightStatusBar(view, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.i3 i3Var2 = this.e;
        boolean z10 = false;
        if (i3Var2 != null) {
            int navigationBarColor = i3Var2.f19206a.getNavigationBarColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false));
            i3Var2.d.setColor(navigationBarColor);
            i3Var2.f19208c.invalidate();
            AndroidUtilities.setNavigationBarColor(i3Var2, navigationBarColor);
            if (AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(i3Var2, z10);
            LaunchActivity.G1.H(true, true, true);
            return;
        }
        LaunchActivity.G1.H(true, true, true);
        if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false))) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(u3Var, z10);
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        float min;
        int d;
        float f7 = 0.0f;
        if (this.f38280n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.I) * Math.min(this.f38283w, 1.0f - this.f38284x);
        }
        if (this.F && min > 0.25f) {
            if (!SharedConfig.adaptableColorInBrowser) {
                d = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Pk, false);
            } else {
                i4 i4Var = this.K;
                if (i4Var.f34021u0[0].getVisibility() == 0) {
                    f7 = 1.0f - (i4Var.f34021u0[0].getTranslationX() / i4Var.f34021u0[0].getWidth());
                }
                d = i0.a.d(1.0f - f7, i4Var.f34021u0[0].getActionBarColor(), i4Var.f34021u0[1].getActionBarColor());
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        if (this.G && this.f38284x <= 0.0f && this.f38283w >= 1.0f && this.I <= 0.0f && !this.f38280n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isShown() {
        u3 u3Var;
        if (this.h || this.f38281r || this.f38283w <= 0.5f || (u3Var = this.f38278c) == null || !u3Var.isAttachedToWindow() || AndroidUtilities.lerp(u3Var.H0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(u3Var.A0.f23575c)) >= u3Var.getHeight() || this.I >= 1.0f) {
            return false;
        }
        return true;
    }

    public final int j() {
        float translationX;
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sk, false);
        }
        i4 i4Var = this.K;
        if (i4Var.f34021u0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (i4Var.f34021u0[0].getTranslationX() / i4Var.f34021u0[0].getWidth());
        }
        return i0.a.d(1.0f - translationX, i4Var.f34021u0[0].getBackgroundColor(), i4Var.f34021u0[1].getBackgroundColor());
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
        return org.telegram.messenger.z0.z(20.0f, l(), dp + height);
    }

    public final int l() {
        float f7;
        i4 i4Var = this.K;
        int i10 = 0;
        m3 m3Var = i4Var.f34021u0[0];
        if (m3Var != null && m3Var.getVisibility() == 0) {
            f7 = 1.0f - (i4Var.f34021u0[0].getTranslationX() / i4Var.f34021u0[0].getWidth());
        } else {
            f7 = 0.0f;
        }
        float f10 = 1.0f - f7;
        m3 m3Var2 = i4Var.f34021u0[0];
        if (m3Var2 != null && m3Var2.getVisibility() == 0) {
            i10 = (int) (i4Var.f34021u0[0].getAlpha() * i4Var.f34021u0[0].getListTop() * f7);
        }
        m3 m3Var3 = i4Var.f34021u0[1];
        if (m3Var3 != null && m3Var3.getVisibility() == 0) {
            return i10 + ((int) (i4Var.f34021u0[1].getAlpha() * i4Var.f34021u0[1].getListTop() * f10));
        }
        return i10;
    }

    public final void m() {
        i4 i4Var = this.K;
        i4Var.f34021u0[0].setLastVisible(this.J);
        i4Var.f34021u0[1].setLastVisible(false);
    }

    public final void n() {
        float f7;
        View view = this.d;
        if (view == null) {
            return;
        }
        float k10 = k();
        float f10 = 1.0f - this.f38283w;
        if (this.f38280n) {
            f7 = 0.0f;
        } else {
            f7 = this.f38284x;
        }
        view.setTranslationY(Math.max(f10, f7) * k10);
        this.f38278c.invalidate();
    }

    @Override
    public final boolean onAttachedBackPressed() {
        i4 i4Var = this.K;
        if (i4Var.f34015o0) {
            AndroidUtilities.hideKeyboard(this.f38278c);
            return true;
        }
        l0 l0Var = i4Var.f34009h0;
        if (l0Var.T) {
            l0Var.h(false);
            return true;
        } else if (l0Var.W) {
            l0Var.k(false);
            return true;
        } else {
            if (i4Var.J()) {
                m3 m3Var = i4Var.f34021u0[0];
                if (m3Var.f35135s) {
                    if (m3Var.f() && m3Var.getWebView() != null) {
                        m3Var.getWebView().goBack();
                    }
                    return true;
                }
            }
            if (i4Var.f34005d0.size() > 1) {
                i4Var.G();
                return true;
            }
            dismiss(false);
            return true;
        }
    }

    @Override
    public final void release() {
        this.f38281r = true;
        i4 i4Var = this.K;
        m3 m3Var = i4Var.f34021u0[0];
        if (m3Var != null && m3Var.h) {
            j3 j3Var = m3Var.e;
            j3Var.setSwipeOffsetY((-j3Var.f8534f) + j3Var.e);
            i4Var.f34021u0[0].h = false;
        }
        m3 m3Var2 = i4Var.f34021u0[0];
        if (m3Var2 != null && !m3Var2.E) {
            if (m3Var2.getWebView() != null) {
                m3Var2.getWebView().onPause();
            }
            m3Var2.E = true;
        }
        m3 m3Var3 = i4Var.f34021u0[1];
        if (m3Var3 != null && !m3Var3.E) {
            if (m3Var3.getWebView() != null) {
                m3Var3.getWebView().onPause();
            }
            m3Var3.E = true;
        }
        org.telegram.ui.ActionBar.i3 i3Var = this.e;
        if (i3Var != null) {
            i3Var.c();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f38277b;
        if (n2Var != null) {
            n2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.f38278c);
            }
        }
        ai.d5 d5Var = this.v;
        if (d5Var != null) {
            d5Var.run();
            this.v = null;
        }
        i4.f33977b1.remove(i4Var);
    }

    @Override
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        i4 i4Var = this.K;
        i4Var.f34021u0[0].setLastVisible(z10);
        i4Var.f34021u0[1].setLastVisible(false);
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (ai.d5) runnable;
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
        this.f38280n = z10;
        if (z10) {
            LaunchActivity.G1.f30831y0.b(this);
        } else {
            e(true, new fu0(this, 10));
        }
        i();
        h();
    }

    @Override
    public final org.telegram.ui.ActionBar.u3 mo37getWindowView() {
        return this.f38278c;
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
