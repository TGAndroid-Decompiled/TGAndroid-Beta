package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

public final class xh0 extends f2.q0 {

    public final Context f44465c;
    public final org.telegram.ui.ActionBar.c6 d;

    public final ni0 f44466e;

    public xh0(ni0 ni0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f44466e = ni0Var;
        this.f44465c = context;
        this.d = c6Var;
    }

    @Override
    public final int h() {
        return this.f44466e.J.size();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        ni0 ni0Var = this.f44466e;
        ArrayList arrayList = ni0Var.J;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) o1Var.f5789a;
        MessageObject.GroupedMessages groupedMessagesL = ni0Var.l(messageObject);
        int size = 0;
        s1Var.setInvalidatesParent(groupedMessagesL != null);
        s1Var.W3(messageObject, groupedMessagesL, false, false, false, false);
        if (!ni0Var.L.i() && arrayList.size() >= 10) {
            size = arrayList.size() % 10;
        }
        if (i10 != size || messageObject.needDrawForwarded()) {
            return;
        }
        ni0Var.M = s1Var;
        Point point = AndroidUtilities.displaySize;
        s1Var.Y3(point.x, point.y);
        ni0Var.N = messageObject.getId();
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        ni0 ni0Var = this.f44466e;
        mi0 mi0Var = new mi0(ni0Var, this.f44465c, ni0Var.f40844c, this.d);
        mi0Var.setDelegate(new ab.a(19));
        return new org.telegram.ui.Components.lk0(mi0Var);
    }
}
