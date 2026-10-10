package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f46137a;
    public final Runnable f46138b;

    public n(int i10, Runnable runnable) {
        this.f46137a = i10;
        this.f46138b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f46137a) {
            case 0:
                Deque deque = (Deque) h.f46123b.get();
                n6.l.h(deque);
                Runnable runnable = this.f46138b;
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
                h.f46123b.set(new ArrayDeque());
                this.f46138b.run();
                return;
        }
    }
}
