package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f44295a;
    public final Runnable f44296b;

    public n(int i10, Runnable runnable) {
        this.f44295a = i10;
        this.f44296b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f44295a) {
            case 0:
                Deque deque = (Deque) h.f44281b.get();
                n6.l.h(deque);
                Runnable runnable = this.f44296b;
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
                h.f44281b.set(new ArrayDeque());
                this.f44296b.run();
                return;
        }
    }
}
