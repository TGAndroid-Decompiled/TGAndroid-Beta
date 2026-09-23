package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class v21 implements org.telegram.ui.ActionBar.i6 {
    public boolean f38274a = false;
    public final w21 f38275b;

    public v21(w21 w21Var) {
        this.f38275b = w21Var;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        w21 w21Var = this.f38275b;
        if (f7 == 0.0f && !this.f38274a) {
            org.telegram.ui.Components.lp lpVar = w21Var.f38516b;
            if (lpVar != null && (arrayList = lpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.mp) obj).f26255c = w21Var.M ? 1 : 0;
                }
            }
            if (!w21Var.Q) {
                org.telegram.ui.Components.lp lpVar2 = w21Var.f38516b;
                for (int i11 = 0; i11 < lpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.mp) lpVar2.d.get(i11)).getClass();
                }
            }
            this.f38274a = true;
        }
        w21Var.E.setColorFilter(new PorterDuffColorFilter(w21Var.d.getThemedColor(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN));
        if (w21Var.Q) {
            org.telegram.ui.Components.lp lpVar3 = w21Var.f38516b;
            for (int i12 = 0; i12 < lpVar3.h(); i12++) {
                ((org.telegram.ui.Components.mp) lpVar3.d.get(i12)).getClass();
            }
        }
        if (f7 == 1.0f && this.f38274a) {
            w21Var.Q = false;
            this.f38274a = false;
        }
    }

    @Override
    public final void b() {
    }
}
