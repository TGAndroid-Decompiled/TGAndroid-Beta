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
public final class y3 implements org.telegram.ui.ActionBar.l2, org.telegram.ui.ActionBar.t3 {
    public ValueAnimator B;
    public boolean C;
    public boolean D;
    public boolean E;
    public float F;
    public boolean G;
    public final l4 H;
    public final AnimationNotificationsLocker f40364a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.p2 f40365b;
    public final x3 f40366c;
    public View d;
    public org.telegram.ui.ActionBar.j3 e;
    public boolean f40367f;
    public boolean h;
    public boolean f40368n;
    public boolean f40369r;
    public boolean f40370s;
    public nh.k3 v;
    public float f40371w;
    public float f40372x;
    public ValueAnimator f40373y;

    public y3(l4 l4Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.H = l4Var;
        this.f40365b = p2Var;
        p2Var.getResourceProvider();
        x3 x3Var = new x3(this, p2Var.getContext());
        this.f40366c = x3Var;
        new ph.i3(x3Var, true, new w3(this, 0));
    }

    @Override
    public final org.telegram.ui.ActionBar.m3 a() {
        int w02;
        int w03;
        float progress;
        org.telegram.ui.ActionBar.m3 m3Var = new org.telegram.ui.ActionBar.m3();
        l4 l4Var = this.H;
        m3Var.C = l4Var.f35933e0.getTitle();
        m3Var.H = l4Var;
        p3 p3Var = l4Var.f35945r0[0];
        Bitmap bitmap = null;
        if (p3Var != null && SharedConfig.adaptableColorInBrowser) {
            w02 = p3Var.getActionBarColor();
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        m3Var.f20459o = w02;
        p3 p3Var2 = l4Var.f35945r0[0];
        if (p3Var2 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = p3Var2.getBackgroundColor();
        } else {
            w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        m3Var.f20460p = w03;
        m3Var.f20456l = true;
        if (!this.C) {
            progress = 0.0f;
        } else {
            progress = l4Var.f35945r0[0].getProgress();
        }
        m3Var.G = progress;
        p3 p3Var3 = l4Var.f35945r0[0];
        m3Var.f20450c = p3Var3;
        if (p3Var3 != null && p3Var3.getWebView() != null) {
            bitmap = l4Var.f35945r0[0].getWebView().getFavicon();
        }
        m3Var.D = bitmap;
        p3 p3Var4 = m3Var.f20450c;
        if (p3Var4 != null) {
            m3Var.e = p3Var4.getWidth();
            m3Var.f20451f = m3Var.f20450c.getHeight();
        }
        m3Var.f20452g = l();
        m3Var.B = org.telegram.ui.ActionBar.j6.I.q();
        return m3Var;
    }

    @Override
    public final boolean attachedToParent() {
        return this.f40366c.isAttachedToWindow();
    }

    @Override
    public final boolean b() {
        return this.f40367f;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.j3 j3Var) {
        this.e = j3Var;
        if (j3Var != null) {
            this.f40367f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f10);
        ofFloat.addUpdateListener(new v3(this, 0));
        return ofFloat;
    }

    @Override
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z4, rt0 rt0Var) {
        float f10;
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f40372x;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new v3(this, 2));
        this.B.addListener(new androidx.fragment.app.g(this, z4, rt0Var, 3));
        this.B.setInterpolator(org.telegram.ui.Components.nr.h);
        this.B.setDuration(250L);
        this.B.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f40373y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f40371w, 1.0f);
        this.f40373y = ofFloat;
        ofFloat.addUpdateListener(new v3(this, 1));
        this.f40373y.addListener(new cg.l0(this, 27));
        this.f40373y.setInterpolator(org.telegram.ui.Components.nr.h);
        this.f40373y.setDuration(320L);
        this.f40373y.start();
    }

    public final void g(org.telegram.ui.ActionBar.p2 p2Var) {
        xn xnVar;
        jk jkVar;
        this.f40369r = false;
        this.f40365b = p2Var;
        p2Var.getResourceProvider();
        if ((p2Var instanceof xn) && (jkVar = (xnVar = (xn) p2Var).V) != null) {
            jkVar.P();
            xnVar.V.n0(true, false, true);
        }
        org.telegram.ui.ActionBar.j3 j3Var = this.e;
        if (j3Var != null) {
            if (!j3Var.e) {
                j3Var.e = true;
                try {
                    j3Var.show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else {
            x3 x3Var = this.f40366c;
            AndroidUtilities.removeFromParent(x3Var);
            if (p2Var.getLayoutContainer() != null) {
                p2Var.getLayoutContainer().addView(x3Var);
            }
        }
        l4 l4Var = this.H;
        p3 p3Var = l4Var.f35945r0[0];
        if (p3Var != null && p3Var.B) {
            if (p3Var.getWebView() != null) {
                p3Var.getWebView().onResume();
            }
            p3Var.B = false;
        }
        p3 p3Var2 = l4Var.f35945r0[1];
        if (p3Var2 != null && p3Var2.B) {
            if (p3Var2.getWebView() != null) {
                p3Var2.getWebView().onResume();
            }
            p3Var2.B = false;
        }
        l4.Y0.add(l4Var);
    }

    @Override
    public final org.telegram.ui.Components.qc getBulletinFactory() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y3.getBulletinFactory():org.telegram.ui.Components.qc");
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        float min;
        if (this.f40368n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f40371w, 1.0f - this.f40372x) * (1.0f - this.F);
        }
        int j10 = j();
        m0 m0Var = this.H.f35933e0;
        if (m0Var != null) {
            j10 = i0.a.d(m0Var.U, j10, m0Var.f39657x);
        }
        return i0.a.d(min, i10, j10);
    }

    @Override
    public final View getWindowView() {
        return this.f40366c;
    }

    public final void h() {
        if (this.f40370s != isFullyVisible()) {
            this.f40370s = isFullyVisible();
            org.telegram.ui.ActionBar.p2 p2Var = this.f40365b;
            if (p2Var != null && (p2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f40365b.getParentLayout();
                org.telegram.ui.ActionBar.w wVar = actionBarLayout.f19481s;
                if (wVar != null) {
                    wVar.invalidate();
                }
                org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.f19486w;
                if (wVar2 != null) {
                    wVar2.invalidate();
                    return;
                }
                return;
            }
            x3 x3Var = this.f40366c;
            if (x3Var.getParent() instanceof View) {
                ((View) x3Var.getParent()).invalidate();
            }
        }
    }

    public final void i() {
        View view;
        org.telegram.ui.ActionBar.j3 j3Var = this.e;
        x3 x3Var = this.f40366c;
        if (j3Var != null) {
            view = j3Var.f19827b;
        } else {
            view = x3Var;
        }
        AndroidUtilities.setLightStatusBar(view, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.j3 j3Var2 = this.e;
        boolean z4 = false;
        if (j3Var2 != null) {
            int navigationBarColor = j3Var2.f19826a.getNavigationBarColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
            j3Var2.d.setColor(navigationBarColor);
            j3Var2.f19828c.invalidate();
            AndroidUtilities.setNavigationBarColor(j3Var2, navigationBarColor);
            if (AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f) {
                z4 = true;
            }
            AndroidUtilities.setLightNavigationBar(j3Var2, z4);
            LaunchActivity.D1.H(true, true, true);
            return;
        }
        LaunchActivity.D1.H(true, true, true);
        if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false))) >= 0.721f) {
            z4 = true;
        }
        AndroidUtilities.setLightNavigationBar(x3Var, z4);
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        float min;
        int d;
        float f10 = 0.0f;
        if (this.f40368n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.F) * Math.min(this.f40371w, 1.0f - this.f40372x);
        }
        if (this.C && min > 0.25f) {
            if (!SharedConfig.adaptableColorInBrowser) {
                d = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            } else {
                l4 l4Var = this.H;
                if (l4Var.f35945r0[0].getVisibility() == 0) {
                    f10 = 1.0f - (l4Var.f35945r0[0].getTranslationX() / l4Var.f35945r0[0].getWidth());
                }
                d = i0.a.d(1.0f - f10, l4Var.f35945r0[0].getActionBarColor(), l4Var.f35945r0[1].getActionBarColor());
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        if (this.D && this.f40372x <= 0.0f && this.f40371w >= 1.0f && this.F <= 0.0f && !this.f40368n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isShown() {
        x3 x3Var;
        if (this.h || this.f40369r || this.f40371w <= 0.5f || (x3Var = this.f40366c) == null || !x3Var.isAttachedToWindow() || AndroidUtilities.lerp(x3Var.E0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(x3Var.f39848x0.f31241c)) >= x3Var.getHeight() || this.F >= 1.0f) {
            return false;
        }
        return true;
    }

    public final int j() {
        float translationX;
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sk, false);
        }
        l4 l4Var = this.H;
        if (l4Var.f35945r0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (l4Var.f35945r0[0].getTranslationX() / l4Var.f35945r0[0].getWidth());
        }
        return i0.a.d(1.0f - translationX, l4Var.f35945r0[0].getBackgroundColor(), l4Var.f35945r0[1].getBackgroundColor());
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
        return org.telegram.messenger.y3.z(20.0f, l(), dp + height);
    }

    public final int l() {
        float f10;
        l4 l4Var = this.H;
        int i10 = 0;
        p3 p3Var = l4Var.f35945r0[0];
        if (p3Var != null && p3Var.getVisibility() == 0) {
            f10 = 1.0f - (l4Var.f35945r0[0].getTranslationX() / l4Var.f35945r0[0].getWidth());
        } else {
            f10 = 0.0f;
        }
        float f11 = 1.0f - f10;
        p3 p3Var2 = l4Var.f35945r0[0];
        if (p3Var2 != null && p3Var2.getVisibility() == 0) {
            i10 = (int) (l4Var.f35945r0[0].getAlpha() * l4Var.f35945r0[0].getListTop() * f10);
        }
        p3 p3Var3 = l4Var.f35945r0[1];
        if (p3Var3 != null && p3Var3.getVisibility() == 0) {
            return i10 + ((int) (l4Var.f35945r0[1].getAlpha() * l4Var.f35945r0[1].getListTop() * f11));
        }
        return i10;
    }

    public final void m() {
        l4 l4Var = this.H;
        l4Var.f35945r0[0].setLastVisible(this.G);
        l4Var.f35945r0[1].setLastVisible(false);
    }

    public final void n() {
        float f10;
        View view = this.d;
        if (view == null) {
            return;
        }
        float k10 = k();
        float f11 = 1.0f - this.f40371w;
        if (this.f40368n) {
            f10 = 0.0f;
        } else {
            f10 = this.f40372x;
        }
        view.setTranslationY(Math.max(f11, f10) * k10);
        this.f40366c.invalidate();
    }

    @Override
    public final boolean onAttachedBackPressed() {
        l4 l4Var = this.H;
        if (l4Var.f35940l0) {
            AndroidUtilities.hideKeyboard(this.f40366c);
            return true;
        }
        m0 m0Var = l4Var.f35933e0;
        if (m0Var.Q) {
            m0Var.h(false);
            return true;
        } else if (m0Var.T) {
            m0Var.k(false);
            return true;
        } else {
            if (l4Var.J()) {
                p3 p3Var = l4Var.f35945r0[0];
                if (p3Var.f37164s) {
                    if (p3Var.f() && p3Var.getWebView() != null) {
                        p3Var.getWebView().goBack();
                    }
                    return true;
                }
            }
            if (l4Var.f35929a0.size() > 1) {
                l4Var.G();
                return true;
            }
            dismiss(false);
            return true;
        }
    }

    @Override
    public final void release() {
        this.f40369r = true;
        l4 l4Var = this.H;
        p3 p3Var = l4Var.f35945r0[0];
        if (p3Var != null && p3Var.h) {
            m3 m3Var = p3Var.e;
            m3Var.setSwipeOffsetY((-m3Var.f43630f) + m3Var.e);
            l4Var.f35945r0[0].h = false;
        }
        p3 p3Var2 = l4Var.f35945r0[0];
        if (p3Var2 != null && !p3Var2.B) {
            if (p3Var2.getWebView() != null) {
                p3Var2.getWebView().onPause();
            }
            p3Var2.B = true;
        }
        p3 p3Var3 = l4Var.f35945r0[1];
        if (p3Var3 != null && !p3Var3.B) {
            if (p3Var3.getWebView() != null) {
                p3Var3.getWebView().onPause();
            }
            p3Var3.B = true;
        }
        org.telegram.ui.ActionBar.j3 j3Var = this.e;
        if (j3Var != null) {
            j3Var.c();
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f40365b;
        if (p2Var != null) {
            p2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.f40366c);
            }
        }
        nh.k3 k3Var = this.v;
        if (k3Var != null) {
            k3Var.run();
            this.v = null;
        }
        l4.Y0.remove(l4Var);
    }

    @Override
    public final void setLastVisible(boolean z4) {
        this.G = z4;
        l4 l4Var = this.H;
        l4Var.f35945r0[0].setLastVisible(z4);
        l4Var.f35945r0[1].setLastVisible(false);
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (nh.k3) runnable;
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        return false;
    }

    @Override
    public final void dismiss(boolean z4) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f40368n = z4;
        if (z4) {
            LaunchActivity.D1.f31654v0.b(this);
        } else {
            e(true, new rt0(this, 10));
        }
        i();
        h();
    }

    @Override
    public final org.telegram.ui.ActionBar.u3 mo37getWindowView() {
        return this.f40366c;
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
