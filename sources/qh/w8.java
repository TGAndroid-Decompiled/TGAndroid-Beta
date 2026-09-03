package qh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w8 implements Runnable {
    public final int f46273a = 1;
    public final x8 f46274b;
    public final Runnable f46275c;
    public final boolean d;

    public w8(x8 x8Var, Runnable runnable, boolean z4) {
        this.f46274b = x8Var;
        this.f46275c = runnable;
        this.d = z4;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f46273a) {
            case 0:
                boolean z4 = this.d;
                this.f46274b.f(this.f46275c, z4);
                return;
            default:
                this.f46275c.run();
                ba baVar = this.f46274b.f46318a;
                d3 d3Var = baVar.Q0;
                if (this.d) {
                    i10 = R.string.StoryHintSwipeToZoom;
                } else {
                    i10 = R.string.StoryHintPinchToZoom;
                }
                d3Var.f45223a.q(LocaleController.getString(i10), false, true);
                d3Var.invalidate();
                baVar.h(true, true);
                baVar.d0(true);
                baVar.F0.a(false, true);
                baVar.G0.b(true, true);
                baVar.i0(true, true);
                return;
        }
    }

    public w8(x8 x8Var, boolean z4, Runnable runnable) {
        this.f46274b = x8Var;
        this.d = z4;
        this.f46275c = runnable;
    }
}
