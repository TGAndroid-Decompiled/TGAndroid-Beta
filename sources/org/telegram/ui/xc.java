package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xc extends org.telegram.ui.Components.rl0 {
    public final int f39894c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final zc e;

    public xc(zc zcVar, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = zcVar;
        this.f39894c = i10;
        this.d = f6Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.e.f40757c.size();
    }

    @Override
    public final void v(f2.l1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xc.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new f2.l1(new org.telegram.ui.Components.w11(this.f39894c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(f2.l1 l1Var) {
        TLRPC.WallPaper wallPaper;
        zc zcVar = this.e;
        ArrayList arrayList = zcVar.f40757c;
        int b10 = l1Var.b();
        View view = l1Var.f5785a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.jp jpVar = (org.telegram.ui.Components.jp) arrayList.get(b10);
            org.telegram.ui.Components.w11 w11Var = (org.telegram.ui.Components.w11) view;
            w11Var.g(jpVar.d, false);
            if (jpVar.f26015a.f19664b) {
                wallPaper = null;
            } else {
                wallPaper = zcVar.v;
            }
            w11Var.setFallbackWallpaper(wallPaper);
        }
    }
}
