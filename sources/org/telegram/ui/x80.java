package org.telegram.ui;

import java.util.ArrayList;
public final class x80 implements org.telegram.ui.Components.t4, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.ut0 {
    public final int f51783a;
    public final h90 f51784b;

    public x80(h90 h90Var, int i7) {
        this.f51783a = i7;
        this.f51784b = h90Var;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        this.f51784b.a0(i7);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        h90 h90Var = this.f51784b;
        h90Var.S.a(h90Var.f46279e);
        h90Var.finishFragment();
    }

    @Override
    public void m(int i7) {
        switch (this.f51783a) {
            case 2:
                h90 h90Var = this.f51784b;
                ArrayList arrayList = h90Var.O;
                if (i7 < arrayList.size()) {
                    h90Var.f46285x.setText(org.telegram.messenger.hd.s(h90Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i7)).intValue(), false));
                    return;
                }
                h90Var.f46285x.setText("");
                return;
            default:
                h90 h90Var2 = this.f51784b;
                h90Var2.F.clearFocus();
                h90Var2.N = true;
                ArrayList arrayList2 = h90Var2.Q;
                if (i7 < arrayList2.size()) {
                    h90Var2.F.setText(((Integer) arrayList2.get(i7)).toString());
                } else {
                    h90Var2.F.setText("");
                }
                h90Var2.N = false;
                return;
        }
    }

    @Override
    public void n() {
        int i7 = this.f51783a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
