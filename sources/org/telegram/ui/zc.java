package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zc extends org.telegram.ui.Components.ql0 {
    public final int f40442c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final bd e;

    public zc(bd bdVar, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = bdVar;
        this.f40442c = i10;
        this.d = f6Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.e.f32842c.size();
    }

    @Override
    public final void v(f2.l1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zc.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new f2.l1(new org.telegram.ui.Components.w11(this.f40442c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(f2.l1 l1Var) {
        TLRPC.WallPaper wallPaper;
        bd bdVar = this.e;
        ArrayList arrayList = bdVar.f32842c;
        int b10 = l1Var.b();
        View view = l1Var.f5774a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.ip ipVar = (org.telegram.ui.Components.ip) arrayList.get(b10);
            org.telegram.ui.Components.w11 w11Var = (org.telegram.ui.Components.w11) view;
            w11Var.g(ipVar.d, false);
            if (ipVar.f25749a.f19639b) {
                wallPaper = null;
            } else {
                wallPaper = bdVar.v;
            }
            w11Var.setFallbackWallpaper(wallPaper);
        }
    }
}
