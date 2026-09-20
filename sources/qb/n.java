package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f41559a;
    public final Runnable f41560b;

    public n(int i10, Runnable runnable) {
        this.f41559a = i10;
        this.f41560b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f41559a) {
            case 0:
                Deque deque = (Deque) h.f41545b.get();
                n6.l.h(deque);
                Runnable runnable = this.f41560b;
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
                h.f41545b.set(new ArrayDeque());
                this.f41560b.run();
                return;
        }
    }
}
