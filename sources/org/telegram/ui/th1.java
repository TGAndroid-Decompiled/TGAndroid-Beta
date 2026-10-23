package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class th1 implements org.telegram.ui.ActionBar.z1, pc1 {
    public final WallpapersListActivity f42017a;

    public th1(WallpapersListActivity wallpapersListActivity) {
        this.f42017a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f35515k0;
        this.f42017a.removeSelfFromStack();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        WallpapersListActivity.U(this.f42017a);
    }
}
