package org.telegram.ui;

import java.util.ArrayList;
public final class z80 implements org.telegram.ui.Components.z4, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.du0 {
    public final int f54457a;
    public final j90 f54458b;

    public z80(j90 j90Var, int i7) {
        this.f54457a = i7;
        this.f54458b = j90Var;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        this.f54458b.a0(i7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        j90 j90Var = this.f54458b;
        j90Var.T.a(j90Var.f48919e);
        j90Var.finishFragment();
    }

    @Override
    public void k(int i7) {
        switch (this.f54457a) {
            case 2:
                j90 j90Var = this.f54458b;
                ArrayList arrayList = j90Var.P;
                if (i7 < arrayList.size()) {
                    j90Var.f48925x.setText(org.telegram.messenger.gd.s(j90Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i7)).intValue(), false));
                    return;
                }
                j90Var.f48925x.setText("");
                return;
            default:
                j90 j90Var2 = this.f54458b;
                j90Var2.G.clearFocus();
                j90Var2.O = true;
                ArrayList arrayList2 = j90Var2.R;
                if (i7 < arrayList2.size()) {
                    j90Var2.G.setText(((Integer) arrayList2.get(i7)).toString());
                } else {
                    j90Var2.G.setText("");
                }
                j90Var2.O = false;
                return;
        }
    }

    @Override
    public void o() {
        int i7 = this.f54457a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
