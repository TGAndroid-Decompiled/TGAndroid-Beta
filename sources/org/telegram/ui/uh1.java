package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uh1 implements org.telegram.ui.ActionBar.b2, sc1 {
    public final WallpapersListActivity f44142a;

    public uh1(WallpapersListActivity wallpapersListActivity) {
        this.f44142a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f37579g0;
        this.f44142a.removeSelfFromStack();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        WallpapersListActivity.W(this.f44142a);
    }
}
