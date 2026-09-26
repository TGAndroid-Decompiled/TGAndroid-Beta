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
public final class v3 implements org.telegram.ui.ActionBar.i2, org.telegram.ui.ActionBar.s3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final i4 K;
    public final AnimationNotificationsLocker f38617a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.m2 f38618b;
    public final u3 f38619c;
    public View d;
    public org.telegram.ui.ActionBar.h3 e;
    public boolean f38620f;
    public boolean h;
    public boolean f38621n;
    public boolean f38622r;
    public boolean f38623s;
    public ai.d5 v;
    public float f38624w;
    public float f38625x;
    public ValueAnimator f38626y;

    public v3(i4 i4Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.K = i4Var;
        this.f38618b = m2Var;
        m2Var.getResourceProvider();
        u3 u3Var = new u3(this, m2Var.getContext());
        this.f38619c = u3Var;
        new ci.i4(u3Var, true, new t3(this, 0));
    }

    @Override
    public final org.telegram.ui.ActionBar.l3 a() {
        int w02;
        int w03;
        float progress;
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3();
        i4 i4Var = this.K;
        l3Var.E = i4Var.f34394h0.getTitle();
        l3Var.J = i4Var;
        m3 m3Var = i4Var.f34406u0[0];
        Bitmap bitmap = null;
        if (m3Var != null && SharedConfig.adaptableColorInBrowser) {
            w02 = m3Var.getActionBarColor();
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Pk, false);
        }
        l3Var.f19610q = w02;
        m3 m3Var2 = i4Var.f34406u0[0];
        if (m3Var2 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = m3Var2.getBackgroundColor();
        } else {
            w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Pk, false);
        }
        l3Var.f19611r = w03;
        l3Var.f19607n = true;
        if (!this.F) {
            progress = 0.0f;
        } else {
            progress = i4Var.f34406u0[0].getProgress();
        }
        l3Var.I = progress;
        m3 m3Var3 = i4Var.f34406u0[0];
        l3Var.f19599c = m3Var3;
        if (m3Var3 != null && m3Var3.getWebView() != null) {
            bitmap = i4Var.f34406u0[0].getWebView().getFavicon();
        }
        l3Var.F = bitmap;
        m3 m3Var4 = l3Var.f19599c;
        if (m3Var4 != null) {
            l3Var.f19601g = m3Var4.getWidth();
            l3Var.h = l3Var.f19599c.getHeight();
        }
        l3Var.f19602i = l();
        l3Var.D = org.telegram.ui.ActionBar.h6.I.q();
        return l3Var;
    }

    @Override
    public final boolean attachedToParent() {
        return this.f38619c.isAttachedToWindow();
    }

    @Override
    public final boolean b() {
        return this.f38620f;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.h3 h3Var) {
        this.e = h3Var;
        if (h3Var != null) {
            this.f38620f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        ofFloat.addUpdateListener(new s3(this, 0));
        return ofFloat;
    }

    @Override
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z10, eu0 eu0Var) {
        float f7;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f38625x;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new s3(this, 2));
        this.E.addListener(new androidx.fragment.app.g(this, z10, eu0Var, 2));
        this.E.setInterpolator(org.telegram.ui.Components.sr.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f38626y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38624w, 1.0f);
        this.f38626y = ofFloat;
        ofFloat.addUpdateListener(new s3(this, 1));
        this.f38626y.addListener(new ai.b(this, 28));
        this.f38626y.setInterpolator(org.telegram.ui.Components.sr.h);
        this.f38626y.setDuration(320L);
        this.f38626y.start();
    }

    public final void g(org.telegram.ui.ActionBar.m2 m2Var) {
        wn wnVar;
        jk jkVar;
        this.f38622r = false;
        this.f38618b = m2Var;
        m2Var.getResourceProvider();
        if ((m2Var instanceof wn) && (jkVar = (wnVar = (wn) m2Var).Y) != null) {
            jkVar.P();
            wnVar.Y.n0(true, false, true);
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
            u3 u3Var = this.f38619c;
            AndroidUtilities.removeFromParent(u3Var);
            if (m2Var.getLayoutContainer() != null) {
                m2Var.getLayoutContainer().addView(u3Var);
            }
        }
        i4 i4Var = this.K;
        m3 m3Var = i4Var.f34406u0[0];
        if (m3Var != null && m3Var.E) {
            if (m3Var.getWebView() != null) {
                m3Var.getWebView().onResume();
            }
            m3Var.E = false;
        }
        m3 m3Var2 = i4Var.f34406u0[1];
        if (m3Var2 != null && m3Var2.E) {
            if (m3Var2.getWebView() != null) {
                m3Var2.getWebView().onResume();
            }
            m3Var2.E = false;
        }
        i4.f34362b1.add(i4Var);
    }

    @Override
    public final org.telegram.ui.Components.xc getBulletinFactory() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v3.getBulletinFactory():org.telegram.ui.Components.xc");
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        float min;
        if (this.f38621n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f38624w, 1.0f - this.f38625x) * (1.0f - this.I);
        }
        int j3 = j();
        l0 l0Var = this.K.f34394h0;
        if (l0Var != null) {
            j3 = i0.a.d(l0Var.f39226a0, j3, l0Var.f39255x);
        }
        return i0.a.d(min, i10, j3);
    }

    @Override
    public final View getWindowView() {
        return this.f38619c;
    }

    public final void h() {
        if (this.f38623s != isFullyVisible()) {
            this.f38623s = isFullyVisible();
            org.telegram.ui.ActionBar.m2 m2Var = this.f38618b;
            if (m2Var != null && (m2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f38618b.getParentLayout();
                org.telegram.ui.ActionBar.v vVar = actionBarLayout.f18639s;
                if (vVar != null) {
                    vVar.invalidate();
                }
                org.telegram.ui.ActionBar.v vVar2 = actionBarLayout.f18644w;
                if (vVar2 != null) {
                    vVar2.invalidate();
                    return;
                }
                return;
            }
            u3 u3Var = this.f38619c;
            if (u3Var.getParent() instanceof View) {
                ((View) u3Var.getParent()).invalidate();
            }
        }
    }

    public final void i() {
        View view;
        org.telegram.ui.ActionBar.h3 h3Var = this.e;
        u3 u3Var = this.f38619c;
        if (h3Var != null) {
            view = h3Var.f18959b;
        } else {
            view = u3Var;
        }
        AndroidUtilities.setLightStatusBar(view, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.h3 h3Var2 = this.e;
        boolean z10 = false;
        if (h3Var2 != null) {
            int navigationBarColor = h3Var2.f18958a.getNavigationBarColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19003a7, false));
            h3Var2.d.setColor(navigationBarColor);
            h3Var2.f18960c.invalidate();
            AndroidUtilities.setNavigationBarColor(h3Var2, navigationBarColor);
            if (AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(h3Var2, z10);
            LaunchActivity.G1.H(true, true, true);
            return;
        }
        LaunchActivity.G1.H(true, true, true);
        if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19003a7, false))) >= 0.721f) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(u3Var, z10);
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        float min;
        int d;
        float f7 = 0.0f;
        if (this.f38621n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.I) * Math.min(this.f38624w, 1.0f - this.f38625x);
        }
        if (this.F && min > 0.25f) {
            if (!SharedConfig.adaptableColorInBrowser) {
                d = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Pk, false);
            } else {
                i4 i4Var = this.K;
                if (i4Var.f34406u0[0].getVisibility() == 0) {
                    f7 = 1.0f - (i4Var.f34406u0[0].getTranslationX() / i4Var.f34406u0[0].getWidth());
                }
                d = i0.a.d(1.0f - f7, i4Var.f34406u0[0].getActionBarColor(), i4Var.f34406u0[1].getActionBarColor());
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        if (this.G && this.f38625x <= 0.0f && this.f38624w >= 1.0f && this.I <= 0.0f && !this.f38621n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isShown() {
        u3 u3Var;
        if (this.h || this.f38622r || this.f38624w <= 0.5f || (u3Var = this.f38619c) == null || !u3Var.isAttachedToWindow() || AndroidUtilities.lerp(u3Var.H0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(u3Var.A0.f23850c)) >= u3Var.getHeight() || this.I >= 1.0f) {
            return false;
        }
        return true;
    }

    public final int j() {
        float translationX;
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sk, false);
        }
        i4 i4Var = this.K;
        if (i4Var.f34406u0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (i4Var.f34406u0[0].getTranslationX() / i4Var.f34406u0[0].getWidth());
        }
        return i0.a.d(1.0f - translationX, i4Var.f34406u0[0].getBackgroundColor(), i4Var.f34406u0[1].getBackgroundColor());
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
        return org.telegram.messenger.f0.A(20.0f, l(), dp + height);
    }

    public final int l() {
        float f7;
        i4 i4Var = this.K;
        int i10 = 0;
        m3 m3Var = i4Var.f34406u0[0];
        if (m3Var != null && m3Var.getVisibility() == 0) {
            f7 = 1.0f - (i4Var.f34406u0[0].getTranslationX() / i4Var.f34406u0[0].getWidth());
        } else {
            f7 = 0.0f;
        }
        float f10 = 1.0f - f7;
        m3 m3Var2 = i4Var.f34406u0[0];
        if (m3Var2 != null && m3Var2.getVisibility() == 0) {
            i10 = (int) (i4Var.f34406u0[0].getAlpha() * i4Var.f34406u0[0].getListTop() * f7);
        }
        m3 m3Var3 = i4Var.f34406u0[1];
        if (m3Var3 != null && m3Var3.getVisibility() == 0) {
            return i10 + ((int) (i4Var.f34406u0[1].getAlpha() * i4Var.f34406u0[1].getListTop() * f10));
        }
        return i10;
    }

    public final void m() {
        i4 i4Var = this.K;
        i4Var.f34406u0[0].setLastVisible(this.J);
        i4Var.f34406u0[1].setLastVisible(false);
    }

    public final void n() {
        float f7;
        View view = this.d;
        if (view == null) {
            return;
        }
        float k10 = k();
        float f10 = 1.0f - this.f38624w;
        if (this.f38621n) {
            f7 = 0.0f;
        } else {
            f7 = this.f38625x;
        }
        view.setTranslationY(Math.max(f10, f7) * k10);
        this.f38619c.invalidate();
    }

    @Override
    public final boolean onAttachedBackPressed() {
        i4 i4Var = this.K;
        if (i4Var.f34400o0) {
            AndroidUtilities.hideKeyboard(this.f38619c);
            return true;
        }
        l0 l0Var = i4Var.f34394h0;
        if (l0Var.T) {
            l0Var.h(false);
            return true;
        } else if (l0Var.W) {
            l0Var.k(false);
            return true;
        } else {
            if (i4Var.J()) {
                m3 m3Var = i4Var.f34406u0[0];
                if (m3Var.f35464s) {
                    if (m3Var.f() && m3Var.getWebView() != null) {
                        m3Var.getWebView().goBack();
                    }
                    return true;
                }
            }
            if (i4Var.f34390d0.size() > 1) {
                i4Var.G();
                return true;
            }
            dismiss(false);
            return true;
        }
    }

    @Override
    public final void release() {
        this.f38622r = true;
        i4 i4Var = this.K;
        m3 m3Var = i4Var.f34406u0[0];
        if (m3Var != null && m3Var.h) {
            j3 j3Var = m3Var.e;
            j3Var.setSwipeOffsetY((-j3Var.f8533f) + j3Var.e);
            i4Var.f34406u0[0].h = false;
        }
        m3 m3Var2 = i4Var.f34406u0[0];
        if (m3Var2 != null && !m3Var2.E) {
            if (m3Var2.getWebView() != null) {
                m3Var2.getWebView().onPause();
            }
            m3Var2.E = true;
        }
        m3 m3Var3 = i4Var.f34406u0[1];
        if (m3Var3 != null && !m3Var3.E) {
            if (m3Var3.getWebView() != null) {
                m3Var3.getWebView().onPause();
            }
            m3Var3.E = true;
        }
        org.telegram.ui.ActionBar.h3 h3Var = this.e;
        if (h3Var != null) {
            h3Var.c();
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f38618b;
        if (m2Var != null) {
            m2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.f38619c);
            }
        }
        ai.d5 d5Var = this.v;
        if (d5Var != null) {
            d5Var.run();
            this.v = null;
        }
        i4.f34362b1.remove(i4Var);
    }

    @Override
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        i4 i4Var = this.K;
        i4Var.f34406u0[0].setLastVisible(z10);
        i4Var.f34406u0[1].setLastVisible(false);
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
        this.f38621n = z10;
        if (z10) {
            LaunchActivity.G1.f31145y0.b(this);
        } else {
            e(true, new eu0(this, 10));
        }
        i();
        h();
    }

    @Override
    public final org.telegram.ui.ActionBar.t3 mo37getWindowView() {
        return this.f38619c;
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
