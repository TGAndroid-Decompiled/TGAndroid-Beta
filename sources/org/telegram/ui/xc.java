package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xc extends org.telegram.ui.Components.vl0 {
    public final int f39430c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final zc e;

    public xc(zc zcVar, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = zcVar;
        this.f39430c = i10;
        this.d = e6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.e.f40076c.size();
    }

    @Override
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xc.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new org.telegram.ui.Components.j21(this.f39430c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.WallPaper wallPaper;
        zc zcVar = this.e;
        ArrayList arrayList = zcVar.f40076c;
        int b10 = c1Var.b();
        View view = c1Var.f42929a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList.get(b10);
            org.telegram.ui.Components.j21 j21Var = (org.telegram.ui.Components.j21) view;
            j21Var.g(lpVar.d, false);
            if (lpVar.f26230a.f18775b) {
                wallPaper = null;
            } else {
                wallPaper = zcVar.v;
            }
            j21Var.setFallbackWallpaper(wallPaper);
        }
    }
}
