package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class w21 implements org.telegram.ui.ActionBar.j6 {
    public boolean f38791a = false;
    public final x21 f38792b;

    public w21(x21 x21Var) {
        this.f38792b = x21Var;
    }

    @Override
    public final void a(float f7) {
        ArrayList arrayList;
        x21 x21Var = this.f38792b;
        if (f7 == 0.0f && !this.f38791a) {
            org.telegram.ui.Components.mp mpVar = x21Var.f39502b;
            if (mpVar != null && (arrayList = mpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.np) obj).f26879c = x21Var.M ? 1 : 0;
                }
            }
            if (!x21Var.Q) {
                org.telegram.ui.Components.mp mpVar2 = x21Var.f39502b;
                for (int i11 = 0; i11 < mpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.np) mpVar2.d.get(i11)).getClass();
                }
            }
            this.f38791a = true;
        }
        x21Var.E.setColorFilter(new PorterDuffColorFilter(x21Var.d.getThemedColor(org.telegram.ui.ActionBar.i6.Oh), PorterDuff.Mode.SRC_IN));
        if (x21Var.Q) {
            org.telegram.ui.Components.mp mpVar3 = x21Var.f39502b;
            for (int i12 = 0; i12 < mpVar3.h(); i12++) {
                ((org.telegram.ui.Components.np) mpVar3.d.get(i12)).getClass();
            }
        }
        if (f7 == 1.0f && this.f38791a) {
            x21Var.Q = false;
            this.f38791a = false;
        }
    }

    @Override
    public final void b() {
    }
}
