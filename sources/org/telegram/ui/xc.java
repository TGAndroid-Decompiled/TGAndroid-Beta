package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xc extends org.telegram.ui.Components.im0 {
    public final int f43191c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final zc e;

    public xc(zc zcVar, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = zcVar;
        this.f43191c = i10;
        this.d = d6Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.e.f43718c.size();
    }

    @Override
    public final void v(s4.b1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xc.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new org.telegram.ui.Components.r21(this.f43191c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.b1 b1Var) {
        TLRPC.WallPaper wallPaper;
        zc zcVar = this.e;
        ArrayList arrayList = zcVar.f43718c;
        int b10 = b1Var.b();
        View view = b1Var.f45921a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.vp vpVar = (org.telegram.ui.Components.vp) arrayList.get(b10);
            org.telegram.ui.Components.r21 r21Var = (org.telegram.ui.Components.r21) view;
            r21Var.g(vpVar.d, false);
            if (vpVar.f31854a.f20728b) {
                wallPaper = null;
            } else {
                wallPaper = zcVar.v;
            }
            r21Var.setFallbackWallpaper(wallPaper);
        }
    }
}
