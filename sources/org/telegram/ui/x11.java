package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class x11 implements org.telegram.ui.ActionBar.g6 {
    public boolean f44323a = false;
    public final y11 f44324b;

    public x11(y11 y11Var) {
        this.f44324b = y11Var;
    }

    @Override
    public final void a(float f10) {
        ArrayList arrayList;
        y11 y11Var = this.f44324b;
        if (f10 == 0.0f && !this.f44323a) {
            org.telegram.ui.Components.ap apVar = y11Var.f44675b;
            if (apVar != null && (arrayList = apVar.d) != null) {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((org.telegram.ui.Components.bp) obj).f27263c = y11Var.I ? 1 : 0;
                }
            }
            if (!y11Var.M) {
                org.telegram.ui.Components.ap apVar2 = y11Var.f44675b;
                for (int i10 = 0; i10 < apVar2.h(); i10++) {
                    ((org.telegram.ui.Components.bp) apVar2.d.get(i10)).getClass();
                }
            }
            this.f44323a = true;
        }
        y11Var.A.setColorFilter(new PorterDuffColorFilter(y11Var.d.getThemedColor(org.telegram.ui.ActionBar.f6.Oh), PorterDuff.Mode.SRC_IN));
        if (y11Var.M) {
            org.telegram.ui.Components.ap apVar3 = y11Var.f44675b;
            for (int i11 = 0; i11 < apVar3.h(); i11++) {
                ((org.telegram.ui.Components.bp) apVar3.d.get(i11)).getClass();
            }
        }
        if (f10 == 1.0f && this.f44323a) {
            y11Var.M = false;
            this.f44323a = false;
        }
    }

    @Override
    public final void b() {
    }
}
