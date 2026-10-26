package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class xh0 extends s4.h0 {
    public final Context f45776c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final ni0 e;

    public xh0(ni0 ni0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        this.e = ni0Var;
        this.f45776c = context;
        this.d = u6Var;
    }

    @Override
    public final int h() {
        return this.e.M.size();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        ni0 ni0Var = this.e;
        ArrayList arrayList = ni0Var.M;
        boolean z10 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) e1Var.f47738a;
        MessageObject.GroupedMessages k10 = ni0Var.k(messageObject);
        int i11 = 0;
        if (k10 == null) {
            z10 = false;
        }
        s1Var.setInvalidatesParent(z10);
        s1Var.Z3(messageObject, k10, false, false, false, false);
        if (!ni0Var.O.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            ni0Var.P = s1Var;
            Point point = AndroidUtilities.displaySize;
            s1Var.b4(point.x, point.y);
            ni0Var.Q = messageObject.getId();
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        ni0 ni0Var = this.e;
        mi0 mi0Var = new mi0(ni0Var, this.f45776c, ni0Var.f41908c, this.d);
        mi0Var.setDelegate(new qb.a(16));
        return new s4.e1(mi0Var);
    }
}
