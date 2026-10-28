package w4;

import android.animation.Animator;
public final class a implements Animator.AnimatorListener {
    public final b f50833a;
    public final c f50834b;

    public a(c cVar, b bVar) {
        this.f50834b = cVar;
        this.f50833a = bVar;
    }

    @Override
    public final void onAnimationRepeat(Animator animator) {
        c cVar = this.f50834b;
        b bVar = this.f50833a;
        cVar.a(1.0f, bVar, true);
        bVar.f50842k = bVar.e;
        bVar.f50843l = bVar.f50838f;
        bVar.f50844m = bVar.f50839g;
        bVar.a((bVar.f50841j + 1) % bVar.f50840i.length);
        if (cVar.f50858f) {
            cVar.f50858f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (bVar.f50845n) {
                bVar.f50845n = false;
                return;
            }
            return;
        }
        cVar.e += 1.0f;
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.f50834b.e = 0.0f;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
    }
}
