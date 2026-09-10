package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class uq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.kl0, org.telegram.ui.Components.ll0 {
    public final int f37330a;
    public final wr f37331b;

    public uq(wr wrVar, int i10) {
        this.f37330a = i10;
        this.f37331b = wrVar;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        wr.V(this.f37331b, view, i10);
    }

    @Override
    public boolean d(int i10, View view) {
        wr wrVar = this.f37331b;
        if (wrVar.getParentActivity() != null) {
            s4.h0 adapter = wrVar.f38323c.getAdapter();
            sr srVar = wrVar.f38317a;
            if (adapter == srVar) {
                return wrVar.h0(srVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f37330a) {
            case 1:
                this.f37331b.u0();
                return;
            default:
                this.f37331b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        wr.U(this.f37331b, j3);
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
