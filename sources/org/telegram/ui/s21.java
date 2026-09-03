package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class s21 implements org.telegram.ui.ActionBar.k6 {
    public boolean f38092a = false;
    public final t21 f38093b;

    public s21(t21 t21Var) {
        this.f38093b = t21Var;
    }

    @Override
    public final void a(float f10) {
        ArrayList arrayList;
        t21 t21Var = this.f38093b;
        if (f10 == 0.0f && !this.f38092a) {
            org.telegram.ui.Components.hp hpVar = t21Var.f38362b;
            if (hpVar != null && (arrayList = hpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.ip) obj).f25751c = t21Var.J ? 1 : 0;
                }
            }
            if (!t21Var.N) {
                org.telegram.ui.Components.hp hpVar2 = t21Var.f38362b;
                for (int i11 = 0; i11 < hpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.ip) hpVar2.d.get(i11)).getClass();
                }
            }
            this.f38092a = true;
        }
        t21Var.B.setColorFilter(new PorterDuffColorFilter(t21Var.d.getThemedColor(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN));
        if (t21Var.N) {
            org.telegram.ui.Components.hp hpVar3 = t21Var.f38362b;
            for (int i12 = 0; i12 < hpVar3.h(); i12++) {
                ((org.telegram.ui.Components.ip) hpVar3.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.f38092a) {
            t21Var.N = false;
            this.f38092a = false;
        }
    }

    @Override
    public final void b() {
    }
}
