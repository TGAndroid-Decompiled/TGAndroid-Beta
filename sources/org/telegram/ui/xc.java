package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xc extends org.telegram.ui.Components.mm0 {
    public final int f45650c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final zc e;

    public xc(zc zcVar, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.e = zcVar;
        this.f45650c = i10;
        this.d = u6Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.e.f46220c.size();
    }

    @Override
    public final void v(s4.e1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xc.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new s4.e1(new org.telegram.ui.Components.e31(this.f45650c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.e1 e1Var) {
        TLRPC.WallPaper wallPaper;
        zc zcVar = this.e;
        ArrayList arrayList = zcVar.f46220c;
        int b10 = e1Var.b();
        View view = e1Var.f47773a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) arrayList.get(b10);
            org.telegram.ui.Components.e31 e31Var = (org.telegram.ui.Components.e31) view;
            e31Var.g(ypVar.d, false);
            if (ypVar.f35124a.f22684b) {
                wallPaper = null;
            } else {
                wallPaper = zcVar.v;
            }
            e31Var.setFallbackWallpaper(wallPaper);
        }
    }
}
