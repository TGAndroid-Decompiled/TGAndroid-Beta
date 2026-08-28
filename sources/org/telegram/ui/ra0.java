package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class ra0 implements org.telegram.ui.Components.x4, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.av0 {
    public final int f42338a;
    public final bb0 f42339b;

    public ra0(bb0 bb0Var, int i9) {
        this.f42338a = i9;
        this.f42339b = bb0Var;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        this.f42339b.U(i9);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        bb0 bb0Var = this.f42339b;
        bb0Var.P.a(bb0Var.f36811e);
        bb0Var.finishFragment();
    }

    @Override
    public void h(int i9) {
        switch (this.f42338a) {
            case 2:
                bb0 bb0Var = this.f42339b;
                ArrayList arrayList = bb0Var.L;
                if (i9 < arrayList.size()) {
                    bb0Var.f36816w.setText(LocaleController.formatDateAudio(bb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i9)).intValue(), false));
                    return;
                }
                bb0Var.f36816w.setText("");
                return;
            default:
                bb0 bb0Var2 = this.f42339b;
                bb0Var2.B.clearFocus();
                bb0Var2.K = true;
                ArrayList arrayList2 = bb0Var2.N;
                if (i9 < arrayList2.size()) {
                    bb0Var2.B.setText(((Integer) arrayList2.get(i9)).toString());
                } else {
                    bb0Var2.B.setText("");
                }
                bb0Var2.K = false;
                return;
        }
    }

    @Override
    public void m() {
        int i9 = this.f42338a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
