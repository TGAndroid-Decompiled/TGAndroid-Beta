package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class v60 implements org.telegram.ui.Components.bm0, mc0 {
    public final z60 f44193a;

    public v60(z60 z60Var) {
        this.f44193a = z60Var;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        z60 z60Var = this.f44193a;
        Location location = z60Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        z60Var.T = messageMedia.address;
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ga;
        z60 z60Var = this.f44193a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(z60Var)) {
                rc0 rc0Var = new rc0(4);
                rc0Var.f42928e0 = 0L;
                rc0Var.E0 = new v60(z60Var);
                z60Var.presentFragment(rc0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.v8) && z60Var.P != 5) {
            org.telegram.ui.ActionBar.o1 o1Var = z60Var.f46179w;
            if (o1Var == null || !o1Var.isShowing()) {
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8(z60Var.getParentActivity(), null, new f(z60Var, 22), true, 1, null);
                r8Var.b(z60Var.W);
                org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(r8Var.f32168a, -2, -2);
                z60Var.f46179w = o1Var2;
                o1Var2.e = true;
                o1Var2.f22910c = 220;
                o1Var2.setOutsideTouchable(true);
                z60Var.f46179w.setClippingEnabled(true);
                z60Var.f46179w.setAnimationStyle(R.style.PopupContextAnimation);
                z60Var.f46179w.setFocusable(true);
                r8Var.f32168a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                z60Var.f46179w.setInputMethodMode(2);
                z60Var.f46179w.getContentView().setFocusableInTouchMode(true);
                z60Var.f46179w.showAtLocation(z60Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((r8Var.f32168a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
                z60Var.f46179w.b();
            }
        }
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
