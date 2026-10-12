package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f46038a;
    public final Runnable f46039b;

    public n(int i10, Runnable runnable) {
        this.f46038a = i10;
        this.f46039b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f46038a) {
            case 0:
                Deque deque = (Deque) h.f46024b.get();
                n6.m.h(deque);
                Runnable runnable = this.f46039b;
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
                h.f46024b.set(new ArrayDeque());
                this.f46039b.run();
                return;
        }
    }
}
