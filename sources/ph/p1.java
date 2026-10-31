package ph;

import org.telegram.ui.Components.ii;
public final class p1 implements Runnable {
    public final int f45263a;
    public final f2 f45264b;
    public final int f45265c;

    public p1(f2 f2Var, int i10, int i11) {
        this.f45263a = i11;
        this.f45264b = f2Var;
        this.f45265c = i10;
    }

    @Override
    public final void run() {
        switch (this.f45263a) {
            case 0:
                this.f45264b.f45045f.scrollBy(0, this.f45265c);
                return;
            default:
                ii iiVar = this.f45264b.f45045f;
                if (iiVar != null) {
                    iiVar.setSpanCount(this.f45265c);
                    return;
                }
                return;
        }
    }
}
