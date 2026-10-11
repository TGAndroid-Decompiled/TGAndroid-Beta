package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f46205a;
    public final Runnable f46206b;

    public n(int i10, Runnable runnable) {
        this.f46205a = i10;
        this.f46206b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f46205a) {
            case 0:
                Deque deque = (Deque) h.f46191b.get();
                n6.m.h(deque);
                Runnable runnable = this.f46206b;
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
                h.f46191b.set(new ArrayDeque());
                this.f46206b.run();
                return;
        }
    }
}
