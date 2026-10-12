package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class wq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.bm0, org.telegram.ui.Components.cm0 {
    public final int f41635a;
    public final yr f41636b;

    public wq(yr yrVar, int i10) {
        this.f41635a = i10;
        this.f41636b = yrVar;
    }

    @Override
    public boolean a(int i10, View view) {
        yr yrVar = this.f41636b;
        if (yrVar.getParentActivity() != null) {
            s4.g0 adapter = yrVar.f42218c.getAdapter();
            ur urVar = yrVar.f42212a;
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
        yr.V(this.f41636b, view, i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41635a) {
            case 1:
                this.f41636b.u0();
                return;
            default:
                this.f41636b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j10) {
        yr.U(this.f41636b, j10);
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
