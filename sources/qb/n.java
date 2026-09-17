package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f41278a;
    public final Runnable f41279b;

    public n(int i10, Runnable runnable) {
        this.f41278a = i10;
        this.f41279b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f41278a) {
            case 0:
                Deque deque = (Deque) h.f41264b.get();
                n6.l.h(deque);
                Runnable runnable = this.f41279b;
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                    return;
                }
                return;
            default:
                h.f41264b.set(new ArrayDeque());
                this.f41279b.run();
                return;
        }
    }
}
