package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ri1 implements org.telegram.ui.ActionBar.z1, nd1 {
    public final WallpapersListActivity f37343a;

    public ri1(WallpapersListActivity wallpapersListActivity) {
        this.f37343a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f31905k0;
        this.f37343a.removeSelfFromStack();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        WallpapersListActivity.U(this.f37343a);
    }
}
