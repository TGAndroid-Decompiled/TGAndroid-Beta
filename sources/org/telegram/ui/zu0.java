package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zu0 extends org.telegram.ui.Components.l60 {
    public final av0 d;

    public zu0(av0 av0Var) {
        this.d = av0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.f34927s.Z7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.f34927s.Y7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.f34927s.Z7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.f34925n);
        return sb2.toString();
    }

    @Override
    public final int i() {
        return Math.max(0, this.d.f34927s.Z7 - 1);
    }

    @Override
    public final int j() {
        return this.d.f34927s.Y7;
    }

    @Override
    public final void k(int i10) {
        int max;
        if (this.d.f34927s.Z7 > 0 && (max = Math.max(0, Math.min(this.d.f34927s.Z7 - 1, i10))) != this.d.f34927s.Y7) {
            av0 av0Var = this.d;
            av0Var.f34926r = av0Var.f34927s.Y7;
            this.d.f34927s.Y7 = max;
            this.d.f34927s.R0();
            this.d.invalidate();
            int i11 = this.d.f34927s.Y7;
            av0 av0Var2 = this.d;
            if (i11 != av0Var2.f34926r) {
                av0Var2.f34927s.p2(1);
            }
        }
    }
}
