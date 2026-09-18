package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class qq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ll0, org.telegram.ui.Components.ml0 {
    public final int f36871a;
    public final sr f36872b;

    public qq(sr srVar, int i10) {
        this.f36871a = i10;
        this.f36872b = srVar;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        sr.V(this.f36872b, view, i10);
    }

    @Override
    public boolean d(int i10, View view) {
        sr srVar = this.f36872b;
        if (srVar.getParentActivity() != null) {
            s4.h0 adapter = srVar.f37398c.getAdapter();
            or orVar = srVar.f37392a;
            if (adapter == orVar) {
                return srVar.h0(orVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36871a) {
            case 1:
                this.f36872b.u0();
                return;
            default:
                this.f36872b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        sr.U(this.f36872b, j3);
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
