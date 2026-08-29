package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rc extends org.telegram.ui.Components.il0 {
    public final int f42030c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final tc f42031e;

    public rc(tc tcVar, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f42031e = tcVar;
        this.f42030c = i10;
        this.d = c6Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f42031e.f42646c.size();
    }

    @Override
    public final void v(f2.n1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rc.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new f2.n1(new org.telegram.ui.Components.l11(this.f42030c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(f2.n1 n1Var) {
        TLRPC.WallPaper wallPaper;
        tc tcVar = this.f42031e;
        ArrayList arrayList = tcVar.f42646c;
        int b10 = n1Var.b();
        View view = n1Var.f6432a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.fp fpVar = (org.telegram.ui.Components.fp) arrayList.get(b10);
            org.telegram.ui.Components.l11 l11Var = (org.telegram.ui.Components.l11) view;
            l11Var.g(fpVar.d, false);
            if (fpVar.f28512a.f22763b) {
                wallPaper = null;
            } else {
                wallPaper = tcVar.v;
            }
            l11Var.setFallbackWallpaper(wallPaper);
        }
    }
}
