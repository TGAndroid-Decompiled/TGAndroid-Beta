package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class zi1 implements org.telegram.ui.ActionBar.z1, vd1 {
    public final WallpapersListActivity f44677a;

    public zi1(WallpapersListActivity wallpapersListActivity) {
        this.f44677a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f35798k0;
        this.f44677a.removeSelfFromStack();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        WallpapersListActivity.U(this.f44677a);
    }
}
