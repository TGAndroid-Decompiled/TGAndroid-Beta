package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class tq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.al0, org.telegram.ui.Components.bl0 {
    public final int f40840a;
    public final vr f40841b;

    public tq(vr vrVar, int i10) {
        this.f40840a = i10;
        this.f40841b = vrVar;
    }

    @Override
    public boolean a(int i10, View view) {
        vr vrVar = this.f40841b;
        if (vrVar.getParentActivity() != null) {
            s4.h0 adapter = vrVar.f41663c.getAdapter();
            rr rrVar = vrVar.f41657a;
            if (adapter == rrVar) {
                return vrVar.h0(rrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        vr.V(this.f40841b, view, i10);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40840a) {
            case 1:
                this.f40841b.u0();
                return;
            default:
                this.f40841b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        vr.U(this.f40841b, j3);
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
