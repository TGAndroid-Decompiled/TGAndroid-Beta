package org.telegram.ui;

import android.view.View;
public final class qp implements org.telegram.messenger.or, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.rj0, org.telegram.ui.Components.sj0 {
    public final int f51500a;
    public final rq f51501b;

    public qp(rq rqVar, int i7) {
        this.f51500a = i7;
        this.f51501b = rqVar;
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public boolean b(int i7, View view) {
        rq rqVar = this.f51501b;
        if (rqVar.getParentActivity() != null) {
            v4.i0 adapter = rqVar.f51816c.getAdapter();
            nq nqVar = rqVar.f51810a;
            if (adapter == nqVar) {
                return rqVar.m0(nqVar.E(i7), false, view);
            }
        }
        return false;
    }

    @Override
    public void g(float f10, float f11, int i7, View view) {
        rq.a0(this.f51501b, view, i7);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f51500a) {
            case 1:
                this.f51501b.z0();
                return;
            default:
                this.f51501b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        rq.Z(this.f51501b, j3);
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }
}
