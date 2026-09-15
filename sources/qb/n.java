package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f41256a;
    public final Runnable f41257b;

    public n(int i10, Runnable runnable) {
        this.f41256a = i10;
        this.f41257b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f41256a) {
            case 0:
                Deque deque = (Deque) h.f41242b.get();
                n6.l.h(deque);
                Runnable runnable = this.f41257b;
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
                h.f41242b.set(new ArrayDeque());
                this.f41257b.run();
                return;
        }
    }
}
