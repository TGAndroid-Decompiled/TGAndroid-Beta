package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f41531a;
    public final Runnable f41532b;

    public n(int i10, Runnable runnable) {
        this.f41531a = i10;
        this.f41532b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f41531a) {
            case 0:
                Deque deque = (Deque) h.f41517b.get();
                n6.l.h(deque);
                Runnable runnable = this.f41532b;
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
                h.f41517b.set(new ArrayDeque());
                this.f41532b.run();
                return;
        }
    }
}
