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
public final class x3 implements org.telegram.ui.ActionBar.j2, org.telegram.ui.ActionBar.t3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final l4 K;
    public final AnimationNotificationsLocker f43009a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.n2 f43010b;
    public final w3 f43011c;
    public View d;
    public org.telegram.ui.ActionBar.i3 e;
    public boolean f43012f;
    public boolean h;
    public boolean f43013n;
    public boolean f43014r;
    public boolean f43015s;
    public ci.t3 v;
    public float f43016w;
    public float f43017x;
    public ValueAnimator f43018y;

    public x3(l4 l4Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.K = l4Var;
        this.f43010b = n2Var;
        n2Var.getResourceProvider();
        w3 w3Var = new w3(this, n2Var.getContext());
        this.f43011c = w3Var;
        new ei.b4(w3Var, true, new v3(this, 0));
    }

    @Override
    public final org.telegram.ui.ActionBar.m3 a() {
        int x02;
        int x03;
        float progress;
        org.telegram.ui.ActionBar.m3 m3Var = new org.telegram.ui.ActionBar.m3();
        l4 l4Var = this.K;
        m3Var.E = l4Var.f38766h0.getTitle();
        m3Var.J = l4Var;
        o3 o3Var = l4Var.f38778u0[0];
        Bitmap bitmap = null;
        if (o3Var != null && SharedConfig.adaptableColorInBrowser) {
            x02 = o3Var.getActionBarColor();
        } else {
            x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pk, false);
        }
        m3Var.f21595q = x02;
        o3 o3Var2 = l4Var.f38778u0[0];
        if (o3Var2 != null && SharedConfig.adaptableColorInBrowser) {
            x03 = o3Var2.getBackgroundColor();
        } else {
            x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pk, false);
        }
        m3Var.f21596r = x03;
        m3Var.f21592n = true;
        if (!this.F) {
            progress = 0.0f;
        } else {
            progress = l4Var.f38778u0[0].getProgress();
        }
        m3Var.I = progress;
        o3 o3Var3 = l4Var.f38778u0[0];
        m3Var.f21584c = o3Var3;
        if (o3Var3 != null && o3Var3.getWebView() != null) {
            bitmap = l4Var.f38778u0[0].getWebView().getFavicon();
        }
        m3Var.F = bitmap;
        o3 o3Var4 = m3Var.f21584c;
        if (o3Var4 != null) {
            m3Var.f21586g = o3Var4.getWidth();
            m3Var.h = m3Var.f21584c.getHeight();
        }
        m3Var.f21587i = l();
        m3Var.D = org.telegram.ui.ActionBar.h6.I.q();
        return m3Var;
    }

    @Override
    public final boolean attachedToParent() {
        return this.f43011c.isAttachedToWindow();
    }

    @Override
    public final boolean b() {
        return this.f43012f;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.i3 i3Var) {
        this.e = i3Var;
        if (i3Var != null) {
            this.f43012f = true;
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

    public final void e(boolean z10, st0 st0Var) {
        float f7;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f43017x;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new u3(this, 2));
        this.E.addListener(new ah.q0(this, z10, st0Var, 3));
        this.E.setInterpolator(org.telegram.ui.Components.bs.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f43018y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f43016w, 1.0f);
        this.f43018y = ofFloat;
        ofFloat.addUpdateListener(new u3(this, 1));
        this.f43018y.addListener(new m.a(this, 3));
        this.f43018y.setInterpolator(org.telegram.ui.Components.bs.h);
        this.f43018y.setDuration(320L);
        this.f43018y.start();
    }

    public final void g(org.telegram.ui.ActionBar.n2 n2Var) {
        qn qnVar;
        fk fkVar;
        this.f43014r = false;
        this.f43010b = n2Var;
        n2Var.getResourceProvider();
        if ((n2Var instanceof qn) && (fkVar = (qnVar = (qn) n2Var).Y) != null) {
            fkVar.N();
            qnVar.Y.l0(true, false, true);
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
            w3 w3Var = this.f43011c;
            AndroidUtilities.removeFromParent(w3Var);
            if (n2Var.getLayoutContainer() != null) {
                n2Var.getLayoutContainer().addView(w3Var);
            }
        }
        l4 l4Var = this.K;
        o3 o3Var = l4Var.f38778u0[0];
        if (o3Var != null && o3Var.E) {
            if (o3Var.getWebView() != null) {
                o3Var.getWebView().onResume();
            }
            o3Var.E = false;
        }
        o3 o3Var2 = l4Var.f38778u0[1];
        if (o3Var2 != null && o3Var2.E) {
            if (o3Var2.getWebView() != null) {
                o3Var2.getWebView().onResume();
            }
            o3Var2.E = false;
        }
        l4.f38734b1.add(l4Var);
    }

    @Override
    public final org.telegram.ui.Components.xc getBulletinFactory() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x3.getBulletinFactory():org.telegram.ui.Components.xc");
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        float min;
        if (this.f43013n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f43016w, 1.0f - this.f43017x) * (1.0f - this.I);
        }
        int j10 = j();
        n0 n0Var = this.K.f38766h0;
        if (n0Var != null) {
            j10 = i0.a.f(n0Var.f42786a0, j10, n0Var.f42815x);
        }
        return i0.a.f(min, i10, j10);
    }

    @Override
    public final View getWindowView() {
        return this.f43011c;
    }

    public final void h() {
        if (this.f43015s != isFullyVisible()) {
            this.f43015s = isFullyVisible();
            org.telegram.ui.ActionBar.n2 n2Var = this.f43010b;
            if (n2Var != null && (n2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f43010b.getParentLayout();
                org.telegram.ui.ActionBar.v vVar = actionBarLayout.f20583s;
                if (vVar != null) {
                    vVar.invalidate();
                }
                org.telegram.ui.ActionBar.v vVar2 = actionBarLayout.f20588w;
                if (vVar2 != null) {
                    vVar2.invalidate();
                    return;
                }
                return;
            }
            w3 w3Var = this.f43011c;
            if (w3Var.getParent() instanceof View) {
                ((View) w3Var.getParent()).invalidate();
            }
        }
    }

    public final void i() {
        View view;
        org.telegram.ui.ActionBar.i3 i3Var = this.e;
        w3 w3Var = this.f43011c;
        if (i3Var != null) {
            view = i3Var.f21412b;
        } else {
            view = w3Var;
        }
        AndroidUtilities.setLightStatusBar(view, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.i3 i3Var2 = this.e;
        boolean z10 = false;
        if (i3Var2 != null) {
            int navigationBarColor = i3Var2.f21411a.getNavigationBarColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20932a7, false));
            i3Var2.d.setColor(navigationBarColor);
            i3Var2.f21413c.invalidate();
            AndroidUtilities.setNavigationBarColor(i3Var2, navigationBarColor);
            if (AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(i3Var2, z10);
            LaunchActivity.H1.H(true, true, true);
            return;
        }
        LaunchActivity.H1.H(true, true, true);
        if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20932a7, false))) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(w3Var, z10);
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        float min;
        int f7;
        float f10 = 0.0f;
        if (this.f43013n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.I) * Math.min(this.f43016w, 1.0f - this.f43017x);
        }
        if (this.F && min > 0.25f) {
            if (!SharedConfig.adaptableColorInBrowser) {
                f7 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pk, false);
            } else {
                l4 l4Var = this.K;
                if (l4Var.f38778u0[0].getVisibility() == 0) {
                    f10 = 1.0f - (l4Var.f38778u0[0].getTranslationX() / l4Var.f38778u0[0].getWidth());
                }
                f7 = i0.a.f(1.0f - f10, l4Var.f38778u0[0].getActionBarColor(), l4Var.f38778u0[1].getActionBarColor());
            }
            if (AndroidUtilities.computePerceivedBrightness(f7) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        if (this.G && this.f43017x <= 0.0f && this.f43016w >= 1.0f && this.I <= 0.0f && !this.f43013n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isShown() {
        w3 w3Var;
        if (this.h || this.f43014r || this.f43016w <= 0.5f || (w3Var = this.f43011c) == null || !w3Var.isAttachedToWindow() || AndroidUtilities.lerp(w3Var.H0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(w3Var.A0.f26086c)) >= w3Var.getHeight() || this.I >= 1.0f) {
            return false;
        }
        return true;
    }

    public final int j() {
        float translationX;
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sk, false);
        }
        l4 l4Var = this.K;
        if (l4Var.f38778u0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (l4Var.f38778u0[0].getTranslationX() / l4Var.f38778u0[0].getWidth());
        }
        return i0.a.f(1.0f - translationX, l4Var.f38778u0[0].getBackgroundColor(), l4Var.f38778u0[1].getBackgroundColor());
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
        return org.telegram.messenger.g0.A(20.0f, l(), dp + height);
    }

    public final int l() {
        float f7;
        l4 l4Var = this.K;
        int i10 = 0;
        o3 o3Var = l4Var.f38778u0[0];
        if (o3Var != null && o3Var.getVisibility() == 0) {
            f7 = 1.0f - (l4Var.f38778u0[0].getTranslationX() / l4Var.f38778u0[0].getWidth());
        } else {
            f7 = 0.0f;
        }
        float f10 = 1.0f - f7;
        o3 o3Var2 = l4Var.f38778u0[0];
        if (o3Var2 != null && o3Var2.getVisibility() == 0) {
            i10 = (int) (l4Var.f38778u0[0].getAlpha() * l4Var.f38778u0[0].getListTop() * f7);
        }
        o3 o3Var3 = l4Var.f38778u0[1];
        if (o3Var3 != null && o3Var3.getVisibility() == 0) {
            return i10 + ((int) (l4Var.f38778u0[1].getAlpha() * l4Var.f38778u0[1].getListTop() * f10));
        }
        return i10;
    }

    public final void m() {
        l4 l4Var = this.K;
        l4Var.f38778u0[0].setLastVisible(this.J);
        l4Var.f38778u0[1].setLastVisible(false);
    }

    public final void n() {
        float f7;
        View view = this.d;
        if (view == null) {
            return;
        }
        float k10 = k();
        float f10 = 1.0f - this.f43016w;
        if (this.f43013n) {
            f7 = 0.0f;
        } else {
            f7 = this.f43017x;
        }
        view.setTranslationY(Math.max(f10, f7) * k10);
        this.f43011c.invalidate();
    }

    @Override
    public final boolean onAttachedBackPressed() {
        l4 l4Var = this.K;
        if (l4Var.f38772o0) {
            AndroidUtilities.hideKeyboard(this.f43011c);
            return true;
        }
        n0 n0Var = l4Var.f38766h0;
        if (n0Var.T) {
            n0Var.h(false);
            return true;
        } else if (n0Var.W) {
            n0Var.k(false);
            return true;
        } else {
            if (l4Var.J()) {
                o3 o3Var = l4Var.f38778u0[0];
                if (o3Var.f39758s) {
                    if (o3Var.f() && o3Var.getWebView() != null) {
                        o3Var.getWebView().goBack();
                    }
                    return true;
                }
            }
            if (l4Var.f38762d0.size() > 1) {
                l4Var.G();
                return true;
            }
            dismiss(false);
            return true;
        }
    }

    @Override
    public final void release() {
        this.f43014r = true;
        l4 l4Var = this.K;
        o3 o3Var = l4Var.f38778u0[0];
        if (o3Var != null && o3Var.h) {
            l3 l3Var = o3Var.e;
            l3Var.setSwipeOffsetY((-l3Var.f11185f) + l3Var.e);
            l4Var.f38778u0[0].h = false;
        }
        o3 o3Var2 = l4Var.f38778u0[0];
        if (o3Var2 != null && !o3Var2.E) {
            if (o3Var2.getWebView() != null) {
                o3Var2.getWebView().onPause();
            }
            o3Var2.E = true;
        }
        o3 o3Var3 = l4Var.f38778u0[1];
        if (o3Var3 != null && !o3Var3.E) {
            if (o3Var3.getWebView() != null) {
                o3Var3.getWebView().onPause();
            }
            o3Var3.E = true;
        }
        org.telegram.ui.ActionBar.i3 i3Var = this.e;
        if (i3Var != null) {
            i3Var.c();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f43010b;
        if (n2Var != null) {
            n2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.f43011c);
            }
        }
        ci.t3 t3Var = this.v;
        if (t3Var != null) {
            t3Var.run();
            this.v = null;
        }
        l4.f38734b1.remove(l4Var);
    }

    @Override
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        l4 l4Var = this.K;
        l4Var.f38778u0[0].setLastVisible(z10);
        l4Var.f38778u0[1].setLastVisible(false);
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (ci.t3) runnable;
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
        this.f43013n = z10;
        if (z10) {
            LaunchActivity.H1.f33201y0.b(this);
        } else {
            e(true, new st0(this, 10));
        }
        i();
        h();
    }

    @Override
    public final org.telegram.ui.ActionBar.u3 mo36getWindowView() {
        return this.f43011c;
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
