package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class ta0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.yw0 {
    public final int f43717a;
    public final db0 f43718b;

    public ta0(db0 db0Var, int i10) {
        this.f43717a = i10;
        this.f43718b = db0Var;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        this.f43718b.W(i10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        db0 db0Var = this.f43718b;
        db0Var.S.a(db0Var.e);
        db0Var.finishFragment();
    }

    @Override
    public void j(int i10) {
        switch (this.f43717a) {
            case 2:
                db0 db0Var = this.f43718b;
                ArrayList arrayList = db0Var.O;
                if (i10 < arrayList.size()) {
                    db0Var.f38822w.setText(LocaleController.formatDateAudio(db0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                db0Var.f38822w.setText("");
                return;
            default:
                db0 db0Var2 = this.f43718b;
                db0Var2.F.clearFocus();
                db0Var2.N = true;
                ArrayList arrayList2 = db0Var2.Q;
                if (i10 < arrayList2.size()) {
                    db0Var2.F.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    db0Var2.F.setText("");
                }
                db0Var2.N = false;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f43717a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
