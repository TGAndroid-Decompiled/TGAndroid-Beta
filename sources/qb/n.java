package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f41252a;
    public final Runnable f41253b;

    public n(int i10, Runnable runnable) {
        this.f41252a = i10;
        this.f41253b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f41252a) {
            case 0:
                Deque deque = (Deque) h.f41238b.get();
                n6.l.h(deque);
                Runnable runnable = this.f41253b;
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
                h.f41238b.set(new ArrayDeque());
                this.f41253b.run();
                return;
        }
    }
}
