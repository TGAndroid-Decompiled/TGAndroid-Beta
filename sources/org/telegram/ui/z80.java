package org.telegram.ui;

import java.util.ArrayList;
public final class z80 implements org.telegram.ui.Components.t4, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.wt0 {
    public final int f52470a;
    public final j90 f52471b;

    public z80(j90 j90Var, int i7) {
        this.f52470a = i7;
        this.f52471b = j90Var;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        this.f52471b.a0(i7);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        j90 j90Var = this.f52471b;
        j90Var.S.a(j90Var.f46889e);
        j90Var.finishFragment();
    }

    @Override
    public void m(int i7) {
        switch (this.f52470a) {
            case 2:
                j90 j90Var = this.f52471b;
                ArrayList arrayList = j90Var.O;
                if (i7 < arrayList.size()) {
                    j90Var.f46895x.setText(org.telegram.messenger.id.s(j90Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i7)).intValue(), false));
                    return;
                }
                j90Var.f46895x.setText("");
                return;
            default:
                j90 j90Var2 = this.f52471b;
                j90Var2.F.clearFocus();
                j90Var2.N = true;
                ArrayList arrayList2 = j90Var2.Q;
                if (i7 < arrayList2.size()) {
                    j90Var2.F.setText(((Integer) arrayList2.get(i7)).toString());
                } else {
                    j90Var2.F.setText("");
                }
                j90Var2.N = false;
                return;
        }
    }

    @Override
    public void n() {
        int i7 = this.f52470a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
