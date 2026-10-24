package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sh1 implements org.telegram.ui.ActionBar.z1, oc1 {
    public final WallpapersListActivity f41408a;

    public sh1(WallpapersListActivity wallpapersListActivity) {
        this.f41408a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f35517k0;
        this.f41408a.removeSelfFromStack();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        WallpapersListActivity.U(this.f41408a);
    }
}
