package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class va0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.zw0 {
    public final int f44221a;
    public final fb0 f44222b;

    public va0(fb0 fb0Var, int i10) {
        this.f44221a = i10;
        this.f44222b = fb0Var;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        this.f44222b.W(i10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        fb0 fb0Var = this.f44222b;
        fb0Var.S.a(fb0Var.e);
        fb0Var.finishFragment();
    }

    @Override
    public void j(int i10) {
        switch (this.f44221a) {
            case 2:
                fb0 fb0Var = this.f44222b;
                ArrayList arrayList = fb0Var.O;
                if (i10 < arrayList.size()) {
                    fb0Var.f39320w.setText(LocaleController.formatDateAudio(fb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                fb0Var.f39320w.setText("");
                return;
            default:
                fb0 fb0Var2 = this.f44222b;
                fb0Var2.F.clearFocus();
                fb0Var2.N = true;
                ArrayList arrayList2 = fb0Var2.Q;
                if (i10 < arrayList2.size()) {
                    fb0Var2.F.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    fb0Var2.F.setText("");
                }
                fb0Var2.N = false;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f44221a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
