package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class sq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.al0, org.telegram.ui.Components.bl0 {
    public final int f37435a;
    public final ur f37436b;

    public sq(ur urVar, int i10) {
        this.f37435a = i10;
        this.f37436b = urVar;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ur.V(this.f37436b, view, i10);
    }

    @Override
    public boolean d(int i10, View view) {
        ur urVar = this.f37436b;
        if (urVar.getParentActivity() != null) {
            s4.h0 adapter = urVar.f38113c.getAdapter();
            qr qrVar = urVar.f38107a;
            if (adapter == qrVar) {
                return urVar.h0(qrVar.E(i10), false, view);
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
        switch (this.f37435a) {
            case 1:
                this.f37436b.u0();
                return;
            default:
                this.f37436b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        ur.U(this.f37436b, j3);
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
