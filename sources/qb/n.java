package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f46093a;
    public final Runnable f46094b;

    public n(int i10, Runnable runnable) {
        this.f46093a = i10;
        this.f46094b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f46093a) {
            case 0:
                Deque deque = (Deque) h.f46079b.get();
                n6.l.h(deque);
                Runnable runnable = this.f46094b;
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
                h.f46079b.set(new ArrayDeque());
                this.f46094b.run();
                return;
        }
    }
}
