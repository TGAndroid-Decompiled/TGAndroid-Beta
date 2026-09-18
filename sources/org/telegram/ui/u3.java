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
public final class u3 implements org.telegram.ui.ActionBar.k2, org.telegram.ui.ActionBar.v3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final h4 K;
    public final AnimationNotificationsLocker f37924a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.o2 f37925b;
    public final t3 f37926c;
    public View d;
    public org.telegram.ui.ActionBar.j3 e;
    public boolean f37927f;
    public boolean h;
    public boolean f37928n;
    public boolean f37929r;
    public boolean f37930s;
    public ai.e5 v;
    public float f37931w;
    public float f37932x;
    public ValueAnimator f37933y;

    public u3(h4 h4Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.K = h4Var;
        this.f37925b = o2Var;
        o2Var.getResourceProvider();
        t3 t3Var = new t3(this, o2Var.getContext());
        this.f37926c = t3Var;
        new ci.j4(t3Var, true, new s3(this, 0));
    }

    @Override
    public final org.telegram.ui.ActionBar.o3 a() {
        int w02;
        int w03;
        float progress;
        org.telegram.ui.ActionBar.o3 o3Var = new org.telegram.ui.ActionBar.o3();
        h4 h4Var = this.K;
        o3Var.E = h4Var.f34161h0.getTitle();
        o3Var.J = h4Var;
        l3 l3Var = h4Var.f34173u0[0];
        Bitmap bitmap = null;
        if (l3Var != null && SharedConfig.adaptableColorInBrowser) {
            w02 = l3Var.getActionBarColor();
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        o3Var.f19467q = w02;
        l3 l3Var2 = h4Var.f34173u0[0];
        if (l3Var2 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = l3Var2.getBackgroundColor();
        } else {
            w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        o3Var.f19468r = w03;
        o3Var.f19464n = true;
        if (!this.F) {
            progress = 0.0f;
        } else {
            progress = h4Var.f34173u0[0].getProgress();
        }
        o3Var.I = progress;
        l3 l3Var3 = h4Var.f34173u0[0];
        o3Var.f19456c = l3Var3;
        if (l3Var3 != null && l3Var3.getWebView() != null) {
            bitmap = h4Var.f34173u0[0].getWebView().getFavicon();
        }
        o3Var.F = bitmap;
        l3 l3Var4 = o3Var.f19456c;
        if (l3Var4 != null) {
            o3Var.f19458g = l3Var4.getWidth();
            o3Var.h = o3Var.f19456c.getHeight();
        }
        o3Var.f19459i = l();
        o3Var.D = org.telegram.ui.ActionBar.j6.I.q();
        return o3Var;
    }

    @Override
    public final boolean attachedToParent() {
        return this.f37926c.isAttachedToWindow();
    }

    @Override
    public final boolean b() {
        return this.f37927f;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.j3 j3Var) {
        this.e = j3Var;
        if (j3Var != null) {
            this.f37927f = true;
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

    public final void e(boolean z10, ou0 ou0Var) {
        float f7;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f37932x;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new r3(this, 2));
        this.E.addListener(new androidx.fragment.app.g(this, z10, ou0Var, 2));
        this.E.setInterpolator(org.telegram.ui.Components.qr.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f37933y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37931w, 1.0f);
        this.f37933y = ofFloat;
        ofFloat.addUpdateListener(new r3(this, 1));
        this.f37933y.addListener(new ai.b(this, 28));
        this.f37933y.setInterpolator(org.telegram.ui.Components.qr.h);
        this.f37933y.setDuration(320L);
        this.f37933y.start();
    }

    public final void g(org.telegram.ui.ActionBar.o2 o2Var) {
        bo boVar;
        nk nkVar;
        this.f37929r = false;
        this.f37925b = o2Var;
        o2Var.getResourceProvider();
        if ((o2Var instanceof bo) && (nkVar = (boVar = (bo) o2Var).Y) != null) {
            nkVar.Q();
            boVar.Y.o0(true, false, true);
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
            t3 t3Var = this.f37926c;
            AndroidUtilities.removeFromParent(t3Var);
            if (o2Var.getLayoutContainer() != null) {
                o2Var.getLayoutContainer().addView(t3Var);
            }
        }
        h4 h4Var = this.K;
        l3 l3Var = h4Var.f34173u0[0];
        if (l3Var != null && l3Var.E) {
            if (l3Var.getWebView() != null) {
                l3Var.getWebView().onResume();
            }
            l3Var.E = false;
        }
        l3 l3Var2 = h4Var.f34173u0[1];
        if (l3Var2 != null && l3Var2.E) {
            if (l3Var2.getWebView() != null) {
                l3Var2.getWebView().onResume();
            }
            l3Var2.E = false;
        }
        h4.f34129b1.add(h4Var);
    }

    @Override
    public final org.telegram.ui.Components.vc getBulletinFactory() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u3.getBulletinFactory():org.telegram.ui.Components.vc");
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        float min;
        if (this.f37928n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f37931w, 1.0f - this.f37932x) * (1.0f - this.I);
        }
        int j3 = j();
        k0 k0Var = this.K.f34161h0;
        if (k0Var != null) {
            j3 = i0.a.d(k0Var.f38955a0, j3, k0Var.f38984x);
        }
        return i0.a.d(min, i10, j3);
    }

    @Override
    public final View getWindowView() {
        return this.f37926c;
    }

    public final void h() {
        if (this.f37930s != isFullyVisible()) {
            this.f37930s = isFullyVisible();
            org.telegram.ui.ActionBar.o2 o2Var = this.f37925b;
            if (o2Var != null && (o2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f37925b.getParentLayout();
                org.telegram.ui.ActionBar.x xVar = actionBarLayout.f18425s;
                if (xVar != null) {
                    xVar.invalidate();
                }
                org.telegram.ui.ActionBar.x xVar2 = actionBarLayout.f18430w;
                if (xVar2 != null) {
                    xVar2.invalidate();
                    return;
                }
                return;
            }
            t3 t3Var = this.f37926c;
            if (t3Var.getParent() instanceof View) {
                ((View) t3Var.getParent()).invalidate();
            }
        }
    }

    public final void i() {
        View view;
        org.telegram.ui.ActionBar.j3 j3Var = this.e;
        t3 t3Var = this.f37926c;
        if (j3Var != null) {
            view = j3Var.f18782b;
        } else {
            view = t3Var;
        }
        AndroidUtilities.setLightStatusBar(view, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.j3 j3Var2 = this.e;
        boolean z10 = false;
        if (j3Var2 != null) {
            int navigationBarColor = j3Var2.f18781a.getNavigationBarColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18807a7, false));
            j3Var2.d.setColor(navigationBarColor);
            j3Var2.f18783c.invalidate();
            AndroidUtilities.setNavigationBarColor(j3Var2, navigationBarColor);
            if (AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(j3Var2, z10);
            LaunchActivity.G1.H(true, true, true);
            return;
        }
        LaunchActivity.G1.H(true, true, true);
        if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18807a7, false))) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(t3Var, z10);
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        float min;
        int d;
        float f7 = 0.0f;
        if (this.f37928n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.I) * Math.min(this.f37931w, 1.0f - this.f37932x);
        }
        if (this.F && min > 0.25f) {
            if (!SharedConfig.adaptableColorInBrowser) {
                d = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            } else {
                h4 h4Var = this.K;
                if (h4Var.f34173u0[0].getVisibility() == 0) {
                    f7 = 1.0f - (h4Var.f34173u0[0].getTranslationX() / h4Var.f34173u0[0].getWidth());
                }
                d = i0.a.d(1.0f - f7, h4Var.f34173u0[0].getActionBarColor(), h4Var.f34173u0[1].getActionBarColor());
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        if (this.G && this.f37932x <= 0.0f && this.f37931w >= 1.0f && this.I <= 0.0f && !this.f37928n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isShown() {
        t3 t3Var;
        if (this.h || this.f37929r || this.f37931w <= 0.5f || (t3Var = this.f37926c) == null || !t3Var.isAttachedToWindow() || AndroidUtilities.lerp(t3Var.H0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(t3Var.A0.f22940c)) >= t3Var.getHeight() || this.I >= 1.0f) {
            return false;
        }
        return true;
    }

    public final int j() {
        float translationX;
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sk, false);
        }
        h4 h4Var = this.K;
        if (h4Var.f34173u0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (h4Var.f34173u0[0].getTranslationX() / h4Var.f34173u0[0].getWidth());
        }
        return i0.a.d(1.0f - translationX, h4Var.f34173u0[0].getBackgroundColor(), h4Var.f34173u0[1].getBackgroundColor());
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
        h4 h4Var = this.K;
        int i10 = 0;
        l3 l3Var = h4Var.f34173u0[0];
        if (l3Var != null && l3Var.getVisibility() == 0) {
            f7 = 1.0f - (h4Var.f34173u0[0].getTranslationX() / h4Var.f34173u0[0].getWidth());
        } else {
            f7 = 0.0f;
        }
        float f10 = 1.0f - f7;
        l3 l3Var2 = h4Var.f34173u0[0];
        if (l3Var2 != null && l3Var2.getVisibility() == 0) {
            i10 = (int) (h4Var.f34173u0[0].getAlpha() * h4Var.f34173u0[0].getListTop() * f7);
        }
        l3 l3Var3 = h4Var.f34173u0[1];
        if (l3Var3 != null && l3Var3.getVisibility() == 0) {
            return i10 + ((int) (h4Var.f34173u0[1].getAlpha() * h4Var.f34173u0[1].getListTop() * f10));
        }
        return i10;
    }

    public final void m() {
        h4 h4Var = this.K;
        h4Var.f34173u0[0].setLastVisible(this.J);
        h4Var.f34173u0[1].setLastVisible(false);
    }

    public final void n() {
        float f7;
        View view = this.d;
        if (view == null) {
            return;
        }
        float k10 = k();
        float f10 = 1.0f - this.f37931w;
        if (this.f37928n) {
            f7 = 0.0f;
        } else {
            f7 = this.f37932x;
        }
        view.setTranslationY(Math.max(f10, f7) * k10);
        this.f37926c.invalidate();
    }

    @Override
    public final boolean onAttachedBackPressed() {
        h4 h4Var = this.K;
        if (h4Var.f34167o0) {
            AndroidUtilities.hideKeyboard(this.f37926c);
            return true;
        }
        k0 k0Var = h4Var.f34161h0;
        if (k0Var.T) {
            k0Var.h(false);
            return true;
        } else if (k0Var.W) {
            k0Var.k(false);
            return true;
        } else {
            if (h4Var.J()) {
                l3 l3Var = h4Var.f34173u0[0];
                if (l3Var.f35440s) {
                    if (l3Var.f() && l3Var.getWebView() != null) {
                        l3Var.getWebView().goBack();
                    }
                    return true;
                }
            }
            if (h4Var.f34157d0.size() > 1) {
                h4Var.G();
                return true;
            }
            dismiss(false);
            return true;
        }
    }

    @Override
    public final void release() {
        this.f37929r = true;
        h4 h4Var = this.K;
        l3 l3Var = h4Var.f34173u0[0];
        if (l3Var != null && l3Var.h) {
            i3 i3Var = l3Var.e;
            i3Var.setSwipeOffsetY((-i3Var.f8551f) + i3Var.e);
            h4Var.f34173u0[0].h = false;
        }
        l3 l3Var2 = h4Var.f34173u0[0];
        if (l3Var2 != null && !l3Var2.E) {
            if (l3Var2.getWebView() != null) {
                l3Var2.getWebView().onPause();
            }
            l3Var2.E = true;
        }
        l3 l3Var3 = h4Var.f34173u0[1];
        if (l3Var3 != null && !l3Var3.E) {
            if (l3Var3.getWebView() != null) {
                l3Var3.getWebView().onPause();
            }
            l3Var3.E = true;
        }
        org.telegram.ui.ActionBar.j3 j3Var = this.e;
        if (j3Var != null) {
            j3Var.c();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f37925b;
        if (o2Var != null) {
            o2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.f37926c);
            }
        }
        ai.e5 e5Var = this.v;
        if (e5Var != null) {
            e5Var.run();
            this.v = null;
        }
        h4.f34129b1.remove(h4Var);
    }

    @Override
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        h4 h4Var = this.K;
        h4Var.f34173u0[0].setLastVisible(z10);
        h4Var.f34173u0[1].setLastVisible(false);
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
        this.f37928n = z10;
        if (z10) {
            LaunchActivity.G1.f30877y0.b(this);
        } else {
            e(true, new ou0(this, 10));
        }
        i();
        h();
    }

    @Override
    public final org.telegram.ui.ActionBar.w3 mo37getWindowView() {
        return this.f37926c;
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
