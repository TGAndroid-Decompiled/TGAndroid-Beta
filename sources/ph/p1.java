package ph;

import org.telegram.ui.Components.ii;
public final class p1 implements Runnable {
    public final int f45274a;
    public final f2 f45275b;
    public final int f45276c;

    public p1(f2 f2Var, int i10, int i11) {
        this.f45274a = i11;
        this.f45275b = f2Var;
        this.f45276c = i10;
    }

    @Override
    public final void run() {
        switch (this.f45274a) {
            case 0:
                this.f45275b.f45056f.scrollBy(0, this.f45276c);
                return;
            default:
                ii iiVar = this.f45275b.f45056f;
                if (iiVar != null) {
                    iiVar.setSpanCount(this.f45276c);
                    return;
                }
                return;
        }
    }
}
