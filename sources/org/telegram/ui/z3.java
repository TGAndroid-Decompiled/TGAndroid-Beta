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

public final class z3 implements org.telegram.ui.ActionBar.j2, org.telegram.ui.ActionBar.s3 {
    public ValueAnimator A;
    public boolean B;
    public boolean C;
    public boolean D;
    public float E;
    public boolean F;
    public final m4 G;

    public final AnimationNotificationsLocker f45003a = new AnimationNotificationsLocker();

    public org.telegram.ui.ActionBar.n2 f45004b;

    public final y3 f45005c;
    public View d;

    public org.telegram.ui.ActionBar.h3 f45006e;

    public boolean f45007f;
    public boolean h;

    public boolean f45008n;

    public boolean f45009r;

    public boolean f45010s;
    public jh.l3 v;

    public float f45011w;

    public float f45012x;

    public ValueAnimator f45013y;

    public z3(m4 m4Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.G = m4Var;
        this.f45004b = n2Var;
        n2Var.getResourceProvider();
        y3 y3Var = new y3(this, n2Var.getContext());
        this.f45005c = y3Var;
        new lh.a4(y3Var, true, new x3(this, 0));
    }

    @Override
    public final org.telegram.ui.ActionBar.l3 a() {
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3();
        m4 m4Var = this.G;
        l3Var.C = m4Var.f40335d0.getTitle();
        l3Var.H = m4Var;
        q3 q3Var = m4Var.f40347q0[0];
        Bitmap favicon = null;
        l3Var.f23635o = (q3Var == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var.getActionBarColor();
        q3 q3Var2 = m4Var.f40347q0[0];
        l3Var.f23636p = (q3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var2.getBackgroundColor();
        l3Var.f23632l = true;
        l3Var.G = !this.B ? 0.0f : m4Var.f40347q0[0].getProgress();
        q3 q3Var3 = m4Var.f40347q0[0];
        l3Var.f23625c = q3Var3;
        if (q3Var3 != null && q3Var3.getWebView() != null) {
            favicon = m4Var.f40347q0[0].getWebView().getFavicon();
        }
        l3Var.D = favicon;
        q3 q3Var4 = l3Var.f23625c;
        if (q3Var4 != null) {
            l3Var.f23626e = q3Var4.getWidth();
            l3Var.f23627f = l3Var.f23625c.getHeight();
        }
        l3Var.f23628g = l();
        l3Var.B = org.telegram.ui.ActionBar.g6.I.q();
        return l3Var;
    }

    @Override
    public final boolean attachedToParent() {
        return this.f45005c.isAttachedToWindow();
    }

    @Override
    public final boolean b() {
        return this.f45007f;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.h3 h3Var) {
        this.f45006e = h3Var;
        if (h3Var != null) {
            this.f45007f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.E, f10);
        valueAnimatorOfFloat.addUpdateListener(new w3(this, 0));
        return valueAnimatorOfFloat;
    }

    @Override
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z10, lt0 lt0Var) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f45012x, z10 ? 1.0f : 0.0f);
        this.A = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new w3(this, 2));
        this.A.addListener(new androidx.fragment.app.g(this, z10, lt0Var, 3));
        this.A.setInterpolator(org.telegram.ui.Components.er.h);
        this.A.setDuration(250L);
        this.A.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f45013y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f45011w, 1.0f);
        this.f45013y = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new w3(this, 1));
        this.f45013y.addListener(new lh.h9(this, 6));
        this.f45013y.setInterpolator(org.telegram.ui.Components.er.h);
        this.f45013y.setDuration(320L);
        this.f45013y.start();
    }

    public final void g(org.telegram.ui.ActionBar.n2 n2Var) {
        rn rnVar;
        ck ckVar;
        this.f45009r = false;
        this.f45004b = n2Var;
        n2Var.getResourceProvider();
        if ((n2Var instanceof rn) && (ckVar = (rnVar = (rn) n2Var).U) != null) {
            ckVar.P();
            rnVar.U.n0(true, false, true);
        }
        org.telegram.ui.ActionBar.h3 h3Var = this.f45006e;
        if (h3Var == null) {
            y3 y3Var = this.f45005c;
            AndroidUtilities.removeFromParent(y3Var);
            if (n2Var.getLayoutContainer() != null) {
                n2Var.getLayoutContainer().addView(y3Var);
            }
        } else if (!h3Var.f23461e) {
            h3Var.f23461e = true;
            try {
                h3Var.show();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        m4 m4Var = this.G;
        q3 q3Var = m4Var.f40347q0[0];
        if (q3Var != null && q3Var.A) {
            if (q3Var.getWebView() != null) {
                q3Var.getWebView().onResume();
            }
            q3Var.A = false;
        }
        q3 q3Var2 = m4Var.f40347q0[1];
        if (q3Var2 != null && q3Var2.A) {
            if (q3Var2.getWebView() != null) {
                q3Var2.getWebView().onResume();
            }
            q3Var2.A = false;
        }
        m4.X0.add(m4Var);
    }

    @Override
    public final org.telegram.ui.Components.mc getBulletinFactory() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z3.getBulletinFactory():org.telegram.ui.Components.mc");
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        float fMin = this.f45008n ? 0.0f : Math.min(this.f45011w, 1.0f - this.f45012x) * (1.0f - this.E);
        int iJ = j();
        o0 o0Var = this.G.f40335d0;
        if (o0Var != null) {
            iJ = i0.b.d(o0Var.T, iJ, o0Var.f43988x);
        }
        return i0.b.d(fMin, i10, iJ);
    }

    @Override
    public final View getWindowView() {
        return this.f45005c;
    }

    public final void h() {
        if (this.f45010s != isFullyVisible()) {
            this.f45010s = isFullyVisible();
            org.telegram.ui.ActionBar.n2 n2Var = this.f45004b;
            if (n2Var == null || !(n2Var.getParentLayout() instanceof ActionBarLayout)) {
                y3 y3Var = this.f45005c;
                if (y3Var.getParent() instanceof View) {
                    ((View) y3Var.getParent()).invalidate();
                    return;
                }
                return;
            }
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.f45004b.getParentLayout();
            org.telegram.ui.ActionBar.w wVar = actionBarLayout.f22679s;
            if (wVar != null) {
                wVar.invalidate();
            }
            org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.f22684w;
            if (wVar2 != null) {
                wVar2.invalidate();
            }
        }
    }

    public final void i() {
        org.telegram.ui.ActionBar.h3 h3Var = this.f45006e;
        y3 y3Var = this.f45005c;
        AndroidUtilities.setLightStatusBar(h3Var != null ? h3Var.f23459b : y3Var, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.h3 h3Var2 = this.f45006e;
        if (h3Var2 == null) {
            LaunchActivity.C1.H(true, true, true);
            AndroidUtilities.setLightNavigationBar(y3Var, AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false))) >= 0.721f);
            return;
        }
        int navigationBarColor = h3Var2.f23458a.getNavigationBarColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        h3Var2.d.setColor(navigationBarColor);
        h3Var2.f23460c.invalidate();
        AndroidUtilities.setNavigationBarColor(h3Var2, navigationBarColor);
        AndroidUtilities.setLightNavigationBar(h3Var2, AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f);
        LaunchActivity.C1.H(true, true, true);
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        float fMin;
        int iD;
        if (this.f45008n) {
            fMin = 0.0f;
        } else {
            fMin = (1.0f - this.E) * Math.min(this.f45011w, 1.0f - this.f45012x);
        }
        if (this.B && fMin > 0.25f) {
            if (SharedConfig.adaptableColorInBrowser) {
                m4 m4Var = this.G;
                iD = i0.b.d(1.0f - (m4Var.f40347q0[0].getVisibility() == 0 ? 1.0f - (m4Var.f40347q0[0].getTranslationX() / m4Var.f40347q0[0].getWidth()) : 0.0f), m4Var.f40347q0[0].getActionBarColor(), m4Var.f40347q0[1].getActionBarColor());
            } else {
                iD = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false);
            }
            if (AndroidUtilities.computePerceivedBrightness(iD) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        return this.C && this.f45012x <= 0.0f && this.f45011w >= 1.0f && this.E <= 0.0f && !this.f45008n && !this.h;
    }

    @Override
    public final boolean isShown() {
        y3 y3Var;
        return !this.h && !this.f45009r && this.f45011w > 0.5f && (y3Var = this.f45005c) != null && y3Var.isAttachedToWindow() && AndroidUtilities.lerp(y3Var.D0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(y3Var.f44693w0.f34812c)) < y3Var.getHeight() && this.E < 1.0f;
    }

    public final int j() {
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sk, false);
        }
        m4 m4Var = this.G;
        return i0.b.d(1.0f - (m4Var.f40347q0[0].getVisibility() != 0 ? 0.0f : 1.0f - (m4Var.f40347q0[0].getTranslationX() / m4Var.f40347q0[0].getWidth())), m4Var.f40347q0[0].getBackgroundColor(), m4Var.f40347q0[1].getBackgroundColor());
    }

    public final int k() {
        int iDp = AndroidUtilities.dp(16.0f);
        View view = this.d;
        return org.telegram.messenger.y1.A(20.0f, l(), iDp + (view == null ? AndroidUtilities.displaySize.y : view.getHeight()));
    }

    public final int l() {
        m4 m4Var = this.G;
        int alpha = 0;
        q3 q3Var = m4Var.f40347q0[0];
        float translationX = (q3Var == null || q3Var.getVisibility() != 0) ? 0.0f : 1.0f - (m4Var.f40347q0[0].getTranslationX() / m4Var.f40347q0[0].getWidth());
        float f10 = 1.0f - translationX;
        q3 q3Var2 = m4Var.f40347q0[0];
        if (q3Var2 != null && q3Var2.getVisibility() == 0) {
            alpha = (int) (m4Var.f40347q0[0].getAlpha() * m4Var.f40347q0[0].getListTop() * translationX);
        }
        q3 q3Var3 = m4Var.f40347q0[1];
        if (q3Var3 == null || q3Var3.getVisibility() != 0) {
            return alpha;
        }
        return alpha + ((int) (m4Var.f40347q0[1].getAlpha() * m4Var.f40347q0[1].getListTop() * f10));
    }

    public final void m() {
        m4 m4Var = this.G;
        m4Var.f40347q0[0].setLastVisible(this.F);
        m4Var.f40347q0[1].setLastVisible(false);
    }

    public final void n() {
        View view = this.d;
        if (view == null) {
            return;
        }
        view.setTranslationY(Math.max(1.0f - this.f45011w, this.f45008n ? 0.0f : this.f45012x) * k());
        this.f45005c.invalidate();
    }

    @Override
    public final boolean onAttachedBackPressed() {
        m4 m4Var = this.G;
        if (m4Var.f40342k0) {
            AndroidUtilities.hideKeyboard(this.f45005c);
            return true;
        }
        o0 o0Var = m4Var.f40335d0;
        if (o0Var.P) {
            o0Var.h(false);
            return true;
        }
        if (o0Var.S) {
            o0Var.k(false);
            return true;
        }
        if (m4Var.J()) {
            q3 q3Var = m4Var.f40347q0[0];
            if (q3Var.f41502s) {
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

    @Override
    public final void release() {
        this.f45009r = true;
        m4 m4Var = this.G;
        q3 q3Var = m4Var.f40347q0[0];
        if (q3Var != null && q3Var.h) {
            n3 n3Var = q3Var.f41498e;
            n3Var.setSwipeOffsetY((-n3Var.f18648f) + n3Var.f18647e);
            m4Var.f40347q0[0].h = false;
        }
        q3 q3Var2 = m4Var.f40347q0[0];
        if (q3Var2 != null && !q3Var2.A) {
            if (q3Var2.getWebView() != null) {
                q3Var2.getWebView().onPause();
            }
            q3Var2.A = true;
        }
        q3 q3Var3 = m4Var.f40347q0[1];
        if (q3Var3 != null && !q3Var3.A) {
            if (q3Var3.getWebView() != null) {
                q3Var3.getWebView().onPause();
            }
            q3Var3.A = true;
        }
        org.telegram.ui.ActionBar.h3 h3Var = this.f45006e;
        if (h3Var != null) {
            h3Var.c();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f45004b;
        if (n2Var != null) {
            n2Var.removeSheet(this);
            if (this.f45006e == null) {
                AndroidUtilities.removeFromParent(this.f45005c);
            }
        }
        jh.l3 l3Var = this.v;
        if (l3Var != null) {
            l3Var.run();
            this.v = null;
        }
        m4.X0.remove(m4Var);
    }

    @Override
    public final void setLastVisible(boolean z10) {
        this.F = z10;
        m4 m4Var = this.G;
        m4Var.f40347q0[0].setLastVisible(z10);
        m4Var.f40347q0[1].setLastVisible(false);
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (jh.l3) runnable;
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
        this.f45008n = z10;
        if (z10) {
            LaunchActivity.C1.f35537u0.b(this);
        } else {
            e(true, new lt0(this, 10));
        }
        i();
        h();
    }

    @Override
    public final org.telegram.ui.ActionBar.t3 mo37getWindowView() {
        return this.f45005c;
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
