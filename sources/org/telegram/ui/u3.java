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
public final class u3 implements org.telegram.ui.ActionBar.j2, org.telegram.ui.ActionBar.u3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final h4 K;
    public final AnimationNotificationsLocker f37786a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.n2 f37787b;
    public final t3 f37788c;
    public View d;
    public org.telegram.ui.ActionBar.i3 e;
    public boolean f37789f;
    public boolean h;
    public boolean f37790n;
    public boolean f37791r;
    public boolean f37792s;
    public ai.e5 v;
    public float f37793w;
    public float f37794x;
    public ValueAnimator f37795y;

    public u3(h4 h4Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.K = h4Var;
        this.f37787b = n2Var;
        n2Var.getResourceProvider();
        t3 t3Var = new t3(this, n2Var.getContext());
        this.f37788c = t3Var;
        new ci.j4(t3Var, true, new s3(this, 0));
    }

    @Override
    public final org.telegram.ui.ActionBar.n3 a() {
        int w02;
        int w03;
        float progress;
        org.telegram.ui.ActionBar.n3 n3Var = new org.telegram.ui.ActionBar.n3();
        h4 h4Var = this.K;
        n3Var.E = h4Var.f34078h0.getTitle();
        n3Var.J = h4Var;
        l3 l3Var = h4Var.f34090u0[0];
        Bitmap bitmap = null;
        if (l3Var != null && SharedConfig.adaptableColorInBrowser) {
            w02 = l3Var.getActionBarColor();
        } else {
            w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Pk, false);
        }
        n3Var.f19435q = w02;
        l3 l3Var2 = h4Var.f34090u0[0];
        if (l3Var2 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = l3Var2.getBackgroundColor();
        } else {
            w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Pk, false);
        }
        n3Var.f19436r = w03;
        n3Var.f19432n = true;
        if (!this.F) {
            progress = 0.0f;
        } else {
            progress = h4Var.f34090u0[0].getProgress();
        }
        n3Var.I = progress;
        l3 l3Var3 = h4Var.f34090u0[0];
        n3Var.f19424c = l3Var3;
        if (l3Var3 != null && l3Var3.getWebView() != null) {
            bitmap = h4Var.f34090u0[0].getWebView().getFavicon();
        }
        n3Var.F = bitmap;
        l3 l3Var4 = n3Var.f19424c;
        if (l3Var4 != null) {
            n3Var.f19426g = l3Var4.getWidth();
            n3Var.h = n3Var.f19424c.getHeight();
        }
        n3Var.f19427i = l();
        n3Var.D = org.telegram.ui.ActionBar.i6.I.q();
        return n3Var;
    }

    @Override
    public final boolean attachedToParent() {
        return this.f37788c.isAttachedToWindow();
    }

    @Override
    public final boolean b() {
        return this.f37789f;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.i3 i3Var) {
        this.e = i3Var;
        if (i3Var != null) {
            this.f37789f = true;
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
        float f10 = this.f37794x;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new r3(this, 2));
        this.E.addListener(new androidx.fragment.app.g(this, z10, mu0Var, 2));
        this.E.setInterpolator(org.telegram.ui.Components.qr.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f37795y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37793w, 1.0f);
        this.f37795y = ofFloat;
        ofFloat.addUpdateListener(new r3(this, 1));
        this.f37795y.addListener(new ai.b(this, 28));
        this.f37795y.setInterpolator(org.telegram.ui.Components.qr.h);
        this.f37795y.setDuration(320L);
        this.f37795y.start();
    }

    public final void g(org.telegram.ui.ActionBar.n2 n2Var) {
        bo boVar;
        mk mkVar;
        this.f37791r = false;
        this.f37787b = n2Var;
        n2Var.getResourceProvider();
        if ((n2Var instanceof bo) && (mkVar = (boVar = (bo) n2Var).Y) != null) {
            mkVar.Q();
            boVar.Y.o0(true, false, true);
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
            t3 t3Var = this.f37788c;
            AndroidUtilities.removeFromParent(t3Var);
            if (n2Var.getLayoutContainer() != null) {
                n2Var.getLayoutContainer().addView(t3Var);
            }
        }
        h4 h4Var = this.K;
        l3 l3Var = h4Var.f34090u0[0];
        if (l3Var != null && l3Var.E) {
            if (l3Var.getWebView() != null) {
                l3Var.getWebView().onResume();
            }
            l3Var.E = false;
        }
        l3 l3Var2 = h4Var.f34090u0[1];
        if (l3Var2 != null && l3Var2.E) {
            if (l3Var2.getWebView() != null) {
                l3Var2.getWebView().onResume();
            }
            l3Var2.E = false;
        }
        h4.f34046b1.add(h4Var);
    }

    @Override
    public final org.telegram.ui.Components.vc getBulletinFactory() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u3.getBulletinFactory():org.telegram.ui.Components.vc");
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        float min;
        if (this.f37790n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f37793w, 1.0f - this.f37794x) * (1.0f - this.I);
        }
        int j3 = j();
        k0 k0Var = this.K.f34078h0;
        if (k0Var != null) {
            j3 = i0.a.d(k0Var.f39111a0, j3, k0Var.f39140x);
        }
        return i0.a.d(min, i10, j3);
    }

    @Override
    public final View getWindowView() {
        return this.f37788c;
    }

    public final void h() {
        if (this.f37792s != isFullyVisible()) {
            this.f37792s = isFullyVisible();
            org.telegram.ui.ActionBar.n2 n2Var = this.f37787b;
            if (n2Var != null && (n2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f37787b.getParentLayout();
                org.telegram.ui.ActionBar.w wVar = actionBarLayout.f18413s;
                if (wVar != null) {
                    wVar.invalidate();
                }
                org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.f18418w;
                if (wVar2 != null) {
                    wVar2.invalidate();
                    return;
                }
                return;
            }
            t3 t3Var = this.f37788c;
            if (t3Var.getParent() instanceof View) {
                ((View) t3Var.getParent()).invalidate();
            }
        }
    }

    public final void i() {
        View view;
        org.telegram.ui.ActionBar.i3 i3Var = this.e;
        t3 t3Var = this.f37788c;
        if (i3Var != null) {
            view = i3Var.f18753b;
        } else {
            view = t3Var;
        }
        AndroidUtilities.setLightStatusBar(view, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.i3 i3Var2 = this.e;
        boolean z10 = false;
        if (i3Var2 != null) {
            int navigationBarColor = i3Var2.f18752a.getNavigationBarColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18778a7, false));
            i3Var2.d.setColor(navigationBarColor);
            i3Var2.f18754c.invalidate();
            AndroidUtilities.setNavigationBarColor(i3Var2, navigationBarColor);
            if (AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(i3Var2, z10);
            LaunchActivity.G1.H(true, true, true);
            return;
        }
        LaunchActivity.G1.H(true, true, true);
        if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18778a7, false))) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(t3Var, z10);
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        float min;
        int d;
        float f7 = 0.0f;
        if (this.f37790n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.I) * Math.min(this.f37793w, 1.0f - this.f37794x);
        }
        if (this.F && min > 0.25f) {
            if (!SharedConfig.adaptableColorInBrowser) {
                d = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Pk, false);
            } else {
                h4 h4Var = this.K;
                if (h4Var.f34090u0[0].getVisibility() == 0) {
                    f7 = 1.0f - (h4Var.f34090u0[0].getTranslationX() / h4Var.f34090u0[0].getWidth());
                }
                d = i0.a.d(1.0f - f7, h4Var.f34090u0[0].getActionBarColor(), h4Var.f34090u0[1].getActionBarColor());
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        if (this.G && this.f37794x <= 0.0f && this.f37793w >= 1.0f && this.I <= 0.0f && !this.f37790n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isShown() {
        t3 t3Var;
        if (this.h || this.f37791r || this.f37793w <= 0.5f || (t3Var = this.f37788c) == null || !t3Var.isAttachedToWindow() || AndroidUtilities.lerp(t3Var.H0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(t3Var.A0.f22951c)) >= t3Var.getHeight() || this.I >= 1.0f) {
            return false;
        }
        return true;
    }

    public final int j() {
        float translationX;
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sk, false);
        }
        h4 h4Var = this.K;
        if (h4Var.f34090u0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (h4Var.f34090u0[0].getTranslationX() / h4Var.f34090u0[0].getWidth());
        }
        return i0.a.d(1.0f - translationX, h4Var.f34090u0[0].getBackgroundColor(), h4Var.f34090u0[1].getBackgroundColor());
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
        return org.telegram.messenger.y0.z(20.0f, l(), dp + height);
    }

    public final int l() {
        float f7;
        h4 h4Var = this.K;
        int i10 = 0;
        l3 l3Var = h4Var.f34090u0[0];
        if (l3Var != null && l3Var.getVisibility() == 0) {
            f7 = 1.0f - (h4Var.f34090u0[0].getTranslationX() / h4Var.f34090u0[0].getWidth());
        } else {
            f7 = 0.0f;
        }
        float f10 = 1.0f - f7;
        l3 l3Var2 = h4Var.f34090u0[0];
        if (l3Var2 != null && l3Var2.getVisibility() == 0) {
            i10 = (int) (h4Var.f34090u0[0].getAlpha() * h4Var.f34090u0[0].getListTop() * f7);
        }
        l3 l3Var3 = h4Var.f34090u0[1];
        if (l3Var3 != null && l3Var3.getVisibility() == 0) {
            return i10 + ((int) (h4Var.f34090u0[1].getAlpha() * h4Var.f34090u0[1].getListTop() * f10));
        }
        return i10;
    }

    public final void m() {
        h4 h4Var = this.K;
        h4Var.f34090u0[0].setLastVisible(this.J);
        h4Var.f34090u0[1].setLastVisible(false);
    }

    public final void n() {
        float f7;
        View view = this.d;
        if (view == null) {
            return;
        }
        float k10 = k();
        float f10 = 1.0f - this.f37793w;
        if (this.f37790n) {
            f7 = 0.0f;
        } else {
            f7 = this.f37794x;
        }
        view.setTranslationY(Math.max(f10, f7) * k10);
        this.f37788c.invalidate();
    }

    @Override
    public final boolean onAttachedBackPressed() {
        h4 h4Var = this.K;
        if (h4Var.f34084o0) {
            AndroidUtilities.hideKeyboard(this.f37788c);
            return true;
        }
        k0 k0Var = h4Var.f34078h0;
        if (k0Var.T) {
            k0Var.h(false);
            return true;
        } else if (k0Var.W) {
            k0Var.k(false);
            return true;
        } else {
            if (h4Var.J()) {
                l3 l3Var = h4Var.f34090u0[0];
                if (l3Var.f35312s) {
                    if (l3Var.f() && l3Var.getWebView() != null) {
                        l3Var.getWebView().goBack();
                    }
                    return true;
                }
            }
            if (h4Var.f34074d0.size() > 1) {
                h4Var.G();
                return true;
            }
            dismiss(false);
            return true;
        }
    }

    @Override
    public final void release() {
        this.f37791r = true;
        h4 h4Var = this.K;
        l3 l3Var = h4Var.f34090u0[0];
        if (l3Var != null && l3Var.h) {
            i3 i3Var = l3Var.e;
            i3Var.setSwipeOffsetY((-i3Var.f8548f) + i3Var.e);
            h4Var.f34090u0[0].h = false;
        }
        l3 l3Var2 = h4Var.f34090u0[0];
        if (l3Var2 != null && !l3Var2.E) {
            if (l3Var2.getWebView() != null) {
                l3Var2.getWebView().onPause();
            }
            l3Var2.E = true;
        }
        l3 l3Var3 = h4Var.f34090u0[1];
        if (l3Var3 != null && !l3Var3.E) {
            if (l3Var3.getWebView() != null) {
                l3Var3.getWebView().onPause();
            }
            l3Var3.E = true;
        }
        org.telegram.ui.ActionBar.i3 i3Var2 = this.e;
        if (i3Var2 != null) {
            i3Var2.c();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f37787b;
        if (n2Var != null) {
            n2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.f37788c);
            }
        }
        ai.e5 e5Var = this.v;
        if (e5Var != null) {
            e5Var.run();
            this.v = null;
        }
        h4.f34046b1.remove(h4Var);
    }

    @Override
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        h4 h4Var = this.K;
        h4Var.f34090u0[0].setLastVisible(z10);
        h4Var.f34090u0[1].setLastVisible(false);
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
        this.f37790n = z10;
        if (z10) {
            LaunchActivity.G1.f30857y0.b(this);
        } else {
            e(true, new mu0(this, 10));
        }
        i();
        h();
    }

    @Override
    public final org.telegram.ui.ActionBar.v3 mo37getWindowView() {
        return this.f37788c;
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
