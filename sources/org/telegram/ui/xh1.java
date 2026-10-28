package org.telegram.ui;
public final class xh1 implements Runnable {
    public final int f45691a;
    public final Object f45692b;

    public xh1(Object obj, int i10) {
        this.f45691a = i10;
        this.f45692b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f45691a;
        Object obj = this.f45692b;
        switch (i10) {
            case 0:
                int[][] iArr = WallpapersListActivity.f37606g0;
                ((WallpapersListActivity) obj).C0(false);
                return;
            case 1:
                ((org.telegram.ui.Components.ra1) obj).b();
                return;
            case 2:
                ((org.telegram.ui.Components.ab1) obj).d();
                return;
            default:
                ((WidgetConformanceActivity) obj).f37628b.fullScroll(130);
                return;
        }
    }
}
