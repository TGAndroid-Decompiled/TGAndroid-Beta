package org.telegram.ui;

import android.view.View;
public final class qp implements org.telegram.messenger.pr, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.rj0, org.telegram.ui.Components.sj0 {
    public final int f51250a;
    public final rq f51251b;

    public qp(rq rqVar, int i7) {
        this.f51250a = i7;
        this.f51251b = rqVar;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int i7, View view) {
        rq rqVar = this.f51251b;
        if (rqVar.getParentActivity() != null) {
            v4.h0 adapter = rqVar.f51731c.getAdapter();
            nq nqVar = rqVar.f51725a;
            if (adapter == nqVar) {
                return rqVar.m0(nqVar.E(i7), false, view);
            }
        }
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        rq.a0(this.f51251b, view, i7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f51250a) {
            case 1:
                this.f51251b.z0();
                return;
            default:
                this.f51251b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        rq.Z(this.f51251b, j3);
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
