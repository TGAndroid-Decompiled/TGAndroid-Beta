package w4;

import android.animation.Animator;
public final class a implements Animator.AnimatorListener {
    public final b f50772a;
    public final c f50773b;

    public a(c cVar, b bVar) {
        this.f50773b = cVar;
        this.f50772a = bVar;
    }

    @Override
    public final void onAnimationRepeat(Animator animator) {
        c cVar = this.f50773b;
        b bVar = this.f50772a;
        cVar.a(1.0f, bVar, true);
        bVar.f50781k = bVar.e;
        bVar.f50782l = bVar.f50777f;
        bVar.f50783m = bVar.f50778g;
        bVar.a((bVar.f50780j + 1) % bVar.f50779i.length);
        if (cVar.f50797f) {
            cVar.f50797f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (bVar.f50784n) {
                bVar.f50784n = false;
                return;
            }
            return;
        }
        cVar.e += 1.0f;
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.f50773b.e = 0.0f;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
    }
}
