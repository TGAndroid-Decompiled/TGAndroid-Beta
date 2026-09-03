package ph;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class y8 implements Runnable {
    public final int f42668a = 1;
    public final a9 f42669b;
    public final Runnable f42670c;
    public final boolean d;

    public y8(a9 a9Var, Runnable runnable, boolean z4) {
        this.f42669b = a9Var;
        this.f42670c = runnable;
        this.d = z4;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f42668a) {
            case 0:
                boolean z4 = this.d;
                this.f42669b.f(this.f42670c, z4);
                return;
            default:
                this.f42670c.run();
                da daVar = this.f42669b.f41310a;
                e3 e3Var = daVar.Q0;
                if (this.d) {
                    i10 = R.string.StoryHintSwipeToZoom;
                } else {
                    i10 = R.string.StoryHintPinchToZoom;
                }
                e3Var.f41602a.q(LocaleController.getString(i10), false, true);
                e3Var.invalidate();
                daVar.h(true, true);
                daVar.d0(true);
                daVar.F0.a(false, true);
                daVar.G0.b(true, true);
                daVar.i0(true, true);
                return;
        }
    }

    public y8(a9 a9Var, boolean z4, Runnable runnable) {
        this.f42669b = a9Var;
        this.d = z4;
        this.f42670c = runnable;
    }
}
