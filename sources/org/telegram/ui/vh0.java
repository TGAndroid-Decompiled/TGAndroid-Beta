package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vh0 extends f2.r0 {
    public final Context f43494c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final li0 f43495e;

    public vh0(li0 li0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f43495e = li0Var;
        this.f43494c = context;
        this.d = b6Var;
    }

    @Override
    public final int h() {
        return this.f43495e.J.size();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        li0 li0Var = this.f43495e;
        ArrayList arrayList = li0Var.J;
        boolean z10 = true;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i9);
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) q1Var.f5501a;
        MessageObject.GroupedMessages l10 = li0Var.l(messageObject);
        int i10 = 0;
        if (l10 == null) {
            z10 = false;
        }
        t1Var.setInvalidatesParent(z10);
        t1Var.X3(messageObject, l10, false, false, false, false);
        if (!li0Var.L.i() && arrayList.size() >= 10) {
            i10 = arrayList.size() % 10;
        }
        if (i9 == i10 && !messageObject.needDrawForwarded()) {
            li0Var.M = t1Var;
            Point point = AndroidUtilities.displaySize;
            t1Var.Z3(point.x, point.y);
            li0Var.N = messageObject.getId();
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        li0 li0Var = this.f43495e;
        ki0 ki0Var = new ki0(li0Var, this.f43494c, li0Var.f40151c, this.d);
        ki0Var.setDelegate(new za.a(18));
        return new f2.q1(ki0Var);
    }
}
