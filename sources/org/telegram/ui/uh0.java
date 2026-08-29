package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class uh0 extends f2.p0 {
    public final Context f43268c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final ki0 f43269e;

    public uh0(ki0 ki0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f43269e = ki0Var;
        this.f43268c = context;
        this.d = c6Var;
    }

    @Override
    public final int h() {
        return this.f43269e.J.size();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        ki0 ki0Var = this.f43269e;
        ArrayList arrayList = ki0Var.J;
        boolean z10 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) n1Var.f6432a;
        MessageObject.GroupedMessages l10 = ki0Var.l(messageObject);
        int i11 = 0;
        if (l10 == null) {
            z10 = false;
        }
        s1Var.setInvalidatesParent(z10);
        s1Var.X3(messageObject, l10, false, false, false, false);
        if (!ki0Var.L.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 == i11 && !messageObject.needDrawForwarded()) {
            ki0Var.M = s1Var;
            Point point = AndroidUtilities.displaySize;
            s1Var.Z3(point.x, point.y);
            ki0Var.N = messageObject.getId();
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        ki0 ki0Var = this.f43269e;
        ji0 ji0Var = new ji0(ki0Var, this.f43268c, ki0Var.f39876c, this.d);
        ji0Var.setDelegate(new x9.d(17));
        return new f2.n1(ji0Var);
    }
}
