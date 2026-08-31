package qh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x8 implements Runnable {
    public final int f46300a = 1;
    public final y8 f46301b;
    public final Runnable f46302c;
    public final boolean d;

    public x8(y8 y8Var, Runnable runnable, boolean z4) {
        this.f46301b = y8Var;
        this.f46302c = runnable;
        this.d = z4;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f46300a) {
            case 0:
                boolean z4 = this.d;
                this.f46301b.f(this.f46302c, z4);
                return;
            default:
                this.f46302c.run();
                ca caVar = this.f46301b.f46362a;
                e3 e3Var = caVar.Q0;
                if (this.d) {
                    i10 = R.string.StoryHintSwipeToZoom;
                } else {
                    i10 = R.string.StoryHintPinchToZoom;
                }
                e3Var.f45242a.q(LocaleController.getString(i10), false, true);
                e3Var.invalidate();
                caVar.h(true, true);
                caVar.d0(true);
                caVar.F0.a(false, true);
                caVar.G0.b(true, true);
                caVar.i0(true, true);
                return;
        }
    }

    public x8(y8 y8Var, boolean z4, Runnable runnable) {
        this.f46301b = y8Var;
        this.d = z4;
        this.f46302c = runnable;
    }
}
