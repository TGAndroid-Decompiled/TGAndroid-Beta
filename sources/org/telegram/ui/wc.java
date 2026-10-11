package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wc extends org.telegram.ui.Components.rm0 {
    public final int f43307c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final yc f43308e;

    public wc(yc ycVar, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f43308e = ycVar;
        this.f43307c = i10;
        this.d = d6Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f43308e.f44311c.size();
    }

    @Override
    public final void v(s4.d1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wc.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new org.telegram.ui.Components.b31(this.f43307c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.d1 d1Var) {
        TLRPC.WallPaper wallPaper;
        yc ycVar = this.f43308e;
        ArrayList arrayList = ycVar.f44311c;
        int b10 = d1Var.b();
        View view = d1Var.f47748a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.bq bqVar = (org.telegram.ui.Components.bq) arrayList.get(b10);
            org.telegram.ui.Components.b31 b31Var = (org.telegram.ui.Components.b31) view;
            b31Var.g(bqVar.d, false);
            if (bqVar.f25002a.f20468b) {
                wallPaper = null;
            } else {
                wallPaper = ycVar.v;
            }
            b31Var.setFallbackWallpaper(wallPaper);
        }
    }
}
