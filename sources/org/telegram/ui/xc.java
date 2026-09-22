package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xc extends org.telegram.ui.Components.xl0 {
    public final int f39480c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final zc e;

    public xc(zc zcVar, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = zcVar;
        this.f39480c = i10;
        this.d = f6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.e.f40194c.size();
    }

    @Override
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xc.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new org.telegram.ui.Components.k21(this.f39480c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.WallPaper wallPaper;
        zc zcVar = this.e;
        ArrayList arrayList = zcVar.f40194c;
        int b10 = c1Var.b();
        View view = c1Var.f42995a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList.get(b10);
            org.telegram.ui.Components.k21 k21Var = (org.telegram.ui.Components.k21) view;
            k21Var.g(lpVar.d, false);
            if (lpVar.f26155a.f18823b) {
                wallPaper = null;
            } else {
                wallPaper = zcVar.v;
            }
            k21Var.setFallbackWallpaper(wallPaper);
        }
    }
}
