package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yc extends org.telegram.ui.Components.yl0 {
    public final int f43123c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final ad f43124e;

    public yc(ad adVar, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f43124e = adVar;
        this.f43123c = i10;
        this.d = d6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f43124e.f34781c.size();
    }

    @Override
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yc.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new org.telegram.ui.Components.s21(this.f43123c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.WallPaper wallPaper;
        ad adVar = this.f43124e;
        ArrayList arrayList = adVar.f34781c;
        int b10 = c1Var.b();
        View view = c1Var.f46524a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.op opVar = (org.telegram.ui.Components.op) arrayList.get(b10);
            org.telegram.ui.Components.s21 s21Var = (org.telegram.ui.Components.s21) view;
            s21Var.g(opVar.d, false);
            if (opVar.f29423a.f20501b) {
                wallPaper = null;
            } else {
                wallPaper = adVar.v;
            }
            s21Var.setFallbackWallpaper(wallPaper);
        }
    }
}
