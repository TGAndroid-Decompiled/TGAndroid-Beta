package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class z21 extends org.telegram.ui.Components.mm0 {
    public final Context f46145c;
    public final boolean d;
    public final a31 e;

    public z21(a31 a31Var, Context context, boolean z10) {
        this.e = a31Var;
        this.f46145c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47776f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        boolean z10 = this.d;
        int i10 = 0;
        a31 a31Var = this.e;
        if (z10) {
            ArrayList arrayList = a31Var.f37675f;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (a31Var.e >= 0) {
            i10 = 1;
        }
        return a31Var.h.size() + i10;
    }

    @Override
    public final int j(int i10) {
        if (!this.d && i10 == this.e.e) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.e1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z21.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.q4 q4Var;
        Context context = this.f46145c;
        if (i10 != 0) {
            if (i10 != 2) {
                q4Var = new org.telegram.ui.Cells.f7(context, (d3) null);
            } else {
                org.telegram.ui.Cells.q4 q4Var2 = new org.telegram.ui.Cells.q4(context);
                q4Var2.setText(LocaleController.getString(R.string.ChooseLanguages));
                q4Var = q4Var2;
            }
        } else {
            q4Var = new org.telegram.ui.Cells.b9(context);
        }
        return new s4.e1(q4Var);
    }
}
