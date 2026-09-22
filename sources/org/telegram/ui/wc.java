package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wc extends org.telegram.ui.Components.kl0 {
    public final int f38771c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final yc e;

    public wc(yc ycVar, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = ycVar;
        this.f38771c = i10;
        this.d = e6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.e.f39806c.size();
    }

    @Override
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wc.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new org.telegram.ui.Components.u11(this.f38771c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.WallPaper wallPaper;
        yc ycVar = this.e;
        ArrayList arrayList = ycVar.f39806c;
        int b10 = c1Var.b();
        View view = c1Var.f42671a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList.get(b10);
            org.telegram.ui.Components.u11 u11Var = (org.telegram.ui.Components.u11) view;
            u11Var.g(lpVar.d, false);
            if (lpVar.f25997a.f18588b) {
                wallPaper = null;
            } else {
                wallPaper = ycVar.v;
            }
            u11Var.setFallbackWallpaper(wallPaper);
        }
    }
}
