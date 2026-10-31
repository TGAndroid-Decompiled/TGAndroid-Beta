package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class y50 implements org.telegram.ui.Components.hk0, tb0 {
    public final c60 f43709a;

    public y50(c60 c60Var) {
        this.f43709a = c60Var;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x9;
        c60 c60Var = this.f43709a;
        if (z10) {
            if (org.telegram.messenger.i0.J1(c60Var)) {
                yb0 yb0Var = new yb0(4);
                yb0Var.f43797n0 = 0L;
                yb0Var.N0 = new y50(c60Var);
                c60Var.presentFragment(yb0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.p8) && c60Var.P != 5) {
            org.telegram.ui.ActionBar.k1 k1Var = c60Var.f36399x;
            if (k1Var == null || !k1Var.isShowing()) {
                m4.n0 n0Var = new m4.n0(c60Var.getParentActivity(), null, new e(c60Var, 19), true, 1, null);
                n0Var.t(c60Var.W);
                org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1((ActionBarPopupWindow$ActionBarPopupWindowLayout) n0Var.f12863a, -2, -2);
                c60Var.f36399x = k1Var2;
                k1Var2.e = true;
                k1Var2.f20456c = 220;
                k1Var2.setOutsideTouchable(true);
                c60Var.f36399x.setClippingEnabled(true);
                c60Var.f36399x.setAnimationStyle(2131755192);
                c60Var.f36399x.setFocusable(true);
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) n0Var.f12863a).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE));
                c60Var.f36399x.setInputMethodMode(2);
                c60Var.f36399x.getContentView().setFocusableInTouchMode(true);
                c60Var.f36399x.showAtLocation(c60Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) n0Var.f12863a).getMeasuredHeight() / 2.0f) + view.getY() + f10));
                c60Var.f36399x.b();
            }
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        c60 c60Var = this.f43709a;
        Location location = c60Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        c60Var.T = messageMedia.address;
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
