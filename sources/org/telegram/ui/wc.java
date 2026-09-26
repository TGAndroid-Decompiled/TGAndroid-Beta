package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wc extends org.telegram.ui.Components.vl0 {
    public final int f38954c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final yc e;

    public wc(yc ycVar, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = ycVar;
        this.f38954c = i10;
        this.d = d6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.e.f40114c.size();
    }

    @Override
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wc.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new org.telegram.ui.Components.h21(this.f38954c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.WallPaper wallPaper;
        yc ycVar = this.e;
        ArrayList arrayList = ycVar.f40114c;
        int b10 = c1Var.b();
        View view = c1Var.f42960a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.mp mpVar = (org.telegram.ui.Components.mp) arrayList.get(b10);
            org.telegram.ui.Components.h21 h21Var = (org.telegram.ui.Components.h21) view;
            h21Var.g(mpVar.d, false);
            if (mpVar.f26564a.f18757b) {
                wallPaper = null;
            } else {
                wallPaper = ycVar.v;
            }
            h21Var.setFallbackWallpaper(wallPaper);
        }
    }
}
