package org.telegram.ui;

import java.util.ArrayList;
public final class u80 implements org.telegram.ui.Components.r4, org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.tt0 {
    public final int f50015a;
    public final e90 f50016b;

    public u80(e90 e90Var, int i3) {
        this.f50015a = i3;
        this.f50016b = e90Var;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        this.f50016b.a0(i3);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        e90 e90Var = this.f50016b;
        e90Var.T.a(e90Var.f44933e);
        e90Var.finishFragment();
    }

    @Override
    public void l(int i3) {
        switch (this.f50015a) {
            case 2:
                e90 e90Var = this.f50016b;
                ArrayList arrayList = e90Var.P;
                if (i3 < arrayList.size()) {
                    e90Var.f44939x.setText(org.telegram.messenger.bd.s(e90Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i3)).intValue(), false));
                    return;
                }
                e90Var.f44939x.setText("");
                return;
            default:
                e90 e90Var2 = this.f50016b;
                e90Var2.G.clearFocus();
                e90Var2.O = true;
                ArrayList arrayList2 = e90Var2.R;
                if (i3 < arrayList2.size()) {
                    e90Var2.G.setText(((Integer) arrayList2.get(i3)).toString());
                } else {
                    e90Var2.G.setText("");
                }
                e90Var2.O = false;
                return;
        }
    }

    @Override
    public void p() {
        int i3 = this.f50015a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
