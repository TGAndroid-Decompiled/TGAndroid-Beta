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
public final class z3 implements org.telegram.ui.ActionBar.k2, org.telegram.ui.ActionBar.s3 {
    public ValueAnimator A;
    public boolean B;
    public boolean C;
    public boolean D;
    public float E;
    public boolean F;
    public final m4 G;
    public final AnimationNotificationsLocker f45044a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.o2 f45045b;
    public final y3 f45046c;
    public View d;
    public org.telegram.ui.ActionBar.i3 f45047e;
    public boolean f45048f;
    public boolean h;
    public boolean f45049n;
    public boolean f45050r;
    public boolean f45051s;
    public lh.j3 v;
    public float f45052w;
    public float f45053x;
    public ValueAnimator f45054y;

    public z3(m4 m4Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.G = m4Var;
        this.f45045b = o2Var;
        o2Var.getResourceProvider();
        y3 y3Var = new y3(this, o2Var.getContext());
        this.f45046c = y3Var;
        new nh.w3(y3Var, true, new x3(this, 0));
    }

    @Override
    public final org.telegram.ui.ActionBar.l3 a() {
        int w02;
        int w03;
        float progress;
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3();
        m4 m4Var = this.G;
        l3Var.C = m4Var.f40392d0.getTitle();
        l3Var.H = m4Var;
        q3 q3Var = m4Var.f40404q0[0];
        Bitmap bitmap = null;
        if (q3Var != null && SharedConfig.adaptableColorInBrowser) {
            w02 = q3Var.getActionBarColor();
        } else {
            w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false);
        }
        l3Var.f23653o = w02;
        q3 q3Var2 = m4Var.f40404q0[0];
        if (q3Var2 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = q3Var2.getBackgroundColor();
        } else {
            w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false);
        }
        l3Var.f23654p = w03;
        l3Var.f23650l = true;
        if (!this.B) {
            progress = 0.0f;
        } else {
            progress = m4Var.f40404q0[0].getProgress();
        }
        l3Var.G = progress;
        q3 q3Var3 = m4Var.f40404q0[0];
        l3Var.f23643c = q3Var3;
        if (q3Var3 != null && q3Var3.getWebView() != null) {
            bitmap = m4Var.f40404q0[0].getWebView().getFavicon();
        }
        l3Var.D = bitmap;
        q3 q3Var4 = l3Var.f23643c;
        if (q3Var4 != null) {
            l3Var.f23644e = q3Var4.getWidth();
            l3Var.f23645f = l3Var.f23643c.getHeight();
        }
        l3Var.f23646g = l();
        l3Var.B = org.telegram.ui.ActionBar.g6.I.q();
        return l3Var;
    }

    @Override
    public final boolean attachedToParent() {
        return this.f45046c.isAttachedToWindow();
    }

    @Override
    public final boolean b() {
        return this.f45048f;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.i3 i3Var) {
        this.f45047e = i3Var;
        if (i3Var != null) {
            this.f45048f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f9);
        ofFloat.addUpdateListener(new w3(this, 0));
        return ofFloat;
    }

    @Override
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z10, it0 it0Var) {
        float f9;
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f45053x;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.A = ofFloat;
        ofFloat.addUpdateListener(new w3(this, 2));
        this.A.addListener(new androidx.fragment.app.g(this, z10, it0Var, 4));
        this.A.setInterpolator(org.telegram.ui.Components.jr.h);
        this.A.setDuration(250L);
        this.A.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f45054y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f45052w, 1.0f);
        this.f45054y = ofFloat;
        ofFloat.addUpdateListener(new w3(this, 1));
        this.f45054y.addListener(new nh.q5(this, 6));
        this.f45054y.setInterpolator(org.telegram.ui.Components.jr.h);
        this.f45054y.setDuration(320L);
        this.f45054y.start();
    }

    public final void g(org.telegram.ui.ActionBar.o2 o2Var) {
        tn tnVar;
        dk dkVar;
        this.f45050r = false;
        this.f45045b = o2Var;
        o2Var.getResourceProvider();
        if ((o2Var instanceof tn) && (dkVar = (tnVar = (tn) o2Var).U) != null) {
            dkVar.P();
            tnVar.U.n0(true, false, true);
        }
        org.telegram.ui.ActionBar.i3 i3Var = this.f45047e;
        if (i3Var != null) {
            if (!i3Var.f23525e) {
                i3Var.f23525e = true;
                try {
                    i3Var.show();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        } else {
            y3 y3Var = this.f45046c;
            AndroidUtilities.removeFromParent(y3Var);
            if (o2Var.getLayoutContainer() != null) {
                o2Var.getLayoutContainer().addView(y3Var);
            }
        }
        m4 m4Var = this.G;
        q3 q3Var = m4Var.f40404q0[0];
        if (q3Var != null && q3Var.A) {
            if (q3Var.getWebView() != null) {
                q3Var.getWebView().onResume();
            }
            q3Var.A = false;
        }
        q3 q3Var2 = m4Var.f40404q0[1];
        if (q3Var2 != null && q3Var2.A) {
            if (q3Var2.getWebView() != null) {
                q3Var2.getWebView().onResume();
            }
            q3Var2.A = false;
        }
        m4.X0.add(m4Var);
    }

    @Override
    public final org.telegram.ui.Components.tc getBulletinFactory() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z3.getBulletinFactory():org.telegram.ui.Components.tc");
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        float min;
        if (this.f45049n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f45052w, 1.0f - this.f45053x) * (1.0f - this.E);
        }
        int j10 = j();
        o0 o0Var = this.G.f40392d0;
        if (o0Var != null) {
            j10 = i0.a.d(o0Var.T, j10, o0Var.f44191x);
        }
        return i0.a.d(min, i10, j10);
    }

    @Override
    public final View getWindowView() {
        return this.f45046c;
    }

    public final void h() {
        if (this.f45051s != isFullyVisible()) {
            this.f45051s = isFullyVisible();
            org.telegram.ui.ActionBar.o2 o2Var = this.f45045b;
            if (o2Var != null && (o2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f45045b.getParentLayout();
                org.telegram.ui.ActionBar.x xVar = actionBarLayout.f22691s;
                if (xVar != null) {
                    xVar.invalidate();
                }
                org.telegram.ui.ActionBar.x xVar2 = actionBarLayout.f22696w;
                if (xVar2 != null) {
                    xVar2.invalidate();
                    return;
                }
                return;
            }
            y3 y3Var = this.f45046c;
            if (y3Var.getParent() instanceof View) {
                ((View) y3Var.getParent()).invalidate();
            }
        }
    }

    public final void i() {
        View view;
        org.telegram.ui.ActionBar.i3 i3Var = this.f45047e;
        y3 y3Var = this.f45046c;
        if (i3Var != null) {
            view = i3Var.f23523b;
        } else {
            view = y3Var;
        }
        AndroidUtilities.setLightStatusBar(view, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.i3 i3Var2 = this.f45047e;
        boolean z10 = false;
        if (i3Var2 != null) {
            int navigationBarColor = i3Var2.f23522a.getNavigationBarColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
            i3Var2.d.setColor(navigationBarColor);
            i3Var2.f23524c.invalidate();
            AndroidUtilities.setNavigationBarColor(i3Var2, navigationBarColor);
            if (AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(i3Var2, z10);
            LaunchActivity.C1.H(true, true, true);
            return;
        }
        LaunchActivity.C1.H(true, true, true);
        if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false))) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(y3Var, z10);
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        float min;
        int d;
        float f9 = 0.0f;
        if (this.f45049n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.E) * Math.min(this.f45052w, 1.0f - this.f45053x);
        }
        if (this.B && min > 0.25f) {
            if (!SharedConfig.adaptableColorInBrowser) {
                d = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false);
            } else {
                m4 m4Var = this.G;
                if (m4Var.f40404q0[0].getVisibility() == 0) {
                    f9 = 1.0f - (m4Var.f40404q0[0].getTranslationX() / m4Var.f40404q0[0].getWidth());
                }
                d = i0.a.d(1.0f - f9, m4Var.f40404q0[0].getActionBarColor(), m4Var.f40404q0[1].getActionBarColor());
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        if (this.C && this.f45053x <= 0.0f && this.f45052w >= 1.0f && this.E <= 0.0f && !this.f45049n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isShown() {
        y3 y3Var;
        if (this.h || this.f45050r || this.f45052w <= 0.5f || (y3Var = this.f45046c) == null || !y3Var.isAttachedToWindow() || AndroidUtilities.lerp(y3Var.D0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(y3Var.f44721w0.f27666c)) >= y3Var.getHeight() || this.E >= 1.0f) {
            return false;
        }
        return true;
    }

    public final int j() {
        float translationX;
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sk, false);
        }
        m4 m4Var = this.G;
        if (m4Var.f40404q0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (m4Var.f40404q0[0].getTranslationX() / m4Var.f40404q0[0].getWidth());
        }
        return i0.a.d(1.0f - translationX, m4Var.f40404q0[0].getBackgroundColor(), m4Var.f40404q0[1].getBackgroundColor());
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
        return org.telegram.messenger.x3.z(20.0f, l(), dp + height);
    }

    public final int l() {
        float f9;
        m4 m4Var = this.G;
        int i10 = 0;
        q3 q3Var = m4Var.f40404q0[0];
        if (q3Var != null && q3Var.getVisibility() == 0) {
            f9 = 1.0f - (m4Var.f40404q0[0].getTranslationX() / m4Var.f40404q0[0].getWidth());
        } else {
            f9 = 0.0f;
        }
        float f10 = 1.0f - f9;
        q3 q3Var2 = m4Var.f40404q0[0];
        if (q3Var2 != null && q3Var2.getVisibility() == 0) {
            i10 = (int) (m4Var.f40404q0[0].getAlpha() * m4Var.f40404q0[0].getListTop() * f9);
        }
        q3 q3Var3 = m4Var.f40404q0[1];
        if (q3Var3 != null && q3Var3.getVisibility() == 0) {
            return i10 + ((int) (m4Var.f40404q0[1].getAlpha() * m4Var.f40404q0[1].getListTop() * f10));
        }
        return i10;
    }

    public final void m() {
        m4 m4Var = this.G;
        m4Var.f40404q0[0].setLastVisible(this.F);
        m4Var.f40404q0[1].setLastVisible(false);
    }

    public final void n() {
        float f9;
        View view = this.d;
        if (view == null) {
            return;
        }
        float k9 = k();
        float f10 = 1.0f - this.f45052w;
        if (this.f45049n) {
            f9 = 0.0f;
        } else {
            f9 = this.f45053x;
        }
        view.setTranslationY(Math.max(f10, f9) * k9);
        this.f45046c.invalidate();
    }

    @Override
    public final boolean onAttachedBackPressed() {
        m4 m4Var = this.G;
        if (m4Var.f40399k0) {
            AndroidUtilities.hideKeyboard(this.f45046c);
            return true;
        }
        o0 o0Var = m4Var.f40392d0;
        if (o0Var.P) {
            o0Var.h(false);
            return true;
        } else if (o0Var.S) {
            o0Var.k(false);
            return true;
        } else {
            if (m4Var.J()) {
                q3 q3Var = m4Var.f40404q0[0];
                if (q3Var.f41519s) {
                    if (q3Var.f() && q3Var.getWebView() != null) {
                        q3Var.getWebView().goBack();
                    }
                    return true;
                }
            }
            if (m4Var.Z.size() > 1) {
                m4Var.G();
                return true;
            }
            dismiss(false);
            return true;
        }
    }

    @Override
    public final void release() {
        this.f45050r = true;
        m4 m4Var = this.G;
        q3 q3Var = m4Var.f40404q0[0];
        if (q3Var != null && q3Var.h) {
            n3 n3Var = q3Var.f41515e;
            n3Var.setSwipeOffsetY((-n3Var.f45906f) + n3Var.f45905e);
            m4Var.f40404q0[0].h = false;
        }
        q3 q3Var2 = m4Var.f40404q0[0];
        if (q3Var2 != null && !q3Var2.A) {
            if (q3Var2.getWebView() != null) {
                q3Var2.getWebView().onPause();
            }
            q3Var2.A = true;
        }
        q3 q3Var3 = m4Var.f40404q0[1];
        if (q3Var3 != null && !q3Var3.A) {
            if (q3Var3.getWebView() != null) {
                q3Var3.getWebView().onPause();
            }
            q3Var3.A = true;
        }
        org.telegram.ui.ActionBar.i3 i3Var = this.f45047e;
        if (i3Var != null) {
            i3Var.c();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f45045b;
        if (o2Var != null) {
            o2Var.removeSheet(this);
            if (this.f45047e == null) {
                AndroidUtilities.removeFromParent(this.f45046c);
            }
        }
        lh.j3 j3Var = this.v;
        if (j3Var != null) {
            j3Var.run();
            this.v = null;
        }
        m4.X0.remove(m4Var);
    }

    @Override
    public final void setLastVisible(boolean z10) {
        this.F = z10;
        m4 m4Var = this.G;
        m4Var.f40404q0[0].setLastVisible(z10);
        m4Var.f40404q0[1].setLastVisible(false);
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (lh.j3) runnable;
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
        this.f45049n = z10;
        if (z10) {
            LaunchActivity.C1.f35601u0.b(this);
        } else {
            e(true, new it0(this, 10));
        }
        i();
        h();
    }

    @Override
    public final org.telegram.ui.ActionBar.t3 mo37getWindowView() {
        return this.f45046c;
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
