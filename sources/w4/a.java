package w4;

import android.animation.Animator;
public final class a implements Animator.AnimatorListener {
    public final b f50775a;
    public final c f50776b;

    public a(c cVar, b bVar) {
        this.f50776b = cVar;
        this.f50775a = bVar;
    }

    @Override
    public final void onAnimationRepeat(Animator animator) {
        c cVar = this.f50776b;
        b bVar = this.f50775a;
        cVar.a(1.0f, bVar, true);
        bVar.f50784k = bVar.e;
        bVar.f50785l = bVar.f50780f;
        bVar.f50786m = bVar.f50781g;
        bVar.a((bVar.f50783j + 1) % bVar.f50782i.length);
        if (cVar.f50800f) {
            cVar.f50800f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (bVar.f50787n) {
                bVar.f50787n = false;
                return;
            }
            return;
        }
        cVar.e += 1.0f;
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.f50776b.e = 0.0f;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
    }
}
