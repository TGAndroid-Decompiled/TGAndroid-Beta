package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yc extends org.telegram.ui.Components.ul0 {
    public final int f38970c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final ad e;

    public yc(ad adVar, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = adVar;
        this.f38970c = i10;
        this.d = f6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.e.f30893c.size();
    }

    @Override
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yc.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new org.telegram.ui.Components.i21(this.f38970c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.WallPaper wallPaper;
        ad adVar = this.e;
        ArrayList arrayList = adVar.f30893c;
        int b10 = c1Var.b();
        View view = c1Var.f41610a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.rp rpVar = (org.telegram.ui.Components.rp) arrayList.get(b10);
            org.telegram.ui.Components.i21 i21Var = (org.telegram.ui.Components.i21) view;
            i21Var.g(rpVar.d, false);
            if (rpVar.f26733a.f17715b) {
                wallPaper = null;
            } else {
                wallPaper = adVar.v;
            }
            i21Var.setFallbackWallpaper(wallPaper);
        }
    }
}
