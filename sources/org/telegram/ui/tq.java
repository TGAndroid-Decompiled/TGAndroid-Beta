package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class tq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.al0, org.telegram.ui.Components.bl0 {
    public final int f40839a;
    public final vr f40840b;

    public tq(vr vrVar, int i10) {
        this.f40839a = i10;
        this.f40840b = vrVar;
    }

    @Override
    public boolean a(int i10, View view) {
        vr vrVar = this.f40840b;
        if (vrVar.getParentActivity() != null) {
            s4.h0 adapter = vrVar.f41662c.getAdapter();
            rr rrVar = vrVar.f41656a;
            if (adapter == rrVar) {
                return vrVar.h0(rrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        vr.V(this.f40840b, view, i10);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40839a) {
            case 1:
                this.f40840b.u0();
                return;
            default:
                this.f40840b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        vr.U(this.f40840b, j3);
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
