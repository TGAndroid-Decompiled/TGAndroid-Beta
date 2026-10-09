package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f46091a;
    public final Runnable f46092b;

    public n(int i10, Runnable runnable) {
        this.f46091a = i10;
        this.f46092b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f46091a) {
            case 0:
                Deque deque = (Deque) h.f46077b.get();
                n6.l.h(deque);
                Runnable runnable = this.f46092b;
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
                h.f46077b.set(new ArrayDeque());
                this.f46092b.run();
                return;
        }
    }
}
