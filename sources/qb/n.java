package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f46030a;
    public final Runnable f46031b;

    public n(int i10, Runnable runnable) {
        this.f46030a = i10;
        this.f46031b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f46030a) {
            case 0:
                Deque deque = (Deque) h.f46016b.get();
                n6.m.h(deque);
                Runnable runnable = this.f46031b;
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
                h.f46016b.set(new ArrayDeque());
                this.f46031b.run();
                return;
        }
    }
}
