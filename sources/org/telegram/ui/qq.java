package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class qq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.hm0, org.telegram.ui.Components.im0 {
    public final int f41217a;
    public final sr f41218b;

    public qq(sr srVar, int i10) {
        this.f41217a = i10;
        this.f41218b = srVar;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        sr.V(this.f41218b, view, i10);
    }

    @Override
    public boolean d(int i10, View view) {
        sr srVar = this.f41218b;
        if (srVar.getParentActivity() != null) {
            s4.i0 adapter = srVar.f41790c.getAdapter();
            or orVar = srVar.f41784a;
            if (adapter == orVar) {
                return srVar.h0(orVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41217a) {
            case 1:
                this.f41218b.u0();
                return;
            default:
                this.f41218b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        sr.U(this.f41218b, j3);
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
