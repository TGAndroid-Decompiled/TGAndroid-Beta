package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;

public final class va0 implements org.telegram.ui.Components.x4, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.cv0 {

    public final int f43395a;

    public final fb0 f43396b;

    public va0(fb0 fb0Var, int i10) {
        this.f43395a = i10;
        this.f43396b = fb0Var;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        this.f43396b.V(i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        fb0 fb0Var = this.f43396b;
        fb0Var.P.a(fb0Var.f38057e);
        fb0Var.finishFragment();
    }

    @Override
    public void j(int i10) {
        switch (this.f43395a) {
            case 2:
                fb0 fb0Var = this.f43396b;
                ArrayList arrayList = fb0Var.L;
                if (i10 >= arrayList.size()) {
                    fb0Var.f38062w.setText("");
                } else {
                    fb0Var.f38062w.setText(LocaleController.formatDateAudio(fb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                }
                break;
            default:
                fb0 fb0Var2 = this.f43396b;
                fb0Var2.B.clearFocus();
                fb0Var2.K = true;
                ArrayList arrayList2 = fb0Var2.N;
                if (i10 < arrayList2.size()) {
                    fb0Var2.B.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    fb0Var2.B.setText("");
                }
                fb0Var2.K = false;
                break;
        }
    }

    @Override
    public void m() {
        int i10 = this.f43395a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
