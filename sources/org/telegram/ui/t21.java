package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t21 extends org.telegram.ui.Components.km0 {
    public final Context f41862c;
    public final boolean d;
    public final u21 e;

    public t21(u21 u21Var, Context context, boolean z10) {
        this.e = u21Var;
        this.f41862c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46345f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        boolean z10 = this.d;
        int i10 = 0;
        u21 u21Var = this.e;
        if (z10) {
            ArrayList arrayList = u21Var.f42190f;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (u21Var.e >= 0) {
            i10 = 1;
        }
        return u21Var.h.size() + i10;
    }

    @Override
    public final int j(int i10) {
        if (!this.d && i10 == this.e.e) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t21.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.l4 l4Var;
        Context context = this.f41862c;
        if (i10 != 0) {
            if (i10 != 2) {
                l4Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
            } else {
                org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context);
                l4Var2.setText(LocaleController.getString(R.string.ChooseLanguages));
                l4Var = l4Var2;
            }
        } else {
            l4Var = new org.telegram.ui.Cells.x8(context);
        }
        return new s4.b1(l4Var);
    }
}
