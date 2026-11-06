package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class y40 implements org.telegram.ui.Components.cj0, ma0 {
    public final d50 f52074a;

    public y40(d50 d50Var) {
        this.f52074a = d50Var;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        d50 d50Var = this.f52074a;
        Location location = d50Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        d50Var.T = messageMedia.address;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        boolean z9 = view instanceof org.telegram.ui.Cells.w9;
        d50 d50Var = this.f52074a;
        if (z9) {
            if (org.telegram.messenger.g0.J1(d50Var)) {
                pa0 pa0Var = new pa0(4);
                pa0Var.f48744l0 = 0L;
                pa0Var.G0 = new y40(d50Var);
                d50Var.presentFragment(pa0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.m8) && d50Var.P != 5) {
            org.telegram.ui.ActionBar.g1 g1Var = d50Var.f44955x;
            if (g1Var == null || !g1Var.isShowing()) {
                org.telegram.messenger.re reVar = new org.telegram.messenger.re(d50Var.getParentActivity(), null, new f(d50Var, 19), true, 1, null);
                reVar.t(d50Var.W);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.f25280b, -2, -2);
                d50Var.f44955x = g1Var2;
                g1Var2.f27482e = true;
                g1Var2.f27481c = 220;
                g1Var2.setOutsideTouchable(true);
                d50Var.f44955x.setClippingEnabled(true);
                d50Var.f44955x.setAnimationStyle(2131755192);
                d50Var.f44955x.setFocusable(true);
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.f25280b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                d50Var.f44955x.setInputMethodMode(2);
                d50Var.f44955x.getContentView().setFocusableInTouchMode(true);
                d50Var.f44955x.showAtLocation(d50Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.f25280b).getMeasuredHeight() / 2.0f) + view.getY() + f11));
                d50Var.f44955x.b();
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
