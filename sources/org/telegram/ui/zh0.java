package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class zh0 extends s4.h0 {
    public final Context f46278c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final pi0 e;

    public zh0(pi0 pi0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        this.e = pi0Var;
        this.f46278c = context;
        this.d = u6Var;
    }

    @Override
    public final int h() {
        return this.e.M.size();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        pi0 pi0Var = this.e;
        ArrayList arrayList = pi0Var.M;
        boolean z10 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) e1Var.f47773a;
        MessageObject.GroupedMessages k10 = pi0Var.k(messageObject);
        int i11 = 0;
        if (k10 == null) {
            z10 = false;
        }
        s1Var.setInvalidatesParent(z10);
        s1Var.Z3(messageObject, k10, false, false, false, false);
        if (!pi0Var.O.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            pi0Var.P = s1Var;
            Point point = AndroidUtilities.displaySize;
            s1Var.b4(point.x, point.y);
            pi0Var.Q = messageObject.getId();
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        pi0 pi0Var = this.e;
        oi0 oi0Var = new oi0(pi0Var, this.f46278c, pi0Var.f42411c, this.d);
        oi0Var.setDelegate(new qb.a(16));
        return new s4.e1(oi0Var);
    }
}
