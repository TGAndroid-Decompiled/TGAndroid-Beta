package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class wq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.bm0, org.telegram.ui.Components.cm0 {
    public final int f41339a;
    public final yr f41340b;

    public wq(yr yrVar, int i10) {
        this.f41339a = i10;
        this.f41340b = yrVar;
    }

    @Override
    public boolean a(int i10, View view) {
        yr yrVar = this.f41340b;
        if (yrVar.getParentActivity() != null) {
            s4.g0 adapter = yrVar.f41895c.getAdapter();
            ur urVar = yrVar.f41889a;
            if (adapter == urVar) {
                return yrVar.h0(urVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        yr.V(this.f41340b, view, i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41339a) {
            case 1:
                this.f41340b.u0();
                return;
            default:
                this.f41340b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j10) {
        yr.U(this.f41340b, j10);
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
