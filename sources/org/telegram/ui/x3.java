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
public final class x3 implements org.telegram.ui.ActionBar.i2, org.telegram.ui.ActionBar.s3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final k4 K;
    public final AnimationNotificationsLocker f41728a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.m2 f41729b;
    public final w3 f41730c;
    public View d;
    public org.telegram.ui.ActionBar.h3 e;
    public boolean f41731f;
    public boolean h;
    public boolean f41732n;
    public boolean f41733r;
    public boolean f41734s;
    public bi.r4 v;
    public float f41735w;
    public float f41736x;
    public ValueAnimator f41737y;

    public x3(k4 k4Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.K = k4Var;
        this.f41729b = m2Var;
        m2Var.getResourceProvider();
        w3 w3Var = new w3(this, m2Var.getContext());
        this.f41730c = w3Var;
        new di.h4(w3Var, true, new v3(this, 0));
    }

    @Override
    public final org.telegram.ui.ActionBar.l3 a() {
        int x02;
        int x03;
        float progress;
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3();
        k4 k4Var = this.K;
        l3Var.E = k4Var.f37545h0.getTitle();
        l3Var.J = k4Var;
        o3 o3Var = k4Var.f37557u0[0];
        Bitmap bitmap = null;
        if (o3Var != null && SharedConfig.adaptableColorInBrowser) {
            x02 = o3Var.getActionBarColor();
        } else {
            x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false);
        }
        l3Var.f20498q = x02;
        o3 o3Var2 = k4Var.f37557u0[0];
        if (o3Var2 != null && SharedConfig.adaptableColorInBrowser) {
            x03 = o3Var2.getBackgroundColor();
        } else {
            x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false);
        }
        l3Var.f20499r = x03;
        l3Var.f20495n = true;
        if (!this.F) {
            progress = 0.0f;
        } else {
            progress = k4Var.f37557u0[0].getProgress();
        }
        l3Var.I = progress;
        o3 o3Var3 = k4Var.f37557u0[0];
        l3Var.f20487c = o3Var3;
        if (o3Var3 != null && o3Var3.getWebView() != null) {
            bitmap = k4Var.f37557u0[0].getWebView().getFavicon();
        }
        l3Var.F = bitmap;
        o3 o3Var4 = l3Var.f20487c;
        if (o3Var4 != null) {
            l3Var.f20489g = o3Var4.getWidth();
            l3Var.h = l3Var.f20487c.getHeight();
        }
        l3Var.f20490i = l();
        l3Var.D = org.telegram.ui.ActionBar.g6.I.q();
        return l3Var;
    }

    @Override
    public final boolean attachedToParent() {
        return this.f41730c.isAttachedToWindow();
    }

    @Override
    public final boolean b() {
        return this.f41731f;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.h3 h3Var) {
        this.e = h3Var;
        if (h3Var != null) {
            this.f41731f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        ofFloat.addUpdateListener(new u3(this, 0));
        return ofFloat;
    }

    @Override
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z10, tu0 tu0Var) {
        float f7;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f41736x;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new u3(this, 2));
        this.E.addListener(new ah.q0(this, z10, tu0Var, 3));
        this.E.setInterpolator(org.telegram.ui.Components.es.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f41737y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41735w, 1.0f);
        this.f41737y = ofFloat;
        ofFloat.addUpdateListener(new u3(this, 1));
        this.f41737y.addListener(new u0(this, 1));
        this.f41737y.setInterpolator(org.telegram.ui.Components.es.h);
        this.f41737y.setDuration(320L);
        this.f41737y.start();
    }

    public final void g(org.telegram.ui.ActionBar.m2 m2Var) {
        fo foVar;
        sk skVar;
        this.f41733r = false;
        this.f41729b = m2Var;
        m2Var.getResourceProvider();
        if ((m2Var instanceof fo) && (skVar = (foVar = (fo) m2Var).Y) != null) {
            skVar.N();
            foVar.Y.l0(true, false, true);
        }
        org.telegram.ui.ActionBar.h3 h3Var = this.e;
        if (h3Var != null) {
            if (!h3Var.e) {
                h3Var.e = true;
                try {
                    h3Var.show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else {
            w3 w3Var = this.f41730c;
            AndroidUtilities.removeFromParent(w3Var);
            if (m2Var.getLayoutContainer() != null) {
                m2Var.getLayoutContainer().addView(w3Var);
            }
        }
        k4 k4Var = this.K;
        o3 o3Var = k4Var.f37557u0[0];
        if (o3Var != null && o3Var.E) {
            if (o3Var.getWebView() != null) {
                o3Var.getWebView().onResume();
            }
            o3Var.E = false;
        }
        o3 o3Var2 = k4Var.f37557u0[1];
        if (o3Var2 != null && o3Var2.E) {
            if (o3Var2.getWebView() != null) {
                o3Var2.getWebView().onResume();
            }
            o3Var2.E = false;
        }
        k4.f37513b1.add(k4Var);
    }

    @Override
    public final org.telegram.ui.Components.zc getBulletinFactory() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x3.getBulletinFactory():org.telegram.ui.Components.zc");
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        float min;
        if (this.f41732n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f41735w, 1.0f - this.f41736x) * (1.0f - this.I);
        }
        int j10 = j();
        m0 m0Var = this.K.f37545h0;
        if (m0Var != null) {
            j10 = i0.a.d(m0Var.f41501a0, j10, m0Var.f41530x);
        }
        return i0.a.d(min, i10, j10);
    }

    @Override
    public final View getWindowView() {
        return this.f41730c;
    }

    public final void h() {
        if (this.f41734s != isFullyVisible()) {
            this.f41734s = isFullyVisible();
            org.telegram.ui.ActionBar.m2 m2Var = this.f41729b;
            if (m2Var != null && (m2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f41729b.getParentLayout();
                org.telegram.ui.ActionBar.v vVar = actionBarLayout.f19526s;
                if (vVar != null) {
                    vVar.invalidate();
                }
                org.telegram.ui.ActionBar.v vVar2 = actionBarLayout.f19531w;
                if (vVar2 != null) {
                    vVar2.invalidate();
                    return;
                }
                return;
            }
            w3 w3Var = this.f41730c;
            if (w3Var.getParent() instanceof View) {
                ((View) w3Var.getParent()).invalidate();
            }
        }
    }

    public final void i() {
        View view;
        org.telegram.ui.ActionBar.h3 h3Var = this.e;
        w3 w3Var = this.f41730c;
        if (h3Var != null) {
            view = h3Var.f20323b;
        } else {
            view = w3Var;
        }
        AndroidUtilities.setLightStatusBar(view, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.h3 h3Var2 = this.e;
        boolean z10 = false;
        if (h3Var2 != null) {
            int navigationBarColor = h3Var2.f20322a.getNavigationBarColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
            h3Var2.d.setColor(navigationBarColor);
            h3Var2.f20324c.invalidate();
            AndroidUtilities.setNavigationBarColor(h3Var2, navigationBarColor);
            if (AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(h3Var2, z10);
            LaunchActivity.G1.H(true, true, true);
            return;
        }
        LaunchActivity.G1.H(true, true, true);
        if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false))) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(w3Var, z10);
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        float min;
        int d;
        float f7 = 0.0f;
        if (this.f41732n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.I) * Math.min(this.f41735w, 1.0f - this.f41736x);
        }
        if (this.F && min > 0.25f) {
            if (!SharedConfig.adaptableColorInBrowser) {
                d = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false);
            } else {
                k4 k4Var = this.K;
                if (k4Var.f37557u0[0].getVisibility() == 0) {
                    f7 = 1.0f - (k4Var.f37557u0[0].getTranslationX() / k4Var.f37557u0[0].getWidth());
                }
                d = i0.a.d(1.0f - f7, k4Var.f37557u0[0].getActionBarColor(), k4Var.f37557u0[1].getActionBarColor());
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        if (this.G && this.f41736x <= 0.0f && this.f41735w >= 1.0f && this.I <= 0.0f && !this.f41732n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isShown() {
        w3 w3Var;
        if (this.h || this.f41733r || this.f41735w <= 0.5f || (w3Var = this.f41730c) == null || !w3Var.isAttachedToWindow() || AndroidUtilities.lerp(w3Var.H0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(w3Var.A0.f25190c)) >= w3Var.getHeight() || this.I >= 1.0f) {
            return false;
        }
        return true;
    }

    public final int j() {
        float translationX;
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sk, false);
        }
        k4 k4Var = this.K;
        if (k4Var.f37557u0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (k4Var.f37557u0[0].getTranslationX() / k4Var.f37557u0[0].getWidth());
        }
        return i0.a.d(1.0f - translationX, k4Var.f37557u0[0].getBackgroundColor(), k4Var.f37557u0[1].getBackgroundColor());
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
        return org.telegram.messenger.q.C(20.0f, l(), dp + height);
    }

    public final int l() {
        float f7;
        k4 k4Var = this.K;
        int i10 = 0;
        o3 o3Var = k4Var.f37557u0[0];
        if (o3Var != null && o3Var.getVisibility() == 0) {
            f7 = 1.0f - (k4Var.f37557u0[0].getTranslationX() / k4Var.f37557u0[0].getWidth());
        } else {
            f7 = 0.0f;
        }
        float f10 = 1.0f - f7;
        o3 o3Var2 = k4Var.f37557u0[0];
        if (o3Var2 != null && o3Var2.getVisibility() == 0) {
            i10 = (int) (k4Var.f37557u0[0].getAlpha() * k4Var.f37557u0[0].getListTop() * f7);
        }
        o3 o3Var3 = k4Var.f37557u0[1];
        if (o3Var3 != null && o3Var3.getVisibility() == 0) {
            return i10 + ((int) (k4Var.f37557u0[1].getAlpha() * k4Var.f37557u0[1].getListTop() * f10));
        }
        return i10;
    }

    public final void m() {
        k4 k4Var = this.K;
        k4Var.f37557u0[0].setLastVisible(this.J);
        k4Var.f37557u0[1].setLastVisible(false);
    }

    public final void n() {
        float f7;
        View view = this.d;
        if (view == null) {
            return;
        }
        float k10 = k();
        float f10 = 1.0f - this.f41735w;
        if (this.f41732n) {
            f7 = 0.0f;
        } else {
            f7 = this.f41736x;
        }
        view.setTranslationY(Math.max(f10, f7) * k10);
        this.f41730c.invalidate();
    }

    @Override
    public final boolean onAttachedBackPressed() {
        k4 k4Var = this.K;
        if (k4Var.f37551o0) {
            AndroidUtilities.hideKeyboard(this.f41730c);
            return true;
        }
        m0 m0Var = k4Var.f37545h0;
        if (m0Var.T) {
            m0Var.h(false);
            return true;
        } else if (m0Var.W) {
            m0Var.k(false);
            return true;
        } else {
            if (k4Var.J()) {
                o3 o3Var = k4Var.f37557u0[0];
                if (o3Var.f38852s) {
                    if (o3Var.f() && o3Var.getWebView() != null) {
                        o3Var.getWebView().goBack();
                    }
                    return true;
                }
            }
            if (k4Var.f37541d0.size() > 1) {
                k4Var.G();
                return true;
            }
            dismiss(false);
            return true;
        }
    }

    @Override
    public final void release() {
        this.f41733r = true;
        k4 k4Var = this.K;
        o3 o3Var = k4Var.f37557u0[0];
        if (o3Var != null && o3Var.h) {
            l3 l3Var = o3Var.e;
            l3Var.setSwipeOffsetY((-l3Var.f9475f) + l3Var.e);
            k4Var.f37557u0[0].h = false;
        }
        o3 o3Var2 = k4Var.f37557u0[0];
        if (o3Var2 != null && !o3Var2.E) {
            if (o3Var2.getWebView() != null) {
                o3Var2.getWebView().onPause();
            }
            o3Var2.E = true;
        }
        o3 o3Var3 = k4Var.f37557u0[1];
        if (o3Var3 != null && !o3Var3.E) {
            if (o3Var3.getWebView() != null) {
                o3Var3.getWebView().onPause();
            }
            o3Var3.E = true;
        }
        org.telegram.ui.ActionBar.h3 h3Var = this.e;
        if (h3Var != null) {
            h3Var.c();
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f41729b;
        if (m2Var != null) {
            m2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.f41730c);
            }
        }
        bi.r4 r4Var = this.v;
        if (r4Var != null) {
            r4Var.run();
            this.v = null;
        }
        k4.f37513b1.remove(k4Var);
    }

    @Override
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        k4 k4Var = this.K;
        k4Var.f37557u0[0].setLastVisible(z10);
        k4Var.f37557u0[1].setLastVisible(false);
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (bi.r4) runnable;
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
        this.f41732n = z10;
        if (z10) {
            LaunchActivity.G1.f32149y0.b(this);
        } else {
            e(true, new tu0(this, 10));
        }
        i();
        h();
    }

    @Override
    public final org.telegram.ui.ActionBar.t3 mo36getWindowView() {
        return this.f41730c;
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
