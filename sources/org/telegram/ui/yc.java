package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yc extends org.telegram.ui.Components.ll0 {
    public final int f39857c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final ad e;

    public yc(ad adVar, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = adVar;
        this.f39857c = i10;
        this.d = f6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.e.f31830c.size();
    }

    @Override
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yc.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new org.telegram.ui.Components.v11(this.f39857c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.WallPaper wallPaper;
        ad adVar = this.e;
        ArrayList arrayList = adVar.f31830c;
        int b10 = c1Var.b();
        View view = c1Var.f42702a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList.get(b10);
            org.telegram.ui.Components.v11 v11Var = (org.telegram.ui.Components.v11) view;
            v11Var.g(lpVar.d, false);
            if (lpVar.f25957a.f18619b) {
                wallPaper = null;
            } else {
                wallPaper = adVar.v;
            }
            v11Var.setFallbackWallpaper(wallPaper);
        }
    }
}
