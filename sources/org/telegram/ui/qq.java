package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class qq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.nl0, org.telegram.ui.Components.ol0 {
    public final int f36980a;
    public final sr f36981b;

    public qq(sr srVar, int i10) {
        this.f36980a = i10;
        this.f36981b = srVar;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        sr.V(this.f36981b, view, i10);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public boolean d(int i10, View view) {
        sr srVar = this.f36981b;
        if (srVar.getParentActivity() != null) {
            s4.h0 adapter = srVar.f37477c.getAdapter();
            or orVar = srVar.f37471a;
            if (adapter == orVar) {
                return srVar.h0(orVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36980a) {
            case 1:
                this.f36981b.u0();
                return;
            default:
                this.f36981b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        sr.U(this.f36981b, j3);
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
