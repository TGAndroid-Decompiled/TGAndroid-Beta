package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class zi1 implements org.telegram.ui.ActionBar.a2, vd1 {
    public final WallpapersListActivity f43447a;

    public zi1(WallpapersListActivity wallpapersListActivity) {
        this.f43447a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f34248k0;
        this.f43447a.removeSelfFromStack();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        WallpapersListActivity.U(this.f43447a);
    }
}
