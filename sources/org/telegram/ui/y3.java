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
public final class y3 implements org.telegram.ui.ActionBar.k2, org.telegram.ui.ActionBar.s3 {
    public ValueAnimator A;
    public boolean B;
    public boolean C;
    public boolean D;
    public float E;
    public boolean F;
    public final l4 G;
    public final AnimationNotificationsLocker f44698a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.o2 f44699b;
    public final x3 f44700c;
    public View d;
    public org.telegram.ui.ActionBar.i3 f44701e;
    public boolean f44702f;
    public boolean h;
    public boolean f44703n;
    public boolean f44704r;
    public boolean f44705s;
    public ih.n3 v;
    public float f44706w;
    public float f44707x;
    public ValueAnimator f44708y;

    public y3(l4 l4Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.G = l4Var;
        this.f44699b = o2Var;
        o2Var.getResourceProvider();
        x3 x3Var = new x3(this, o2Var.getContext());
        this.f44700c = x3Var;
        new kh.b4(x3Var, true, new w3(this, 0));
    }

    @Override
    public final org.telegram.ui.ActionBar.l3 a() {
        int w02;
        int w03;
        float progress;
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3();
        l4 l4Var = this.G;
        l3Var.C = l4Var.f40014d0.getTitle();
        l3Var.H = l4Var;
        p3 p3Var = l4Var.f40026q0[0];
        Bitmap bitmap = null;
        if (p3Var != null && SharedConfig.adaptableColorInBrowser) {
            w02 = p3Var.getActionBarColor();
        } else {
            w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false);
        }
        l3Var.f23631o = w02;
        p3 p3Var2 = l4Var.f40026q0[0];
        if (p3Var2 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = p3Var2.getBackgroundColor();
        } else {
            w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false);
        }
        l3Var.f23632p = w03;
        l3Var.f23628l = true;
        if (!this.B) {
            progress = 0.0f;
        } else {
            progress = l4Var.f40026q0[0].getProgress();
        }
        l3Var.G = progress;
        p3 p3Var3 = l4Var.f40026q0[0];
        l3Var.f23621c = p3Var3;
        if (p3Var3 != null && p3Var3.getWebView() != null) {
            bitmap = l4Var.f40026q0[0].getWebView().getFavicon();
        }
        l3Var.D = bitmap;
        p3 p3Var4 = l3Var.f23621c;
        if (p3Var4 != null) {
            l3Var.f23622e = p3Var4.getWidth();
            l3Var.f23623f = l3Var.f23621c.getHeight();
        }
        l3Var.f23624g = l();
        l3Var.B = org.telegram.ui.ActionBar.f6.I.q();
        return l3Var;
    }

    @Override
    public final boolean attachedToParent() {
        return this.f44700c.isAttachedToWindow();
    }

    @Override
    public final boolean b() {
        return this.f44702f;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.i3 i3Var) {
        this.f44701e = i3Var;
        if (i3Var != null) {
            this.f44702f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f10);
        ofFloat.addUpdateListener(new v3(this, 0));
        return ofFloat;
    }

    @Override
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z10, kt0 kt0Var) {
        float f10;
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f44707x;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.A = ofFloat;
        ofFloat.addUpdateListener(new v3(this, 2));
        this.A.addListener(new androidx.fragment.app.g(this, z10, kt0Var, 3));
        this.A.setInterpolator(org.telegram.ui.Components.gr.h);
        this.A.setDuration(250L);
        this.A.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f44708y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f44706w, 1.0f);
        this.f44708y = ofFloat;
        ofFloat.addUpdateListener(new v3(this, 1));
        this.f44708y.addListener(new mh.x(this, 4));
        this.f44708y.setInterpolator(org.telegram.ui.Components.gr.h);
        this.f44708y.setDuration(320L);
        this.f44708y.start();
    }

    public final void g(org.telegram.ui.ActionBar.o2 o2Var) {
        qn qnVar;
        ak akVar;
        this.f44704r = false;
        this.f44699b = o2Var;
        o2Var.getResourceProvider();
        if ((o2Var instanceof qn) && (akVar = (qnVar = (qn) o2Var).U) != null) {
            akVar.O();
            qnVar.U.m0(true, false, true);
        }
        org.telegram.ui.ActionBar.i3 i3Var = this.f44701e;
        if (i3Var != null) {
            if (!i3Var.f23515e) {
                i3Var.f23515e = true;
                try {
                    i3Var.show();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        } else {
            x3 x3Var = this.f44700c;
            AndroidUtilities.removeFromParent(x3Var);
            if (o2Var.getLayoutContainer() != null) {
                o2Var.getLayoutContainer().addView(x3Var);
            }
        }
        l4 l4Var = this.G;
        p3 p3Var = l4Var.f40026q0[0];
        if (p3Var != null && p3Var.A) {
            if (p3Var.getWebView() != null) {
                p3Var.getWebView().onResume();
            }
            p3Var.A = false;
        }
        p3 p3Var2 = l4Var.f40026q0[1];
        if (p3Var2 != null && p3Var2.A) {
            if (p3Var2.getWebView() != null) {
                p3Var2.getWebView().onResume();
            }
            p3Var2.A = false;
        }
        l4.X0.add(l4Var);
    }

    @Override
    public final org.telegram.ui.Components.oc getBulletinFactory() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y3.getBulletinFactory():org.telegram.ui.Components.oc");
    }

    @Override
    public final int getNavigationBarColor(int i9) {
        float min;
        if (this.f44703n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f44706w, 1.0f - this.f44707x) * (1.0f - this.E);
        }
        int j10 = j();
        n0 n0Var = this.G.f40014d0;
        if (n0Var != null) {
            j10 = i0.a.d(n0Var.T, j10, n0Var.f44001x);
        }
        return i0.a.d(min, i9, j10);
    }

    @Override
    public final View getWindowView() {
        return this.f44700c;
    }

    public final void h() {
        if (this.f44705s != isFullyVisible()) {
            this.f44705s = isFullyVisible();
            org.telegram.ui.ActionBar.o2 o2Var = this.f44699b;
            if (o2Var != null && (o2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f44699b.getParentLayout();
                org.telegram.ui.ActionBar.w wVar = actionBarLayout.f22679s;
                if (wVar != null) {
                    wVar.invalidate();
                }
                org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.f22684w;
                if (wVar2 != null) {
                    wVar2.invalidate();
                    return;
                }
                return;
            }
            x3 x3Var = this.f44700c;
            if (x3Var.getParent() instanceof View) {
                ((View) x3Var.getParent()).invalidate();
            }
        }
    }

    public final void i() {
        View view;
        org.telegram.ui.ActionBar.i3 i3Var = this.f44701e;
        x3 x3Var = this.f44700c;
        if (i3Var != null) {
            view = i3Var.f23513b;
        } else {
            view = x3Var;
        }
        AndroidUtilities.setLightStatusBar(view, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.i3 i3Var2 = this.f44701e;
        boolean z10 = false;
        if (i3Var2 != null) {
            int navigationBarColor = i3Var2.f23512a.getNavigationBarColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
            i3Var2.d.setColor(navigationBarColor);
            i3Var2.f23514c.invalidate();
            AndroidUtilities.setNavigationBarColor(i3Var2, navigationBarColor);
            if (AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(i3Var2, z10);
            LaunchActivity.C1.H(true, true, true);
            return;
        }
        LaunchActivity.C1.H(true, true, true);
        if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false))) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(x3Var, z10);
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        float min;
        int d;
        float f10 = 0.0f;
        if (this.f44703n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.E) * Math.min(this.f44706w, 1.0f - this.f44707x);
        }
        if (this.B && min > 0.25f) {
            if (!SharedConfig.adaptableColorInBrowser) {
                d = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false);
            } else {
                l4 l4Var = this.G;
                if (l4Var.f40026q0[0].getVisibility() == 0) {
                    f10 = 1.0f - (l4Var.f40026q0[0].getTranslationX() / l4Var.f40026q0[0].getWidth());
                }
                d = i0.a.d(1.0f - f10, l4Var.f40026q0[0].getActionBarColor(), l4Var.f40026q0[1].getActionBarColor());
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        if (this.C && this.f44707x <= 0.0f && this.f44706w >= 1.0f && this.E <= 0.0f && !this.f44703n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isShown() {
        x3 x3Var;
        if (this.h || this.f44704r || this.f44706w <= 0.5f || (x3Var = this.f44700c) == null || !x3Var.isAttachedToWindow() || AndroidUtilities.lerp(x3Var.D0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(x3Var.f44348w0.f34854c)) >= x3Var.getHeight() || this.E >= 1.0f) {
            return false;
        }
        return true;
    }

    public final int j() {
        float translationX;
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sk, false);
        }
        l4 l4Var = this.G;
        if (l4Var.f40026q0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (l4Var.f40026q0[0].getTranslationX() / l4Var.f40026q0[0].getWidth());
        }
        return i0.a.d(1.0f - translationX, l4Var.f40026q0[0].getBackgroundColor(), l4Var.f40026q0[1].getBackgroundColor());
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
        float f10;
        l4 l4Var = this.G;
        int i9 = 0;
        p3 p3Var = l4Var.f40026q0[0];
        if (p3Var != null && p3Var.getVisibility() == 0) {
            f10 = 1.0f - (l4Var.f40026q0[0].getTranslationX() / l4Var.f40026q0[0].getWidth());
        } else {
            f10 = 0.0f;
        }
        float f11 = 1.0f - f10;
        p3 p3Var2 = l4Var.f40026q0[0];
        if (p3Var2 != null && p3Var2.getVisibility() == 0) {
            i9 = (int) (l4Var.f40026q0[0].getAlpha() * l4Var.f40026q0[0].getListTop() * f10);
        }
        p3 p3Var3 = l4Var.f40026q0[1];
        if (p3Var3 != null && p3Var3.getVisibility() == 0) {
            return i9 + ((int) (l4Var.f40026q0[1].getAlpha() * l4Var.f40026q0[1].getListTop() * f11));
        }
        return i9;
    }

    public final void m() {
        l4 l4Var = this.G;
        l4Var.f40026q0[0].setLastVisible(this.F);
        l4Var.f40026q0[1].setLastVisible(false);
    }

    public final void n() {
        float f10;
        View view = this.d;
        if (view == null) {
            return;
        }
        float k10 = k();
        float f11 = 1.0f - this.f44706w;
        if (this.f44703n) {
            f10 = 0.0f;
        } else {
            f10 = this.f44707x;
        }
        view.setTranslationY(Math.max(f11, f10) * k10);
        this.f44700c.invalidate();
    }

    @Override
    public final boolean onAttachedBackPressed() {
        l4 l4Var = this.G;
        if (l4Var.f40021k0) {
            AndroidUtilities.hideKeyboard(this.f44700c);
            return true;
        }
        n0 n0Var = l4Var.f40014d0;
        if (n0Var.P) {
            n0Var.h(false);
            return true;
        } else if (n0Var.S) {
            n0Var.k(false);
            return true;
        } else {
            if (l4Var.J()) {
                p3 p3Var = l4Var.f40026q0[0];
                if (p3Var.f41326s) {
                    if (p3Var.f() && p3Var.getWebView() != null) {
                        p3Var.getWebView().goBack();
                    }
                    return true;
                }
            }
            if (l4Var.Z.size() > 1) {
                l4Var.G();
                return true;
            }
            dismiss(false);
            return true;
        }
    }

    @Override
    public final void release() {
        this.f44704r = true;
        l4 l4Var = this.G;
        p3 p3Var = l4Var.f40026q0[0];
        if (p3Var != null && p3Var.h) {
            m3 m3Var = p3Var.f41322e;
            m3Var.setSwipeOffsetY((-m3Var.f17841f) + m3Var.f17840e);
            l4Var.f40026q0[0].h = false;
        }
        p3 p3Var2 = l4Var.f40026q0[0];
        if (p3Var2 != null && !p3Var2.A) {
            if (p3Var2.getWebView() != null) {
                p3Var2.getWebView().onPause();
            }
            p3Var2.A = true;
        }
        p3 p3Var3 = l4Var.f40026q0[1];
        if (p3Var3 != null && !p3Var3.A) {
            if (p3Var3.getWebView() != null) {
                p3Var3.getWebView().onPause();
            }
            p3Var3.A = true;
        }
        org.telegram.ui.ActionBar.i3 i3Var = this.f44701e;
        if (i3Var != null) {
            i3Var.c();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f44699b;
        if (o2Var != null) {
            o2Var.removeSheet(this);
            if (this.f44701e == null) {
                AndroidUtilities.removeFromParent(this.f44700c);
            }
        }
        ih.n3 n3Var = this.v;
        if (n3Var != null) {
            n3Var.run();
            this.v = null;
        }
        l4.X0.remove(l4Var);
    }

    @Override
    public final void setLastVisible(boolean z10) {
        this.F = z10;
        l4 l4Var = this.G;
        l4Var.f40026q0[0].setLastVisible(z10);
        l4Var.f40026q0[1].setLastVisible(false);
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (ih.n3) runnable;
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
        this.f44703n = z10;
        if (z10) {
            LaunchActivity.C1.f35534u0.b(this);
        } else {
            e(true, new kt0(this, 10));
        }
        i();
        h();
    }

    @Override
    public final org.telegram.ui.ActionBar.t3 mo37getWindowView() {
        return this.f44700c;
    }

    @Override
    public final void setKeyboardHeightFromParent(int i9) {
    }
}
