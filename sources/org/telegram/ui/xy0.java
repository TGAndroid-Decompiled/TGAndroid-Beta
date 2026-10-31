package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class xy0 extends org.telegram.ui.Components.w71 {
    public final int V;
    public Object W;
    public final FrameLayout f43667a0;

    public xy0(FrameLayout frameLayout, Context context, Object obj, int i10) {
        super(context, null);
        this.V = i10;
        this.f43667a0 = frameLayout;
        this.W = obj;
    }

    @Override
    public final void A(int i10) {
        switch (this.V) {
            case 0:
                ((org.telegram.ui.Components.zq0) this.f43667a0).f44254b.f31163b0.get(i10, -1);
                ((org.telegram.ui.Components.yq0) this.W).d.R0(1.0f);
                return;
            case 1:
                ((org.telegram.ui.Components.vq0) this.f43667a0).l();
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.W;
                if (k2Var instanceof ProfileActivity) {
                    ((ProfileActivity) k2Var).V();
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.uq0 uq0Var = (org.telegram.ui.Components.uq0) this.f43667a0;
                String currentLang = uq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    uq0Var.G.T0();
                    return;
                }
                return;
        }
    }

    @Override
    public void h() {
        switch (this.V) {
            case 1:
                org.telegram.ui.Components.vq0 vq0Var = (org.telegram.ui.Components.vq0) this.f43667a0;
                org.telegram.ui.Components.v71 v71Var = vq0Var.f45132n;
                if (vq0Var.b() && v71Var != null) {
                    if (vq0Var.J == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a1.g.m(null, 2131750107, new StringBuilder("+ ")));
                        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131232557, 0);
                        dqVar.G = 0.8f;
                        spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
                        vq0Var.J = spannableStringBuilder;
                    }
                    v71Var.a(-1, vq0Var.J);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        boolean g10;
        switch (this.V) {
            case 1:
                g10 = ((org.telegram.ui.Components.vq0) this.f43667a0).g();
                break;
            case 2:
                g10 = ((org.telegram.ui.Components.uq0) this.f43667a0).G.E1;
                break;
            default:
                return super.i(motionEvent);
        }
        return !g10;
    }

    @Override
    public final void w(boolean z10) {
        switch (this.V) {
            case 0:
                ((org.telegram.ui.Components.yq0) this.W).d.R0(((org.telegram.ui.Components.zq0) this.f43667a0).f44254b.getAnimatingIndicatorProgress());
                return;
            case 1:
                org.telegram.ui.Components.vq0 vq0Var = (org.telegram.ui.Components.vq0) this.f43667a0;
                vq0Var.l();
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.W;
                if (k2Var instanceof ProfileActivity) {
                    ((ProfileActivity) k2Var).V();
                    View fragmentView = k2Var.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                vq0Var.p();
                return;
            default:
                org.telegram.ui.Components.uq0 uq0Var = (org.telegram.ui.Components.uq0) this.f43667a0;
                String currentLang = uq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    uq0Var.G.T0();
                    return;
                }
                return;
        }
    }

    @Override
    public void y(int i10) {
        switch (this.V) {
            case 2:
                org.telegram.ui.Components.uq0 uq0Var = (org.telegram.ui.Components.uq0) this.f43667a0;
                String currentLang = uq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    uq0Var.G.T0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(int i10, boolean z10) {
        switch (this.V) {
            case 0:
                int i11 = ((org.telegram.ui.Components.zq0) this.f43667a0).f44254b.f31163b0.get(i10, -1);
                org.telegram.ui.Components.zt0 zt0Var = ((org.telegram.ui.Components.yq0) this.W).d;
                if (i11 <= 0) {
                    org.telegram.ui.Components.zt0.s(zt0Var, 8, z10);
                    return;
                } else {
                    org.telegram.ui.Components.zt0.s(zt0Var, zt0Var.s1(i11).f32788a, z10);
                    return;
                }
            default:
                super.z(i10, z10);
                return;
        }
    }

    public xy0(org.telegram.ui.Components.uq0 uq0Var, Context context) {
        super(context, null);
        this.V = 2;
        this.f43667a0 = uq0Var;
    }
}
