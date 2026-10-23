package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class xa0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.rw0 {
    public final int f43555a;
    public final gb0 f43556b;

    public xa0(gb0 gb0Var, int i10) {
        this.f43555a = i10;
        this.f43556b = gb0Var;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        this.f43556b.V(i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        gb0 gb0Var = this.f43556b;
        gb0Var.T.a(gb0Var.e);
        gb0Var.finishFragment();
    }

    @Override
    public void i(int i10) {
        switch (this.f43555a) {
            case 2:
                gb0 gb0Var = this.f43556b;
                ArrayList arrayList = gb0Var.P;
                if (i10 < arrayList.size()) {
                    gb0Var.f37560w.setText(LocaleController.formatDateAudio(gb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                gb0Var.f37560w.setText("");
                return;
            default:
                gb0 gb0Var2 = this.f43556b;
                gb0Var2.F.clearFocus();
                gb0Var2.O = true;
                ArrayList arrayList2 = gb0Var2.R;
                if (i10 < arrayList2.size()) {
                    gb0Var2.F.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    gb0Var2.F.setText("");
                }
                gb0Var2.O = false;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f43555a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
