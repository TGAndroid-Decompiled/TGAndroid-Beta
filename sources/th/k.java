package th;

import android.animation.ValueAnimator;
import org.telegram.ui.tw;
public final class k implements Runnable {
    public final int f49148a;
    public final l f49149b;

    public k(l lVar, int i10) {
        this.f49148a = i10;
        this.f49149b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f49148a) {
            case 0:
                tw twVar = this.f49149b.f49166b0;
                ValueAnimator valueAnimator = twVar.f49222j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                twVar.f49223k0 = null;
                return;
            default:
                l lVar = this.f49149b;
                lVar.f49173x = false;
                lVar.invalidate();
                return;
        }
    }
}
