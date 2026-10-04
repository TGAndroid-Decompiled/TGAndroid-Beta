package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class w21 implements org.telegram.ui.ActionBar.j6 {
    public boolean f41894a = false;
    public final x21 f41895b;

    public w21(x21 x21Var) {
        this.f41895b = x21Var;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        x21 x21Var = this.f41895b;
        if (f7 == 0.0f && !this.f41894a) {
            org.telegram.ui.Components.np npVar = x21Var.f42725b;
            if (npVar != null && (arrayList = npVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.op) obj).f29425c = x21Var.M ? 1 : 0;
                }
            }
            if (!x21Var.Q) {
                org.telegram.ui.Components.np npVar2 = x21Var.f42725b;
                for (int i11 = 0; i11 < npVar2.h(); i11++) {
                    ((org.telegram.ui.Components.op) npVar2.d.get(i11)).getClass();
                }
            }
            this.f41894a = true;
        }
        x21Var.E.setColorFilter(new PorterDuffColorFilter(x21Var.d.getThemedColor(org.telegram.ui.ActionBar.i6.Oh), PorterDuff.Mode.SRC_IN));
        if (x21Var.Q) {
            org.telegram.ui.Components.np npVar3 = x21Var.f42725b;
            for (int i12 = 0; i12 < npVar3.h(); i12++) {
                ((org.telegram.ui.Components.op) npVar3.d.get(i12)).getClass();
            }
        }
        if (f7 == 1.0f && this.f41894a) {
            x21Var.Q = false;
            this.f41894a = false;
        }
    }

    @Override
    public final void b() {
    }
}
