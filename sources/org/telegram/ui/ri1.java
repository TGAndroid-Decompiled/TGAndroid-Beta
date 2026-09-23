package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ri1 implements org.telegram.ui.ActionBar.a2, nd1 {
    public final WallpapersListActivity f36858a;

    public ri1(WallpapersListActivity wallpapersListActivity) {
        this.f36858a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f31589k0;
        this.f36858a.removeSelfFromStack();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        WallpapersListActivity.U(this.f36858a);
    }
}
