package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class qq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.fm0, org.telegram.ui.Components.gm0 {
    public final int f41163a;
    public final tr f41164b;

    public qq(tr trVar, int i10) {
        this.f41163a = i10;
        this.f41164b = trVar;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        tr.V(this.f41164b, view, i10);
    }

    @Override
    public boolean d(int i10, View view) {
        tr trVar = this.f41164b;
        if (trVar.getParentActivity() != null) {
            s4.i0 adapter = trVar.f42056c.getAdapter();
            pr prVar = trVar.f42050a;
            if (adapter == prVar) {
                return trVar.h0(prVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41163a) {
            case 1:
                this.f41164b.u0();
                return;
            default:
                this.f41164b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        tr.U(this.f41164b, j3);
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
