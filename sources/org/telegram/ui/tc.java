package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tc extends org.telegram.ui.Components.vk0 {
    public final int f42946c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final vc f42947e;

    public tc(vc vcVar, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f42947e = vcVar;
        this.f42946c = i9;
        this.d = b6Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f42947e.f43430c.size();
    }

    @Override
    public final void v(f2.q1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tc.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new f2.q1(new org.telegram.ui.Components.a11(this.f42946c, 3, viewGroup.getContext(), this.d));
    }

    @Override
    public final void y(f2.q1 q1Var) {
        TLRPC.WallPaper wallPaper;
        vc vcVar = this.f42947e;
        ArrayList arrayList = vcVar.f43430c;
        int b10 = q1Var.b();
        View view = q1Var.f5501a;
        if (b10 >= 0 && b10 < arrayList.size()) {
            org.telegram.ui.Components.bp bpVar = (org.telegram.ui.Components.bp) arrayList.get(b10);
            org.telegram.ui.Components.a11 a11Var = (org.telegram.ui.Components.a11) view;
            a11Var.g(bpVar.d, false);
            if (bpVar.f27261a.f22749b) {
                wallPaper = null;
            } else {
                wallPaper = vcVar.v;
            }
            a11Var.setFallbackWallpaper(wallPaper);
        }
    }
}
