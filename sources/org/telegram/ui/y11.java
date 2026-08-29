package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class y11 implements org.telegram.ui.ActionBar.h6 {
    public boolean f44698a = false;
    public final z11 f44699b;

    public y11(z11 z11Var) {
        this.f44699b = z11Var;
    }

    @Override
    public final void a(float f9) {
        ArrayList arrayList;
        z11 z11Var = this.f44699b;
        if (f9 == 0.0f && !this.f44698a) {
            org.telegram.ui.Components.ep epVar = z11Var.f45025b;
            if (epVar != null && (arrayList = epVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.fp) obj).f28514c = z11Var.I ? 1 : 0;
                }
            }
            if (!z11Var.M) {
                org.telegram.ui.Components.ep epVar2 = z11Var.f45025b;
                for (int i11 = 0; i11 < epVar2.h(); i11++) {
                    ((org.telegram.ui.Components.fp) epVar2.d.get(i11)).getClass();
                }
            }
            this.f44698a = true;
        }
        z11Var.A.setColorFilter(new PorterDuffColorFilter(z11Var.d.getThemedColor(org.telegram.ui.ActionBar.g6.Oh), PorterDuff.Mode.SRC_IN));
        if (z11Var.M) {
            org.telegram.ui.Components.ep epVar3 = z11Var.f45025b;
            for (int i12 = 0; i12 < epVar3.h(); i12++) {
                ((org.telegram.ui.Components.fp) epVar3.d.get(i12)).getClass();
            }
        }
        if (f9 == 1.0f && this.f44698a) {
            z11Var.M = false;
            this.f44698a = false;
        }
    }

    @Override
    public final void b() {
    }
}
