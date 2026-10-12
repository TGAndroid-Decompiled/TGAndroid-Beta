package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class tq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.lm0, org.telegram.ui.Components.mm0 {
    public final int f42263a;
    public final wr f42264b;

    public tq(wr wrVar, int i10) {
        this.f42263a = i10;
        this.f42264b = wrVar;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        wr.V(this.f42264b, view, i10);
    }

    @Override
    public boolean d(int i10, View view) {
        wr wrVar = this.f42264b;
        if (wrVar.getParentActivity() != null) {
            s4.i0 adapter = wrVar.f43614c.getAdapter();
            sr srVar = wrVar.f43608a;
            if (adapter == srVar) {
                return wrVar.h0(srVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f42263a) {
            case 1:
                this.f42264b.u0();
                return;
            default:
                this.f42264b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        wr.U(this.f42264b, j3);
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
