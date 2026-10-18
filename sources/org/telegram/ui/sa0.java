package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class sa0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.mw0 {
    public final int f41069a;
    public final cb0 f41070b;

    public sa0(cb0 cb0Var, int i10) {
        this.f41069a = i10;
        this.f41070b = cb0Var;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        this.f41070b.V(i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        cb0 cb0Var = this.f41070b;
        cb0Var.T.a(cb0Var.e);
        cb0Var.finishFragment();
    }

    @Override
    public void h(int i10) {
        switch (this.f41069a) {
            case 2:
                cb0 cb0Var = this.f41070b;
                ArrayList arrayList = cb0Var.P;
                if (i10 < arrayList.size()) {
                    cb0Var.f35917w.setText(LocaleController.formatDateAudio(cb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                cb0Var.f35917w.setText("");
                return;
            default:
                cb0 cb0Var2 = this.f41070b;
                cb0Var2.F.clearFocus();
                cb0Var2.O = true;
                ArrayList arrayList2 = cb0Var2.R;
                if (i10 < arrayList2.size()) {
                    cb0Var2.F.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    cb0Var2.F.setText("");
                }
                cb0Var2.O = false;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f41069a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
