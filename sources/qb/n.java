package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f41546a;
    public final Runnable f41547b;

    public n(int i10, Runnable runnable) {
        this.f41546a = i10;
        this.f41547b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f41546a) {
            case 0:
                Deque deque = (Deque) h.f41532b.get();
                n6.l.h(deque);
                Runnable runnable = this.f41547b;
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
                h.f41532b.set(new ArrayDeque());
                this.f41547b.run();
                return;
        }
    }
}
