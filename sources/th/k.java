package th;

import android.animation.ValueAnimator;
import org.telegram.ui.uw;
public final class k implements Runnable {
    public final int f49134a;
    public final l f49135b;

    public k(l lVar, int i10) {
        this.f49134a = i10;
        this.f49135b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f49134a) {
            case 0:
                uw uwVar = this.f49135b.f49152b0;
                ValueAnimator valueAnimator = uwVar.f49208j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                uwVar.f49209k0 = null;
                return;
            default:
                l lVar = this.f49135b;
                lVar.f49159x = false;
                lVar.invalidate();
                return;
        }
    }
}
