package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class xh0 extends s4.g0 {
    public final Context f43123c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final ni0 e;

    public xh0(ni0 ni0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = ni0Var;
        this.f43123c = context;
        this.d = d6Var;
    }

    @Override
    public final int h() {
        return this.e.N.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        ni0 ni0Var = this.e;
        ArrayList arrayList = ni0Var.N;
        boolean z10 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) b1Var.f45910a;
        MessageObject.GroupedMessages l4 = ni0Var.l(messageObject);
        int i11 = 0;
        if (l4 == null) {
            z10 = false;
        }
        u1Var.setInvalidatesParent(z10);
        u1Var.X3(messageObject, l4, false, false, false, false);
        if (!ni0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            ni0Var.Q = u1Var;
            Point point = AndroidUtilities.displaySize;
            u1Var.Z3(point.x, point.y);
            ni0Var.R = messageObject.getId();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ni0 ni0Var = this.e;
        mi0 mi0Var = new mi0(ni0Var, this.f43123c, ni0Var.f39452c, this.d);
        mi0Var.setDelegate(new rb.b(17));
        return new s4.b1(mi0Var);
    }
}
