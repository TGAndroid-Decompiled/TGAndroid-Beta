package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class u21 implements org.telegram.ui.ActionBar.i6 {
    public boolean f38280a = false;
    public final v21 f38281b;

    public u21(v21 v21Var) {
        this.f38281b = v21Var;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        v21 v21Var = this.f38281b;
        if (f7 == 0.0f && !this.f38280a) {
            org.telegram.ui.Components.lp lpVar = v21Var.f38593b;
            if (lpVar != null && (arrayList = lpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.mp) obj).f26559c = v21Var.M ? 1 : 0;
                }
            }
            if (!v21Var.Q) {
                org.telegram.ui.Components.lp lpVar2 = v21Var.f38593b;
                for (int i11 = 0; i11 < lpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.mp) lpVar2.d.get(i11)).getClass();
                }
            }
            this.f38280a = true;
        }
        v21Var.E.setColorFilter(new PorterDuffColorFilter(v21Var.d.getThemedColor(org.telegram.ui.ActionBar.h6.Oh), PorterDuff.Mode.SRC_IN));
        if (v21Var.Q) {
            org.telegram.ui.Components.lp lpVar3 = v21Var.f38593b;
            for (int i12 = 0; i12 < lpVar3.h(); i12++) {
                ((org.telegram.ui.Components.mp) lpVar3.d.get(i12)).getClass();
            }
        }
        if (f7 == 1.0f && this.f38280a) {
            v21Var.Q = false;
            this.f38280a = false;
        }
    }

    @Override
    public final void b() {
    }
}
