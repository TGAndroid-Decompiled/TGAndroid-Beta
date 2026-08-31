package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xc extends org.telegram.ui.Components.sl0 {
    public final int f43027c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final zc f43028e;

    public xc(zc zcVar, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f43028e = zcVar;
        this.f43027c = i10;
        this.d = g6Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f43028e.f43894c.size();
    }

    @Override
    public final void v(f2.m1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xc.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new f2.m1(new org.telegram.ui.Components.x11(this.f43027c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(f2.m1 m1Var) {
        TLRPC.WallPaper wallPaper;
        zc zcVar = this.f43028e;
        ArrayList arrayList = zcVar.f43894c;
        int b10 = m1Var.b();
        View view = m1Var.f5875a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList.get(b10);
            org.telegram.ui.Components.x11 x11Var = (org.telegram.ui.Components.x11) view;
            x11Var.g(lpVar.d, false);
            if (lpVar.f28796a.f21359b) {
                wallPaper = null;
            } else {
                wallPaper = zcVar.v;
            }
            x11Var.setFallbackWallpaper(wallPaper);
        }
    }
}
