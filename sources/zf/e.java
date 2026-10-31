package zf;

import org.telegram.ui.zx;
public final class e implements Runnable {
    public final int f55473a;
    public final m f55474b;

    public e(m mVar, int i10) {
        this.f55473a = i10;
        this.f55474b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f55473a) {
            case 0:
                for (zx zxVar : this.f55474b.R.f35794e0) {
                    ((s4.a0) zxVar.f44239a.getLayoutManager()).f47874u = false;
                }
                return;
            default:
                this.f55474b.K();
                return;
        }
    }
}
