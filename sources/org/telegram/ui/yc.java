package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yc extends org.telegram.ui.Components.xl0 {
    public final int f40186c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final ad e;

    public yc(ad adVar, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = adVar;
        this.f40186c = i10;
        this.d = e6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.e.f32049c.size();
    }

    @Override
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yc.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new org.telegram.ui.Components.j21(this.f40186c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.WallPaper wallPaper;
        ad adVar = this.e;
        ArrayList arrayList = adVar.f32049c;
        int b10 = c1Var.b();
        View view = c1Var.f43005a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.np npVar = (org.telegram.ui.Components.np) arrayList.get(b10);
            org.telegram.ui.Components.j21 j21Var = (org.telegram.ui.Components.j21) view;
            j21Var.g(npVar.d, false);
            if (npVar.f26877a.f18801b) {
                wallPaper = null;
            } else {
                wallPaper = adVar.v;
            }
            j21Var.setFallbackWallpaper(wallPaper);
        }
    }
}
