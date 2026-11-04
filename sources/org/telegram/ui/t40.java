package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class t40 implements org.telegram.ui.Components.gj0, ia0 {
    public final y40 f49696a;

    public t40(y40 y40Var) {
        this.f49696a = y40Var;
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.v9;
        y40 y40Var = this.f49696a;
        if (z10) {
            if (org.telegram.messenger.g0.J1(y40Var)) {
                la0 la0Var = new la0(4);
                la0Var.m0 = 0L;
                la0Var.H0 = new t40(y40Var);
                y40Var.presentFragment(la0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.l8) && y40Var.Q != 5) {
            org.telegram.ui.ActionBar.f1 f1Var = y40Var.f52189x;
            if (f1Var == null || !f1Var.isShowing()) {
                o4.m0 m0Var = new o4.m0(y40Var.getParentActivity(), null, new f(y40Var, 19), true, 1, null);
                m0Var.t(y40Var.X);
                org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1((ActionBarPopupWindow$ActionBarPopupWindowLayout) m0Var.f20753a, -2, -2);
                y40Var.f52189x = f1Var2;
                f1Var2.f27495e = true;
                f1Var2.f27494c = 220;
                f1Var2.setOutsideTouchable(true);
                y40Var.f52189x.setClippingEnabled(true);
                y40Var.f52189x.setAnimationStyle(2131755192);
                y40Var.f52189x.setFocusable(true);
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) m0Var.f20753a).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                y40Var.f52189x.setInputMethodMode(2);
                y40Var.f52189x.getContentView().setFocusableInTouchMode(true);
                y40Var.f52189x.showAtLocation(y40Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) m0Var.f20753a).getMeasuredHeight() / 2.0f) + view.getY() + f11));
                y40Var.f52189x.b();
            }
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        y40 y40Var = this.f49696a;
        Location location = y40Var.V;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        y40Var.U = messageMedia.address;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
