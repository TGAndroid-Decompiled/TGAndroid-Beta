package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class zp0 implements org.telegram.ui.Components.d5, org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.k1, org.telegram.ui.ActionBar.z1 {
    public final int f44188a;
    public final mq0 f44189b;

    public zp0(mq0 mq0Var, int i10) {
        this.f44188a = i10;
        this.f44189b = mq0Var;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f44188a) {
            case 0:
                this.f44189b.e0(i10, z10);
                return;
            default:
                this.f44189b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        mq0 mq0Var = this.f44189b;
        if (mq0Var.Y) {
            mq0Var.a0(view, mq0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.s5) {
            org.telegram.ui.Components.om0 om0Var = mq0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.s5) view).a();
            mq0Var.X = z10;
            om0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        mq0 mq0Var = this.f44189b;
        qq0 qq0Var = mq0Var.f39668t0;
        if (qq0Var != null) {
            switch (qq0Var.f40907a) {
                case 0:
                    rq0 rq0Var = qq0Var.f40908b;
                    rq0Var.f41223a.Z();
                    rq0Var.f41224b.Z();
                    return;
                default:
                    rq0 rq0Var2 = qq0Var.f40908b;
                    rq0Var2.f41223a.Z();
                    rq0Var2.f41224b.Z();
                    return;
            }
        }
        mq0Var.Z();
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        mq0 mq0Var = this.f44189b;
        mq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = mq0Var.m0) != null && m1Var.isShowing()) {
            mq0Var.m0.d(true);
        }
    }
}
