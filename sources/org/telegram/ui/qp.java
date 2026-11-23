package org.telegram.ui;

import android.view.View;
public final class qp implements org.telegram.messenger.pr, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.rj0, org.telegram.ui.Components.sj0 {
    public final int f51318a;
    public final rq f51319b;

    public qp(rq rqVar, int i7) {
        this.f51318a = i7;
        this.f51319b = rqVar;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int i7, View view) {
        rq rqVar = this.f51319b;
        if (rqVar.getParentActivity() != null) {
            v4.i0 adapter = rqVar.f51701c.getAdapter();
            nq nqVar = rqVar.f51695a;
            if (adapter == nqVar) {
                return rqVar.m0(nqVar.E(i7), false, view);
            }
        }
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        rq.a0(this.f51319b, view, i7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f51318a) {
            case 1:
                this.f51319b.z0();
                return;
            default:
                this.f51319b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        rq.Z(this.f51319b, j3);
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
