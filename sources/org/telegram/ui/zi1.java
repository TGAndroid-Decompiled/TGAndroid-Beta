package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class zi1 implements org.telegram.ui.ActionBar.a2, vd1 {
    public final WallpapersListActivity f43475a;

    public zi1(WallpapersListActivity wallpapersListActivity) {
        this.f43475a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f34276k0;
        this.f43475a.removeSelfFromStack();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        WallpapersListActivity.U(this.f43475a);
    }
}
