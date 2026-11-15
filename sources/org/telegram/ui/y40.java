package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class y40 implements org.telegram.ui.Components.hj0, ma0 {
    public final c50 f53410a;

    public y40(c50 c50Var) {
        this.f53410a = c50Var;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        c50 c50Var = this.f53410a;
        Location location = c50Var.V;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        c50Var.U = messageMedia.address;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.v9;
        c50 c50Var = this.f53410a;
        if (z10) {
            if (org.telegram.messenger.g0.J1(c50Var)) {
                pa0 pa0Var = new pa0(4);
                pa0Var.m0 = 0L;
                pa0Var.H0 = new y40(c50Var);
                c50Var.presentFragment(pa0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.l8) && c50Var.Q != 5) {
            org.telegram.ui.ActionBar.g1 g1Var = c50Var.f46026x;
            if (g1Var == null || !g1Var.isShowing()) {
                org.telegram.messenger.qe qeVar = new org.telegram.messenger.qe(c50Var.getParentActivity(), null, new f(c50Var, 19), true, 1, null);
                qeVar.u(c50Var.X);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1((ActionBarPopupWindow$ActionBarPopupWindowLayout) qeVar.f26085b, -2, -2);
                c50Var.f46026x = g1Var2;
                g1Var2.f28555e = true;
                g1Var2.f28554c = 220;
                g1Var2.setOutsideTouchable(true);
                c50Var.f46026x.setClippingEnabled(true);
                c50Var.f46026x.setAnimationStyle(2131755192);
                c50Var.f46026x.setFocusable(true);
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) qeVar.f26085b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                c50Var.f46026x.setInputMethodMode(2);
                c50Var.f46026x.getContentView().setFocusableInTouchMode(true);
                c50Var.f46026x.showAtLocation(c50Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) qeVar.f26085b).getMeasuredHeight() / 2.0f) + view.getY() + f11));
                c50Var.f46026x.b();
            }
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
