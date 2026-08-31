package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class vp0 implements org.telegram.ui.Components.y4, org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.n1, org.telegram.ui.ActionBar.c2 {
    public final int f42272a;
    public final hq0 f42273b;

    public vp0(hq0 hq0Var, int i10) {
        this.f42272a = i10;
        this.f42273b = hq0Var;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        switch (this.f42272a) {
            case 0:
                this.f42273b.e0(i10, z4);
                return;
            default:
                this.f42273b.e0(i10, z4);
                return;
        }
    }

    @Override
    public boolean f(int i10, View view) {
        hq0 hq0Var = this.f42273b;
        if (hq0Var.V) {
            hq0Var.a0(view, hq0Var.G.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.t5) {
            org.telegram.ui.Components.wl0 wl0Var = hq0Var.S;
            boolean z4 = !((org.telegram.ui.Cells.t5) view).a();
            hq0Var.U = z4;
            wl0Var.d(view, i10, z4);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        hq0 hq0Var = this.f42273b;
        lq0 lq0Var = hq0Var.f37592q0;
        if (lq0Var != null) {
            switch (lq0Var.f38839a) {
                case 0:
                    mq0 mq0Var = lq0Var.f38840b;
                    mq0Var.f39199a.Z();
                    mq0Var.f39200b.Z();
                    return;
                default:
                    mq0 mq0Var2 = lq0Var.f38840b;
                    mq0Var2.f39199a.Z();
                    mq0Var2.f39200b.Z();
                    return;
            }
        }
        hq0Var.Z();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        hq0 hq0Var = this.f42273b;
        hq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = hq0Var.f37585j0) != null && p1Var.isShowing()) {
            hq0Var.f37585j0.d(true);
        }
    }
}
