package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xc extends org.telegram.ui.Components.qm0 {
    public final int f43963c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final zc f43964e;

    public xc(zc zcVar, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f43964e = zcVar;
        this.f43963c = i10;
        this.d = e6Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f43964e.f44585c.size();
    }

    @Override
    public final void v(s4.d1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xc.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new org.telegram.ui.Components.a31(this.f43963c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.d1 d1Var) {
        TLRPC.WallPaper wallPaper;
        zc zcVar = this.f43964e;
        ArrayList arrayList = zcVar.f44585c;
        int b10 = d1Var.b();
        View view = d1Var.f47702a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.bq bqVar = (org.telegram.ui.Components.bq) arrayList.get(b10);
            org.telegram.ui.Components.a31 a31Var = (org.telegram.ui.Components.a31) view;
            a31Var.g(bqVar.d, false);
            if (bqVar.f25019a.f20510b) {
                wallPaper = null;
            } else {
                wallPaper = zcVar.v;
            }
            a31Var.setFallbackWallpaper(wallPaper);
        }
    }
}
