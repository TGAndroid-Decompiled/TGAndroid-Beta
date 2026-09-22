package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class zi1 implements org.telegram.ui.ActionBar.a2, vd1 {
    public final WallpapersListActivity f40213a;

    public zi1(WallpapersListActivity wallpapersListActivity) {
        this.f40213a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f31615k0;
        this.f40213a.removeSelfFromStack();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        WallpapersListActivity.U(this.f40213a);
    }
}
