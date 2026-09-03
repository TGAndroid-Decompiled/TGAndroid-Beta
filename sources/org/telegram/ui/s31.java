package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s31 extends org.telegram.ui.Components.ql0 {
    public final Context f38097c;
    public final boolean d;
    public final t31 e;

    public s31(t31 t31Var, Context context, boolean z4) {
        this.e = t31Var;
        this.f38097c = context;
        this.d = z4;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        boolean z4 = this.d;
        int i10 = 0;
        t31 t31Var = this.e;
        if (z4) {
            ArrayList arrayList = t31Var.f38378f;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (t31Var.e >= 0) {
            i10 = 1;
        }
        return t31Var.h.size() + i10;
    }

    @Override
    public final int j(int i10) {
        if (!this.d && i10 == this.e.e) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s31.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.l4 l4Var;
        Context context = this.f38097c;
        if (i10 != 0) {
            if (i10 != 2) {
                l4Var = new org.telegram.ui.Cells.y6(context, (b) null);
            } else {
                org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context);
                l4Var2.setText(LocaleController.getString(R.string.ChooseLanguages));
                l4Var = l4Var2;
            }
        } else {
            l4Var = new org.telegram.ui.Cells.s8(context);
        }
        return new f2.l1(l4Var);
    }
}
