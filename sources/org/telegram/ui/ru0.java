package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ru0 extends org.telegram.ui.Components.a60 {
    public final su0 d;

    public ru0(su0 su0Var) {
        this.d = su0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.f41316s.V7 > 0) {
            sb.append(", ");
            sb.append(this.d.f41316s.U7 + 1);
            sb.append(" / ");
            sb.append(this.d.f41316s.V7);
        }
        sb.append(", ");
        sb.append(this.d.h);
        sb.append(" – ");
        sb.append(this.d.f41314n);
        return sb.toString();
    }

    @Override
    public final int i() {
        return Math.max(0, this.d.f41316s.V7 - 1);
    }

    @Override
    public final int j() {
        return this.d.f41316s.U7;
    }

    @Override
    public final void k(int i10) {
        int max;
        if (this.d.f41316s.V7 > 0 && (max = Math.max(0, Math.min(this.d.f41316s.V7 - 1, i10))) != this.d.f41316s.U7) {
            su0 su0Var = this.d;
            su0Var.f41315r = su0Var.f41316s.U7;
            this.d.f41316s.U7 = max;
            this.d.f41316s.R0();
            this.d.invalidate();
            int i11 = this.d.f41316s.U7;
            su0 su0Var2 = this.d;
            if (i11 != su0Var2.f41315r) {
                su0Var2.f41316s.p2(1);
            }
        }
    }
}
