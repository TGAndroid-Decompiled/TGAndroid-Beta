package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f41544a;
    public final Runnable f41545b;

    public n(int i10, Runnable runnable) {
        this.f41544a = i10;
        this.f41545b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f41544a) {
            case 0:
                Deque deque = (Deque) h.f41530b.get();
                n6.l.h(deque);
                Runnable runnable = this.f41545b;
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
                h.f41530b.set(new ArrayDeque());
                this.f41545b.run();
                return;
        }
    }
}
