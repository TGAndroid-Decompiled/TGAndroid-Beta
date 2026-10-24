package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class r60 implements org.telegram.ui.Components.am0, mc0 {
    public final w60 f41042a;

    public r60(w60 w60Var) {
        this.f41042a = w60Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        w60 w60Var = this.f41042a;
        Location location = w60Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        w60Var.T = messageMedia.address;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ca;
        w60 w60Var = this.f41042a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(w60Var)) {
                rc0 rc0Var = new rc0(4);
                rc0Var.f41099e0 = 0L;
                rc0Var.E0 = new r60(w60Var);
                w60Var.presentFragment(rc0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.r8) && w60Var.P != 5) {
            org.telegram.ui.ActionBar.m1 m1Var = w60Var.f42923w;
            if (m1Var == null || !m1Var.isShowing()) {
                org.telegram.ui.Components.n8 n8Var = new org.telegram.ui.Components.n8(w60Var.getParentActivity(), null, new f(w60Var, 22), true, 1, null);
                n8Var.b(w60Var.W);
                org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(n8Var.f28825a, -2, -2);
                w60Var.f42923w = m1Var2;
                m1Var2.e = true;
                m1Var2.f21632c = 220;
                m1Var2.setOutsideTouchable(true);
                w60Var.f42923w.setClippingEnabled(true);
                w60Var.f42923w.setAnimationStyle(R.style.PopupContextAnimation);
                w60Var.f42923w.setFocusable(true);
                n8Var.f28825a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                w60Var.f42923w.setInputMethodMode(2);
                w60Var.f42923w.getContentView().setFocusableInTouchMode(true);
                w60Var.f42923w.showAtLocation(w60Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((n8Var.f28825a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
                w60Var.f42923w.b();
            }
        }
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
