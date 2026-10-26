package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class t60 implements org.telegram.ui.Components.am0, kc0 {
    public final x60 f43688a;

    public t60(x60 x60Var) {
        this.f43688a = x60Var;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        x60 x60Var = this.f43688a;
        Location location = x60Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        x60Var.T = messageMedia.address;
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ga;
        x60 x60Var = this.f43688a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(x60Var)) {
                pc0 pc0Var = new pc0(4);
                pc0Var.f42435e0 = 0L;
                pc0Var.E0 = new t60(x60Var);
                x60Var.presentFragment(pc0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.v8) && x60Var.P != 5) {
            org.telegram.ui.ActionBar.o1 o1Var = x60Var.f45672w;
            if (o1Var == null || !o1Var.isShowing()) {
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8(x60Var.getParentActivity(), null, new f(x60Var, 22), true, 1, null);
                r8Var.b(x60Var.W);
                org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(r8Var.f32159a, -2, -2);
                x60Var.f45672w = o1Var2;
                o1Var2.e = true;
                o1Var2.f22909c = 220;
                o1Var2.setOutsideTouchable(true);
                x60Var.f45672w.setClippingEnabled(true);
                x60Var.f45672w.setAnimationStyle(R.style.PopupContextAnimation);
                x60Var.f45672w.setFocusable(true);
                r8Var.f32159a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                x60Var.f45672w.setInputMethodMode(2);
                x60Var.f45672w.getContentView().setFocusableInTouchMode(true);
                x60Var.f45672w.showAtLocation(x60Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((r8Var.f32159a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
                x60Var.f45672w.b();
            }
        }
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
