package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xc extends org.telegram.ui.Components.pm0 {
    public final int f43917c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final zc f43918e;

    public xc(zc zcVar, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f43918e = zcVar;
        this.f43917c = i10;
        this.d = e6Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f43918e.f44539c.size();
    }

    @Override
    public final void v(s4.d1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xc.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new org.telegram.ui.Components.z21(this.f43917c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.d1 d1Var) {
        TLRPC.WallPaper wallPaper;
        zc zcVar = this.f43918e;
        ArrayList arrayList = zcVar.f44539c;
        int b10 = d1Var.b();
        View view = d1Var.f47656a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.bq bqVar = (org.telegram.ui.Components.bq) arrayList.get(b10);
            org.telegram.ui.Components.z21 z21Var = (org.telegram.ui.Components.z21) view;
            z21Var.g(bqVar.d, false);
            if (bqVar.f25082a.f20506b) {
                wallPaper = null;
            } else {
                wallPaper = zcVar.v;
            }
            z21Var.setFallbackWallpaper(wallPaper);
        }
    }
}
