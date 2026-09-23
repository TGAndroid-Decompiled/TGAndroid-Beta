package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xu0 extends org.telegram.ui.Components.y50 {
    public final yu0 d;

    public xu0(yu0 yu0Var) {
        this.d = yu0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.f39901s.Z7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.f39901s.Y7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.f39901s.Z7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.f39899n);
        return sb2.toString();
    }

    @Override
    public final int i() {
        return Math.max(0, this.d.f39901s.Z7 - 1);
    }

    @Override
    public final int j() {
        return this.d.f39901s.Y7;
    }

    @Override
    public final void k(int i10) {
        int max;
        if (this.d.f39901s.Z7 > 0 && (max = Math.max(0, Math.min(this.d.f39901s.Z7 - 1, i10))) != this.d.f39901s.Y7) {
            yu0 yu0Var = this.d;
            yu0Var.f39900r = yu0Var.f39901s.Y7;
            this.d.f39901s.Y7 = max;
            this.d.f39901s.R0();
            this.d.invalidate();
            int i11 = this.d.f39901s.Y7;
            yu0 yu0Var2 = this.d;
            if (i11 != yu0Var2.f39900r) {
                yu0Var2.f39901s.o2(1);
            }
        }
    }
}
