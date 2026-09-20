package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class qq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.kl0, org.telegram.ui.Components.ll0 {
    public final int f36957a;
    public final sr f36958b;

    public qq(sr srVar, int i10) {
        this.f36957a = i10;
        this.f36958b = srVar;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        sr.V(this.f36958b, view, i10);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public boolean d(int i10, View view) {
        sr srVar = this.f36958b;
        if (srVar.getParentActivity() != null) {
            s4.h0 adapter = srVar.f37453c.getAdapter();
            or orVar = srVar.f37447a;
            if (adapter == orVar) {
                return srVar.h0(orVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36957a) {
            case 1:
                this.f36958b.u0();
                return;
            default:
                this.f36958b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        sr.U(this.f36958b, j3);
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
