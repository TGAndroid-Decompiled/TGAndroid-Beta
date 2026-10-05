package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f44936a;
    public final Runnable f44937b;

    public n(int i10, Runnable runnable) {
        this.f44936a = i10;
        this.f44937b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f44936a) {
            case 0:
                Deque deque = (Deque) h.f44922b.get();
                n6.l.h(deque);
                Runnable runnable = this.f44937b;
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
                h.f44922b.set(new ArrayDeque());
                this.f44937b.run();
                return;
        }
    }
}
