package zf;

import org.telegram.ui.yx;
public final class e implements Runnable {
    public final int f55491a;
    public final m f55492b;

    public e(m mVar, int i10) {
        this.f55491a = i10;
        this.f55492b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f55491a) {
            case 0:
                for (yx yxVar : this.f55492b.R.f44137e0) {
                    ((s4.a0) yxVar.f43733a.getLayoutManager()).f47885u = false;
                }
                return;
            default:
                this.f55492b.K();
                return;
        }
    }
}
