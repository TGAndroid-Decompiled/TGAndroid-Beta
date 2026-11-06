package org.telegram.ui;

import java.util.ArrayList;
public final class x80 implements org.telegram.ui.Components.t4, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.ut0 {
    public final int f51798a;
    public final h90 f51799b;

    public x80(h90 h90Var, int i7) {
        this.f51798a = i7;
        this.f51799b = h90Var;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        this.f51799b.a0(i7);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        h90 h90Var = this.f51799b;
        h90Var.S.a(h90Var.f46298e);
        h90Var.finishFragment();
    }

    @Override
    public void m(int i7) {
        switch (this.f51798a) {
            case 2:
                h90 h90Var = this.f51799b;
                ArrayList arrayList = h90Var.O;
                if (i7 < arrayList.size()) {
                    h90Var.f46304x.setText(org.telegram.messenger.hd.s(h90Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i7)).intValue(), false));
                    return;
                }
                h90Var.f46304x.setText("");
                return;
            default:
                h90 h90Var2 = this.f51799b;
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
        int i7 = this.f51798a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
