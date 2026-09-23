package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f41208a;
    public final Runnable f41209b;

    public n(int i10, Runnable runnable) {
        this.f41208a = i10;
        this.f41209b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f41208a) {
            case 0:
                Deque deque = (Deque) h.f41194b.get();
                n6.l.h(deque);
                Runnable runnable = this.f41209b;
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
                h.f41194b.set(new ArrayDeque());
                this.f41209b.run();
                return;
        }
    }
}
