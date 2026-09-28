package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f41545a;
    public final Runnable f41546b;

    public n(int i10, Runnable runnable) {
        this.f41545a = i10;
        this.f41546b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f41545a) {
            case 0:
                Deque deque = (Deque) h.f41531b.get();
                n6.l.h(deque);
                Runnable runnable = this.f41546b;
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
                h.f41531b.set(new ArrayDeque());
                this.f41546b.run();
                return;
        }
    }
}
