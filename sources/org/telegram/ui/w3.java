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
public final class w3 implements org.telegram.ui.ActionBar.l2, org.telegram.ui.ActionBar.w3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final j4 K;
    public final AnimationNotificationsLocker f37685a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.p2 f37686b;
    public final v3 f37687c;
    public View d;
    public org.telegram.ui.ActionBar.k3 e;
    public boolean f37688f;
    public boolean h;
    public boolean f37689n;
    public boolean f37690r;
    public boolean f37691s;
    public zh.j2 v;
    public float f37692w;
    public float f37693x;
    public ValueAnimator f37694y;

    public w3(j4 j4Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.K = j4Var;
        this.f37686b = p2Var;
        p2Var.getResourceProvider();
        v3 v3Var = new v3(this, p2Var.getContext());
        this.f37687c = v3Var;
        new bi.b5(v3Var, true, new u3(this, 0));
    }

    @Override
    public final org.telegram.ui.ActionBar.p3 a() {
        int w02;
        int w03;
        float progress;
        org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3();
        j4 j4Var = this.K;
        p3Var.E = j4Var.f33908h0.getTitle();
        p3Var.J = j4Var;
        n3 n3Var = j4Var.f33920u0[0];
        Bitmap bitmap = null;
        if (n3Var != null && SharedConfig.adaptableColorInBrowser) {
            w02 = n3Var.getActionBarColor();
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        p3Var.f18553q = w02;
        n3 n3Var2 = j4Var.f33920u0[0];
        if (n3Var2 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = n3Var2.getBackgroundColor();
        } else {
            w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        p3Var.f18554r = w03;
        p3Var.f18550n = true;
        if (!this.F) {
            progress = 0.0f;
        } else {
            progress = j4Var.f33920u0[0].getProgress();
        }
        p3Var.I = progress;
        n3 n3Var3 = j4Var.f33920u0[0];
        p3Var.f18542c = n3Var3;
        if (n3Var3 != null && n3Var3.getWebView() != null) {
            bitmap = j4Var.f33920u0[0].getWebView().getFavicon();
        }
        p3Var.F = bitmap;
        n3 n3Var4 = p3Var.f18542c;
        if (n3Var4 != null) {
            p3Var.f18544g = n3Var4.getWidth();
            p3Var.h = p3Var.f18542c.getHeight();
        }
        p3Var.f18545i = l();
        p3Var.D = org.telegram.ui.ActionBar.j6.I.q();
        return p3Var;
    }

    @Override
    public final boolean attachedToParent() {
        return this.f37687c.isAttachedToWindow();
    }

    @Override
    public final boolean b() {
        return this.f37688f;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.k3 k3Var) {
        this.e = k3Var;
        if (k3Var != null) {
            this.f37688f = true;
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

    public final void e(boolean z10, mu0 mu0Var) {
        float f7;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f37693x;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new t3(this, 2));
        this.E.addListener(new androidx.fragment.app.g(this, z10, mu0Var, 2));
        this.E.setInterpolator(org.telegram.ui.Components.wr.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f37694y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37692w, 1.0f);
        this.f37694y = ofFloat;
        ofFloat.addUpdateListener(new t3(this, 1));
        this.f37694y.addListener(new bi.h(this, 18));
        this.f37694y.setInterpolator(org.telegram.ui.Components.wr.h);
        this.f37694y.setDuration(320L);
        this.f37694y.start();
    }

    public final void g(org.telegram.ui.ActionBar.p2 p2Var) {
        eo eoVar;
        ok okVar;
        this.f37690r = false;
        this.f37686b = p2Var;
        p2Var.getResourceProvider();
        if ((p2Var instanceof eo) && (okVar = (eoVar = (eo) p2Var).Y) != null) {
            okVar.P();
            eoVar.Y.n0(true, false, true);
        }
        org.telegram.ui.ActionBar.k3 k3Var = this.e;
        if (k3Var != null) {
            if (!k3Var.e) {
                k3Var.e = true;
                try {
                    k3Var.show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else {
            v3 v3Var = this.f37687c;
            AndroidUtilities.removeFromParent(v3Var);
            if (p2Var.getLayoutContainer() != null) {
                p2Var.getLayoutContainer().addView(v3Var);
            }
        }
        j4 j4Var = this.K;
        n3 n3Var = j4Var.f33920u0[0];
        if (n3Var != null && n3Var.E) {
            if (n3Var.getWebView() != null) {
                n3Var.getWebView().onResume();
            }
            n3Var.E = false;
        }
        n3 n3Var2 = j4Var.f33920u0[1];
        if (n3Var2 != null && n3Var2.E) {
            if (n3Var2.getWebView() != null) {
                n3Var2.getWebView().onResume();
            }
            n3Var2.E = false;
        }
        j4.f33876b1.add(j4Var);
    }

    @Override
    public final org.telegram.ui.Components.wc getBulletinFactory() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w3.getBulletinFactory():org.telegram.ui.Components.wc");
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        float min;
        if (this.f37689n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f37692w, 1.0f - this.f37693x) * (1.0f - this.I);
        }
        int j3 = j();
        l0 l0Var = this.K.f33908h0;
        if (l0Var != null) {
            j3 = i0.a.d(l0Var.f38101a0, j3, l0Var.f38130x);
        }
        return i0.a.d(min, i10, j3);
    }

    @Override
    public final View getWindowView() {
        return this.f37687c;
    }

    public final void h() {
        if (this.f37691s != isFullyVisible()) {
            this.f37691s = isFullyVisible();
            org.telegram.ui.ActionBar.p2 p2Var = this.f37686b;
            if (p2Var != null && (p2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f37686b.getParentLayout();
                org.telegram.ui.ActionBar.w wVar = actionBarLayout.f17506s;
                if (wVar != null) {
                    wVar.invalidate();
                }
                org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.f17511w;
                if (wVar2 != null) {
                    wVar2.invalidate();
                    return;
                }
                return;
            }
            v3 v3Var = this.f37687c;
            if (v3Var.getParent() instanceof View) {
                ((View) v3Var.getParent()).invalidate();
            }
        }
    }

    public final void i() {
        View view;
        org.telegram.ui.ActionBar.k3 k3Var = this.e;
        v3 v3Var = this.f37687c;
        if (k3Var != null) {
            view = k3Var.f18342b;
        } else {
            view = v3Var;
        }
        AndroidUtilities.setLightStatusBar(view, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.k3 k3Var2 = this.e;
        boolean z10 = false;
        if (k3Var2 != null) {
            int navigationBarColor = k3Var2.f18341a.getNavigationBarColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
            k3Var2.d.setColor(navigationBarColor);
            k3Var2.f18343c.invalidate();
            AndroidUtilities.setNavigationBarColor(k3Var2, navigationBarColor);
            if (AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(k3Var2, z10);
            LaunchActivity.G1.H(true, true, true);
            return;
        }
        LaunchActivity.G1.H(true, true, true);
        if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false))) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(v3Var, z10);
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        float min;
        int d;
        float f7 = 0.0f;
        if (this.f37689n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.I) * Math.min(this.f37692w, 1.0f - this.f37693x);
        }
        if (this.F && min > 0.25f) {
            if (!SharedConfig.adaptableColorInBrowser) {
                d = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            } else {
                j4 j4Var = this.K;
                if (j4Var.f33920u0[0].getVisibility() == 0) {
                    f7 = 1.0f - (j4Var.f33920u0[0].getTranslationX() / j4Var.f33920u0[0].getWidth());
                }
                d = i0.a.d(1.0f - f7, j4Var.f33920u0[0].getActionBarColor(), j4Var.f33920u0[1].getActionBarColor());
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        if (this.G && this.f37693x <= 0.0f && this.f37692w >= 1.0f && this.I <= 0.0f && !this.f37689n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isShown() {
        v3 v3Var;
        if (this.h || this.f37690r || this.f37692w <= 0.5f || (v3Var = this.f37687c) == null || !v3Var.isAttachedToWindow() || AndroidUtilities.lerp(v3Var.H0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(v3Var.A0.f22295c)) >= v3Var.getHeight() || this.I >= 1.0f) {
            return false;
        }
        return true;
    }

    public final int j() {
        float translationX;
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sk, false);
        }
        j4 j4Var = this.K;
        if (j4Var.f33920u0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (j4Var.f33920u0[0].getTranslationX() / j4Var.f33920u0[0].getWidth());
        }
        return i0.a.d(1.0f - translationX, j4Var.f33920u0[0].getBackgroundColor(), j4Var.f33920u0[1].getBackgroundColor());
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
        return org.telegram.messenger.a2.z(20.0f, l(), dp + height);
    }

    public final int l() {
        float f7;
        j4 j4Var = this.K;
        int i10 = 0;
        n3 n3Var = j4Var.f33920u0[0];
        if (n3Var != null && n3Var.getVisibility() == 0) {
            f7 = 1.0f - (j4Var.f33920u0[0].getTranslationX() / j4Var.f33920u0[0].getWidth());
        } else {
            f7 = 0.0f;
        }
        float f10 = 1.0f - f7;
        n3 n3Var2 = j4Var.f33920u0[0];
        if (n3Var2 != null && n3Var2.getVisibility() == 0) {
            i10 = (int) (j4Var.f33920u0[0].getAlpha() * j4Var.f33920u0[0].getListTop() * f7);
        }
        n3 n3Var3 = j4Var.f33920u0[1];
        if (n3Var3 != null && n3Var3.getVisibility() == 0) {
            return i10 + ((int) (j4Var.f33920u0[1].getAlpha() * j4Var.f33920u0[1].getListTop() * f10));
        }
        return i10;
    }

    public final void m() {
        j4 j4Var = this.K;
        j4Var.f33920u0[0].setLastVisible(this.J);
        j4Var.f33920u0[1].setLastVisible(false);
    }

    public final void n() {
        float f7;
        View view = this.d;
        if (view == null) {
            return;
        }
        float k10 = k();
        float f10 = 1.0f - this.f37692w;
        if (this.f37689n) {
            f7 = 0.0f;
        } else {
            f7 = this.f37693x;
        }
        view.setTranslationY(Math.max(f10, f7) * k10);
        this.f37687c.invalidate();
    }

    @Override
    public final boolean onAttachedBackPressed() {
        j4 j4Var = this.K;
        if (j4Var.f33914o0) {
            AndroidUtilities.hideKeyboard(this.f37687c);
            return true;
        }
        l0 l0Var = j4Var.f33908h0;
        if (l0Var.T) {
            l0Var.h(false);
            return true;
        } else if (l0Var.W) {
            l0Var.k(false);
            return true;
        } else {
            if (j4Var.J()) {
                n3 n3Var = j4Var.f33920u0[0];
                if (n3Var.f35107s) {
                    if (n3Var.f() && n3Var.getWebView() != null) {
                        n3Var.getWebView().goBack();
                    }
                    return true;
                }
            }
            if (j4Var.f33904d0.size() > 1) {
                j4Var.G();
                return true;
            }
            dismiss(false);
            return true;
        }
    }

    @Override
    public final void release() {
        this.f37690r = true;
        j4 j4Var = this.K;
        n3 n3Var = j4Var.f33920u0[0];
        if (n3Var != null && n3Var.h) {
            k3 k3Var = n3Var.e;
            k3Var.setSwipeOffsetY((-k3Var.f6919f) + k3Var.e);
            j4Var.f33920u0[0].h = false;
        }
        n3 n3Var2 = j4Var.f33920u0[0];
        if (n3Var2 != null && !n3Var2.E) {
            if (n3Var2.getWebView() != null) {
                n3Var2.getWebView().onPause();
            }
            n3Var2.E = true;
        }
        n3 n3Var3 = j4Var.f33920u0[1];
        if (n3Var3 != null && !n3Var3.E) {
            if (n3Var3.getWebView() != null) {
                n3Var3.getWebView().onPause();
            }
            n3Var3.E = true;
        }
        org.telegram.ui.ActionBar.k3 k3Var2 = this.e;
        if (k3Var2 != null) {
            k3Var2.c();
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f37686b;
        if (p2Var != null) {
            p2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.f37687c);
            }
        }
        zh.j2 j2Var = this.v;
        if (j2Var != null) {
            j2Var.run();
            this.v = null;
        }
        j4.f33876b1.remove(j4Var);
    }

    @Override
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        j4 j4Var = this.K;
        j4Var.f33920u0[0].setLastVisible(z10);
        j4Var.f33920u0[1].setLastVisible(false);
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (zh.j2) runnable;
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
        this.f37689n = z10;
        if (z10) {
            LaunchActivity.G1.f29973y0.b(this);
        } else {
            e(true, new mu0(this, 10));
        }
        i();
        h();
    }

    @Override
    public final org.telegram.ui.ActionBar.x3 mo37getWindowView() {
        return this.f37687c;
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
