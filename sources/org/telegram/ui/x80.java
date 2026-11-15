package org.telegram.ui;

import java.util.ArrayList;
public final class x80 implements org.telegram.ui.Components.r4, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.vt0 {
    public final int f53122a;
    public final i90 f53123b;

    public x80(i90 i90Var, int i7) {
        this.f53122a = i7;
        this.f53123b = i90Var;
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        this.f53123b.a0(i7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        i90 i90Var = this.f53123b;
        i90Var.T.a(i90Var.f47979e);
        i90Var.finishFragment();
    }

    @Override
    public void l(int i7) {
        switch (this.f53122a) {
            case 2:
                i90 i90Var = this.f53123b;
                ArrayList arrayList = i90Var.P;
                if (i7 < arrayList.size()) {
                    i90Var.f47985x.setText(org.telegram.messenger.hd.s(i90Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i7)).intValue(), false));
                    return;
                }
                i90Var.f47985x.setText("");
                return;
            default:
                i90 i90Var2 = this.f53123b;
                i90Var2.G.clearFocus();
                i90Var2.O = true;
                ArrayList arrayList2 = i90Var2.R;
                if (i7 < arrayList2.size()) {
                    i90Var2.G.setText(((Integer) arrayList2.get(i7)).toString());
                } else {
                    i90Var2.G.setText("");
                }
                i90Var2.O = false;
                return;
        }
    }

    @Override
    public void p() {
        int i7 = this.f53122a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
