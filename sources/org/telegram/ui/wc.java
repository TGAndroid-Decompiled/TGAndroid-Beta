package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wc extends org.telegram.ui.Components.rl0 {
    public final int f42403c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final zc f42404e;

    public wc(zc zcVar, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f42404e = zcVar;
        this.f42403c = i10;
        this.d = g6Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f42404e.f43893c.size();
    }

    @Override
    public final void v(f2.m1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wc.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new f2.m1(new org.telegram.ui.Components.w11(this.f42403c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(f2.m1 m1Var) {
        TLRPC.WallPaper wallPaper;
        zc zcVar = this.f42404e;
        ArrayList arrayList = zcVar.f43893c;
        int b10 = m1Var.b();
        View view = m1Var.f5875a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList.get(b10);
            org.telegram.ui.Components.w11 w11Var = (org.telegram.ui.Components.w11) view;
            w11Var.g(lpVar.d, false);
            if (lpVar.f28819a.f21361b) {
                wallPaper = null;
            } else {
                wallPaper = zcVar.v;
            }
            w11Var.setFallbackWallpaper(wallPaper);
        }
    }
}
