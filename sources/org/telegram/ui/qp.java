package org.telegram.ui;

import android.view.View;
public final class qp implements org.telegram.messenger.or, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.pj0, org.telegram.ui.Components.qj0 {
    public final int f51300a;
    public final rq f51301b;

    public qp(rq rqVar, int i7) {
        this.f51300a = i7;
        this.f51301b = rqVar;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int i7, View view) {
        rq rqVar = this.f51301b;
        if (rqVar.getParentActivity() != null) {
            v4.i0 adapter = rqVar.f51733c.getAdapter();
            nq nqVar = rqVar.f51727a;
            if (adapter == nqVar) {
                return rqVar.m0(nqVar.E(i7), false, view);
            }
        }
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        rq.a0(this.f51301b, view, i7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f51300a) {
            case 1:
                this.f51301b.z0();
                return;
            default:
                this.f51301b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        rq.Z(this.f51301b, j3);
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
