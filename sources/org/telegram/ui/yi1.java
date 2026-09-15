package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yi1 implements ki.e, org.telegram.ui.ActionBar.a2, ud1 {
    public final WallpapersListActivity f39919a;

    public yi1(WallpapersListActivity wallpapersListActivity) {
        this.f39919a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f31618j0;
        this.f39919a.removeSelfFromStack();
    }

    @Override
    public int e() {
        int[][] iArr = WallpapersListActivity.f31618j0;
        WallpapersListActivity wallpapersListActivity = this.f39919a;
        wallpapersListActivity.getClass();
        return wallpapersListActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f18780a7);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        WallpapersListActivity.U(this.f39919a);
    }
}
