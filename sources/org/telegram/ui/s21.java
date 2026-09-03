package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class s21 implements org.telegram.ui.ActionBar.l6 {
    public boolean f41000a = false;
    public final t21 f41001b;

    public s21(t21 t21Var) {
        this.f41001b = t21Var;
    }

    @Override
    public final void a(float f10) {
        ArrayList arrayList;
        t21 t21Var = this.f41001b;
        if (f10 == 0.0f && !this.f41000a) {
            org.telegram.ui.Components.kp kpVar = t21Var.f41390b;
            if (kpVar != null && (arrayList = kpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.lp) obj).f28821c = t21Var.J ? 1 : 0;
                }
            }
            if (!t21Var.N) {
                org.telegram.ui.Components.kp kpVar2 = t21Var.f41390b;
                for (int i11 = 0; i11 < kpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.lp) kpVar2.d.get(i11)).getClass();
                }
            }
            this.f41000a = true;
        }
        t21Var.B.setColorFilter(new PorterDuffColorFilter(t21Var.d.getThemedColor(org.telegram.ui.ActionBar.k6.Oh), PorterDuff.Mode.SRC_IN));
        if (t21Var.N) {
            org.telegram.ui.Components.kp kpVar3 = t21Var.f41390b;
            for (int i12 = 0; i12 < kpVar3.h(); i12++) {
                ((org.telegram.ui.Components.lp) kpVar3.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.f41000a) {
            t21Var.N = false;
            this.f41000a = false;
        }
    }

    @Override
    public final void b() {
    }
}
