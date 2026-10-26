package org.telegram.ui;
public final class vh1 implements Runnable {
    public final int f44816a;
    public final Object f44817b;

    public vh1(Object obj, int i10) {
        this.f44816a = i10;
        this.f44817b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f44816a;
        Object obj = this.f44817b;
        switch (i10) {
            case 0:
                int[][] iArr = WallpapersListActivity.f37582g0;
                ((WallpapersListActivity) obj).C0(false);
                return;
            case 1:
                ((org.telegram.ui.Components.qa1) obj).b();
                return;
            case 2:
                ((org.telegram.ui.Components.za1) obj).d();
                return;
            default:
                ((WidgetConformanceActivity) obj).f37604b.fullScroll(130);
                return;
        }
    }
}
