package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f41303a;
    public final d f41304b;

    public c(d dVar, int i10) {
        this.f41303a = i10;
        this.f41304b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41303a) {
            case 0:
                d dVar = this.f41304b;
                dVar.G = false;
                dVar.e.q(null, false, true);
                return;
            default:
                d dVar2 = this.f41304b;
                dVar2.M = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
