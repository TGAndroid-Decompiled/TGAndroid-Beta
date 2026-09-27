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
public final class w3 implements org.telegram.ui.ActionBar.k2, org.telegram.ui.ActionBar.u3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final j4 K;
    public final AnimationNotificationsLocker f38793a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.o2 f38794b;
    public final v3 f38795c;
    public View d;
    public org.telegram.ui.ActionBar.j3 e;
    public boolean f38796f;
    public boolean h;
    public boolean f38797n;
    public boolean f38798r;
    public boolean f38799s;
    public ai.d5 v;
    public float f38800w;
    public float f38801x;
    public ValueAnimator f38802y;

    public w3(j4 j4Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.K = j4Var;
        this.f38794b = o2Var;
        o2Var.getResourceProvider();
        v3 v3Var = new v3(this, o2Var.getContext());
        this.f38795c = v3Var;
        new ci.i4(v3Var, true, new u3(this, 0));
    }

    @Override
    public final org.telegram.ui.ActionBar.n3 a() {
        int w02;
        int w03;
        float progress;
        org.telegram.ui.ActionBar.n3 n3Var = new org.telegram.ui.ActionBar.n3();
        j4 j4Var = this.K;
        n3Var.E = j4Var.f34615h0.getTitle();
        n3Var.J = j4Var;
        n3 n3Var2 = j4Var.f34627u0[0];
        Bitmap bitmap = null;
        if (n3Var2 != null && SharedConfig.adaptableColorInBrowser) {
            w02 = n3Var2.getActionBarColor();
        } else {
            w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Pk, false);
        }
        n3Var.f19662q = w02;
        n3 n3Var3 = j4Var.f34627u0[0];
        if (n3Var3 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = n3Var3.getBackgroundColor();
        } else {
            w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Pk, false);
        }
        n3Var.f19663r = w03;
        n3Var.f19659n = true;
        if (!this.F) {
            progress = 0.0f;
        } else {
            progress = j4Var.f34627u0[0].getProgress();
        }
        n3Var.I = progress;
        n3 n3Var4 = j4Var.f34627u0[0];
        n3Var.f19651c = n3Var4;
        if (n3Var4 != null && n3Var4.getWebView() != null) {
            bitmap = j4Var.f34627u0[0].getWebView().getFavicon();
        }
        n3Var.F = bitmap;
        n3 n3Var5 = n3Var.f19651c;
        if (n3Var5 != null) {
            n3Var.f19653g = n3Var5.getWidth();
            n3Var.h = n3Var.f19651c.getHeight();
        }
        n3Var.f19654i = l();
        n3Var.D = org.telegram.ui.ActionBar.i6.I.q();
        return n3Var;
    }

    @Override
    public final boolean attachedToParent() {
        return this.f38795c.isAttachedToWindow();
    }

    @Override
    public final boolean b() {
        return this.f38796f;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.j3 j3Var) {
        this.e = j3Var;
        if (j3Var != null) {
            this.f38796f = true;
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

    public final void e(boolean z10, hu0 hu0Var) {
        float f7;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f38801x;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new t3(this, 2));
        this.E.addListener(new androidx.fragment.app.g(this, z10, hu0Var, 2));
        this.E.setInterpolator(org.telegram.ui.Components.sr.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f38802y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38800w, 1.0f);
        this.f38802y = ofFloat;
        ofFloat.addUpdateListener(new t3(this, 1));
        this.f38802y.addListener(new ai.b(this, 28));
        this.f38802y.setInterpolator(org.telegram.ui.Components.sr.h);
        this.f38802y.setDuration(320L);
        this.f38802y.start();
    }

    public final void g(org.telegram.ui.ActionBar.o2 o2Var) {
        xn xnVar;
        lk lkVar;
        this.f38798r = false;
        this.f38794b = o2Var;
        o2Var.getResourceProvider();
        if ((o2Var instanceof xn) && (lkVar = (xnVar = (xn) o2Var).Y) != null) {
            lkVar.P();
            xnVar.Y.n0(true, false, true);
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
            v3 v3Var = this.f38795c;
            AndroidUtilities.removeFromParent(v3Var);
            if (o2Var.getLayoutContainer() != null) {
                o2Var.getLayoutContainer().addView(v3Var);
            }
        }
        j4 j4Var = this.K;
        n3 n3Var = j4Var.f34627u0[0];
        if (n3Var != null && n3Var.E) {
            if (n3Var.getWebView() != null) {
                n3Var.getWebView().onResume();
            }
            n3Var.E = false;
        }
        n3 n3Var2 = j4Var.f34627u0[1];
        if (n3Var2 != null && n3Var2.E) {
            if (n3Var2.getWebView() != null) {
                n3Var2.getWebView().onResume();
            }
            n3Var2.E = false;
        }
        j4.f34583b1.add(j4Var);
    }

    @Override
    public final org.telegram.ui.Components.xc getBulletinFactory() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w3.getBulletinFactory():org.telegram.ui.Components.xc");
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        float min;
        if (this.f38797n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f38800w, 1.0f - this.f38801x) * (1.0f - this.I);
        }
        int j3 = j();
        m0 m0Var = this.K.f34615h0;
        if (m0Var != null) {
            j3 = i0.a.d(m0Var.f39182a0, j3, m0Var.f39211x);
        }
        return i0.a.d(min, i10, j3);
    }

    @Override
    public final View getWindowView() {
        return this.f38795c;
    }

    public final void h() {
        if (this.f38799s != isFullyVisible()) {
            this.f38799s = isFullyVisible();
            org.telegram.ui.ActionBar.o2 o2Var = this.f38794b;
            if (o2Var != null && (o2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f38794b.getParentLayout();
                org.telegram.ui.ActionBar.x xVar = actionBarLayout.f18633s;
                if (xVar != null) {
                    xVar.invalidate();
                }
                org.telegram.ui.ActionBar.x xVar2 = actionBarLayout.f18638w;
                if (xVar2 != null) {
                    xVar2.invalidate();
                    return;
                }
                return;
            }
            v3 v3Var = this.f38795c;
            if (v3Var.getParent() instanceof View) {
                ((View) v3Var.getParent()).invalidate();
            }
        }
    }

    public final void i() {
        View view;
        org.telegram.ui.ActionBar.j3 j3Var = this.e;
        v3 v3Var = this.f38795c;
        if (j3Var != null) {
            view = j3Var.f19478b;
        } else {
            view = v3Var;
        }
        AndroidUtilities.setLightStatusBar(view, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.j3 j3Var2 = this.e;
        boolean z10 = false;
        if (j3Var2 != null) {
            int navigationBarColor = j3Var2.f19477a.getNavigationBarColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19001a7, false));
            j3Var2.d.setColor(navigationBarColor);
            j3Var2.f19479c.invalidate();
            AndroidUtilities.setNavigationBarColor(j3Var2, navigationBarColor);
            if (AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(j3Var2, z10);
            LaunchActivity.G1.H(true, true, true);
            return;
        }
        LaunchActivity.G1.H(true, true, true);
        if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19001a7, false))) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(v3Var, z10);
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        float min;
        int d;
        float f7 = 0.0f;
        if (this.f38797n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.I) * Math.min(this.f38800w, 1.0f - this.f38801x);
        }
        if (this.F && min > 0.25f) {
            if (!SharedConfig.adaptableColorInBrowser) {
                d = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Pk, false);
            } else {
                j4 j4Var = this.K;
                if (j4Var.f34627u0[0].getVisibility() == 0) {
                    f7 = 1.0f - (j4Var.f34627u0[0].getTranslationX() / j4Var.f34627u0[0].getWidth());
                }
                d = i0.a.d(1.0f - f7, j4Var.f34627u0[0].getActionBarColor(), j4Var.f34627u0[1].getActionBarColor());
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        if (this.G && this.f38801x <= 0.0f && this.f38800w >= 1.0f && this.I <= 0.0f && !this.f38797n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isShown() {
        v3 v3Var;
        if (this.h || this.f38798r || this.f38800w <= 0.5f || (v3Var = this.f38795c) == null || !v3Var.isAttachedToWindow() || AndroidUtilities.lerp(v3Var.H0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(v3Var.A0.f23890c)) >= v3Var.getHeight() || this.I >= 1.0f) {
            return false;
        }
        return true;
    }

    public final int j() {
        float translationX;
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sk, false);
        }
        j4 j4Var = this.K;
        if (j4Var.f34627u0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (j4Var.f34627u0[0].getTranslationX() / j4Var.f34627u0[0].getWidth());
        }
        return i0.a.d(1.0f - translationX, j4Var.f34627u0[0].getBackgroundColor(), j4Var.f34627u0[1].getBackgroundColor());
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
        return org.telegram.messenger.l0.A(20.0f, l(), dp + height);
    }

    public final int l() {
        float f7;
        j4 j4Var = this.K;
        int i10 = 0;
        n3 n3Var = j4Var.f34627u0[0];
        if (n3Var != null && n3Var.getVisibility() == 0) {
            f7 = 1.0f - (j4Var.f34627u0[0].getTranslationX() / j4Var.f34627u0[0].getWidth());
        } else {
            f7 = 0.0f;
        }
        float f10 = 1.0f - f7;
        n3 n3Var2 = j4Var.f34627u0[0];
        if (n3Var2 != null && n3Var2.getVisibility() == 0) {
            i10 = (int) (j4Var.f34627u0[0].getAlpha() * j4Var.f34627u0[0].getListTop() * f7);
        }
        n3 n3Var3 = j4Var.f34627u0[1];
        if (n3Var3 != null && n3Var3.getVisibility() == 0) {
            return i10 + ((int) (j4Var.f34627u0[1].getAlpha() * j4Var.f34627u0[1].getListTop() * f10));
        }
        return i10;
    }

    public final void m() {
        j4 j4Var = this.K;
        j4Var.f34627u0[0].setLastVisible(this.J);
        j4Var.f34627u0[1].setLastVisible(false);
    }

    public final void n() {
        float f7;
        View view = this.d;
        if (view == null) {
            return;
        }
        float k10 = k();
        float f10 = 1.0f - this.f38800w;
        if (this.f38797n) {
            f7 = 0.0f;
        } else {
            f7 = this.f38801x;
        }
        view.setTranslationY(Math.max(f10, f7) * k10);
        this.f38795c.invalidate();
    }

    @Override
    public final boolean onAttachedBackPressed() {
        j4 j4Var = this.K;
        if (j4Var.f34621o0) {
            AndroidUtilities.hideKeyboard(this.f38795c);
            return true;
        }
        m0 m0Var = j4Var.f34615h0;
        if (m0Var.T) {
            m0Var.h(false);
            return true;
        } else if (m0Var.W) {
            m0Var.k(false);
            return true;
        } else {
            if (j4Var.J()) {
                n3 n3Var = j4Var.f34627u0[0];
                if (n3Var.f35800s) {
                    if (n3Var.f() && n3Var.getWebView() != null) {
                        n3Var.getWebView().goBack();
                    }
                    return true;
                }
            }
            if (j4Var.f34611d0.size() > 1) {
                j4Var.G();
                return true;
            }
            dismiss(false);
            return true;
        }
    }

    @Override
    public final void release() {
        this.f38798r = true;
        j4 j4Var = this.K;
        n3 n3Var = j4Var.f34627u0[0];
        if (n3Var != null && n3Var.h) {
            k3 k3Var = n3Var.e;
            k3Var.setSwipeOffsetY((-k3Var.f8536f) + k3Var.e);
            j4Var.f34627u0[0].h = false;
        }
        n3 n3Var2 = j4Var.f34627u0[0];
        if (n3Var2 != null && !n3Var2.E) {
            if (n3Var2.getWebView() != null) {
                n3Var2.getWebView().onPause();
            }
            n3Var2.E = true;
        }
        n3 n3Var3 = j4Var.f34627u0[1];
        if (n3Var3 != null && !n3Var3.E) {
            if (n3Var3.getWebView() != null) {
                n3Var3.getWebView().onPause();
            }
            n3Var3.E = true;
        }
        org.telegram.ui.ActionBar.j3 j3Var = this.e;
        if (j3Var != null) {
            j3Var.c();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f38794b;
        if (o2Var != null) {
            o2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.f38795c);
            }
        }
        ai.d5 d5Var = this.v;
        if (d5Var != null) {
            d5Var.run();
            this.v = null;
        }
        j4.f34583b1.remove(j4Var);
    }

    @Override
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        j4 j4Var = this.K;
        j4Var.f34627u0[0].setLastVisible(z10);
        j4Var.f34627u0[1].setLastVisible(false);
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
        this.f38797n = z10;
        if (z10) {
            LaunchActivity.G1.f31148y0.b(this);
        } else {
            e(true, new hu0(this, 10));
        }
        i();
        h();
    }

    @Override
    public final org.telegram.ui.ActionBar.v3 mo37getWindowView() {
        return this.f38795c;
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
