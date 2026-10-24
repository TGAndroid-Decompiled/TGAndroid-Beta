package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class zh0 extends s4.g0 {
    public final Context f44109c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final pi0 e;

    public zh0(pi0 pi0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = pi0Var;
        this.f44109c = context;
        this.d = g6Var;
    }

    @Override
    public final int h() {
        return this.e.M.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        pi0 pi0Var = this.e;
        ArrayList arrayList = pi0Var.M;
        boolean z10 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) b1Var.f46342a;
        MessageObject.GroupedMessages k10 = pi0Var.k(messageObject);
        int i11 = 0;
        if (k10 == null) {
            z10 = false;
        }
        t1Var.setInvalidatesParent(z10);
        t1Var.W3(messageObject, k10, false, false, false, false);
        if (!pi0Var.O.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            pi0Var.P = t1Var;
            Point point = AndroidUtilities.displaySize;
            t1Var.Y3(point.x, point.y);
            pi0Var.Q = messageObject.getId();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        pi0 pi0Var = this.e;
        oi0 oi0Var = new oi0(pi0Var, this.f44109c, pi0Var.f40553c, this.d);
        oi0Var.setDelegate(new rb.b(17));
        return new s4.b1(oi0Var);
    }
}
