package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yi1 implements org.telegram.ui.ActionBar.a2, wd1 {
    public final WallpapersListActivity f39970a;

    public yi1(WallpapersListActivity wallpapersListActivity) {
        this.f39970a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f31923i0;
        this.f39970a.removeSelfFromStack();
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        WallpapersListActivity.U(this.f39970a);
    }
}
