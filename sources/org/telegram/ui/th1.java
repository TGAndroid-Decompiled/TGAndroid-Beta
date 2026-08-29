package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class th1 implements org.telegram.ui.ActionBar.b2, pc1 {
    public final WallpapersListActivity f42713a;

    public th1(WallpapersListActivity wallpapersListActivity) {
        this.f42713a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f36361g0;
        this.f42713a.removeSelfFromStack();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        WallpapersListActivity.U(this.f42713a);
    }
}
