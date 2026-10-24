package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xc extends org.telegram.ui.Components.km0 {
    public final int f43523c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final zc e;

    public xc(zc zcVar, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = zcVar;
        this.f43523c = i10;
        this.d = g6Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.e.f44063c.size();
    }

    @Override
    public final void v(s4.b1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xc.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new org.telegram.ui.Components.u21(this.f43523c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.b1 b1Var) {
        TLRPC.WallPaper wallPaper;
        zc zcVar = this.e;
        ArrayList arrayList = zcVar.f44063c;
        int b10 = b1Var.b();
        View view = b1Var.f46342a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.tp tpVar = (org.telegram.ui.Components.tp) arrayList.get(b10);
            org.telegram.ui.Components.u21 u21Var = (org.telegram.ui.Components.u21) view;
            u21Var.g(tpVar.d, false);
            if (tpVar.f30871a.f20886b) {
                wallPaper = null;
            } else {
                wallPaper = zcVar.v;
            }
            u21Var.setFallbackWallpaper(wallPaper);
        }
    }
}
