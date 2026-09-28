package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wc extends org.telegram.ui.Components.xl0 {
    public final int f38955c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final yc e;

    public wc(yc ycVar, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = ycVar;
        this.f38955c = i10;
        this.d = d6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.e.f40115c.size();
    }

    @Override
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wc.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new org.telegram.ui.Components.j21(this.f38955c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.WallPaper wallPaper;
        yc ycVar = this.e;
        ArrayList arrayList = ycVar.f40115c;
        int b10 = c1Var.b();
        View view = c1Var.f42961a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.np npVar = (org.telegram.ui.Components.np) arrayList.get(b10);
            org.telegram.ui.Components.j21 j21Var = (org.telegram.ui.Components.j21) view;
            j21Var.g(npVar.d, false);
            if (npVar.f26844a.f18758b) {
                wallPaper = null;
            } else {
                wallPaper = ycVar.v;
            }
            j21Var.setFallbackWallpaper(wallPaper);
        }
    }
}
