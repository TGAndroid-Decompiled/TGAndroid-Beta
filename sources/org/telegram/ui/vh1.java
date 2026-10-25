package org.telegram.ui;
public final class vh1 implements Runnable {
    public final int f44813a;
    public final Object f44814b;

    public vh1(Object obj, int i10) {
        this.f44813a = i10;
        this.f44814b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f44813a;
        Object obj = this.f44814b;
        switch (i10) {
            case 0:
                int[][] iArr = WallpapersListActivity.f37579g0;
                ((WallpapersListActivity) obj).C0(false);
                return;
            case 1:
                ((org.telegram.ui.Components.qa1) obj).b();
                return;
            case 2:
                ((org.telegram.ui.Components.za1) obj).d();
                return;
            default:
                ((WidgetConformanceActivity) obj).f37601b.fullScroll(130);
                return;
        }
    }
}
