package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s31 extends org.telegram.ui.Components.rl0 {
    public final Context f41006c;
    public final boolean d;
    public final t31 f41007e;

    public s31(t31 t31Var, Context context, boolean z4) {
        this.f41007e = t31Var;
        this.f41006c = context;
        this.d = z4;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        boolean z4 = this.d;
        int i10 = 0;
        t31 t31Var = this.f41007e;
        if (z4) {
            ArrayList arrayList = t31Var.f41428f;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (t31Var.f41427e >= 0) {
            i10 = 1;
        }
        return t31Var.h.size() + i10;
    }

    @Override
    public final int j(int i10) {
        if (!this.d && i10 == this.f41007e.f41427e) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.m1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s31.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m4 m4Var;
        Context context = this.f41006c;
        if (i10 != 0) {
            if (i10 != 2) {
                m4Var = new org.telegram.ui.Cells.z6(context, (b) null);
            } else {
                org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context);
                m4Var2.setText(LocaleController.getString(R.string.ChooseLanguages));
                m4Var = m4Var2;
            }
        } else {
            m4Var = new org.telegram.ui.Cells.t8(context);
        }
        return new f2.m1(m4Var);
    }
}
