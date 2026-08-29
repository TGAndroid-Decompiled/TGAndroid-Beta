package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class ua0 implements org.telegram.ui.Components.b5, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.kv0 {
    public final int f43208a;
    public final eb0 f43209b;

    public ua0(eb0 eb0Var, int i10) {
        this.f43208a = i10;
        this.f43209b = eb0Var;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        this.f43209b.V(i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        eb0 eb0Var = this.f43209b;
        eb0Var.P.a(eb0Var.f37777e);
        eb0Var.finishFragment();
    }

    @Override
    public void h(int i10) {
        switch (this.f43208a) {
            case 2:
                eb0 eb0Var = this.f43209b;
                ArrayList arrayList = eb0Var.L;
                if (i10 < arrayList.size()) {
                    eb0Var.f37782w.setText(LocaleController.formatDateAudio(eb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                eb0Var.f37782w.setText("");
                return;
            default:
                eb0 eb0Var2 = this.f43209b;
                eb0Var2.B.clearFocus();
                eb0Var2.K = true;
                ArrayList arrayList2 = eb0Var2.N;
                if (i10 < arrayList2.size()) {
                    eb0Var2.B.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    eb0Var2.B.setText("");
                }
                eb0Var2.K = false;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f43208a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
