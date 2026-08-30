package tf;

import org.telegram.ui.ny;
public final class e implements Runnable {
    public final int f44701a;
    public final k f44702b;

    public e(k kVar, int i10) {
        this.f44701a = i10;
        this.f44702b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f44701a) {
            case 0:
                for (ny nyVar : this.f44702b.O.f37009b0) {
                    ((f2.i0) nyVar.f36741a.getLayoutManager()).f5737u = false;
                }
                return;
            default:
                this.f44702b.J();
                return;
        }
    }
}
