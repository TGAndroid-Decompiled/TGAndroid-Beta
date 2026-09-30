package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class u21 implements org.telegram.ui.ActionBar.i6 {
    public boolean f38389a = false;
    public final v21 f38390b;

    public u21(v21 v21Var) {
        this.f38390b = v21Var;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        v21 v21Var = this.f38390b;
        if (f7 == 0.0f && !this.f38389a) {
            org.telegram.ui.Components.np npVar = v21Var.f38698b;
            if (npVar != null && (arrayList = npVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.op) obj).f27162c = v21Var.M ? 1 : 0;
                }
            }
            if (!v21Var.Q) {
                org.telegram.ui.Components.np npVar2 = v21Var.f38698b;
                for (int i11 = 0; i11 < npVar2.h(); i11++) {
                    ((org.telegram.ui.Components.op) npVar2.d.get(i11)).getClass();
                }
            }
            this.f38389a = true;
        }
        v21Var.E.setColorFilter(new PorterDuffColorFilter(v21Var.d.getThemedColor(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN));
        if (v21Var.Q) {
            org.telegram.ui.Components.np npVar3 = v21Var.f38698b;
            for (int i12 = 0; i12 < npVar3.h(); i12++) {
                ((org.telegram.ui.Components.op) npVar3.d.get(i12)).getClass();
            }
        }
        if (f7 == 1.0f && this.f38389a) {
            v21Var.Q = false;
            this.f38389a = false;
        }
    }

    @Override
    public final void b() {
    }
}
