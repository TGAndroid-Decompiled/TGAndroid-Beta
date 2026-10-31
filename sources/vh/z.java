package vh;

import android.content.Context;
import android.widget.FrameLayout;
public final class z extends eg.q {
    public final int P;
    public final FrameLayout Q;

    public z(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.P = i10;
        this.Q = frameLayout;
    }

    @Override
    public final int getCurrentHeight() {
        switch (this.P) {
            case 0:
                return b0.b((b0) this.Q);
            default:
                return g0.b((g0) this.Q);
        }
    }

    @Override
    public final int getCurrentWidth() {
        switch (this.P) {
            case 0:
                return b0.a((b0) this.Q);
            default:
                return g0.a((g0) this.Q);
        }
    }
}
