package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class qq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.gm0, org.telegram.ui.Components.hm0 {
    public final int f41209a;
    public final tr f41210b;

    public qq(tr trVar, int i10) {
        this.f41209a = i10;
        this.f41210b = trVar;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        tr.V(this.f41210b, view, i10);
    }

    @Override
    public boolean d(int i10, View view) {
        tr trVar = this.f41210b;
        if (trVar.getParentActivity() != null) {
            s4.i0 adapter = trVar.f42102c.getAdapter();
            pr prVar = trVar.f42096a;
            if (adapter == prVar) {
                return trVar.h0(prVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41209a) {
            case 1:
                this.f41210b.u0();
                return;
            default:
                this.f41210b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        tr.U(this.f41210b, j3);
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
