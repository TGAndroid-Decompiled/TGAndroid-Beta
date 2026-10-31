package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vc extends org.telegram.ui.Components.sk0 {
    public final int f42700c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final xc e;

    public vc(xc xcVar, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.e = xcVar;
        this.f42700c = i10;
        this.d = p6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.e.f43537c.size();
    }

    @Override
    public final void t(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vc.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new s4.c1(new org.telegram.ui.Components.e11(this.f42700c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.WallPaper wallPaper;
        xc xcVar = this.e;
        ArrayList arrayList = xcVar.f43537c;
        int b10 = c1Var.b();
        View view = c1Var.f47898a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.cp cpVar = (org.telegram.ui.Components.cp) arrayList.get(b10);
            org.telegram.ui.Components.e11 e11Var = (org.telegram.ui.Components.e11) view;
            e11Var.g(cpVar.d, false);
            if (cpVar.f25123a.f21559b) {
                wallPaper = null;
            } else {
                wallPaper = xcVar.f43542w;
            }
            e11Var.setFallbackWallpaper(wallPaper);
        }
    }
}
