package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class x50 implements org.telegram.ui.Components.ik0, sb0 {
    public final b60 f43246a;

    public x50(b60 b60Var) {
        this.f43246a = b60Var;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x9;
        b60 b60Var = this.f43246a;
        if (z10) {
            if (org.telegram.messenger.i0.J1(b60Var)) {
                xb0 xb0Var = new xb0(4);
                xb0Var.f43317n0 = 0L;
                xb0Var.N0 = new x50(b60Var);
                b60Var.presentFragment(xb0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.p8) && b60Var.P != 5) {
            org.telegram.ui.ActionBar.k1 k1Var = b60Var.f35961x;
            if (k1Var == null || !k1Var.isShowing()) {
                m4.n0 n0Var = new m4.n0(b60Var.getParentActivity(), null, new e(b60Var, 19), true, 1, null);
                n0Var.t(b60Var.W);
                org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1((ActionBarPopupWindow$ActionBarPopupWindowLayout) n0Var.f12864a, -2, -2);
                b60Var.f35961x = k1Var2;
                k1Var2.e = true;
                k1Var2.f20457c = 220;
                k1Var2.setOutsideTouchable(true);
                b60Var.f35961x.setClippingEnabled(true);
                b60Var.f35961x.setAnimationStyle(2131755192);
                b60Var.f35961x.setFocusable(true);
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) n0Var.f12864a).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE));
                b60Var.f35961x.setInputMethodMode(2);
                b60Var.f35961x.getContentView().setFocusableInTouchMode(true);
                b60Var.f35961x.showAtLocation(b60Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) n0Var.f12864a).getMeasuredHeight() / 2.0f) + view.getY() + f10));
                b60Var.f35961x.b();
            }
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        b60 b60Var = this.f43246a;
        Location location = b60Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        b60Var.T = messageMedia.address;
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
