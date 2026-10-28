package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wh1 implements org.telegram.ui.ActionBar.b2, uc1 {
    public final WallpapersListActivity f45010a;

    public wh1(WallpapersListActivity wallpapersListActivity) {
        this.f45010a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f37606g0;
        this.f45010a.removeSelfFromStack();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        WallpapersListActivity.W(this.f45010a);
    }
}
