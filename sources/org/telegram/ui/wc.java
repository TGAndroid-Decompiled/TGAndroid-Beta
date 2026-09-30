package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wc extends org.telegram.ui.Components.yl0 {
    public final int f39043c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final yc e;

    public wc(yc ycVar, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = ycVar;
        this.f39043c = i10;
        this.d = d6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.e.f40220c.size();
    }

    @Override
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wc.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new org.telegram.ui.Components.k21(this.f39043c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.WallPaper wallPaper;
        yc ycVar = this.e;
        ArrayList arrayList = ycVar.f40220c;
        int b10 = c1Var.b();
        View view = c1Var.f43068a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.op opVar = (org.telegram.ui.Components.op) arrayList.get(b10);
            org.telegram.ui.Components.k21 k21Var = (org.telegram.ui.Components.k21) view;
            k21Var.g(opVar.d, false);
            if (opVar.f27160a.f18774b) {
                wallPaper = null;
            } else {
                wallPaper = ycVar.v;
            }
            k21Var.setFallbackWallpaper(wallPaper);
        }
    }
}
