package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f41580a;
    public final Runnable f41581b;

    public n(int i10, Runnable runnable) {
        this.f41580a = i10;
        this.f41581b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f41580a) {
            case 0:
                Deque deque = (Deque) h.f41566b.get();
                n6.l.h(deque);
                Runnable runnable = this.f41581b;
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
                h.f41566b.set(new ArrayDeque());
                this.f41581b.run();
                return;
        }
    }
}
