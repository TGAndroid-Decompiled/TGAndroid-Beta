package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wu0 extends org.telegram.ui.Components.l60 {
    public final xu0 d;

    public wu0(xu0 xu0Var) {
        this.d = xu0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.f40099s.Z7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.f40099s.Y7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.f40099s.Z7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.f40097n);
        return sb2.toString();
    }

    @Override
    public final int i() {
        return Math.max(0, this.d.f40099s.Z7 - 1);
    }

    @Override
    public final int j() {
        return this.d.f40099s.Y7;
    }

    @Override
    public final void k(int i10) {
        int max;
        if (this.d.f40099s.Z7 > 0 && (max = Math.max(0, Math.min(this.d.f40099s.Z7 - 1, i10))) != this.d.f40099s.Y7) {
            xu0 xu0Var = this.d;
            xu0Var.f40098r = xu0Var.f40099s.Y7;
            this.d.f40099s.Y7 = max;
            this.d.f40099s.R0();
            this.d.invalidate();
            int i11 = this.d.f40099s.Y7;
            xu0 xu0Var2 = this.d;
            if (i11 != xu0Var2.f40098r) {
                xu0Var2.f40099s.o2(1);
            }
        }
    }
}
