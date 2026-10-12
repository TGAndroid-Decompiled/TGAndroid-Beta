package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ri0 extends s4.g0 {
    public final Context f39809c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final hj0 e;

    public ri0(hj0 hj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = hj0Var;
        this.f39809c = context;
        this.d = c6Var;
    }

    @Override
    public final int h() {
        return this.e.N.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        hj0 hj0Var = this.e;
        ArrayList arrayList = hj0Var.N;
        boolean z10 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) b1Var.f44838a;
        MessageObject.GroupedMessages l4 = hj0Var.l(messageObject);
        int i11 = 0;
        if (l4 == null) {
            z10 = false;
        }
        u1Var.setInvalidatesParent(z10);
        u1Var.X3(messageObject, l4, false, false, false, false);
        if (!hj0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            hj0Var.Q = u1Var;
            Point point = AndroidUtilities.displaySize;
            u1Var.Z3(point.x, point.y);
            hj0Var.R = messageObject.getId();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        hj0 hj0Var = this.e;
        gj0 gj0Var = new gj0(hj0Var, this.f39809c, hj0Var.f36838c, this.d);
        gj0Var.setDelegate(new rb.b(17));
        return new s4.b1(gj0Var);
    }
}
