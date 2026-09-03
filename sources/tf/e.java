package tf;

import org.telegram.ui.py;
public final class e implements Runnable {
    public final int f44763a;
    public final k f44764b;

    public e(k kVar, int i10) {
        this.f44763a = i10;
        this.f44764b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f44763a) {
            case 0:
                for (py pyVar : this.f44764b.O.f37527b0) {
                    ((f2.i0) pyVar.f37246a.getLayoutManager()).f5726u = false;
                }
                return;
            default:
                this.f44764b.J();
                return;
        }
    }
}
