package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w31 extends org.telegram.ui.Components.ll0 {
    public final Context f38527c;
    public final boolean d;
    public final x31 e;

    public w31(x31 x31Var, Context context, boolean z10) {
        this.e = x31Var;
        this.f38527c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42630f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        boolean z10 = this.d;
        int i10 = 0;
        x31 x31Var = this.e;
        if (z10) {
            ArrayList arrayList = x31Var.f39183f;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (x31Var.e >= 0) {
            i10 = 1;
        }
        return x31Var.h.size() + i10;
    }

    @Override
    public final int j(int i10) {
        if (!this.d && i10 == this.e.e) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w31.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m4 m4Var;
        Context context = this.f38527c;
        if (i10 != 0) {
            if (i10 != 2) {
                m4Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
            } else {
                org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context);
                m4Var2.setText(LocaleController.getString(R.string.ChooseLanguages));
                m4Var = m4Var2;
            }
        } else {
            m4Var = new org.telegram.ui.Cells.y8(context);
        }
        return new s4.c1(m4Var);
    }
}
