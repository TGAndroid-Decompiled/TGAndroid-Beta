package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zc extends org.telegram.ui.Components.hm0 {
    public final int f43716c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final bd e;

    public zc(bd bdVar, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = bdVar;
        this.f43716c = i10;
        this.d = d6Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.e.f35648c.size();
    }

    @Override
    public final void v(s4.b1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zc.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new org.telegram.ui.Components.p21(this.f43716c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(s4.b1 b1Var) {
        TLRPC.WallPaper wallPaper;
        bd bdVar = this.e;
        ArrayList arrayList = bdVar.f35648c;
        int b10 = b1Var.b();
        View view = b1Var.f45938a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.vp vpVar = (org.telegram.ui.Components.vp) arrayList.get(b10);
            org.telegram.ui.Components.p21 p21Var = (org.telegram.ui.Components.p21) view;
            p21Var.g(vpVar.d, false);
            if (vpVar.f31889a.f20720b) {
                wallPaper = null;
            } else {
                wallPaper = bdVar.v;
            }
            p21Var.setFallbackWallpaper(wallPaper);
        }
    }
}
