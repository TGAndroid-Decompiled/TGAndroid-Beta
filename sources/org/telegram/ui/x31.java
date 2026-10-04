package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x31 extends org.telegram.ui.Components.yl0 {
    public final Context f42734c;
    public final boolean d;
    public final y31 f42735e;

    public x31(y31 y31Var, Context context, boolean z10) {
        this.f42735e = y31Var;
        this.f42734c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f46527f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        boolean z10 = this.d;
        int i10 = 0;
        y31 y31Var = this.f42735e;
        if (z10) {
            ArrayList arrayList = y31Var.f43040f;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (y31Var.f43039e >= 0) {
            i10 = 1;
        }
        return y31Var.h.size() + i10;
    }

    @Override
    public final int j(int i10) {
        if (!this.d && i10 == this.f42735e.f43039e) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x31.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m4 m4Var;
        Context context = this.f42734c;
        if (i10 != 0) {
            if (i10 != 2) {
                m4Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
            } else {
                org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context);
                m4Var2.setText(LocaleController.getString(R.string.ChooseLanguages));
                m4Var = m4Var2;
            }
        } else {
            m4Var = new org.telegram.ui.Cells.x8(context);
        }
        return new s4.c1(m4Var);
    }
}
