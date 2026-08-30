package ph;

import android.content.Context;
import android.widget.FrameLayout;
public final class a0 extends yf.n {
    public final int M;
    public final FrameLayout N;

    public a0(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.M = i10;
        this.N = frameLayout;
    }

    @Override
    public final int getCurrentHeight() {
        switch (this.M) {
            case 0:
                return c0.b((c0) this.N);
            default:
                return f0.b((f0) this.N);
        }
    }

    @Override
    public final int getCurrentWidth() {
        switch (this.M) {
            case 0:
                return c0.a((c0) this.N);
            default:
                return f0.a((f0) this.N);
        }
    }
}
