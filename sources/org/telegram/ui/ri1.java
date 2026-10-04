package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ri1 implements org.telegram.ui.ActionBar.a2, qd1 {
    public final WallpapersListActivity f40137a;

    public ri1(WallpapersListActivity wallpapersListActivity) {
        this.f40137a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f34593i0;
        this.f40137a.removeSelfFromStack();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        WallpapersListActivity.S(this.f40137a);
    }
}
