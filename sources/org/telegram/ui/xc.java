package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xc extends org.telegram.ui.Components.kl0 {
    public final int f42684c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final zc f42685e;

    public xc(zc zcVar, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f42685e = zcVar;
        this.f42684c = i10;
        this.d = f6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f42685e.f43371c.size();
    }

    @Override
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xc.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new org.telegram.ui.Components.t11(this.f42684c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.WallPaper wallPaper;
        zc zcVar = this.f42685e;
        ArrayList arrayList = zcVar.f43371c;
        int b10 = c1Var.b();
        View view = c1Var.f45739a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.kp kpVar = (org.telegram.ui.Components.kp) arrayList.get(b10);
            org.telegram.ui.Components.t11 t11Var = (org.telegram.ui.Components.t11) view;
            t11Var.g(kpVar.d, false);
            if (kpVar.f27883a.f20363b) {
                wallPaper = null;
            } else {
                wallPaper = zcVar.v;
            }
            t11Var.setFallbackWallpaper(wallPaper);
        }
    }
}
